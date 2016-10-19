package stu.cn.ua.transport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.cn.ua.transport.domain.Station;
import stu.cn.ua.transport.repository.StationRepository;
import stu.cn.ua.transport.service.StationService;

import java.util.List;

@Service
public class StationServiceImpl implements StationService{

    @Autowired
    private StationRepository stationRepository;

    @Override
    public Station addStation(Station station) {
        return stationRepository.saveAndFlush(station);
    }

    @Override
    public Station findById(Long id) {
        return stationRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        stationRepository.delete(id);
    }

    @Override
    public List<Station> getAll() {
        return stationRepository.findAll();
    }
}
