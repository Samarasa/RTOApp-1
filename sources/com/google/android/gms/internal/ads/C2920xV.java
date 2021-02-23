package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.xV  reason: case insensitive filesystem */
final class C2920xV extends C2636tV {

    /* renamed from: a  reason: collision with root package name */
    private String f12768a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f12769b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f12770c;

    C2920xV() {
    }

    public final C2424qV a() {
        String str = this.f12768a;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str2 = str2.concat(" clientVersion");
        }
        if (this.f12769b == null) {
            str2 = String.valueOf(str2).concat(" shouldGetAdvertisingId");
        }
        if (this.f12770c == null) {
            str2 = String.valueOf(str2).concat(" isGooglePlayServicesAvailable");
        }
        if (str2.isEmpty()) {
            return new C2778vV(this.f12768a, this.f12769b.booleanValue(), this.f12770c.booleanValue());
        }
        String valueOf = String.valueOf(str2);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public final C2636tV a(String str) {
        if (str != null) {
            this.f12768a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    public final C2636tV a(boolean z) {
        this.f12769b = Boolean.valueOf(z);
        return this;
    }

    public final C2636tV b(boolean z) {
        this.f12770c = true;
        return this;
    }
}
