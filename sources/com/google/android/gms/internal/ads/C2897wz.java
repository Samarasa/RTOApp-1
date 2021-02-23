package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wz  reason: case insensitive filesystem */
public final class C2897wz implements Xga<C2526rna> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1200Yk> f12724a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<String> f12725b;

    public C2897wz(C1876iha<C1200Yk> iha, C1876iha<String> iha2) {
        this.f12724a = iha;
        this.f12725b = iha2;
    }

    public final /* synthetic */ Object get() {
        p.c();
        C2526rna rna = new C2526rna(oa.a(), this.f12724a.get(), this.f12725b.get(), new JSONObject(), false, true);
        C1452cha.a(rna, "Cannot return null from a non-@Nullable @Provides method");
        return rna;
    }
}
