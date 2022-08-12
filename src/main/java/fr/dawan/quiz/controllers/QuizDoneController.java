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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.quiz.entities.QuizDone;
import fr.dawan.quiz.services.QuizDoneService;

@RestController
@RequestMapping ("/api/quizdone")
@CrossOrigin(origins = "http://localhost:3000")
public class QuizDoneController {

	@Autowired
	private QuizDoneService service;
	
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QuizDone> getAll() {

        return service.getAllQuizDone()
;    }

//    @GetMapping(value = "find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public QuizDone findQuizDone(@PathVariable long id) {
//        return service.findById(id);
//
//    }
    
    @GetMapping(value = "find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QuizDone> findQuizDonebyUser(@PathVariable long id) {
        return service.findQuizDonebyUser(id);
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public QuizDone addQuizDone(@RequestBody QuizDone quizDone) {
        return service.saveAndUpdate(quizDone);
    }


    @DeleteMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> deleteQuizDone(@PathVariable long id) {
        QuizDone q = service.findById(id);
        if (q == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quiz introuvable!");

        } else {
            service.deleteQuizDone(id);
            return ResponseEntity.status(HttpStatus.OK).body("Quiz supprimée");
        }

    }

}
