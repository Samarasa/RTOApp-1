package androidx.work.impl.utils;

import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.c.p;
import androidx.work.impl.m;
import androidx.work.o;

public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2020a = h.a("StopWorkRunnable");

    /* renamed from: b  reason: collision with root package name */
    private m f2021b;

    /* renamed from: c  reason: collision with root package name */
    private String f2022c;

    public j(m mVar, String str) {
        this.f2021b = mVar;
        this.f2022c = str;
    }

    public void run() {
        WorkDatabase g2 = this.f2021b.g();
        p r = g2.r();
        g2.c();
        try {
            if (r.c(this.f2022c) == o.RUNNING) {
                r.a(o.ENQUEUED, this.f2022c);
            }
            boolean e2 = this.f2021b.e().e(this.f2022c);
            h.a().a(f2020a, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f2022c, Boolean.valueOf(e2)}), new Throwable[0]);
            g2.k();
        } finally {
            g2.e();
        }
    }
}
