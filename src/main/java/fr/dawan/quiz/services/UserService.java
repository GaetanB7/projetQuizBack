package fr.dawan.quiz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import fr.dawan.quiz.entities.User;

public interface UserService {

    List<User> getAllUser();

    User findById(long id);

    void deleteUser(long id);

    User saveAndUpdate(User user);

    Optional<User> findUserByEmail(String email); 
}
