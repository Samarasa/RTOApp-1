package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.b.b.b.d.f.Hf;

/* renamed from: com.google.android.gms.measurement.internal.ud  reason: case insensitive filesystem */
final class C3225ud implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13792a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hf f13793b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3196od f13794c;

    C3225ud(C3196od odVar, xe xeVar, Hf hf) {
        this.f13794c = odVar;
        this.f13792a = xeVar;
        this.f13793b = hf;
    }

    public final void run() {
        String str = null;
        try {
            C3218tb d2 = this.f13794c.f13705d;
            if (d2 == null) {
                this.f13794c.h().t().a("Failed to get app instance id");
            } else {
                str = d2.c(this.f13792a);
                if (str != null) {
                    this.f13794c.p().a(str);
                    this.f13794c.l().m.a(str);
                }
                this.f13794c.J();
            }
        } catch (RemoteException e2) {
            this.f13794c.h().t().a("Failed to get app instance id", e2);
        } catch (Throwable th) {
            this.f13794c.k().a(this.f13793b, (String) null);
            throw th;
        }
        this.f13794c.k().a(this.f13793b, str);
    }
}
