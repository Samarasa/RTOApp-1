package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nK  reason: case insensitive filesystem */
public final class C2200nK implements Xga<C2058lK> {

    /* renamed from: a  reason: collision with root package name */
    private final C2058lK f11448a;

    private C2200nK(C2058lK lKVar) {
        this.f11448a = lKVar;
    }

    public static C2200nK a(C2058lK lKVar) {
        return new C2200nK(lKVar);
    }

    public final /* synthetic */ Object get() {
        C2058lK lKVar = this.f11448a;
        if (lKVar != null) {
            C1452cha.a(lKVar, "Cannot return null from a non-@Nullable @Provides method");
            return lKVar;
        }
        throw null;
    }
}
