package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.d.f.Hf;

final class Id implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13303a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13304b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f13305c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ xe f13306d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Hf f13307e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C3196od f13308f;

    Id(C3196od odVar, String str, String str2, boolean z, xe xeVar, Hf hf) {
        this.f13308f = odVar;
        this.f13303a = str;
        this.f13304b = str2;
        this.f13305c = z;
        this.f13306d = xeVar;
        this.f13307e = hf;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C3218tb d2 = this.f13308f.f13705d;
            if (d2 == null) {
                this.f13308f.h().t().a("Failed to get user properties", this.f13303a, this.f13304b);
            } else {
                bundle = se.a(d2.a(this.f13303a, this.f13304b, this.f13305c, this.f13306d));
                this.f13308f.J();
            }
        } catch (RemoteException e2) {
            this.f13308f.h().t().a("Failed to get user properties", this.f13303a, e2);
        } catch (Throwable th) {
            this.f13308f.k().a(this.f13307e, bundle);
            throw th;
        }
        this.f13308f.k().a(this.f13307e, bundle);
    }
}
