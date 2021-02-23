package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c.b.b.a.a.f.a;
import c.b.b.a.a.p;
import c.b.b.a.a.u;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        u.a(getApplicationContext());
        p.a a2 = p.a();
        a2.a(string);
        a2.a(a.a(i));
        if (string2 != null) {
            a2.a(Base64.decode(string2, 0));
        }
        u.a().b().a(a2.a(), i2, g.a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
