package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.Route;
import stu.cn.ua.transport.repository.RouteRepository;
import stu.cn.ua.transport.service.RouteService;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route addRoute(Route route) {
        return routeRepository.saveAndFlush(route);
    }

    @Override
    public Route findById(Long id) {
        return routeRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        routeRepository.delete(id);
    }

    @Override
    public List<Route> getAll() {
        return routeRepository.findAll();
    }
}
