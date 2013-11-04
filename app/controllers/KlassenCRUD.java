package controllers;

import models.Klasse;
import play.mvc.With;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Klasse.class)
public class KlassenCRUD extends CRUD {

}
