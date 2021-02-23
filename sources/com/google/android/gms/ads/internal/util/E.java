package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1074To;
import com.google.android.gms.internal.ads.C1218Zc;
import com.google.android.gms.internal.ads.C2720ue;
import java.util.Map;

final class E extends C1074To {
    private final /* synthetic */ byte[] r;
    private final /* synthetic */ Map s;
    private final /* synthetic */ C0836Kk t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    E(C0518y yVar, int i, String str, C2720ue ueVar, C1218Zc zc, byte[] bArr, Map map, C0836Kk kk) {
        super(i, str, ueVar, zc);
        this.r = bArr;
        this.s = map;
        this.t = kk;
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.s;
        return map == null ? super.a() : map;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        c((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        this.t.a(str);
        super.c(str);
    }

    public final byte[] p() {
        byte[] bArr = this.r;
        return bArr == null ? super.p() : bArr;
    }
}
