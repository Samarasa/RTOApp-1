package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import java.util.List;
import java.util.Map;

final class Hb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Ib f13277a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13278b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f13279c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f13280d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13281e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, List<String>> f13282f;

    private Hb(String str, Ib ib, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C0563t.a(ib);
        this.f13277a = ib;
        this.f13278b = i;
        this.f13279c = th;
        this.f13280d = bArr;
        this.f13281e = str;
        this.f13282f = map;
    }

    public final void run() {
        this.f13277a.a(this.f13281e, this.f13278b, this.f13279c, this.f13280d, this.f13282f);
    }
}
