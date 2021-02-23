package com.google.android.gms.internal.ads;

public final class Zna {

    /* renamed from: a  reason: collision with root package name */
    final long f9587a;

    /* renamed from: b  reason: collision with root package name */
    final String f9588b;

    /* renamed from: c  reason: collision with root package name */
    final int f9589c;

    Zna(long j, String str, int i) {
        this.f9587a = j;
        this.f9588b = str;
        this.f9589c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Zna)) {
            Zna zna = (Zna) obj;
            return zna.f9587a == this.f9587a && zna.f9589c == this.f9589c;
        }
    }

    public final int hashCode() {
        return (int) this.f9587a;
    }
}
