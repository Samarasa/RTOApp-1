package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c.b.b.b.d.e.a;
import c.b.b.b.d.e.f;
import c.b.b.b.g.i;
import java.util.concurrent.ScheduledExecutorService;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    private static ba f14553a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f14554b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f14555c;

    /* renamed from: d  reason: collision with root package name */
    private ca f14556d = new ca(this);

    /* renamed from: e  reason: collision with root package name */
    private int f14557e = 1;

    private ba(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14555c = scheduledExecutorService;
        this.f14554b = context.getApplicationContext();
    }

    private final synchronized int a() {
        int i;
        i = this.f14557e;
        this.f14557e = i + 1;
        return i;
    }

    private final synchronized <T> i<T> a(C3323j<T> jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(jVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f14556d.a((C3323j<?>) jVar)) {
            this.f14556d = new ca(this);
            this.f14556d.a((C3323j<?>) jVar);
        }
        return jVar.f14576b.a();
    }

    public static synchronized ba a(Context context) {
        ba baVar;
        synchronized (ba.class) {
            if (f14553a == null) {
                f14553a = new ba(context, a.a().a(1, new com.google.android.gms.common.util.a.a("MessengerIpcClient"), f.f4072a));
            }
            baVar = f14553a;
        }
        return baVar;
    }

    public final i<Void> a(int i, Bundle bundle) {
        return a(new C3320g(a(), 2, bundle));
    }

    public final i<Bundle> b(int i, Bundle bundle) {
        return a(new C3325l(a(), 1, bundle));
    }
}
