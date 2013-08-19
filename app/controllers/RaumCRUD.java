package controllers;

import play.mvc.With;
import models.Raum;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Raum.class)
public class RaumCRUD extends CRUD{

}
