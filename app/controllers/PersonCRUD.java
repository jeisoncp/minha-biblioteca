package controllers;

import java.util.List;

import models.Person;
import play.data.Form;
import play.mvc.*;

import com.avaje.ebean.*;

import views.html.person.*;

public class PersonCRUD extends Controller {

  public Result neew() {
    return ok(neew.render(""));
  }

  public Result save() {
    Person person = Form.form(Person.class).bindFromRequest().get();
    person.save();
    return redirect(routes.Application.index());
  }

}
