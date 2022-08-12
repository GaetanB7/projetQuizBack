package fr.dawan.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="reponses")
public class Reponse extends Db_Object {

    private static final long serialVersionUID = 1L;

    @Version
    private int version;
    private String description;
    private boolean isValid;

    @ManyToOne
    @JsonProperty( access=Access.WRITE_ONLY)
    private Question question;
    
    public Reponse() {

    }

    public Reponse(String description, boolean isValid) {

        this.description = description;
        this.isValid = isValid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    
    
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Reponse [version=" + version + ", description=" + description + ", isValid=" + isValid + ", toString()="
                + super.toString() + "]";
    }

}
