package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zI  reason: case insensitive filesystem */
final /* synthetic */ class C3049zI implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final C2693uH f13027a;

    C3049zI(C2693uH uHVar) {
        this.f13027a = uHVar;
    }

    public final void a(boolean z, Context context) {
        C2693uH uHVar = this.f13027a;
        try {
            ((C1925jT) uHVar.f12306b).a(z);
            ((C1925jT) uHVar.f12306b).g();
        } catch (WS e2) {
            C1018Rk.c("Cannot show interstitial.");
            throw new C0954Oy(e2.getCause());
        }
    }
}
