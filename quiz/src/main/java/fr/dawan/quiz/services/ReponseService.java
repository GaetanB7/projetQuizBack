package fr.dawan.quiz.services;

import java.util.List;

import fr.dawan.quiz.entities.Reponse;

public interface ReponseService {

	List<Reponse> getAllReponseByQuestion(long id);
	
    Reponse findById(long id);

    void deleteReponse(long id);

    Reponse saveAndUpdate(Reponse reponse);
}
