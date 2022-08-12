package fr.dawan.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.quiz.entities.Categorie;
import fr.dawan.quiz.services.CategorieService;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:3000")
public class CategorieControllerRest {

    @Autowired
    CategorieService categorieService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Categorie> getAll() {

        return categorieService.getAllCategorie();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Categorie findCategorie(@PathVariable long id) {
        return categorieService.findById(id);

    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveAndUpdate(categorie);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public Categorie updateCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveAndUpdate(categorie);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> deleteCategorie(@PathVariable long id) {
        Categorie c = categorieService.findById(id);
        if (c == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categorie introuvable!");

        } else {
            categorieService.deleteCategorie(id);
            return ResponseEntity.status(HttpStatus.OK).body("Categorie supprimée");
        }

    }

}

