package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Klasse_Tag_Stunde extends Model{
	
	@ManyToOne
	public Klasse klasse;
	
	@ManyToOne
	public Tag tag;
	
	@ManyToOne
	public Stunde stunde;
	
	@ManyToOne
	public Raum raum;
	
	@ManyToOne
	public Lehrer lehrer;
	
	@ManyToOne
	public Unterrichtsfach unterrichtsfach;
	
	@Override
	public String toString() {
		return klasse + "-" + tag + "-" + raum + "-" + stunde;
	}

}
