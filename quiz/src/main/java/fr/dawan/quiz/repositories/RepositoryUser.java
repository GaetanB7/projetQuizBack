package fr.dawan.quiz.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Abonne;
import fr.dawan.quiz.entities.Quiz;
import fr.dawan.quiz.entities.User;

@Repository
public interface RepositoryUser extends JpaRepository<User, Long> {

	Optional<User> findUserByEmail(String email); 
}
