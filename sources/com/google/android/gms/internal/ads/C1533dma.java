package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.dma  reason: case insensitive filesystem */
public final class C1533dma {

    /* renamed from: a  reason: collision with root package name */
    public final int f10183a;

    /* renamed from: b  reason: collision with root package name */
    private final C1391bma[] f10184b;

    /* renamed from: c  reason: collision with root package name */
    private int f10185c;

    public C1533dma(C1391bma... bmaArr) {
        this.f10184b = bmaArr;
        this.f10183a = bmaArr.length;
    }

    public final C1391bma a(int i) {
        return this.f10184b[i];
    }

    public final C1391bma[] a() {
        return (C1391bma[]) this.f10184b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1533dma.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10184b, ((C1533dma) obj).f10184b);
    }

    public final int hashCode() {
        if (this.f10185c == 0) {
            this.f10185c = Arrays.hashCode(this.f10184b) + 527;
        }
        return this.f10185c;
    }
}
