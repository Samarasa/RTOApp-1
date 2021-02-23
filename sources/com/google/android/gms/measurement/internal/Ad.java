package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.a;

final class Ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13165a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f13166b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3192o f13167c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ xe f13168d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f13169e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C3196od f13170f;

    Ad(C3196od odVar, boolean z, boolean z2, C3192o oVar, xe xeVar, String str) {
        this.f13170f = odVar;
        this.f13165a = z;
        this.f13166b = z2;
        this.f13167c = oVar;
        this.f13168d = xeVar;
        this.f13169e = str;
    }

    public final void run() {
        C3218tb d2 = this.f13170f.f13705d;
        if (d2 == null) {
            this.f13170f.h().t().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f13165a) {
            this.f13170f.a(d2, (a) this.f13166b ? null : this.f13167c, this.f13168d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f13169e)) {
                    d2.a(this.f13167c, this.f13168d);
                } else {
                    d2.a(this.f13167c, this.f13169e, this.f13170f.h().C());
                }
            } catch (RemoteException e2) {
                this.f13170f.h().t().a("Failed to send event to the service", e2);
            }
        }
        this.f13170f.J();
    }
}
