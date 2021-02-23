package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.qO  reason: case insensitive filesystem */
public final class C2417qO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f11843a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11844b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11845c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11846d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f11847e;

    public C2417qO(String str, String str2, String str3, String str4, Long l) {
        this.f11843a = str;
        this.f11844b = str2;
        this.f11845c = str3;
        this.f11846d = str4;
        this.f11847e = l;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C1359bT.a(bundle, "gmp_app_id", this.f11843a);
        C1359bT.a(bundle, "fbs_aiid", this.f11844b);
        C1359bT.a(bundle, "fbs_aeid", this.f11845c);
        C1359bT.a(bundle, "apm_id_origin", this.f11846d);
        Long l = this.f11847e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
