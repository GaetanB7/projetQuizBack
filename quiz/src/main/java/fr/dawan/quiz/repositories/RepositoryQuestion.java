package fr.dawan.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Question;

@Repository
public interface RepositoryQuestion extends JpaRepository<Question, Long> {

}
