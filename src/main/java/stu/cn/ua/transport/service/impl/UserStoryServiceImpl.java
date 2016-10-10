package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.UserStory;
import stu.cn.ua.transport.repository.UserStoryRepository;
import stu.cn.ua.transport.service.UserStoryService;

import java.util.List;

@Service
public class UserStoryServiceImpl implements UserStoryService{

    @Autowired
    private UserStoryRepository userStoryRepository;

    @Override
    public UserStory addUserStory(UserStory userStory) {
        return userStoryRepository.saveAndFlush(userStory);
    }

    @Override
    public void delete(Long id) {
        userStoryRepository.delete(id);
    }

    @Override
    public List<UserStory> getAll() {
        return userStoryRepository.findAll();
    }
}
