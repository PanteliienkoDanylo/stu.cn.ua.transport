package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.ElectronicTickerUser;

import java.util.List;

public interface ElectronicTicketUserService {

    ElectronicTickerUser add(ElectronicTickerUser electronicTickerUser);
    void delete(Long id);
    List<ElectronicTickerUser> getAll();
}
