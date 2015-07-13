package controllers;

import java.util.List;

import models.Book;
import models.Person;
import play.data.Form;
import play.mvc.*;

import com.avaje.ebean.*;

import views.html.book.*;

public class BookCRUD extends Controller {

	public Result neew() {
		return ok(neew.render());
	}

	public Result save() {
		Book book = Form.form(Book.class).bindFromRequest().get();
		book.setStatus(false);
		book.save();
		return redirect(routes.BookCRUD.list());
	}

	public Result list() {
		List<Book> books = Book.find.findList();
		return ok(list.render(books));
	}

	public Result edit(Long id) {
		Book book = Book.find.byId(id);
		return ok(edit.render(book));
	}

	public Result delete(Long id) {
		Book.find.byId(id).delete();
		return redirect(routes.BookCRUD.list());
	}

	public Result toggleStatus(Long id) {
		Book book = Book.find.byId(id);
		
		System.out.println("Teste: " + book.getStatus());
		
		if(book.getStatus().equals(true)){
			book.setStatus(false);
			book.update();
			System.out.println("Teste: to false");
		} else {
			book.setStatus(true);
			book.update();
		}
		
		return redirect(routes.BookCRUD.list());
	}

}
