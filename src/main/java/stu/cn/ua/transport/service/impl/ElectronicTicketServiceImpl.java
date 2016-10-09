package stu.cn.ua.transport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.ElectronicTicket;
import stu.cn.ua.transport.repository.ElectronicTicketRepository;
import stu.cn.ua.transport.service.ElectronicTicketService;

import java.util.List;

@Service
public class ElectronicTicketServiceImpl implements ElectronicTicketService {

    @Autowired
    private ElectronicTicketRepository electronicTicketRepository;

    @Override
    public ElectronicTicket addElectronicTicket(ElectronicTicket electronicTicket) {
        ElectronicTicket savedElectronicTicket = electronicTicketRepository.saveAndFlush(electronicTicket);

        return savedElectronicTicket;
    }

    @Override
    public ElectronicTicket findById(Long id) {
        return electronicTicketRepository.findById(id);
    }

    @Override
    public ElectronicTicket findByNumber(Integer number) {
        return electronicTicketRepository.findByNumber(number);
    }

    @Override
    public void updatePoint(Double point, Long id) {
        electronicTicketRepository.updatePointById(point, id);
    }

    @Override
    public void delete(Long id) {
        electronicTicketRepository.delete(id);
    }

    @Override
    public List<ElectronicTicket> getAll() {
        return electronicTicketRepository.findAll();
    }
}
