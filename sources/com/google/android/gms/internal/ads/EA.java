package com.google.android.gms.internal.ads;

import b.e.b;
import java.util.Map;

public final class EA implements C0872Lu {

    /* renamed from: a  reason: collision with root package name */
    private final C0877Lz f6663a;

    /* renamed from: b  reason: collision with root package name */
    private final C0981Pz f6664b;

    public EA(C0877Lz lz, C0981Pz pz) {
        this.f6663a = lz;
        this.f6664b = pz;
    }

    public final void I() {
        if (this.f6663a.v() != null) {
            C2313on u = this.f6663a.u();
            C2313on t = this.f6663a.t();
            if (u == null) {
                u = t != null ? t : null;
            }
            if (this.f6664b.a() && u != null) {
                u.a("onSdkImpression", (Map<String, ?>) new b());
            }
        }
    }
}
