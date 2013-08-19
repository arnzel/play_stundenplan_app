package models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Stunde extends Model{
	
	public Date zeitVon = new Date();
	
	public Date zeitBis = new Date();
	
	@Override
	public String toString() {
		return new SimpleDateFormat("hh:mm").format(zeitVon) + "-" + new SimpleDateFormat("hh:mm").format(zeitBis);
	}

}
