package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.vma  reason: case insensitive filesystem */
public final class C2808vma {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f12563a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2950xma<? extends Bma> f12564b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public IOException f12565c;

    public C2808vma(String str) {
        this.f12563a = Tma.a(str);
    }

    public final <T extends Bma> long a(T t, C3021yma<T> yma, int i) {
        Looper myLooper = Looper.myLooper();
        Cma.b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C2950xma(this, myLooper, t, yma, i, elapsedRealtime).a(0);
        return elapsedRealtime;
    }

    public final void a(int i) {
        IOException iOException = this.f12565c;
        if (iOException == null) {
            C2950xma<? extends Bma> xma = this.f12564b;
            if (xma != null) {
                xma.a(xma.f12838c);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(Runnable runnable) {
        C2950xma<? extends Bma> xma = this.f12564b;
        if (xma != null) {
            xma.a(true);
        }
        this.f12563a.execute(runnable);
        this.f12563a.shutdown();
    }

    public final boolean a() {
        return this.f12564b != null;
    }

    public final void b() {
        this.f12564b.a(false);
    }
}
