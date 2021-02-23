package com.google.android.gms.internal.ads;

import android.content.Context;

public final class HO implements Xga<EO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f7138a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f7139b;

    private HO(C1876iha<PY> iha, C1876iha<Context> iha2) {
        this.f7138a = iha;
        this.f7139b = iha2;
    }

    public static EO a(PY py, Context context) {
        return new EO(py, context);
    }

    public static HO a(C1876iha<PY> iha, C1876iha<Context> iha2) {
        return new HO(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7138a.get(), this.f7139b.get());
    }
}
