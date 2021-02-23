package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jr  reason: case insensitive filesystem */
public final class C0817Jr implements Xga<C2819vs> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7509a;

    public C0817Jr(C0661Dr dr) {
        this.f7509a = dr;
    }

    public static C2819vs a(C0661Dr dr) {
        C2819vs c2 = dr.c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7509a);
    }
}
