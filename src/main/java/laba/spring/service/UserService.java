package laba.spring.service;

import laba.spring.model.User;
import laba.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> users() {

        List<User> users = userRepository.findAll();

        users.sort(Comparator.comparing(User::getCountOfDegree)
                .thenComparing(User::getCountOfRank)
                .thenComparing(User::getCountOfPublication)
                .thenComparing(user -> user.getDirection().getName()).reversed());

        return users;

    }
}
