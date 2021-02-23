package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.c.C0193e;
import androidx.work.impl.c.o;
import androidx.work.impl.d;
import androidx.work.impl.m;
import androidx.work.impl.utils.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1846a = h.a("SystemJobScheduler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f1847b;

    /* renamed from: c  reason: collision with root package name */
    private final JobScheduler f1848c;

    /* renamed from: d  reason: collision with root package name */
    private final m f1849d;

    /* renamed from: e  reason: collision with root package name */
    private final e f1850e;

    /* renamed from: f  reason: collision with root package name */
    private final b f1851f;

    public c(Context context, m mVar) {
        this(context, mVar, (JobScheduler) context.getSystemService("jobscheduler"), new b(context));
    }

    public c(Context context, m mVar, JobScheduler jobScheduler, b bVar) {
        this.f1847b = context;
        this.f1849d = mVar;
        this.f1848c = jobScheduler;
        this.f1850e = new e(context);
        this.f1851f = bVar;
    }

    private static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h.a().b(f1846a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static List<Integer> a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a2 = a(context, jobScheduler);
        if (a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : a2) {
            PersistableBundle extras = next.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            h.a().b(f1846a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static void a(Context context) {
        List<JobInfo> a2;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a2 = a(context, jobScheduler)) != null && !a2.isEmpty()) {
            for (JobInfo id : a2) {
                a(jobScheduler, id.getId());
            }
        }
    }

    public static void b(Context context) {
        List<JobInfo> a2;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a2 = a(context, jobScheduler)) != null && !a2.isEmpty()) {
            for (JobInfo next : a2) {
                PersistableBundle extras = next.getExtras();
                if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    a(jobScheduler, next.getId());
                }
            }
        }
    }

    public void a(o oVar, int i) {
        JobInfo a2 = this.f1851f.a(oVar, i);
        h.a().a(f1846a, String.format("Scheduling work ID %s Job ID %s", new Object[]{oVar.f1890c, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.f1848c.schedule(a2);
        } catch (IllegalStateException e2) {
            List<JobInfo> a3 = a(this.f1847b, this.f1848c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(a3 != null ? a3.size() : 0), Integer.valueOf(this.f1849d.g().r().a().size()), Integer.valueOf(this.f1849d.b().c())});
            h.a().b(f1846a, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            h.a().b(f1846a, String.format("Unable to schedule %s", new Object[]{oVar}), th);
        }
    }

    public void a(String str) {
        List<Integer> a2 = a(this.f1847b, this.f1848c, str);
        if (a2 != null && !a2.isEmpty()) {
            for (Integer intValue : a2) {
                a(this.f1848c, intValue.intValue());
            }
            this.f1849d.g().p().b(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void a(o... oVarArr) {
        List<Integer> a2;
        WorkDatabase g2 = this.f1849d.g();
        int length = oVarArr.length;
        int i = 0;
        while (i < length) {
            o oVar = oVarArr[i];
            g2.c();
            try {
                o d2 = g2.r().d(oVar.f1890c);
                if (d2 == null) {
                    h a3 = h.a();
                    String str = f1846a;
                    a3.e(str, "Skipping scheduling " + oVar.f1890c + " because it's no longer in the DB", new Throwable[0]);
                } else if (d2.f1891d != androidx.work.o.ENQUEUED) {
                    h a4 = h.a();
                    String str2 = f1846a;
                    a4.e(str2, "Skipping scheduling " + oVar.f1890c + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    C0193e a5 = g2.p().a(oVar.f1890c);
                    int a6 = a5 != null ? a5.f1877b : this.f1850e.a(this.f1849d.b().d(), this.f1849d.b().b());
                    if (a5 == null) {
                        this.f1849d.g().p().a(new C0193e(oVar.f1890c, a6));
                    }
                    a(oVar, a6);
                    if (Build.VERSION.SDK_INT == 23 && (a2 = a(this.f1847b, this.f1848c, oVar.f1890c)) != null) {
                        int indexOf = a2.indexOf(Integer.valueOf(a6));
                        if (indexOf >= 0) {
                            a2.remove(indexOf);
                        }
                        a(oVar, !a2.isEmpty() ? a2.get(0).intValue() : this.f1850e.a(this.f1849d.b().d(), this.f1849d.b().b()));
                    }
                }
                g2.k();
                g2.e();
                i++;
            } catch (Throwable th) {
                g2.e();
                throw th;
            }
        }
    }
}
