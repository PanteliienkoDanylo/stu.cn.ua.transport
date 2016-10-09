package stu.cn.ua.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import stu.cn.ua.transport.domain.ElectronicTicket;
import stu.cn.ua.transport.service.ElectronicTicketService;

import java.util.List;

@RestController
public class ElectronicTicketController {

    @Autowired
    private ElectronicTicketService electronicTicketService;

    @RequestMapping(value = "/createEl", method = RequestMethod.GET)
    public String createElectronicTicket(Double point, Integer number){
        ElectronicTicket electronicTicket = new ElectronicTicket();
        electronicTicket.setNumber(number);
        electronicTicket.setPoint(point);
        try{
            electronicTicketService.addElectronicTicket(electronicTicket);
        }catch (Exception ex){
            return ex.toString();
        }
        return "ElT  have done";
    }

    @RequestMapping(value = "/updateEl", method = RequestMethod.GET)
    public ElectronicTicket updatePoint(Double point, Long id){
        electronicTicketService.updatePoint(point, id);
        return electronicTicketService.findById(id);
    }



    @RequestMapping(value = "/getAllEl", method = RequestMethod.GET)
    public List<ElectronicTicket> getAllElectronicTicket(){
        return electronicTicketService.getAll();
    }
}
