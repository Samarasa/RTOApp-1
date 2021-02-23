package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.C0562s;

/* renamed from: com.google.android.gms.ads.internal.util.w  reason: case insensitive filesystem */
public final class C0516w {

    /* renamed from: a  reason: collision with root package name */
    public final String f5659a;

    /* renamed from: b  reason: collision with root package name */
    private final double f5660b;

    /* renamed from: c  reason: collision with root package name */
    private final double f5661c;

    /* renamed from: d  reason: collision with root package name */
    public final double f5662d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5663e;

    public C0516w(String str, double d2, double d3, double d4, int i) {
        this.f5659a = str;
        this.f5661c = d2;
        this.f5660b = d3;
        this.f5662d = d4;
        this.f5663e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0516w)) {
            return false;
        }
        C0516w wVar = (C0516w) obj;
        return C0562s.a(this.f5659a, wVar.f5659a) && this.f5660b == wVar.f5660b && this.f5661c == wVar.f5661c && this.f5663e == wVar.f5663e && Double.compare(this.f5662d, wVar.f5662d) == 0;
    }

    public final int hashCode() {
        return C0562s.a(this.f5659a, Double.valueOf(this.f5660b), Double.valueOf(this.f5661c), Double.valueOf(this.f5662d), Integer.valueOf(this.f5663e));
    }

    public final String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("name", this.f5659a);
        a2.a("minBound", Double.valueOf(this.f5661c));
        a2.a("maxBound", Double.valueOf(this.f5660b));
        a2.a("percent", Double.valueOf(this.f5662d));
        a2.a("count", Integer.valueOf(this.f5663e));
        return a2.toString();
    }
}
