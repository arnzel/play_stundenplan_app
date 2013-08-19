package controllers;

import models.Tag;
import play.mvc.With;
import controllers.CRUD.For;

@With(Secure.class)
@For(value=Tag.class)
public class TageCrud extends CRUD{

}
