package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

/* renamed from: com.google.android.gms.internal.ads.bia  reason: case insensitive filesystem */
public final class C1383bia extends C1808hia {
    private final Dha i;
    private long j;

    public C1383bia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, Dha dha) {
        super(wha, str, str2, aVar, i2, 53);
        this.i = dha;
        if (dha != null) {
            this.j = dha.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.i != null) {
            this.f10710e.e(((Long) this.f10711f.invoke((Object) null, new Object[]{Long.valueOf(this.j)})).longValue());
        }
    }
}
