package fr.dawan.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Commentaire;

@Repository
public interface RepositoryCommentaire extends JpaRepository<Commentaire, Long> {

}
