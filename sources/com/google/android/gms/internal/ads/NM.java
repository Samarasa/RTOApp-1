package com.google.android.gms.internal.ads;

import android.content.Context;

public final class NM implements Xga<LM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f7953a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f7954b;

    private NM(C1876iha<PY> iha, C1876iha<Context> iha2) {
        this.f7953a = iha;
        this.f7954b = iha2;
    }

    public static NM a(C1876iha<PY> iha, C1876iha<Context> iha2) {
        return new NM(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new LM(this.f7953a.get(), this.f7954b.get());
    }
}
