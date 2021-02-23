package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.nN  reason: case insensitive filesystem */
final class C2203nN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f11451a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11452b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f11453c;

    private C2203nN(String str, String str2, Bundle bundle) {
        this.f11451a = str;
        this.f11452b = str2;
        this.f11453c = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f11451a);
        bundle.putString("fc_consent", this.f11452b);
        bundle.putBundle("iab_consent_info", this.f11453c);
    }
}
