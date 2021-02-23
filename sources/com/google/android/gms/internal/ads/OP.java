package com.google.android.gms.internal.ads;

public final class OP implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final PP f8078a;

    public OP(PP pp) {
        this.f8078a = pp;
    }

    public static String a(PP pp) {
        String a2 = pp.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8078a);
    }
}
