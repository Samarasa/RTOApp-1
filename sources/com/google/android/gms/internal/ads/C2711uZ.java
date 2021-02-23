package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uZ  reason: case insensitive filesystem */
public abstract class C2711uZ<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f12335a;

    public C2711uZ(Class<PrimitiveT> cls) {
        this.f12335a = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> a() {
        return this.f12335a;
    }

    public abstract PrimitiveT a(KeyT keyt);
}
