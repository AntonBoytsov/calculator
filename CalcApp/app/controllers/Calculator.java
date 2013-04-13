package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Calculator extends Controller {
	
	public static Result index() {
		return ok(views.html.calculator.render());
	}
	
}
