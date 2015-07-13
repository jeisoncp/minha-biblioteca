package models;

import java.util.Date;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import play.data.validation.Constraints;

@Entity
public class Book extends Model{

	@Id
	@GeneratedValue
	private Long id;

	@Constraints.Required
	private String name;

	@Constraints.Required
	private String author;
	
	private String publisher;
	private Boolean status;
	
	public static Model.Finder<Long,Book> find =
			new Model.Finder<Long,Book>(Book.class);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}
}
