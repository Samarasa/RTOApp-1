package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hx  reason: case insensitive filesystem */
public final class C1832hx implements Xga<C1004Qw> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10755a;

    private C1832hx(C1004Qw qw) {
        this.f10755a = qw;
    }

    public static C1832hx a(C1004Qw qw) {
        return new C1832hx(qw);
    }

    public final /* synthetic */ Object get() {
        C1004Qw qw = this.f10755a;
        if (qw != null) {
            C1452cha.a(qw, "Cannot return null from a non-@Nullable @Provides method");
            return qw;
        }
        throw null;
    }
}
