package controllers;

import java.util.List;

import models.Klasse;
import play.mvc.Controller;

public class Klassen extends Controller {
	
	public static void all(){
		List<Klasse> klassen = Klasse.findAll();
		render(klassen);
		
	}

}
