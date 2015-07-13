package controllers;

import java.util.List;
import models.Login;
import models.Person;
import play.data.Form;
import play.mvc.*;

import com.avaje.ebean.*;

import views.html.person.*;

public class PersonCRUD extends Controller {

  public Result neew() {
    return ok(neew.render());
  }

  public Result save() {
    Person person = Form.form(Person.class).bindFromRequest().get();
    person.save();
    return redirect(routes.Application.index());
  }
  
  public Result login() {
	  Login login = Form.form(Login.class).bindFromRequest().get();
	  	  
	  List<Person> personDb = Ebean.find(Person.class)
			  .where()
			  	.eq("user", login.getUser())
			  	.eq("password", login.getPassword())
			  	.findList();
	  
	  if(personDb.size() == 1){
		  return redirect(routes.BookCRUD.list());
	  }
	  return redirect(routes.Application.index());
  }

}
