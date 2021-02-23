package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import c.b.b.b.d.e.a;
import c.b.b.b.d.e.b;
import c.b.b.b.g.C0471d;
import c.b.b.b.g.i;
import c.b.b.b.g.j;
import c.b.b.b.g.l;
import com.google.firebase.iid.B;
import com.google.firebase.iid.C3337y;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class f extends Service {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f14647a;

    /* renamed from: b  reason: collision with root package name */
    private Binder f14648b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f14649c;

    /* renamed from: d  reason: collision with root package name */
    private int f14650d;

    /* renamed from: e  reason: collision with root package name */
    private int f14651e;

    public f() {
        b a2 = a.a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f14647a = a2.a(new com.google.android.gms.common.util.a.a(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")), c.b.b.b.d.e.f.f4072a);
        this.f14649c = new Object();
        this.f14651e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final i<Void> d(Intent intent) {
        if (b(intent)) {
            return l.a(null);
        }
        j jVar = new j();
        this.f14647a.execute(new h(this, intent, jVar));
        return jVar.a();
    }

    private final void f(Intent intent) {
        if (intent != null) {
            C3337y.a(intent);
        }
        synchronized (this.f14649c) {
            this.f14651e--;
            if (this.f14651e == 0) {
                stopSelfResult(this.f14650d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Intent a(Intent intent);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Intent intent, i iVar) {
        f(intent);
    }

    public abstract boolean b(Intent intent);

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f14648b == null) {
            this.f14648b = new B(new i(this));
        }
        return this.f14648b;
    }

    public void onDestroy() {
        this.f14647a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f14649c) {
            this.f14650d = i2;
            this.f14651e++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            f(intent);
            return 2;
        }
        i<Void> e2 = d(a2);
        if (e2.d()) {
            f(intent);
            return 2;
        }
        e2.a(k.f14661a, (C0471d<Void>) new j(this, intent));
        return 3;
    }
}
