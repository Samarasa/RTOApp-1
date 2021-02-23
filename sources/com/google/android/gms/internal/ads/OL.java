package com.google.android.gms.internal.ads;

public final class OL implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final LL f8073a;

    public OL(LL ll) {
        this.f8073a = ll;
    }

    public final /* synthetic */ Object get() {
        String b2 = this.f8073a.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
