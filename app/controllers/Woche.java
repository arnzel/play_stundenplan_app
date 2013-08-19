package controllers;

import java.util.List;

import models.Tag;
import play.mvc.Controller;

public class Woche extends Controller {
	
	public static void show(long klassenId,String klassenbezeichnung){
		//List<Tag> tage = Tag.findAll();
		List<Tag> tage = Tag.find("order by position").fetch();
		render(tage,klassenbezeichnung);
	}
	
	public static void showLehrer(long lehrerId,String vorname,String name){
		//List<Tag> tage = Tag.findAll();
		List<Tag> tage = Tag.find("order by position").fetch();
		String bezeichnung = vorname + " " + name;
		render(tage,bezeichnung);
	}
	
	public static void showRaum(long raumId,String bezeichnung){
		List<Tag> tage = Tag.find("order by position").fetch();
		render(tage,bezeichnung);
	}

}
