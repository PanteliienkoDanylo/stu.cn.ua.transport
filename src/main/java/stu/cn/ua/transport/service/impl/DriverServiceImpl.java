package stu.cn.ua.transport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.Driver;
import stu.cn.ua.transport.repository.DriverRepository;
import stu.cn.ua.transport.service.DriverService;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.saveAndFlush(driver);
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        driverRepository.delete(id);
    }

    @Override
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }
}
