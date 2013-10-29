package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Raum extends Model{
	
	@Unique
	@Column(unique=true,length=10)
	public String bezeichnung;
	
	@Override
	public String toString() {
		return bezeichnung;
	}

}
