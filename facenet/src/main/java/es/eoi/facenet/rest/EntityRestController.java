package es.eoi.facenet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.eoi.facenet.entities.TestEntity;
import es.eoi.facenet.services.EntityService;
 
@RestController
public class EntityRestController {
 
	@Autowired
	EntityService service;
	
    @GetMapping("/entities/{id}")
    public TestEntity message(@PathVariable String id) {   
    	return service.getEntityById(Integer.parseInt(id));
    }
}