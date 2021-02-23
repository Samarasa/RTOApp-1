package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.js  reason: case insensitive filesystem */
public final class C1968js implements Xga<Runnable> {

    /* renamed from: a  reason: collision with root package name */
    private final C2039ks f11015a;

    public C1968js(C2039ks ksVar) {
        this.f11015a = ksVar;
    }

    public final /* synthetic */ Object get() {
        Runnable b2 = this.f11015a.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
