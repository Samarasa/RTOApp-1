package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.f.a;
import c.b.b.a.a.p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class f implements t {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5295a;

    /* renamed from: b  reason: collision with root package name */
    private final C0248d f5296b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5297c;

    public f(Context context, C0248d dVar, h hVar) {
        this.f5295a = context;
        this.f5296b = dVar;
        this.f5297c = hVar;
    }

    private boolean a(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int a(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5295a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }

    public void a(p pVar, int i) {
        ComponentName componentName = new ComponentName(this.f5295a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5295a.getSystemService("jobscheduler");
        int a2 = a(pVar);
        if (a(jobScheduler, a2, i)) {
            c.b.b.a.a.a.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", (Object) pVar);
            return;
        }
        long b2 = this.f5296b.b(pVar);
        h hVar = this.f5297c;
        JobInfo.Builder builder = new JobInfo.Builder(a2, componentName);
        hVar.a(builder, pVar.d(), b2, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        c.b.b.a.a.a.a.a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(a2), Long.valueOf(this.f5297c.a(pVar.d(), b2, i)), Long.valueOf(b2), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
