package com.example.springbootjpadesign.Service;

import com.example.springbootjpadesign.Entity.Teacher;
import com.example.springbootjpadesign.Entity.User;
import com.example.springbootjpadesign.Repository.TeacherRepository;
import com.example.springbootjpadesign.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public User getUser(int num) {
        return userRepository.findByUserId(num).orElse(null);
    }

    public Teacher getTeacher(int tid) {
        return teacherRepository.findById(tid).orElse(null);
    }

    /**
     * 对user声明了persist/remove操作
     * @param teacher
     * @return
     */
    public Teacher addTeacher(Teacher teacher,User user) {
        user.setRole(User.Role.STUDENT);
        teacher.setUser(user);

        userRepository.save(user);
        teacher.setUser(user);
        return teacherRepository.save(teacher);
    }

    public void addTeacher(Teacher t) {
        teacherRepository.save(t);
    }
    public User getUser1(String name){
        return userRepository.findByName(name).orElse(null);
    }

}