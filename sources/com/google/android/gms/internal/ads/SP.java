package com.google.android.gms.internal.ads;

public final class SP implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final PP f8608a;

    public SP(PP pp) {
        this.f8608a = pp;
    }

    public final /* synthetic */ Object get() {
        String g2 = this.f8608a.g();
        C1452cha.a(g2, "Cannot return null from a non-@Nullable @Provides method");
        return g2;
    }
}
