package fr.dawan.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quiz.entities.Categorie;

@Repository
public interface RepositoryCategorie extends JpaRepository<Categorie, Long> {

}

