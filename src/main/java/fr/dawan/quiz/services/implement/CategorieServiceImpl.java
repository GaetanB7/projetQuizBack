package fr.dawan.quiz.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.Categorie;
import fr.dawan.quiz.repositories.RepositoryCategorie;
import fr.dawan.quiz.services.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	private RepositoryCategorie repository;
	
	@Override
	public List<Categorie> getAllCategorie() {
		return repository.findAll();
	}

	@Override
	public Categorie findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteCategorie(long id) {
		repository.deleteById(id);		
	}

	@Override
	public Categorie saveAndUpdate(Categorie categorie) {
		return repository.saveAndFlush(categorie);
	}

	
	public void setRepository(RepositoryCategorie repository) {
		this.repository = repository;
	}
}
