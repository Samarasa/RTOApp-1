package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;

/* renamed from: com.google.android.gms.internal.ads.un  reason: case insensitive filesystem */
final class C2738un implements q {

    /* renamed from: a  reason: collision with root package name */
    private C2313on f12412a;

    /* renamed from: b  reason: collision with root package name */
    private q f12413b;

    public C2738un(C2313on onVar, q qVar) {
        this.f12412a = onVar;
        this.f12413b = qVar;
    }

    public final void J() {
        q qVar = this.f12413b;
        if (qVar != null) {
            qVar.J();
        }
    }

    public final void Tb() {
        q qVar = this.f12413b;
        if (qVar != null) {
            qVar.Tb();
        }
        this.f12412a.v();
    }

    public final void a(m mVar) {
        q qVar = this.f12413b;
        if (qVar != null) {
            qVar.a(mVar);
        }
        this.f12412a.w();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }
}
