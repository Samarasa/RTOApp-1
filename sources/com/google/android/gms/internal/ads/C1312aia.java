package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

/* renamed from: com.google.android.gms.internal.ads.aia  reason: case insensitive filesystem */
public final class C1312aia extends C1808hia {
    private final boolean i;

    public C1312aia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3) {
        super(wha, str, str2, aVar, i2, 61);
        this.i = wha.d();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        long longValue = ((Long) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a(), Boolean.valueOf(this.i)})).longValue();
        synchronized (this.f10710e) {
            this.f10710e.h(longValue);
        }
    }
}
