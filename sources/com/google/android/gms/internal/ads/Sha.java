package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

public final class Sha extends C1808hia {
    private static volatile Long i;
    private static final Object j = new Object();

    public Sha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 22);
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
            this.f10710e.v(i.longValue());
        }
    }
}
