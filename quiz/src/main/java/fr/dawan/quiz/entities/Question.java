package fr.dawan.quiz.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="questions")
public class Question extends Db_Object {

    private static final long serialVersionUID = 1L;

    @Version
    private int version;
    private String description;

    private String image;
    private boolean isMultiple;
    private int numOrder;

    @ManyToOne
    @JsonProperty( access=Access.WRITE_ONLY)
    private Quiz quiz;
    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
   // @JsonProperty( access=Access.WRITE_ONLY)
    private List<Reponse> reponses;
    
    public Question() {

    }

    public Question(String description, String image, boolean isMultiple, int numOrder) {

        this.description = description;
        this.image = image;
        this.isMultiple = isMultiple;
        this.numOrder = numOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

  
    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isMultiple() {
        return isMultiple;
    }

    public void setMultiple(boolean isMultiple) {
        this.isMultiple = isMultiple;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    
    
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }


    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }

	@Override
	public String toString() {
		return "Question [version=" + version + ", description=" + description + ", image=" + image + ", isMultiple="
				+ isMultiple + ", numOrder=" + numOrder + ", quiz=" + quiz + ", reponses=" + reponses + ", getId()="
				+ getId() + "]";
	}


}
