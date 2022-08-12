package fr.dawan.quiz.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Quiz;

@Repository
public interface RepositoryQuiz extends JpaRepository<Quiz, Long> {

	@Query("FROM Quiz q JOIN q.categorie c WHERE c.id=:categorie_id")
	//@Query(value = "Select * FROM quizs  WHERE categorie_id =id", nativeQuery = true)
	List<Quiz> findQuizByCategorie(@Param("categorie_id") long id);

	// List<Quiz> findQuizByCategorie(long id);

	List<Quiz> findQuizByTitreContains(String search);

	
	@Query(value = "FROM Quiz q"
//			+ " JOIN q.questions qs"
//			+ " JOIN qs.reponses qz"
			+ " WHERE q.id=:id")
	//@Query(value = "SELECT q.id AS quiz_id, q.image , q.titre , qs.id AS question_id , qs.description , qs.image , r.id AS reponse_id , r.description ,r.is_valid FROM quizs q INNER JOIN questions qs ON q.id=qs.quiz_id INNER JOIN reponses r ON qs.id=r.question_id WHERE q.id=id", nativeQuery = true)
	//@Query(value = "SELECT qs FROM Quiz q JOIN q.question qs WHERE q.id=:id")
	Quiz findQuizAJouer(@Param("id") long id);

}