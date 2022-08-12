package fr.dawan.quiz.services;

import java.util.List;

import fr.dawan.quiz.entities.Categorie;

public interface CategorieService {

    
    List<Categorie> getAllCategorie();

    Categorie findById(long id);

    void deleteCategorie(long id);

    Categorie saveAndUpdate(Categorie categorie);
    

}
