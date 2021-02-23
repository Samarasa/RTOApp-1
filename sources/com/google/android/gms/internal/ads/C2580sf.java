package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sf  reason: case insensitive filesystem */
public final class C2580sf<I, O> implements C2214nY<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1305af<O> f12114a;

    /* renamed from: b  reason: collision with root package name */
    private final C1246_e<I> f12115b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12116c;

    /* renamed from: d  reason: collision with root package name */
    private final LY<C1090Ue> f12117d;

    C2580sf(LY<C1090Ue> ly, String str, C1246_e<I> _eVar, C1305af<O> afVar) {
        this.f12117d = ly;
        this.f12116c = str;
        this.f12115b = _eVar;
        this.f12114a = afVar;
    }

    public final LY<O> a(I i) {
        return DY.a(this.f12117d, new C2509rf(this, i), (Executor) C1252_k.f9704f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Object obj, C1090Ue ue) {
        C1742gl glVar = new C1742gl();
        p.c();
        String a2 = oa.a();
        C0594Bc.p.a(a2, (C1726gd) new C2722uf(this, glVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", a2);
        jSONObject.put("args", this.f12115b.a(obj));
        ue.b(this.f12116c, jSONObject);
        return glVar;
    }
}
