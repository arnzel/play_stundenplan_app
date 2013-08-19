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
import play.test.Fixtures;

@OnApplicationStart
public class ApplicationJobs extends Job {

	public void doJob() {
		try {
			Fixtures.loadModels("startData.yml");
		} catch (Exception e) {
		}

	}

}
