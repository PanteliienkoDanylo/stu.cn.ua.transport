package stu.cn.ua.transport.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import stu.cn.ua.transport.domain.UserStory;

public interface UserStoryRepository extends JpaRepository<UserStory, Long>{
}
