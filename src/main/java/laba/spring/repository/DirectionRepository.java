package laba.spring.repository;

import laba.spring.model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Long> {
    Direction getDirectionsByUsers(Long id);
    List<Direction> findAll();
}
