package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.measurement.internal.k  reason: case insensitive filesystem */
final class C3171k {

    /* renamed from: a  reason: collision with root package name */
    final String f13623a;

    /* renamed from: b  reason: collision with root package name */
    final String f13624b;

    /* renamed from: c  reason: collision with root package name */
    final long f13625c;

    /* renamed from: d  reason: collision with root package name */
    final long f13626d;

    /* renamed from: e  reason: collision with root package name */
    final long f13627e;

    /* renamed from: f  reason: collision with root package name */
    final long f13628f;

    /* renamed from: g  reason: collision with root package name */
    final long f13629g;

    /* renamed from: h  reason: collision with root package name */
    final Long f13630h;
    final Long i;
    final Long j;
    final Boolean k;

    C3171k(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        C0563t.b(str);
        C0563t.b(str2);
        boolean z = true;
        C0563t.a(j7 >= 0);
        C0563t.a(j8 >= 0);
        C0563t.a(j9 >= 0);
        C0563t.a(j10 < 0 ? false : z);
        this.f13623a = str;
        this.f13624b = str2;
        this.f13625c = j7;
        this.f13626d = j8;
        this.f13627e = j9;
        this.f13628f = j5;
        this.f13629g = j10;
        this.f13630h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    C3171k(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j2, j3, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final C3171k a(long j2) {
        return new C3171k(this.f13623a, this.f13624b, this.f13625c, this.f13626d, this.f13627e, j2, this.f13629g, this.f13630h, this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final C3171k a(long j2, long j3) {
        return new C3171k(this.f13623a, this.f13624b, this.f13625c, this.f13626d, this.f13627e, this.f13628f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final C3171k a(Long l, Long l2, Boolean bool) {
        return new C3171k(this.f13623a, this.f13624b, this.f13625c, this.f13626d, this.f13627e, this.f13628f, this.f13629g, this.f13630h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
