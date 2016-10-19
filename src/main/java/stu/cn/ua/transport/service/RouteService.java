package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.Route;

import java.util.List;

public interface RouteService {

    Route addRoute(Route route);
    Route findById(Long id);
    void delete(Long id);
    List<Route> getAll();
}
