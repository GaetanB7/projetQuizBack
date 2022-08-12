package fr.dawan.quiz.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.Question;
import fr.dawan.quiz.repositories.RepositoryQuestion;
import fr.dawan.quiz.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private RepositoryQuestion repository;
	
	@Override
	public List<Question> getAllQuestion() {
		return repository.findAll();
	}

	@Override
	public Question findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteQuestion(long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Question saveAndUpdate(Question question) {
		return repository.saveAndFlush(question);
	}

	public void setRepository(RepositoryQuestion repository) {
		this.repository = repository;
	}

	
}
