package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import stu.cn.ua.transport.domain.ElectronicTicket;


@Repository
public interface ElectronicTicketRepository extends JpaRepository<ElectronicTicket, Long> {

    @Query("select e from ElectronicTicket e where e.id = :id")
    ElectronicTicket findById(@Param("id") Long id);

    @Query("select e from ElectronicTicket e where e.number = :number")
    ElectronicTicket findByNumber(@Param("number") Integer number);

    @Query("update ElectronicTicket e set e.point = :point where e.id = :id")
    void updatePointById(@Param("point") Double point, @Param("id") Long id);
}
