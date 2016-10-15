package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.ElectronicTickerUser;
import stu.cn.ua.transport.repository.ElectronicTicketUserRepository;
import stu.cn.ua.transport.service.ElectronicTicketUserService;

import java.util.List;

@Service
public class ElectronicTicketUserServiceImpl implements ElectronicTicketUserService {

    @Autowired
    private ElectronicTicketUserRepository electronicTicketUserRepository;

    @Override
    public ElectronicTickerUser add(ElectronicTickerUser electronicTickerUser) {
        return electronicTicketUserRepository.saveAndFlush(electronicTickerUser);
    }

    @Override
    public void delete(Long id) {
        electronicTicketUserRepository.delete(id);
    }

    @Override
    public List<ElectronicTickerUser> getAll() {
        return electronicTicketUserRepository.findAll();
    }
}
