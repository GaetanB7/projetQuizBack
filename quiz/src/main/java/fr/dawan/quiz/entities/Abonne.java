package fr.dawan.quiz.entities;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
@DiscriminatorValue("ABONNE")
public class Abonne extends User {

    private static final long serialVersionUID = 1L;

    private String pseudo;
    private LocalDate dateNaissance;
    @Lob
    private byte[] avatar;
    private boolean isValid=false;

    // relations avec les autres entities 
    @OneToMany(mappedBy = "abonne")
    private List<QuizDone> quizdones;
    
    public Abonne() {
        super();
    }

    public Abonne(String nom, String prenom, String email, String password, String confirmPassword,
            LocalDate dateCreation, String pseudo, LocalDate dateNaissance, byte[] avatar, boolean isValid) {
        super(nom, prenom, email, password, confirmPassword, dateCreation);
        this.pseudo = pseudo;
        this.dateNaissance = dateNaissance;
        this.avatar = avatar;
        this.isValid = isValid;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Abonne [pseudo=" + pseudo + ", dateNaissance=" + dateNaissance + ", avatar=" + Arrays.toString(avatar)
                + ", isValid=" + isValid + ", toString()=" + super.toString() + "]";
    }

    public List<QuizDone> getQuizdones() {
        return quizdones;
    }

    public void setQuizdones(List<QuizDone> quizdones) {
        this.quizdones = quizdones;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getUsername() {
		return super.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

  

    
    
    
}
