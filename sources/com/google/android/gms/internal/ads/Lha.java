package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

public final class Lha extends C1808hia {
    public Lha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        super(wha, str, str2, aVar, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f10710e.m(-1);
        this.f10710e.n(-1);
        int[] iArr = (int[]) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()});
        synchronized (this.f10710e) {
            this.f10710e.m((long) iArr[0]);
            this.f10710e.n((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f10710e.f((long) iArr[2]);
            }
        }
    }
}
