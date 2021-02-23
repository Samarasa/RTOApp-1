package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

public final class DN implements Xga<BN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f6536a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ViewGroup> f6537b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f6538c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Set<String>> f6539d;

    private DN(C1876iha<PY> iha, C1876iha<ViewGroup> iha2, C1876iha<Context> iha3, C1876iha<Set<String>> iha4) {
        this.f6536a = iha;
        this.f6537b = iha2;
        this.f6538c = iha3;
        this.f6539d = iha4;
    }

    public static DN a(C1876iha<PY> iha, C1876iha<ViewGroup> iha2, C1876iha<Context> iha3, C1876iha<Set<String>> iha4) {
        return new DN(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new BN(this.f6536a.get(), this.f6537b.get(), this.f6538c.get(), this.f6539d.get());
    }
}
