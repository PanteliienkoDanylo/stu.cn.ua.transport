package stu.cn.ua.transport.service;


import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.User;

import java.util.List;

@Service
public interface UserService {

    User addUser(User user);
    void delete(Long id);
    List<User> getAll();
}
