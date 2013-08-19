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
	
	public int position;
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	@Override
	public String toString() {
		return bezeichnung;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
