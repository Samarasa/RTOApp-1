package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.List;

public final class _S {

    /* renamed from: a  reason: collision with root package name */
    private final C2988yS f9657a;

    /* renamed from: b  reason: collision with root package name */
    private final DS f9658b;

    /* renamed from: c  reason: collision with root package name */
    private final C1701gH f9659c;

    /* renamed from: d  reason: collision with root package name */
    private final C1644fV f9660d;

    public _S(C1701gH gHVar, C1644fV fVVar, C2988yS ySVar, DS ds) {
        this.f9657a = ySVar;
        this.f9658b = ds;
        this.f9659c = gHVar;
        this.f9660d = fVVar;
    }

    private final void a(String str, int i) {
        if (!this.f9657a.ea) {
            this.f9660d.a(str);
            return;
        }
        this.f9659c.a(new C2197nH(p.j().a(), this.f9658b.f6547b, str, i));
    }

    public final void a(List<String> list) {
        for (String a2 : list) {
            a(a2, C1489dH.f10122b);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<java.lang.String> r2, java.lang.Integer r3) {
        /*
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.a((java.lang.String) r0, (int) r3)
            goto L_0x0004
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads._S.a(java.util.List, int):void");
    }
}
