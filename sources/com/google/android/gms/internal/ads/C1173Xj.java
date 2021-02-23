package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Xj  reason: case insensitive filesystem */
final /* synthetic */ class C1173Xj implements C1598ek {

    /* renamed from: a  reason: collision with root package name */
    static final C1598ek f9273a = new C1173Xj();

    private C1173Xj() {
    }

    public final Object a(C0580Ao ao) {
        String Ya = ao.Ya();
        if (Ya != null) {
            return Ya;
        }
        String zb = ao.zb();
        return zb != null ? zb : BuildConfig.FLAVOR;
    }
}
