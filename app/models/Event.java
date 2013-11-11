package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Event extends Model {
	
  @Column(length=19)
	public String EvDatum;
	
	@Column(length=10)
	public String EvRaum;
	
	@Column(length=5)
	public String EvKurzname;

  //@Unique
	//@Column(unique=true,length=10,nullable=false)
	//public String EvBezeichnung;
  
  public  String toString(){
    return EvKurzname;
  }
  

}