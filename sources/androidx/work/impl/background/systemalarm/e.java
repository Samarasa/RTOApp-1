package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.h;
import androidx.work.impl.a;
import androidx.work.impl.b.c;
import androidx.work.impl.b.d;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.background.systemalarm.j;
import androidx.work.impl.c.o;
import androidx.work.impl.utils.k;
import java.util.Collections;
import java.util.List;

public class e implements c, a, j.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1807a = h.a("DelayMetCommandHandler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f1808b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1809c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1810d;

    /* renamed from: e  reason: collision with root package name */
    private final g f1811e;

    /* renamed from: f  reason: collision with root package name */
    private final d f1812f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f1813g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private int f1814h = 0;
    private PowerManager.WakeLock i;
    private boolean j = false;

    e(Context context, int i2, String str, g gVar) {
        this.f1808b = context;
        this.f1809c = i2;
        this.f1811e = gVar;
        this.f1810d = str;
        this.f1812f = new d(this.f1808b, gVar.c(), this);
    }

    private void b() {
        synchronized (this.f1813g) {
            this.f1812f.a();
            this.f1811e.e().a(this.f1810d);
            if (this.i != null && this.i.isHeld()) {
                h.a().a(f1807a, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.i, this.f1810d}), new Throwable[0]);
                this.i.release();
            }
        }
    }

    private void c() {
        synchronized (this.f1813g) {
            if (this.f1814h < 2) {
                this.f1814h = 2;
                h.a().a(f1807a, String.format("Stopping work for WorkSpec %s", new Object[]{this.f1810d}), new Throwable[0]);
                this.f1811e.a((Runnable) new g.a(this.f1811e, b.c(this.f1808b, this.f1810d), this.f1809c));
                if (this.f1811e.b().b(this.f1810d)) {
                    h.a().a(f1807a, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f1810d}), new Throwable[0]);
                    this.f1811e.a((Runnable) new g.a(this.f1811e, b.b(this.f1808b, this.f1810d), this.f1809c));
                } else {
                    h.a().a(f1807a, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f1810d}), new Throwable[0]);
                }
            } else {
                h.a().a(f1807a, String.format("Already stopped work for %s", new Object[]{this.f1810d}), new Throwable[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.i = k.a(this.f1808b, String.format("%s (%s)", new Object[]{this.f1810d, Integer.valueOf(this.f1809c)}));
        h.a().a(f1807a, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.i, this.f1810d}), new Throwable[0]);
        this.i.acquire();
        o d2 = this.f1811e.d().g().r().d(this.f1810d);
        if (d2 == null) {
            c();
            return;
        }
        this.j = d2.b();
        if (!this.j) {
            h.a().a(f1807a, String.format("No constraints for %s", new Object[]{this.f1810d}), new Throwable[0]);
            b(Collections.singletonList(this.f1810d));
            return;
        }
        this.f1812f.c(Collections.singletonList(d2));
    }

    public void a(String str) {
        h.a().a(f1807a, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        c();
    }

    public void a(String str, boolean z) {
        h.a().a(f1807a, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        b();
        if (z) {
            Intent b2 = b.b(this.f1808b, this.f1810d);
            g gVar = this.f1811e;
            gVar.a((Runnable) new g.a(gVar, b2, this.f1809c));
        }
        if (this.j) {
            Intent a2 = b.a(this.f1808b);
            g gVar2 = this.f1811e;
            gVar2.a((Runnable) new g.a(gVar2, a2, this.f1809c));
        }
    }

    public void a(List<String> list) {
        c();
    }

    public void b(List<String> list) {
        if (list.contains(this.f1810d)) {
            synchronized (this.f1813g) {
                if (this.f1814h == 0) {
                    this.f1814h = 1;
                    h.a().a(f1807a, String.format("onAllConstraintsMet for %s", new Object[]{this.f1810d}), new Throwable[0]);
                    if (this.f1811e.b().c(this.f1810d)) {
                        this.f1811e.e().a(this.f1810d, 600000, this);
                    } else {
                        b();
                    }
                } else {
                    h.a().a(f1807a, String.format("Already started work for %s", new Object[]{this.f1810d}), new Throwable[0]);
                }
            }
        }
    }
}
