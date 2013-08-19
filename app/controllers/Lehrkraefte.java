package controllers;

import java.util.List;

import models.Lehrer;
import play.mvc.Controller;

public class Lehrkraefte extends Controller {
	
	public static void all(){
		List<Lehrer> lehrer = Lehrer.findAll();
		render(lehrer);
		
	}

}
