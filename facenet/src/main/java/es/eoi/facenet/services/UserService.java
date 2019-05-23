package es.eoi.facenet.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.User;
import es.eoi.facenet.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public User getUserById(Integer id) {
		return this.repository.findById(id).get();
	}	
	
	public User updateUser(User user) {
		return this.repository.save(user);
	}
	
	public void deleteUser(User user) {
		this.repository.delete(user);
	}
	
	public List<User> findAll(){
		return this.repository.findAll();
	}

}
