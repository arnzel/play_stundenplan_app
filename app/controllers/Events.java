package controllers;

import java.util.List;

import models.Event;
import play.mvc.Controller;

class Events extends Controller {
	
	public static void all(){
		List<Event> events = Event.findAll();
		render(events);
		
	}

}