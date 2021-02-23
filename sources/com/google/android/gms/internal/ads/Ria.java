package com.google.android.gms.internal.ads;

public final class Ria {

    /* renamed from: a  reason: collision with root package name */
    public static final Ria f8504a = new Ria(1.0f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final float f8505b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8506c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8507d;

    public Ria(float f2, float f3) {
        this.f8505b = f2;
        this.f8506c = f3;
        this.f8507d = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.f8507d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ria.class == obj.getClass()) {
            Ria ria = (Ria) obj;
            return this.f8505b == ria.f8505b && this.f8506c == ria.f8506c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8505b) + 527) * 31) + Float.floatToRawIntBits(this.f8506c);
    }
}
