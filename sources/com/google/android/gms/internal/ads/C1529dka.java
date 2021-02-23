package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.dka  reason: case insensitive filesystem */
public final class C1529dka {

    /* renamed from: a  reason: collision with root package name */
    public final int f10174a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10175b;

    public C1529dka(int i, byte[] bArr) {
        this.f10175b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1529dka.class == obj.getClass()) {
            C1529dka dka = (C1529dka) obj;
            return this.f10174a == dka.f10174a && Arrays.equals(this.f10175b, dka.f10175b);
        }
    }

    public final int hashCode() {
        return (this.f10174a * 31) + Arrays.hashCode(this.f10175b);
    }
}
