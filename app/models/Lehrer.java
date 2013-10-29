package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Lehrer extends Model{
	
	@Column(length=5)
	public String Kurzname;
	
	@Column(length=45)
	public String Name;
	
	@Column(length=45)
	public String Vorname;
	
	@Override
	public String toString() {
		return Kurzname;
	}

}
