package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.a.a;

/* renamed from: com.google.android.gms.measurement.internal.qd  reason: case insensitive filesystem */
final class C3206qd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f13736a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ re f13737b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ xe f13738c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3196od f13739d;

    C3206qd(C3196od odVar, boolean z, re reVar, xe xeVar) {
        this.f13739d = odVar;
        this.f13736a = z;
        this.f13737b = reVar;
        this.f13738c = xeVar;
    }

    public final void run() {
        C3218tb d2 = this.f13739d.f13705d;
        if (d2 == null) {
            this.f13739d.h().t().a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f13739d.a(d2, (a) this.f13736a ? null : this.f13737b, this.f13738c);
        this.f13739d.J();
    }
}
