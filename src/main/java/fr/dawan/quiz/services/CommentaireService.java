package fr.dawan.quiz.services;

import java.util.List;

import fr.dawan.quiz.entities.Commentaire;

public interface CommentaireService {

    
    List<Commentaire> getAllCommentaire();

    Commentaire findById(long id);

    void deleteCommentaire(long id);

    Commentaire saveAndUpdate(Commentaire commentaire);
}
