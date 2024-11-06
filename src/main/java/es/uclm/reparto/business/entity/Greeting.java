package es.uclm.reparto.business.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column
	private String person;

	@Column
	private String content;

	public Greeting() {
	}

	public Greeting(String person, String content) {
		super();
		this.person = person;
		this.content = content;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", person=" + person + ", content=" + content + "]";
	}

	
	
}
