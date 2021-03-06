package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Klasse extends Model {
	
	@Unique
	@Column(unique=true,length=10,nullable=false)
	public String bezeichnung;
	
	@Override
	public String toString() {
		return bezeichnung;
	}

}
