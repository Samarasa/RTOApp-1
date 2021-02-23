package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jq  reason: case insensitive filesystem */
public final class C0816Jq implements Xga<C2526rna> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f7501a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f7502b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<JSONObject> f7503c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<String> f7504d;

    private C0816Jq(C1876iha<C2988yS> iha, C1876iha<C1200Yk> iha2, C1876iha<JSONObject> iha3, C1876iha<String> iha4) {
        this.f7501a = iha;
        this.f7502b = iha2;
        this.f7503c = iha3;
        this.f7504d = iha4;
    }

    public static C0816Jq a(C1876iha<C2988yS> iha, C1876iha<C1200Yk> iha2, C1876iha<JSONObject> iha3, C1876iha<String> iha4) {
        return new C0816Jq(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        C2988yS ySVar = this.f7501a.get();
        String str = this.f7504d.get();
        boolean equals = "native".equals(str);
        p.c();
        C2526rna rna = new C2526rna(oa.a(), this.f7502b.get(), str, this.f7503c.get(), false, equals);
        C1452cha.a(rna, "Cannot return null from a non-@Nullable @Provides method");
        return rna;
    }
}
