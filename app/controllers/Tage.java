package controllers;

import java.util.List;

import models.Klasse_Tag_Stunde;
import play.mvc.Controller;

public class Tage extends Controller {
	
	public static void show(long tagId,long klassenId ){
		List<Klasse_Tag_Stunde> results= Klasse_Tag_Stunde.find("byTag_idAndKlasse_Id",tagId,klassenId).fetch();
		
		render(results);
	}

}
