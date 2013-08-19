package controllers;

import models.Stunde;
import play.mvc.With;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Stunde.class)
public class StundenCRUD extends CRUD {

}
