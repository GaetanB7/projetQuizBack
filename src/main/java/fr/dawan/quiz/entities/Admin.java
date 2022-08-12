package fr.dawan.quiz.entities;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User {

    private static final long serialVersionUID = 1L;

    public Admin() {
        super();
        
    }

    public Admin(String nom, String prenom, String email, String password, String confirmPassword,
            LocalDate dateCreation) {
        super(nom, prenom, email, password, confirmPassword, dateCreation);
       
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
