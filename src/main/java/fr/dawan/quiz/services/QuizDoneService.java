package fr.dawan.quiz.services;

import java.util.List;
import java.util.Optional;

import fr.dawan.quiz.entities.QuizDone;

public interface QuizDoneService {

    
    List<QuizDone> getAllQuizDone();

    QuizDone findById(long id);

    void deleteQuizDone(long id);

    QuizDone saveAndUpdate(QuizDone quizDone);
    
    List<QuizDone> findQuizDonebyUser(long id);
    
}
