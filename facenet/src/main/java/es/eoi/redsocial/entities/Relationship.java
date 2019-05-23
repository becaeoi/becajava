package es.eoi.redsocial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "relationships")
@Getter
@Setter
public class Relationship {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "state")
	private int state;

	@ManyToOne(fetch = FetchType.LAZY)
<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git
	@JoinColumn(name="id_receive")
	private User receiveUser;
	
=======
	@JoinColumn(name = "id_receive")
	private User receiveUser;

>>>>>>> feb20e7 repositories(Event,Assistance,Relationship)
	@ManyToOne(fetch = FetchType.LAZY)
<<<<<<< Upstream, based on branch 'grupo4' of https://github.com/jotajota1302/becajava.git
	@JoinColumn(name="id_send")
	private User sendUser;

	public Relationship() {

	}

	public Relationship(int id, int state, User receiveUser, User sendUser) {
		this.id = id;
		this.state = state;
		this.receiveUser = receiveUser;
		this.sendUser = sendUser;
	}
=======
	@JoinColumn(name = "id_send")
	private User sendUser;

	public Relationship() {

	}

	public Relationship(int id, int state, User receiveUser, User sendUser) {
		this.id = id;
		this.state = state;
		this.receiveUser = receiveUser;
		this.sendUser = sendUser;
	}

>>>>>>> feb20e7 repositories(Event,Assistance,Relationship)
}
