package stu.cn.ua.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.Route;
import stu.cn.ua.transport.domain.Station;
import stu.cn.ua.transport.domain.Transport;
import stu.cn.ua.transport.domain.User;
import stu.cn.ua.transport.service.TransportService;

import java.util.*;

@RestController
public class TransportController {

    /*@Autowired
    private TransportService transportService;*/


    /*@RequestMapping(value = "/createTransport", method = RequestMethod.GET)
    public String createTransport() {
        Transport transport = new Transport();
        transport.setNumber(12);
        transport.setRoute(getRoute());
        transport.setLongitude(99.99);
        transport.setLatitude(99.00);
        try {
            transportService.addTransport(transport);
        } catch (Exception ex) {
            return ex.toString();
        }

        return "User have done";
    }*/

    /*@RequestMapping(value = "/getAllTransport", method = RequestMethod.GET)
    public List<Transport> getAllTransport(){
        return transportService.getAll();
    }*/

    /*private Route getRoute(){
        Route route = new Route();
        route.setStartTime(new Date(System.currentTimeMillis()));
        route.setEndTime(new Date(System.currentTimeMillis()));
        route.setStations(getListStation());
        return route;
    }


    private Set<Station> getListStation(){
        Set<Station> stations = new HashSet<>();
        Station station = new Station();
        station.setName("hello");
        station.setLongitude(99.9);
        station.setLatitude(88.8);
        station.setRoutes(getListRoute());
        stations.add(station);
        return stations;
    }

    private Set<Route> getListRoute(){
        Set<Route> routes = new HashSet<>();
        routes.add(getRoute());
        return routes;
    }

    private Set<Transport> getListTransport(){
        Set<Transport> transports = new HashSet<>();
        Transport transport = new Transport();
        transport.setNumber(12);
        transport.setRoute(getRoute());
        transport.setLongitude(99.99);
        transport.setLatitude(99.00);
        transports.add(transport);
        return transports;
    }*/
}
