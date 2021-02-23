package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mr  reason: case insensitive filesystem */
public final class C0895Mr implements Xga<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7919a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0635Cr> f7920b;

    public C0895Mr(C0661Dr dr, C1876iha<C0635Cr> iha) {
        this.f7919a = dr;
        this.f7920b = iha;
    }

    public static C0583Ar a(C0661Dr dr, Object obj) {
        C0635Cr cr = (C0635Cr) obj;
        C1452cha.a(cr, "Cannot return null from a non-@Nullable @Provides method");
        return cr;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7919a, this.f7920b.get());
    }
}
