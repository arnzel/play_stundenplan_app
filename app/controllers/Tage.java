package controllers;

import java.util.List;

import models.Klasse_Tag_Stunde;
import models.Tag;
import play.mvc.Controller;

public class Tage extends Controller {
	
	public static void show(long tagId,long klassenId ){
		List<Klasse_Tag_Stunde> results= Klasse_Tag_Stunde.find("byTag_idAndKlasse_Id",tagId,klassenId).fetch();
		Tag tag  = Tag.findById(tagId);
		String tagBezeichnung = tag.bezeichnung;
		render(results,tagBezeichnung);
	}
	
	public static void showLehrer(long tagId,long lehrerId ){
		List<Klasse_Tag_Stunde> results= Klasse_Tag_Stunde.find("byTag_idAndLehrer_Id",tagId,lehrerId).fetch();
		Tag tag  = Tag.findById(tagId);
		String tagBezeichnung = tag.bezeichnung;
		renderTemplate("Tage/show.html",results,tagBezeichnung);
	}
	
	public static void showRaum(long tagId,long raumId ){
		List<Klasse_Tag_Stunde> results= Klasse_Tag_Stunde.find("byTag_idAndRaum_Id",tagId,raumId).fetch();
		Tag tag  = Tag.findById(tagId);
		String tagBezeichnung = tag.bezeichnung;
		renderTemplate("Tage/show.html",results,tagBezeichnung);
	}

}
