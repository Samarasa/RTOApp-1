package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.M;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class HI implements II<C3110zz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1240Zy f7127a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f7128b;

    /* renamed from: c  reason: collision with root package name */
    private final WA f7129c;

    /* renamed from: d  reason: collision with root package name */
    private final C1855iT<VB> f7130d;

    public HI(C1240Zy zy, PY py, WA wa, C1855iT<VB> iTVar) {
        this.f7127a = zy;
        this.f7128b = py;
        this.f7129c = wa;
        this.f7130d = iTVar;
    }

    private final LY<C3110zz> a(OS os, C2988yS ySVar, JSONObject jSONObject) {
        LY<VB> a2 = this.f7130d.a();
        LY<C0877Lz> a3 = this.f7129c.a(os, ySVar, jSONObject);
        return DY.b((LY<? extends V>[]) new LY[]{a2, a3}).a(new OI(this, a3, a2, os, ySVar, jSONObject), this.f7128b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(OS os, C2988yS ySVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return DY.a((Throwable) new VE(C2351pT.NO_FILL));
        }
        int i = 0;
        if (os.f8087a.f7415a.k <= 1) {
            return DY.a(a(os, ySVar, jSONArray.getJSONObject(0)), LI.f7657a, (Executor) this.f7128b);
        }
        int length = jSONArray.length();
        this.f7130d.a(Math.min(length, os.f8087a.f7415a.k));
        ArrayList arrayList = new ArrayList(os.f8087a.f7415a.k);
        while (i < os.f8087a.f7415a.k) {
            arrayList.add(i < length ? a(os, ySVar, jSONArray.getJSONObject(i)) : DY.a((Throwable) new VE(C2351pT.NO_FILL)));
            i++;
        }
        return DY.a(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(VB vb, JSONObject jSONObject) {
        this.f7130d.a(DY.a(vb));
        if (jSONObject.optBoolean("success")) {
            return DY.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new C1142We("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2988yS ySVar, VB vb) {
        JSONObject a2 = M.a("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", ySVar.r.f7022c);
        jSONObject.put("sdk_params", a2);
        return DY.a(vb.a("google.afma.nativeAds.preProcessJson", jSONObject), new MI(this, vb), (Executor) this.f7128b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C3110zz a(LY ly, LY ly2, OS os, C2988yS ySVar, JSONObject jSONObject) {
        C0877Lz lz = (C0877Lz) ly.get();
        VB vb = (VB) ly2.get();
        C0929Nz a2 = this.f7127a.a(new C0974Ps(os, ySVar, (String) null), new C1189Xz(lz), new C2259nz(jSONObject, vb));
        a2.i().a();
        a2.j().a(vb);
        a2.k().a(lz.t());
        return a2.h();
    }

    public final boolean a(OS os, C2988yS ySVar) {
        GS gs = ySVar.r;
        return (gs == null || gs.f7022c == null) ? false : true;
    }

    public final LY<List<LY<C3110zz>>> b(OS os, C2988yS ySVar) {
        return DY.a(DY.a(this.f7130d.a(), new KI(this, ySVar), (Executor) this.f7128b), new JI(this, os, ySVar), (Executor) this.f7128b);
    }
}
