package stu.cn.ua.transport.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.Route;
import stu.cn.ua.transport.domain.Station;
import stu.cn.ua.transport.domain.Transport;
import stu.cn.ua.transport.service.RouteService;
import stu.cn.ua.transport.service.StationService;

import java.util.Date;

@RestController
public class RouteStationContoller {

    @Autowired
    private RouteService routeService;

    @Autowired
    private StationService stationService;

    @RequestMapping(value = "/createRoute", method = RequestMethod.GET)
    public String createRoute() {
        Route route = new Route();
        route.setStartTime(new Date(System.currentTimeMillis()));
        route.setEndTime(new Date(System.currentTimeMillis()));
        try {
            routeService.addRoute(route);
        } catch (Exception ex) {
            return ex.toString();
        }

        return "User have done";
    }

    @RequestMapping(value = "/createStation", method = RequestMethod.GET)
    public String createStation() {
        Station station = new Station();
        station.setName("RKZ");
        station.setLongitude(9.9);
        station.setLatitude(9.9);
        try {
            stationService.addStation(station);
        } catch (Exception ex) {
            return ex.toString();
        }

        return "User have done";
    }

}
