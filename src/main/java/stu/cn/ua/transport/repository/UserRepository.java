package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import stu.cn.ua.transport.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Query("select u from User u where u.id = :id")
    User findById(@Param("id") Long id);

    @Query("select u from User u where u.login = :login")
    User findByLogin(@Param("login") String login);

    @Query("select u from User u where u.name = :name")
    User findByName(@Param("name") String name);

    @Query("select u from User u where u.surname = :surname")
    User findBySurname(@Param("surname") String surname);
}
