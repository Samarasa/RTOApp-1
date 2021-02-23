package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.C1766hB;
import java.lang.reflect.InvocationTargetException;

public final class Hha extends C1808hia {
    public Hha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i, int i2) {
        super(wha, str, str2, aVar, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f10710e.b(C2408qF.ENUM_FAILURE);
        try {
            this.f10710e.b(((Boolean) this.f10711f.invoke((Object) null, new Object[]{this.f10707b.a()})).booleanValue() ? C2408qF.ENUM_TRUE : C2408qF.ENUM_FALSE);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
