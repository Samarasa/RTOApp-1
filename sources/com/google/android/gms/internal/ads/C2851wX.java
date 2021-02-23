package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wX  reason: case insensitive filesystem */
final class C2851wX<E> extends C2355pX<E> {

    /* renamed from: c  reason: collision with root package name */
    private final C2709uX<E> f12632c;

    C2851wX(C2709uX<E> uXVar, int i) {
        super(uXVar.size(), i);
        this.f12632c = uXVar;
    }

    /* access modifiers changed from: protected */
    public final E a(int i) {
        return this.f12632c.get(i);
    }
}
