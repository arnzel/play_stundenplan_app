package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Tag extends Model{
	
	@Unique
	@Column(unique=true)
	public String bezeichnung;
	
	@Override
	public String toString() {
		return bezeichnung;
	}

}
