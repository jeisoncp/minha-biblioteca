package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import play.data.validation.Constraints;

@Entity
public class Person extends Model{

	@Id
	@GeneratedValue
	private Long id;
	
	@Constraints.Required
	private String name;
	
	@Constraints.Required
	private String user;
	
	@Constraints.Required
	private String password;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
