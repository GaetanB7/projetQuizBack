package fr.dawan.quiz.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name="quizdones")
public class QuizDone extends Db_Object {
	
	

    private static final long serialVersionUID = 1L;

    @Version
    private int version;
    private int score;
    private LocalDate dateQuiz;

    @ManyToOne
    private Abonne abonne ;
    @ManyToOne
    private Quiz quiz;
    
    public QuizDone() {

    }

    public QuizDone(int score, LocalDate dateQuiz) {

        this.score = score;
        this.dateQuiz = dateQuiz;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDate getDateQuiz() {
        return dateQuiz;
    }

    public void setDateQuiz(LocalDate dateQuiz) {
        this.dateQuiz = dateQuiz;
    }

    
    public Abonne getAbonne() {
        return abonne;
    }

    public void setAbonne(Abonne abonne) {
        this.abonne = abonne;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "QuizDone [version=" + version + ", score=" + score + ", dateQuiz=" + dateQuiz + ", toString()="
                + super.toString() + "]";
    }

}
