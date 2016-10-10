package stu.cn.ua.transport.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.Station;
import stu.cn.ua.transport.domain.UserStory;
import stu.cn.ua.transport.service.UserService;
import stu.cn.ua.transport.service.UserStoryService;

import java.util.Date;
import java.util.List;

@RestController
public class UserStoryController {

    @Autowired
    private UserStoryService userStoryService;

    @Autowired
    private UserService userService;


    @RequestMapping("/create_user_story")
    public void createUserStory(){
        UserStory userStory = new UserStory();
        userStory.setStation(new Station());
        userStory.setUser(userService.findById(2l));
        userStory.setTime(new Date(System.currentTimeMillis()));
        userStoryService.addUserStory(userStory);
    }

    @RequestMapping("/getAllUserStory")
    public List<UserStory> getAllUserStory(){
        return userStoryService.getAll();
    }
}
