package com.google.android.gms.internal.ads;

import java.io.InputStream;

public final class Toa {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f8829a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8830b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8831c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8832d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8833e;

    private Toa(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f8829a = inputStream;
        this.f8830b = z;
        this.f8831c = z2;
        this.f8832d = j;
        this.f8833e = z3;
    }

    public static Toa a(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new Toa(inputStream, z, z2, j, z3);
    }

    public final InputStream a() {
        return this.f8829a;
    }

    public final boolean b() {
        return this.f8830b;
    }

    public final boolean c() {
        return this.f8833e;
    }

    public final long d() {
        return this.f8832d;
    }

    public final boolean e() {
        return this.f8831c;
    }
}
