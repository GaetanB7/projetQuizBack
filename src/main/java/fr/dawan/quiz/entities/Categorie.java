package fr.dawan.quiz.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="categories")
public class Categorie extends Db_Object {

    private static final long serialVersionUID = 1L;

    
    private String titre;
    
    private String image;
   
    //@Transient
    @OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
    @JsonProperty( access=Access.WRITE_ONLY)
    private List<Quiz> quizs;

    public Categorie() {

    }

    public Categorie(String titre, String image) {
        super();
        this.titre = titre;
        this.image = image;
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

 
    public List<Quiz> getQuizs() {
        return quizs;
    }


    public void setQuizs(List<Quiz> quizs) {
        this.quizs = quizs;
    }

	@Override
	public String toString() {
		return "Categorie [titre=" + titre + ", image=" + image + ", quizs=" + quizs + ", getId()=" + getId() + "]";
	}

 

}
