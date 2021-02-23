package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.a;

final class Dd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13220a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f13221b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Ge f13222c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ xe f13223d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Ge f13224e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C3196od f13225f;

    Dd(C3196od odVar, boolean z, boolean z2, Ge ge, xe xeVar, Ge ge2) {
        this.f13225f = odVar;
        this.f13220a = z;
        this.f13221b = z2;
        this.f13222c = ge;
        this.f13223d = xeVar;
        this.f13224e = ge2;
    }

    public final void run() {
        C3218tb d2 = this.f13225f.f13705d;
        if (d2 == null) {
            this.f13225f.h().t().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f13220a) {
            this.f13225f.a(d2, (a) this.f13221b ? null : this.f13222c, this.f13223d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f13224e.f13267a)) {
                    d2.a(this.f13222c, this.f13223d);
                } else {
                    d2.a(this.f13222c);
                }
            } catch (RemoteException e2) {
                this.f13225f.h().t().a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f13225f.J();
    }
}
