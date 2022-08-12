package fr.dawan.quiz.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.QuizDone;
import fr.dawan.quiz.repositories.RepositoryQuizDone;
import fr.dawan.quiz.services.QuizDoneService;

@Service
public class QuizDoneServiceImpl implements QuizDoneService {
	
	@Autowired
	private RepositoryQuizDone repository;
	
	@Override
	public List<QuizDone> getAllQuizDone() {
		return repository.findAll();
	}

	@Override
	public QuizDone findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteQuizDone(long id) {
		repository.deleteById(id);

	}

	@Override
	public QuizDone saveAndUpdate(QuizDone quizDone) {
		return repository.saveAndFlush(quizDone);
	}


	public void setRepository(RepositoryQuizDone repository) {
		this.repository = repository;
	}

}
