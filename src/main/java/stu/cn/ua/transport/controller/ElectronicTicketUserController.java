package stu.cn.ua.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.ElectronicTickerUser;
import stu.cn.ua.transport.domain.ElectronicTicket;
import stu.cn.ua.transport.domain.User;
import stu.cn.ua.transport.service.ElectronicTicketService;
import stu.cn.ua.transport.service.ElectronicTicketUserService;
import stu.cn.ua.transport.service.UserService;

import java.util.List;

@RestController
public class ElectronicTicketUserController {

    @Autowired
    private ElectronicTicketUserService electronicTicketUserService;

    @Autowired
    private UserService userService;

    @Autowired
    private ElectronicTicketService electronicTicketService;

    @RequestMapping(value = "/createElTicketUser", method = RequestMethod.GET)
    public String createElTicketUser() {
        User user = new User();
        user.setName("1");
        user.setSurname("1");
        user.setLogin("1");
        user.setPassword("1");


        ElectronicTicket electronicTicket = new ElectronicTicket();
        electronicTicket.setNumber(1111);
        electronicTicket.setPoint(1.1);


        ElectronicTickerUser electronicTickerUser = new ElectronicTickerUser();
        electronicTickerUser.setUser(user);
        electronicTickerUser.setElectronicTicket(electronicTicket);
        try {
            userService.addUser(user);
            electronicTicketService.addElectronicTicket(electronicTicket);
            electronicTicketUserService.add(electronicTickerUser);
        } catch (Exception ex) {
            return ex.toString();
        }

        return "User have done";
    }


    @RequestMapping("/getAllElTicketUser")
    public List<ElectronicTickerUser> users() {
        return electronicTicketUserService.getAll();
    }
}
