package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import stu.cn.ua.transport.domain.Transport;
import stu.cn.ua.transport.repository.TransportRepository;
import stu.cn.ua.transport.service.TransportService;

import java.util.List;

public class TrasnportServiceImpl implements TransportService{

    @Autowired
    private TransportRepository transportRepository;

    @Override
    public Transport addTransport(Transport transport) {
        return transportRepository.saveAndFlush(transport);
    }

    @Override
    public void delete(Long id) {
        transportRepository.delete(id);
    }

    @Override
    public List<Transport> getAll() {
        return transportRepository.findAll();
    }
}
