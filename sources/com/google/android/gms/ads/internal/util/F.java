package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.Ara;
import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1339b;
import com.google.android.gms.internal.ads.C1742gl;
import com.google.android.gms.internal.ads.C2594sm;
import com.google.android.gms.internal.ads.C3073zd;
import java.util.Map;

public final class F extends C1339b<Ara> {
    private final C1742gl<Ara> p;
    private final Map<String, String> q;
    private final C0836Kk r;

    public F(String str, C1742gl<Ara> glVar) {
        this(str, (Map<String, String>) null, glVar);
    }

    private F(String str, Map<String, String> map, C1742gl<Ara> glVar) {
        super(0, str, new I(glVar));
        this.q = null;
        this.p = glVar;
        this.r = new C0836Kk();
        this.r.a(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final C3073zd<Ara> a(Ara ara) {
        return C3073zd.a(ara, C2594sm.a(ara));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        Ara ara = (Ara) obj;
        this.r.a((Map<String, ?>) ara.f6213c, ara.f6211a);
        C0836Kk kk = this.r;
        byte[] bArr = ara.f6212b;
        if (C0836Kk.a() && bArr != null) {
            kk.a(bArr);
        }
        this.p.a(ara);
    }
}
