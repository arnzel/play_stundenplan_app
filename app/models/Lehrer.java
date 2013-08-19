package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Lehrer extends Model{
	
	public String kurzname;
	
	public String name;
	
	public String vorname;
	
	@Override
	public String toString() {
		return kurzname;
	}

}
