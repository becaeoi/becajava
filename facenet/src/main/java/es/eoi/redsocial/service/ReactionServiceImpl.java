package es.eoi.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.eoi.redsocial.entity.Reaction;
import es.eoi.redsocial.repository.ReactionRepository;

@Service
public class ReactionServiceImpl implements ReactionService {

	@Autowired
	ReactionRepository reationRepository;
	
	@Override
	public List<Reaction> findAllReactionById(int id) {
		//TODO query personalizada
		return null;
	}

	@Override
	public void createReactionByUser(int idUsuario, String typeReation) {
		// TODO query personalizada
		
	}

}
