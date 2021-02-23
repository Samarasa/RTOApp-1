package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;
import java.lang.reflect.InvocationTargetException;

public final class Zha extends C1808hia {
    public Zha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        super(wha, str, str2, aVar, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.f10710e.d(((Boolean) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()})).booleanValue() ? C2408qF.ENUM_TRUE : C2408qF.ENUM_FALSE);
        } catch (InvocationTargetException unused) {
            this.f10710e.d(C2408qF.ENUM_FAILURE);
        }
    }
}
