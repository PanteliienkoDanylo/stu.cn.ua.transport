package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.Transport;

import java.util.List;

public interface TransportService {

    Transport addTransport(Transport transport);
    void delete(Long id);
    List<Transport> getAll();
}
