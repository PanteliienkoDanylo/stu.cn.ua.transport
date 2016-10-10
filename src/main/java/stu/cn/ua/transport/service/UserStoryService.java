package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.UserStory;

import java.util.List;

public interface UserStoryService {

    UserStory addUserStory(UserStory userStory);
    void delete(Long id);
    List<UserStory> getAll();
}
