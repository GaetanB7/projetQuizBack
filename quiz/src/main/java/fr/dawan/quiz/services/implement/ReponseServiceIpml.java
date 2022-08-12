package fr.dawan.quiz.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.Reponse;
import fr.dawan.quiz.repositories.RepositoryReponse;
import fr.dawan.quiz.services.ReponseService;

@Service
public class ReponseServiceIpml implements ReponseService {

	@Autowired
	private RepositoryReponse repository;
	

	@Override
	public Reponse findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteReponse(long id) {
		repository.deleteById(id);
	}

	@Override
	public Reponse saveAndUpdate(Reponse reponse) {
		return repository.saveAndFlush(reponse);
	}

	@Override
	public List<Reponse> getAllReponseByQuestion(long id) {
		return repository.getAllReponseByQuestion(id);
	}

	public void setRepository(RepositoryReponse repository) {
		this.repository = repository;
	}


		
}
