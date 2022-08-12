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

import fr.dawan.quiz.entities.Quiz;
import fr.dawan.quiz.entities.User;
import fr.dawan.quiz.services.QuizService;
@RestController
@RequestMapping ("/api/quiz")
@CrossOrigin(origins = "http://localhost:3000")
public class QuizControllerRest  {
    
    
    @Autowired
    private QuizService quizservice;
    
   
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Quiz> getAllQuiz(){
        return quizservice.getAllQuiz();      
    }
    
    
    @GetMapping("/{titre}")
    public List<Quiz> QuizByTitle(@PathVariable String titre){
        return quizservice.findQuizByTitreContains(titre);  
    }
    
    @GetMapping("/categorie/{id}")
    public List<Quiz> findQuizByCategorie (@PathVariable long id){
        return quizservice.findQuizByCategorie(id); 
    }
    
    
    @PostMapping("/add")
    public Quiz addQuiz  (@RequestBody Quiz quiz) {
        return quizservice.saveAndUpdate(quiz);
    }
    
    @GetMapping("/find/{id}")
    public Quiz findQuizById(@PathVariable long id){
        return quizservice.findById(id);
    }
    

    @DeleteMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> deleteQuiz(@PathVariable long id) {
        Quiz q = quizservice.findById(id);
        if (q == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Utilisateur introuvable!");

        } else {
            quizservice.deleteQuiz(id);
            return ResponseEntity.status(HttpStatus.OK).body("Quiz supprimée");
        }
    }
    
    @PutMapping("/update")
    public Quiz updateQuiz (@RequestBody Quiz quiz) {
        return quizservice.saveAndUpdate(quiz);
    }
        
    @GetMapping("/jouer/{id}")
    public Quiz findQuizAJouer(@PathVariable long id) {
    	return quizservice.findQuizAJouer(id);
    }
    
}
