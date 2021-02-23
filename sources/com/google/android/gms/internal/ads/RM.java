package com.google.android.gms.internal.ads;

import android.content.Context;

public final class RM implements Xga<PM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f8458a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f8459b;

    public RM(C1876iha<PY> iha, C1876iha<Context> iha2) {
        this.f8458a = iha;
        this.f8459b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new PM(this.f8458a.get(), this.f8459b.get());
    }
}
