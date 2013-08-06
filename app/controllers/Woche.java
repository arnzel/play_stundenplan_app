package controllers;

import java.util.List;

import models.Tag;
import play.mvc.Controller;

public class Woche extends Controller {
	
	public static void show(long klassenId,String klassenbezeichnung){
		//List<Tag> tage = Tag.findAll();
		List<Tag> tage = Tag.find("order by id").fetch();
		render(tage,klassenbezeichnung);
	}

}
