package fr.dawan.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.QuizDone;

@Repository
public interface RepositoryQuizDone extends JpaRepository<QuizDone, Long> {

}
