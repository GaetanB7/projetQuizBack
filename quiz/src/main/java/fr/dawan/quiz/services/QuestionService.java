package fr.dawan.quiz.services;

import java.util.List;

import fr.dawan.quiz.entities.Question;

public interface QuestionService {

    
    List<Question> getAllQuestion();

    Question findById(long id);

    void deleteQuestion(long id);

    Question saveAndUpdate(Question question);
}
