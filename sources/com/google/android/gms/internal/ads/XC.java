package com.google.android.gms.internal.ads;

import android.content.Context;

public final class XC implements C0950Ou {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f9203a;

    XC(C2313on onVar) {
        this.f9203a = !((Boolean) Qqa.e().a(F.qa)).booleanValue() ? null : onVar;
    }

    public final void b(Context context) {
        C2313on onVar = this.f9203a;
        if (onVar != null) {
            onVar.onResume();
        }
    }

    public final void c(Context context) {
        C2313on onVar = this.f9203a;
        if (onVar != null) {
            onVar.destroy();
        }
    }

    public final void d(Context context) {
        C2313on onVar = this.f9203a;
        if (onVar != null) {
            onVar.onPause();
        }
    }
}
