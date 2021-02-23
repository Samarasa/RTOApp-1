package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qo  reason: case insensitive filesystem */
public final class C0996Qo implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f8390a;

    public C0996Qo(C0684Eo eo) {
        this.f8390a = eo;
    }

    public final /* synthetic */ Object get() {
        String d2 = this.f8390a.d();
        C1452cha.a(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
