package controllers;

import models.Event;
import play.mvc.With;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Event.class)
public class EventsCRUD extends CRUD {

}
