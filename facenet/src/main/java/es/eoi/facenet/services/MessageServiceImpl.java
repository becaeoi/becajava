package es.eoi.facenet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.facenet.repositories.MessageRepository;



@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository repository;
	

}