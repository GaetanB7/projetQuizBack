package fr.dawan.quiz.services.implement;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.Quiz;
import fr.dawan.quiz.repositories.RepositoryQuiz;
import fr.dawan.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	
	@Autowired
	private RepositoryQuiz repository;
	
	@Override
	public List<Quiz> getAllQuiz() {
		return repository.findAll();
	}

	@Override
	public Quiz findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteQuiz(long id) {
		repository.deleteById(id);
	}

	@Override
	public Quiz saveAndUpdate(Quiz quiz) {
		return repository.saveAndFlush(quiz);
	}


	@Override
	public List<Quiz> findQuizByTitreContains(String search) {
		return repository.findQuizByTitreContains(search);
	}


	@Override
	public List<Quiz> findQuizByCategorie(long id) {
		return repository.findQuizByCategorie(id);
	}


	@Override
	public Quiz findQuizAJouer(long id) {
		return repository.findQuizAJouer(id);
	}
	
	
	public void setRepository(RepositoryQuiz repository) {
		this.repository = repository;
	}


}
