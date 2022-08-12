package fr.dawan.quiz.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.dawan.quiz.entities.User;
import fr.dawan.quiz.repositories.RepositoryUser;
import fr.dawan.quiz.services.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private RepositoryUser repository;
	
	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}

	@Override
	public User findById(long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteUser(long id) {
		repository.deleteById(id);
	}

	@Override
	public User saveAndUpdate(User user) {
		return repository.saveAndFlush(user);
	}

	@Override
	public Optional<User> findUserByEmail(String email) {
		return repository.findUserByEmail(email);
	}



}
