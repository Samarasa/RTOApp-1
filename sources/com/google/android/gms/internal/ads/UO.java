package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class UO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8891a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8892b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8893c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8894d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8895e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8896f;

    public UO(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f8891a = str;
        this.f8892b = i;
        this.f8893c = i2;
        this.f8894d = i3;
        this.f8895e = z;
        this.f8896f = i4;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f8891a;
        boolean z = true;
        C1359bT.a(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f8892b);
        if (this.f8892b == -2) {
            z = false;
        }
        C1359bT.a(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f8893c);
        bundle.putInt("pt", this.f8894d);
        Bundle a2 = C1359bT.a(bundle, "device");
        bundle.putBundle("device", a2);
        Bundle a3 = C1359bT.a(a2, "network");
        a2.putBundle("network", a3);
        a3.putInt("active_network_state", this.f8896f);
        a3.putBoolean("active_network_metered", this.f8895e);
    }
}
