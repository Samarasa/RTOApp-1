package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.C1766hB;

/* renamed from: com.google.android.gms.internal.ads.gia  reason: case insensitive filesystem */
public final class C1737gia extends C1808hia {
    private final View i;

    public C1737gia(C2869wha wha, String str, String str2, C1766hB.a aVar, int i2, int i3, View view) {
        super(wha, str, str2, aVar, i2, 57);
        this.i = view;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) Qqa.e().a(F.Ub);
            DisplayMetrics displayMetrics = this.f10707b.a().getResources().getDisplayMetrics();
            Eha eha = new Eha((String) this.f10711f.invoke((Object) null, new Object[]{this.i, displayMetrics, bool}));
            C1766hB.f.a o = C1766hB.f.o();
            o.a(eha.f6727b.longValue());
            o.b(eha.f6728c.longValue());
            o.c(eha.f6729d.longValue());
            if (bool.booleanValue()) {
                o.d(eha.f6730e.longValue());
            }
            this.f10710e.a((C1766hB.f) o.k());
        }
    }
}
