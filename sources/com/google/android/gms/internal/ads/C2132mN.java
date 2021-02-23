package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mN  reason: case insensitive filesystem */
public final class C2132mN implements JO<C2203nN> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11294a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f11295b;

    C2132mN(Context context, PY py) {
        this.f11294a = context;
        this.f11295b = py;
    }

    public final LY<C2203nN> a() {
        return this.f11295b.a(new C2061lN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2203nN b() {
        p.c();
        String k = oa.k(this.f11294a);
        boolean booleanValue = ((Boolean) Qqa.e().a(F.ue)).booleanValue();
        String str = BuildConfig.FLAVOR;
        if (booleanValue) {
            str = this.f11294a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        p.c();
        return new C2203nN(k, str, oa.l(this.f11294a));
    }
}
