package controllers;

import play.mvc.With;
import models.Lehrer;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Lehrer.class)
public class LehrerCRUD extends CRUD{

	
	
}
