package stu.cn.ua.transport.domain;

import javax.persistence.*;


@Entity
@Table(name = "electronic_ticket")
public class ElectronicTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "point")
    private Double point;

    @Column(name = "number")
    private Integer number;

    public ElectronicTicket() {
    }

    public ElectronicTicket(Double point, Integer number) {
        this.point = point;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
