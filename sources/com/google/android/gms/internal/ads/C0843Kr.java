package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kr  reason: case insensitive filesystem */
public final class C0843Kr implements Xga<BS> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7630a;

    public C0843Kr(C0661Dr dr) {
        this.f7630a = dr;
    }

    public static BS a(C0661Dr dr) {
        BS d2 = dr.d();
        C1452cha.a(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7630a);
    }
}
