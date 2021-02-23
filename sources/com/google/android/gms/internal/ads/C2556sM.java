package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.sM  reason: case insensitive filesystem */
public final class C2556sM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C3100zqa f12076a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f12077b;

    public C2556sM(C3100zqa zqa, C1200Yk yk) {
        this.f12076a = zqa;
        this.f12077b = yk;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int intValue = ((Integer) Qqa.e().a(F.zd)).intValue();
        C1200Yk yk = this.f12077b;
        if (yk != null && yk.f9458c >= intValue) {
            bundle.putString("app_open_version", "2");
        }
        C3100zqa zqa = this.f12076a;
        if (zqa != null) {
            int i = zqa.f13127a;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
