package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class IJ implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final C2693uH f7259a;

    IJ(C2693uH uHVar) {
        this.f7259a = uHVar;
    }

    public final void a(boolean z, Context context) {
        C2693uH uHVar = this.f7259a;
        try {
            ((C1925jT) uHVar.f12306b).a(z);
            ((C1925jT) uHVar.f12306b).h();
        } catch (WS e2) {
            C1018Rk.c("Cannot show rewarded video.", e2);
            throw new C0954Oy(e2.getCause());
        }
    }
}
