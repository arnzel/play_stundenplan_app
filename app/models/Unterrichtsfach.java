package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Unterrichtsfach extends Model{
	
	@Column(length=10,nullable=false)
	@Required
	public String kurzname;
	
	
	@Unique
	@Column(unique=true,length=45)
	public String bezeichnung;
	
	@Override
	public String toString() {
		return kurzname;
	}
	
	

}
