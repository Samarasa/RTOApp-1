package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

/* renamed from: com.google.android.gms.internal.ads.eia  reason: case insensitive filesystem */
public final class C1595eia extends C1808hia {
    private static volatile Long i;
    private static final Object j = new Object();

    public C1595eia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 33);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f10711f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f10710e) {
            this.f10710e.z(i.longValue());
        }
    }
}
