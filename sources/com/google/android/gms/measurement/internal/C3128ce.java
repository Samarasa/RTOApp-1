package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.measurement.internal.ce  reason: case insensitive filesystem */
final class C3128ce {

    /* renamed from: a  reason: collision with root package name */
    private final e f13533a;

    /* renamed from: b  reason: collision with root package name */
    private long f13534b;

    public C3128ce(e eVar) {
        C0563t.a(eVar);
        this.f13533a = eVar;
    }

    public final void a() {
        this.f13534b = this.f13533a.b();
    }

    public final boolean a(long j) {
        return this.f13534b == 0 || this.f13533a.b() - this.f13534b >= 3600000;
    }

    public final void b() {
        this.f13534b = 0;
    }
}
