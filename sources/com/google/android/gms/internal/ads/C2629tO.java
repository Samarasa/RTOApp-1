package com.google.android.gms.internal.ads;

import android.content.Context;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.tO  reason: case insensitive filesystem */
public final class C2629tO implements JO<C2417qO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1017Rj f12189a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f12190b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12191c;

    public C2629tO(C1017Rj rj, PY py, Context context) {
        this.f12189a = rj;
        this.f12190b = py;
        this.f12191c = context;
    }

    public final LY<C2417qO> a() {
        return this.f12190b.a(new C2558sO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2417qO b() {
        if (!this.f12189a.g(this.f12191c)) {
            return new C2417qO((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String b2 = this.f12189a.b(this.f12191c);
        String str = b2 == null ? BuildConfig.FLAVOR : b2;
        String c2 = this.f12189a.c(this.f12191c);
        String str2 = c2 == null ? BuildConfig.FLAVOR : c2;
        String d2 = this.f12189a.d(this.f12191c);
        String str3 = d2 == null ? BuildConfig.FLAVOR : d2;
        String e2 = this.f12189a.e(this.f12191c);
        return new C2417qO(str, str2, str3, e2 == null ? BuildConfig.FLAVOR : e2, "TIME_OUT".equals(str2) ? (Long) Qqa.e().a(F.Z) : null);
    }
}
