package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.cn.ua.transport.domain.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long>{
}
