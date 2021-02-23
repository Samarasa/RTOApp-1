package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

public final class Xha extends C1808hia {
    private static volatile String i;
    private static final Object j = new Object();

    public Xha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 1);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f10710e.c("E");
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (String) this.f10711f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f10710e) {
            this.f10710e.c(i);
        }
    }
}
