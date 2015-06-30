package controllers;

import java.util.List;

import models.Person;
import play.data.Form;
import play.mvc.*;

import com.avaje.ebean.*;

import views.html.*;
import static play.libs.Json.toJson;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result addPerson() {
    	Person person = Form.form(Person.class).bindFromRequest().get();
    	person.save();
        return redirect(routes.Application.index());
    }
    
    @SuppressWarnings("unchecked")
	public Result getPersons() {
    	@SuppressWarnings({ "rawtypes", "deprecation" })
		List<Person> persons = new Model.Finder(String.class, Person.class).all();
        return ok(toJson(persons));
    }
}
