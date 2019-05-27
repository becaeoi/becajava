package es.eoi.facenet.services;

import java.util.List;


import org.springframework.stereotype.Service;

import es.eoi.facenet.entities.User;

public interface UserService {

	public List<User> findAll();
	public User findAllActiveUsers(String userName, String pass);
	public User findById(int id);
	public User save(User user);
	public boolean existsById(int id);
}
