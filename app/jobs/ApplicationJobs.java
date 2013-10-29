package jobs;

import java.util.Date;

import models.Klasse;
import models.Lehrer;
import models.Raum;
import models.Stunde;
import models.Tag;
import models.Unterrichtsfach;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class ApplicationJobs extends Job {

	public static boolean dataLoaded = false;
	
	public void doJob() {
		if(!dataLoaded){
			try {
				Fixtures.loadModels("startData.yml");
				Logger.info("Loaded Start data");
				dataLoaded = true;
			} catch (Exception e) {
				Logger.error(e,null);
			}
		}
	}

}
