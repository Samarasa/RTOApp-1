package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nJ  reason: case insensitive filesystem */
final /* synthetic */ class C2199nJ implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final C2693uH f11447a;

    C2199nJ(C2693uH uHVar) {
        this.f11447a = uHVar;
    }

    public final void a(boolean z, Context context) {
        C2693uH uHVar = this.f11447a;
        try {
            ((C1925jT) uHVar.f12306b).a(z);
            ((C1925jT) uHVar.f12306b).b(context);
        } catch (WS e2) {
            throw new C0954Oy(e2.getCause());
        }
    }
}
