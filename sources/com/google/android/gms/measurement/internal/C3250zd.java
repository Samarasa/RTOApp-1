package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import c.b.b.b.d.f.Hf;

/* renamed from: com.google.android.gms.measurement.internal.zd  reason: case insensitive filesystem */
final class C3250zd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3192o f13842a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13843b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Hf f13844c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3196od f13845d;

    C3250zd(C3196od odVar, C3192o oVar, String str, Hf hf) {
        this.f13845d = odVar;
        this.f13842a = oVar;
        this.f13843b = str;
        this.f13844c = hf;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C3218tb d2 = this.f13845d.f13705d;
            if (d2 == null) {
                this.f13845d.h().t().a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = d2.a(this.f13842a, this.f13843b);
                this.f13845d.J();
            }
        } catch (RemoteException e2) {
            this.f13845d.h().t().a("Failed to send event to the service to bundle", e2);
        } catch (Throwable th) {
            this.f13845d.k().a(this.f13844c, bArr);
            throw th;
        }
        this.f13845d.k().a(this.f13844c, bArr);
    }
}
