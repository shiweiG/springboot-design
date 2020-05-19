package com.example.springbootjpadesign.component;

import com.example.springbootjpadesign.Entity.Teacher;
import com.example.springbootjpadesign.Entity.User;
import com.example.springbootjpadesign.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InitComponent implements InitializingBean {
    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserService userService;

    @Override
    public void afterPropertiesSet() throws Exception {
        int num = 1001;
        User user = userService.getUser(num);
        if (user == null) {
            User u = new User();
            u.setName("yao");
            u.setNumber(num);
            u.setRole(User.Role.TEACHER);

            u.setPassword(encoder.encode(String.valueOf(num)));

            Teacher t = new Teacher();

            userService.addTeacher(t,u);
        }
    }
}