package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import stu.cn.ua.transport.domain.Transport;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}
