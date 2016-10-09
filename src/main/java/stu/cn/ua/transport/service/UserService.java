package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.User;

import java.util.List;


public interface UserService {

    User addUser(User user);
    User findById(Long id);
    User findByLogin(String login);
    User findByName(String name);
    User findBySurname(String surname);
    void delete(Long id);
    List<User> getAll();
}
