package stu.cn.ua.transport.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.User;
import stu.cn.ua.transport.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/user")
    public User user(){
        return new User(1l, "name", "surname", "login", "password");
    }

    @RequestMapping("/create")
    @ResponseBody
    public String createUser(){
        try {
            userService.addUser(new User("name", "surname", "login", "password"));
        }catch (Exception ex){
            return "Error" + ex.toString();
        }

        return "User have done";
    }
}
