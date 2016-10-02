package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import stu.cn.ua.transport.domain.User;
import stu.cn.ua.transport.repository.UserRepository;
import stu.cn.ua.transport.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
         return userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
