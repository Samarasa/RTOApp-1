package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.f;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Kc  reason: case insensitive filesystem */
final class C0828Kc implements C1088Uc<C2313on> {
    C0828Kc() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        if (onVar.C() != null) {
            onVar.C().Vb();
        }
        f a2 = onVar.a();
        if (a2 != null) {
            a2.Zb();
            return;
        }
        f g2 = onVar.g();
        if (g2 != null) {
            g2.Zb();
        } else {
            C1018Rk.d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
