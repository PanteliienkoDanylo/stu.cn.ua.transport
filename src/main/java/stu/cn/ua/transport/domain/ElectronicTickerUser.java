package stu.cn.ua.transport.domain;

import javax.persistence.*;

@Entity
@Table(name = "electronic_ticket_user")
public class ElectronicTickerUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "electronic_ticket_id")
    private ElectronicTicket electronicTicket;

    public ElectronicTickerUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ElectronicTicket getElectronicTicket() {
        return electronicTicket;
    }

    public void setElectronicTicket(ElectronicTicket electronicTicket) {
        this.electronicTicket = electronicTicket;
    }
}
