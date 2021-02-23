package com.google.android.gms.internal.ads;

import android.content.Context;

public final class VO implements Xga<TO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f9039a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f9040b;

    private VO(C1876iha<PY> iha, C1876iha<Context> iha2) {
        this.f9039a = iha;
        this.f9040b = iha2;
    }

    public static VO a(C1876iha<PY> iha, C1876iha<Context> iha2) {
        return new VO(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new TO(this.f9039a.get(), this.f9040b.get());
    }
}
