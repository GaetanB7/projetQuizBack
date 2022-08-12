package fr.dawan.quiz.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commentaires")
public class Commentaire extends Db_Object {

    private static final long serialVersionUID = 1L;

    private String description;
    private LocalDate dateCreation;
    
    @ManyToOne
    private Quiz quiz;

    public Commentaire() {

    }

    public Commentaire(String description, LocalDate dateCreation) {

        this.description = description;
        this.dateCreation = dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    
    
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Commentaire [description=" + description + ", dateCreation=" + dateCreation + ", toString()="
                + super.toString() + "]";
    }

}
