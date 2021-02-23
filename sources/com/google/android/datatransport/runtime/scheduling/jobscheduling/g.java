package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JobInfoSchedulerService f5298a;

    /* renamed from: b  reason: collision with root package name */
    private final JobParameters f5299b;

    private g(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f5298a = jobInfoSchedulerService;
        this.f5299b = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new g(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f5298a.jobFinished(this.f5299b, false);
    }
}
