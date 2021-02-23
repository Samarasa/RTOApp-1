package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zZ  reason: case insensitive filesystem */
public final class C3066zZ<P> {

    /* renamed from: a  reason: collision with root package name */
    private final P f13064a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f13065b;

    /* renamed from: c  reason: collision with root package name */
    private final C1371bca f13066c;

    /* renamed from: d  reason: collision with root package name */
    private final C2717uca f13067d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13068e;

    C3066zZ(P p, byte[] bArr, C1371bca bca, C2717uca uca, int i) {
        this.f13064a = p;
        this.f13065b = Arrays.copyOf(bArr, bArr.length);
        this.f13066c = bca;
        this.f13067d = uca;
        this.f13068e = i;
    }

    public final P a() {
        return this.f13064a;
    }

    public final C1371bca b() {
        return this.f13066c;
    }

    public final C2717uca c() {
        return this.f13067d;
    }

    public final byte[] d() {
        byte[] bArr = this.f13065b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
