package stu.cn.ua.transport.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_time")
    private Date startTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_time")
    private Date endTime;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "route")
    private List<Transport> transports;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "routes")
    private List<Station> stations;

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
