package controllers;

import models.Klasse_Tag_Stunde;
import play.mvc.With;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Klasse_Tag_Stunde.class)
public class KlasseTagStundenCRUD extends CRUD {

}
