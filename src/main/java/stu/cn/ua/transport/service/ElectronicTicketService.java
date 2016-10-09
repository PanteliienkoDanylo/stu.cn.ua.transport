package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.ElectronicTicket;

import java.util.List;

public interface ElectronicTicketService {

    ElectronicTicket addElectronicTicket(ElectronicTicket electronicTicket);
    ElectronicTicket findById(Long id);
    ElectronicTicket findByNumber(Integer number);
    void updatePoint(Double point, Long id);
    void delete(Long id);
    List<ElectronicTicket> getAll();
}
