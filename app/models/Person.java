package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Person extends Model{

	@Id
	@GeneratedValue
	public int id;
	public String name;
}
