package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.b.b.c.a;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class ssa extends C2818vra {

    /* renamed from: a  reason: collision with root package name */
    private C0621Cd f12155a;

    public final void B(String str) {
    }

    public final void Fa() {
    }

    public final List<C3002yd> Ta() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        C0621Cd cd = this.f12155a;
        if (cd != null) {
            try {
                cd.c(Collections.emptyList());
            } catch (RemoteException e2) {
                C1018Rk.c("Could not notify onComplete event.", e2);
            }
        }
    }

    public final void a(float f2) {
    }

    public final void a(a aVar, String str) {
    }

    public final void a(C0621Cd cd) {
        this.f12155a = cd;
    }

    public final void a(C0675Ef ef) {
    }

    public final void a(C1551e eVar) {
    }

    public final void b(String str, a aVar) {
    }

    public final boolean fb() {
        return false;
    }

    public final void g(boolean z) {
    }

    public final String hb() {
        return BuildConfig.FLAVOR;
    }

    public final void p() {
        C1018Rk.b("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        C0758Hk.f7186a.post(new vsa(this));
    }

    public final float pb() {
        return 1.0f;
    }

    public final void z(String str) {
    }
}
