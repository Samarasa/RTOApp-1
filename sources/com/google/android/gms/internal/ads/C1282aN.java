package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.aN  reason: case insensitive filesystem */
public final class C1282aN implements JO<XM> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f9774a;

    /* renamed from: b  reason: collision with root package name */
    private final C1697gD f9775b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9776c;

    /* renamed from: d  reason: collision with root package name */
    private final SS f9777d;

    public C1282aN(PY py, C1697gD gDVar, SS ss, String str) {
        this.f9774a = py;
        this.f9775b = gDVar;
        this.f9777d = ss;
        this.f9776c = str;
    }

    public final LY<XM> a() {
        return this.f9774a.a(new _M(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ XM b() {
        JSONObject a2;
        if (((Boolean) Qqa.e().a(F.zc)).booleanValue() && (a2 = this.f9775b.a(this.f9777d.f8620f, this.f9776c)) != null) {
            return new XM(a2.toString());
        }
        return null;
    }
}
