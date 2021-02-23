package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class VF implements _F {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1876iha<_F>> f9013a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f9014b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0769Hv f9015c;

    public VF(Map<String, C1876iha<_F>> map, PY py, C0769Hv hv) {
        this.f9013a = map;
        this.f9014b = py;
        this.f9015c = hv;
    }

    public final LY<OS> a(C2515ri riVar) {
        this.f9015c.a(riVar);
        LY<OS> a2 = DY.a((Throwable) new VE(C2351pT.NO_FILL));
        for (String trim : ((String) Qqa.e().a(F.zf)).split(",")) {
            C1876iha iha = this.f9013a.get(trim.trim());
            if (iha != null) {
                a2 = DY.a(a2, VE.class, new YF(iha, riVar), (Executor) this.f9014b);
            }
        }
        DY.a(a2, new XF(this), (Executor) C1252_k.f9704f);
        return a2;
    }
}
