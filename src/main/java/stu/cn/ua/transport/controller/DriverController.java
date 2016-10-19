package stu.cn.ua.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.Driver;
import stu.cn.ua.transport.service.DriverService;
import stu.cn.ua.transport.service.TransportService;
import stu.cn.ua.transport.service.UserService;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @Autowired
    private TransportService transportService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/createDriver", method = RequestMethod.GET)
    public String createDriver() {
        Driver driver = new Driver();
        driver.setUser(userService.findById(1l));
        driver.setTransport(transportService.findById(1l));

        try {
            driverService.addDriver(driver);
        } catch (Exception ex) {
            return ex.toString();
        }

        return "User have done";
    }
}
