package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;

public final class _ha extends C1808hia {
    private final StackTraceElement[] i;

    public _ha(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(wha, str, str2, aVar, i2, 45);
        this.i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Object obj = this.i;
        if (obj != null) {
            C2514rha rha = new C2514rha((String) this.f10711f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f10710e) {
                this.f10710e.b(rha.f12012b.longValue());
                if (rha.f12013c.booleanValue()) {
                    this.f10710e.c(rha.f12014d.booleanValue() ? C2408qF.ENUM_FALSE : C2408qF.ENUM_TRUE);
                } else {
                    this.f10710e.c(C2408qF.ENUM_FAILURE);
                }
            }
        }
    }
}
