package fr.dawan.quiz.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Reponse;
@Repository
public interface RepositoryReponse extends JpaRepository<Reponse, Long> {

	@Query(value="SELECT r FROM Reponse r WHERE r.question =:id")
	List<Reponse> getAllReponseByQuestion(@Param("id")long id);
	
	
}
