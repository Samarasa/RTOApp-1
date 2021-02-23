package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qma  reason: case insensitive filesystem */
public final class C2454qma implements C2028kma {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11884a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11885b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f11886c;

    /* renamed from: d  reason: collision with root package name */
    private final C1816hma[] f11887d;

    /* renamed from: e  reason: collision with root package name */
    private int f11888e;

    /* renamed from: f  reason: collision with root package name */
    private int f11889f;

    /* renamed from: g  reason: collision with root package name */
    private int f11890g;

    /* renamed from: h  reason: collision with root package name */
    private C1816hma[] f11891h;

    public C2454qma(boolean z, int i) {
        this(true, 65536, 0);
    }

    private C2454qma(boolean z, int i, int i2) {
        Cma.a(true);
        Cma.a(true);
        this.f11884a = true;
        this.f11885b = 65536;
        this.f11890g = 0;
        this.f11891h = new C1816hma[100];
        this.f11886c = null;
        this.f11887d = new C1816hma[1];
    }

    public final synchronized void a() {
        if (this.f11884a) {
            a(0);
        }
    }

    public final synchronized void a(int i) {
        boolean z = i < this.f11888e;
        this.f11888e = i;
        if (z) {
            f();
        }
    }

    public final synchronized void a(C1816hma hma) {
        this.f11887d[0] = hma;
        a(this.f11887d);
    }

    public final synchronized void a(C1816hma[] hmaArr) {
        boolean z;
        if (this.f11890g + hmaArr.length >= this.f11891h.length) {
            this.f11891h = (C1816hma[]) Arrays.copyOf(this.f11891h, Math.max(this.f11891h.length << 1, this.f11890g + hmaArr.length));
        }
        for (C1816hma hma : hmaArr) {
            if (hma.f10723a != null) {
                if (hma.f10723a.length != this.f11885b) {
                    z = false;
                    Cma.a(z);
                    C1816hma[] hmaArr2 = this.f11891h;
                    int i = this.f11890g;
                    this.f11890g = i + 1;
                    hmaArr2[i] = hma;
                }
            }
            z = true;
            Cma.a(z);
            C1816hma[] hmaArr22 = this.f11891h;
            int i2 = this.f11890g;
            this.f11890g = i2 + 1;
            hmaArr22[i2] = hma;
        }
        this.f11889f -= hmaArr.length;
        notifyAll();
    }

    public final synchronized int b() {
        return this.f11889f * this.f11885b;
    }

    public final synchronized void f() {
        int max = Math.max(0, Tma.a(this.f11888e, this.f11885b) - this.f11889f);
        if (max < this.f11890g) {
            Arrays.fill(this.f11891h, max, this.f11890g, (Object) null);
            this.f11890g = max;
        }
    }

    public final int g() {
        return this.f11885b;
    }

    public final synchronized C1816hma h() {
        C1816hma hma;
        this.f11889f++;
        if (this.f11890g > 0) {
            C1816hma[] hmaArr = this.f11891h;
            int i = this.f11890g - 1;
            this.f11890g = i;
            hma = hmaArr[i];
            this.f11891h[this.f11890g] = null;
        } else {
            hma = new C1816hma(new byte[this.f11885b], 0);
        }
        return hma;
    }
}
