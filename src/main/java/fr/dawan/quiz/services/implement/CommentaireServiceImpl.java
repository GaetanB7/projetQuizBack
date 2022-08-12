package fr.dawan.quiz.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.Commentaire;
import fr.dawan.quiz.repositories.RepositoryCommentaire;
import fr.dawan.quiz.services.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService{

	@Autowired
	private RepositoryCommentaire repository;
	
	@Override
	public List<Commentaire> getAllCommentaire() {
		return repository.findAll();
	}

	@Override
	public Commentaire findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteCommentaire(long id) {
		repository.deleteById(id);
	}

	@Override
	public Commentaire saveAndUpdate(Commentaire commentaire) {
		return repository.saveAndFlush(commentaire);
	}

	public void setRepository(RepositoryCommentaire repository) {
		this.repository = repository;
	}



	
}
