package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;

/* renamed from: com.google.android.gms.internal.ads.ko  reason: case insensitive filesystem */
final class C2031ko implements q {

    /* renamed from: a  reason: collision with root package name */
    private C2313on f11098a;

    /* renamed from: b  reason: collision with root package name */
    private q f11099b;

    public C2031ko(C2313on onVar, q qVar) {
        this.f11098a = onVar;
        this.f11099b = qVar;
    }

    public final void J() {
        q qVar = this.f11099b;
        if (qVar != null) {
            qVar.J();
        }
    }

    public final void Tb() {
        q qVar = this.f11099b;
        if (qVar != null) {
            qVar.Tb();
        }
        this.f11098a.v();
    }

    public final void a(m mVar) {
        q qVar = this.f11099b;
        if (qVar != null) {
            qVar.a(mVar);
        }
        this.f11098a.w();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }
}
