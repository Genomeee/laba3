package laba.spring.service;

import laba.spring.model.Direction;
import laba.spring.repository.DirectionRepository;
import laba.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DirectionService {
    @Autowired
    private DirectionRepository directionRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Direction> getUsersWithoutDirectins() {
        return directionRepository.findAll().stream()
                .filter(direction -> userRepository.findUserByDirection_Id(direction.getId()).isEmpty())
                .collect(Collectors.toList());

    }
}
