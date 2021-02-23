package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vV  reason: case insensitive filesystem */
final class C2778vV extends C2424qV {

    /* renamed from: a  reason: collision with root package name */
    private final String f12503a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12504b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12505c;

    private C2778vV(String str, boolean z, boolean z2) {
        this.f12503a = str;
        this.f12504b = z;
        this.f12505c = z2;
    }

    public final String a() {
        return this.f12503a;
    }

    public final boolean b() {
        return this.f12504b;
    }

    public final boolean d() {
        return this.f12505c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2424qV) {
            C2424qV qVVar = (C2424qV) obj;
            return this.f12503a.equals(qVVar.a()) && this.f12504b == qVVar.b() && this.f12505c == qVVar.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.f12503a.hashCode() ^ 1000003) * 1000003) ^ (this.f12504b ? 1231 : 1237)) * 1000003;
        if (!this.f12505c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f12503a;
        boolean z = this.f12504b;
        boolean z2 = this.f12505c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
