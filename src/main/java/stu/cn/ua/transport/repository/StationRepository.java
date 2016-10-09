package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import stu.cn.ua.transport.domain.Station;

public interface StationRepository extends JpaRepository<Station, Long>{
}
