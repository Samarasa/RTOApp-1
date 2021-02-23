package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

final class KX extends C2709uX<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ GX f7561c;

    KX(GX gx) {
        this.f7561c = gx;
    }

    public final /* synthetic */ Object get(int i) {
        C1434cX.a(i, this.f7561c.f7039f);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f7561c.f7037d[i2], this.f7561c.f7037d[i2 + 1]);
    }

    public final boolean h() {
        return true;
    }

    public final int size() {
        return this.f7561c.f7039f;
    }
}
