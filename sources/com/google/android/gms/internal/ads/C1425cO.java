package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.cO  reason: case insensitive filesystem */
public final class C1425cO implements Xga<C1283aO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f10026a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Bundle> f10027b;

    private C1425cO(C1876iha<PY> iha, C1876iha<Bundle> iha2) {
        this.f10026a = iha;
        this.f10027b = iha2;
    }

    public static C1425cO a(C1876iha<PY> iha, C1876iha<Bundle> iha2) {
        return new C1425cO(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C1283aO(this.f10026a.get(), this.f10027b.get());
    }
}
