package jobs;

import java.util.Date;

import models.Klasse;
import models.Lehrer;
import models.Raum;
import models.Stunde;
import models.Tag;
import models.Unterrichtsfach;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class ApplicationJobs extends Job {

	public void doJob() {
		try {
			initializeTage();
			initializeKlassen();
			initializeRaueme();
			initializeLehrer();
			initializeStunden();
			initializeFaecher();
		} catch (Exception e) {
		}
	}

	private void initializeLehrer() {
		Lehrer lehrer = new Lehrer();
		lehrer.name = "Weißflog";
		lehrer.vorname = "Bernd";
		lehrer.save();

	}

	private void initializeTage() {

		String[] tage = { "Montag", "Dienstag", "Mittwoch", "Donnerstag",
				"Freitag" };

		for (int i = 0; i < tage.length; i++) {
			String tagName = tage[i];
			Tag tag = new Tag();
			tag.bezeichnung = tagName;
			tag.save();

		}

	}

	private void initializeKlassen() {
		String[] klassen = { "It1b" };
		for (int i = 0; i < klassen.length; i++) {
			String klassenBezeichnung = klassen[i];
			Klasse klasse = new Klasse();
			klasse.bezeichnung = klassenBezeichnung;
			klasse.save();
		}
	}

	public void initializeRaueme() {
		String[] raeumeBezeichnungen = { "Raum 202" };
		for (int i = 0; i < raeumeBezeichnungen.length; i++) {
			String raumBezeichnung = raeumeBezeichnungen[i];
			Raum raum = new Raum();
			raum.bezeichnung = raumBezeichnung;
			raum.save();

		}
	}
	
	public void initializeStunden(){
		Stunde stunde = new Stunde();
		Date von = new Date();
		von.setHours(9);
		von.setMinutes(0);
		stunde.zeitVon = von;
		
		Date bis = new Date();
		bis.setHours(10);
		bis.setMinutes(0);
		stunde.zeitBis = bis;
		
		stunde.save();
		
	}
	
	public void initializeFaecher(){
		Unterrichtsfach unterrichtsfach = new Unterrichtsfach();
		unterrichtsfach.bezeichnung = "Sport";
		unterrichtsfach.save();
	}

}
