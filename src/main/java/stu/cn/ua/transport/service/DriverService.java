package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.Driver;

import java.util.List;

public interface DriverService {

    Driver addDriver(Driver driver);
    Driver getDriverById(Long id);
    void delete(Long id);
    List<Driver> getAll();
}
