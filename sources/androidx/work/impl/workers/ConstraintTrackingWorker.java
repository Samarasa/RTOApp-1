package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b.c;
import androidx.work.impl.b.d;
import androidx.work.impl.c.o;
import androidx.work.impl.m;
import androidx.work.impl.utils.a.e;
import c.b.c.a.a.a;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f2025e = h.a("ConstraintTrkngWrkr");

    /* renamed from: f  reason: collision with root package name */
    private WorkerParameters f2026f;

    /* renamed from: g  reason: collision with root package name */
    final Object f2027g = new Object();

    /* renamed from: h  reason: collision with root package name */
    volatile boolean f2028h = false;
    e<ListenableWorker.a> i = e.d();
    private ListenableWorker j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2026f = workerParameters;
    }

    public WorkDatabase a() {
        return m.a(getApplicationContext()).g();
    }

    public void a(List<String> list) {
        h.a().a(f2025e, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f2027g) {
            this.f2028h = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.i.b(ListenableWorker.a.a());
    }

    public void b(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.i.b(ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void d() {
        String a2 = getInputData().a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(a2)) {
            h.a().b(f2025e, "No worker to delegate to.", new Throwable[0]);
        } else {
            this.j = getWorkerFactory().b(getApplicationContext(), a2, this.f2026f);
            if (this.j == null) {
                h.a().a(f2025e, "No worker to delegate to.", new Throwable[0]);
            } else {
                o d2 = a().r().d(getId().toString());
                if (d2 == null) {
                    b();
                    return;
                }
                d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
                dVar.c(Collections.singletonList(d2));
                if (dVar.a(getId().toString())) {
                    h.a().a(f2025e, String.format("Constraints met for delegate %s", new Object[]{a2}), new Throwable[0]);
                    try {
                        a<ListenableWorker.a> startWork = this.j.startWork();
                        startWork.a(new b(this, startWork), getBackgroundExecutor());
                        return;
                    } catch (Throwable th) {
                        h.a().a(f2025e, String.format("Delegated worker %s threw exception in startWork.", new Object[]{a2}), th);
                        synchronized (this.f2027g) {
                            if (this.f2028h) {
                                h.a().a(f2025e, "Constraints were unmet, Retrying.", new Throwable[0]);
                                c();
                            } else {
                                b();
                            }
                            return;
                        }
                    }
                } else {
                    h.a().a(f2025e, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{a2}), new Throwable[0]);
                    c();
                    return;
                }
            }
        }
        b();
    }

    public androidx.work.impl.utils.b.a getTaskExecutor() {
        return m.a(getApplicationContext()).h();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a(this));
        return this.i;
    }
}
