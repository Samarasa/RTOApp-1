package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.Fk  reason: case insensitive filesystem */
public final class C0706Fk {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f6891a = BigInteger.ONE;

    /* renamed from: b  reason: collision with root package name */
    private String f6892b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f6891a.toString();
        this.f6891a = this.f6891a.add(BigInteger.ONE);
        this.f6892b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f6892b;
    }
}
