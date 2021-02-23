package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Po  reason: case insensitive filesystem */
public final class C0970Po implements Xga<C1200Yk> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f8265a;

    public C0970Po(C0684Eo eo) {
        this.f8265a = eo;
    }

    public static C1200Yk a(C0684Eo eo) {
        C1200Yk c2 = eo.c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8265a);
    }
}
