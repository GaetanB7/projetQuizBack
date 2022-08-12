package fr.dawan.quiz.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import fr.dawan.quiz.enums.EnumLevel;

@Entity
@Table(name="quizs")
public class Quiz extends Db_Object {

    private static final long serialVersionUID = 1L;

    @Version
    private int version;
    private String titre;
    
    
    private String image;
    
    @Enumerated(EnumType.STRING)
    private EnumLevel niveau;
    private int nbQuestion;

    // relations 
    @ManyToOne(fetch = FetchType.EAGER)
    private Categorie categorie;
   
    @OneToMany(mappedBy = "quiz") 
    private List<Commentaire> commentaires;
    
    
    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonProperty( access=Access.READ_ONLY)
    private List<Question> questions;
    @OneToMany(mappedBy = "quiz")
    @JsonProperty( access=Access.WRITE_ONLY)
    private List<QuizDone> quizDones;
    
    public Quiz() {

    }

    public Quiz(String titre, String image, EnumLevel niveau, int nbQuestion) {
        super();
        this.titre = titre;
        this.image = image;
        this.niveau = niveau;
        this.nbQuestion = nbQuestion;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public EnumLevel getNiveau() {
        return niveau;
    }

    public void setNiveau(EnumLevel niveau) {
        this.niveau = niveau;
    }

    public int getNbQuestion() {
        return nbQuestion;
    }

    public void setNbQuestion(int nbQuestion) {
        this.nbQuestion = nbQuestion;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
 
    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<QuizDone> getQuizDones() {
        return quizDones;
    }

    public void setQuizDones(List<QuizDone> quizDones) {
        this.quizDones = quizDones;
    }

	@Override
	public String toString() {
		return "Quiz [titre=" + titre + ", image=" + image + ", niveau=" + niveau + ", nbQuestion=" + nbQuestion
				+ ", categorie=" + categorie + ", commentaires=" + commentaires + ", questions=" + questions
				+ ", quizDones=" + quizDones + ", getId()=" + getId() + "]";
	}
    
    


}
