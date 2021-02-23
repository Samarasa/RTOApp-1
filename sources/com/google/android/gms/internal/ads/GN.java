package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class GN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C2846wS f7014a;

    public GN(C2846wS wSVar) {
        this.f7014a = wSVar;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C2846wS wSVar = this.f7014a;
        if (wSVar != null) {
            bundle.putBoolean("render_in_browser", wSVar.a());
            bundle.putBoolean("disable_ml", this.f7014a.b());
        }
    }
}
