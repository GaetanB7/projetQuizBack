package fr.dawan.quiz.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.QuizDone;
import fr.dawan.quiz.entities.User;

@Repository
public interface RepositoryQuizDone extends JpaRepository<QuizDone, Long> {

	@Query("FROM QuizDone qd JOIN qd.abonne a WHERE a.id=:abonne_id")
	List<QuizDone> findQuizDonebyUser(@Param("abonne_id") long id); 
}
