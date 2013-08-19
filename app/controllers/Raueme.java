package controllers;

import java.util.List;

import models.Raum;
import play.mvc.Controller;

public class Raueme extends Controller{
	
	public static void all(){
		List<Raum> raueme = Raum.findAll();
		render(raueme);
	}

}
