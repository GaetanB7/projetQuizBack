package fr.dawan.quiz.services;

import java.util.List;

import fr.dawan.quiz.entities.Quiz;

public interface QuizService {
    
    List<Quiz> getAllQuiz();

    Quiz findById(long id);

    void deleteQuiz(long id);

    Quiz saveAndUpdate(Quiz quiz);
    
    // rechercher par categorie 
    List<Quiz> findQuizByCategorie(long id);
    
    // chercher un quiz par mot clé
    List<Quiz> findQuizByTitreContains(String search);
    
    Quiz findQuizAJouer(long id);
    

}
