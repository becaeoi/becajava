package es.eoi.facenet.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class UserDto {
	
	private int id;

	private String name;

	private String surname;
	
	private Date birthDate;
	
	private Date startDate;
	
	private String user;

	private String password;

	
}
