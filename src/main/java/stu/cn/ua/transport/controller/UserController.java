package stu.cn.ua.transport.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.User;
import stu.cn.ua.transport.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUser(){
        User user = new User();
        user.setName("name");
        user.setSurname("surname");
        user.setLogin("login");
        user.setPassword("password");
        try {
            userService.addUser(user);
        }catch (Exception ex){
            return "Error" + ex.toString();
        }

        return "User have done";
    }

    @RequestMapping("/getAll")
    public List<User> users(){
        return userService.getAll();
    }


}
