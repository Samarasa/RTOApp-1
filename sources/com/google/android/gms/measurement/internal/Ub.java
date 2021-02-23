package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import c.b.b.b.d.f.C0342hc;
import c.b.b.b.d.f.La;

public final class Ub implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f13430a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Rb f13431b;

    Ub(Rb rb, String str) {
        this.f13431b = rb;
        this.f13430a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f13431b.f13402a.h().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            La a2 = C0342hc.a(iBinder);
            if (a2 == null) {
                this.f13431b.f13402a.h().w().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f13431b.f13402a.h().z().a("Install Referrer Service connected");
            this.f13431b.f13402a.g().a((Runnable) new Tb(this, a2, this));
        } catch (Exception e2) {
            this.f13431b.f13402a.h().w().a("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f13431b.f13402a.h().z().a("Install Referrer Service disconnected");
    }
}
