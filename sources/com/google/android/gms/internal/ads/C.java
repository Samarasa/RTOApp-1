package com.google.android.gms.internal.ads;

final class C implements C1034Sa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ B f6381a;

    C(B b2) {
        this.f6381a = b2;
    }

    public final Boolean a(String str, boolean z) {
        return Boolean.valueOf(this.f6381a.f6239e.getBoolean(str, z));
    }

    public final Double a(String str, double d2) {
        return Double.valueOf((double) this.f6381a.f6239e.getFloat(str, (float) d2));
    }

    public final String a(String str, String str2) {
        return this.f6381a.f6239e.getString(str, str2);
    }

    public final Long getLong(String str, long j) {
        try {
            return Long.valueOf(this.f6381a.f6239e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f6381a.f6239e.getInt(str, (int) j));
        }
    }
}
