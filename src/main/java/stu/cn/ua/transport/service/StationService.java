package stu.cn.ua.transport.service;


import stu.cn.ua.transport.domain.Station;

import java.util.List;

public interface StationService {

    Station addStation(Station station);
    Station findById(Long id);
    void delete(Long id);
    List<Station> getAll();
}
