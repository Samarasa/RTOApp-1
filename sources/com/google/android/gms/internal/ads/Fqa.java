package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;

final class Fqa extends Nqa<C1875ih> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f6960b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0675Ef f6961c;

    Fqa(Aqa aqa, Context context, C0675Ef ef) {
        this.f6960b = context;
        this.f6961c = ef;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C1875ih b() {
        try {
            return ((C2301oh) C1096Uk.a(this.f6960b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", Hqa.f7224a)).a(b.a(this.f6960b), this.f6961c, 203404000);
        } catch (RemoteException | C1148Wk | NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    public final /* synthetic */ Object a(C2393pra pra) {
        return pra.a(b.a(this.f6960b), this.f6961c, 203404000);
    }
}
