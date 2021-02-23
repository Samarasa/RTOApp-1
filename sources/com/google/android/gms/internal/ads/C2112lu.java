package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lu  reason: case insensitive filesystem */
public final class C2112lu implements Xga<SS> {

    /* renamed from: a  reason: collision with root package name */
    private final C1616eu f11260a;

    private C2112lu(C1616eu euVar) {
        this.f11260a = euVar;
    }

    public static C2112lu a(C1616eu euVar) {
        return new C2112lu(euVar);
    }

    public static SS b(C1616eu euVar) {
        SS b2 = euVar.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f11260a);
    }
}
