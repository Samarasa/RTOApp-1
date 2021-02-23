package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xy  reason: case insensitive filesystem */
public final class C1188Xy implements Xga<C1136Vy> {

    /* renamed from: a  reason: collision with root package name */
    private final C1136Vy f9310a;

    private C1188Xy(C1136Vy vy) {
        this.f9310a = vy;
    }

    public static C1188Xy a(C1136Vy vy) {
        return new C1188Xy(vy);
    }

    public final /* synthetic */ Object get() {
        C1136Vy vy = this.f9310a;
        if (vy != null) {
            C1452cha.a(vy, "Cannot return null from a non-@Nullable @Provides method");
            return vy;
        }
        throw null;
    }
}
