package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class TE extends C0569Ad {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Object f8747a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8748b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f8749c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1742gl f8750d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ FE f8751e;

    TE(FE fe, Object obj, String str, long j, C1742gl glVar) {
        this.f8751e = fe;
        this.f8747a = obj;
        this.f8748b = str;
        this.f8749c = j;
        this.f8750d = glVar;
    }

    public final void da() {
        synchronized (this.f8747a) {
            this.f8751e.a(this.f8748b, true, BuildConfig.FLAVOR, (int) (p.j().b() - this.f8749c));
            this.f8751e.k.b(this.f8748b);
            this.f8750d.a(true);
        }
    }

    public final void n(String str) {
        synchronized (this.f8747a) {
            this.f8751e.a(this.f8748b, false, str, (int) (p.j().b() - this.f8749c));
            this.f8751e.k.a(this.f8748b, "error");
            this.f8750d.a(false);
        }
    }
}
