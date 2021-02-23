package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.jd  reason: case insensitive filesystem */
final /* synthetic */ class C3169jd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C3151gd f13616a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13617b;

    /* renamed from: c  reason: collision with root package name */
    private final Exception f13618c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f13619d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f13620e;

    C3169jd(C3151gd gdVar, int i, Exception exc, byte[] bArr, Map map) {
        this.f13616a = gdVar;
        this.f13617b = i;
        this.f13618c = exc;
        this.f13619d = bArr;
        this.f13620e = map;
    }

    public final void run() {
        this.f13616a.a(this.f13617b, this.f13618c, this.f13619d, this.f13620e);
    }
}
