package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

/* renamed from: com.google.android.gms.internal.ads.dia  reason: case insensitive filesystem */
public final class C1525dia extends C1808hia {
    public C1525dia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        super(wha, str, str2, aVar, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        C1766hB.a aVar;
        C2408qF qFVar;
        this.f10710e.a(C2408qF.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()})).booleanValue();
        synchronized (this.f10710e) {
            if (booleanValue) {
                aVar = this.f10710e;
                qFVar = C2408qF.ENUM_TRUE;
            } else {
                aVar = this.f10710e;
                qFVar = C2408qF.ENUM_FALSE;
            }
            aVar.a(qFVar);
        }
    }
}
