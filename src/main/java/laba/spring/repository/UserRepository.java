package laba.spring.repository;

import laba.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Set<User> findUserByDirection_Id(Long directionId);
    Set<User> getUsersById(String id);
    List<User> findAll();
}
