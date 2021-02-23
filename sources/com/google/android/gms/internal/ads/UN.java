package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class UN implements Xga<SN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f8888a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f8889b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Set<String>> f8890c;

    private UN(C1876iha<PY> iha, C1876iha<Context> iha2, C1876iha<Set<String>> iha3) {
        this.f8888a = iha;
        this.f8889b = iha2;
        this.f8890c = iha3;
    }

    public static UN a(C1876iha<PY> iha, C1876iha<Context> iha2, C1876iha<Set<String>> iha3) {
        return new UN(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new SN(this.f8888a.get(), this.f8889b.get(), this.f8890c.get());
    }
}
