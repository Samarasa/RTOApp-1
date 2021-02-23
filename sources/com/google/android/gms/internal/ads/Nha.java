package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

public final class Nha extends C1808hia {
    private long i;

    public Nha(C2869wha wha, String str, String str2, C1766hB.a aVar, long j, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 25);
        this.i = j;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.f10711f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f10710e) {
            this.f10710e.k(longValue);
            if (this.i != 0) {
                this.f10710e.t(longValue - this.i);
                this.f10710e.w(this.i);
            }
        }
    }
}
