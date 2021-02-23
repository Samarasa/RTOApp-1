package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fu  reason: case insensitive filesystem */
public final class C1687fu implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1616eu f10473a;

    private C1687fu(C1616eu euVar) {
        this.f10473a = euVar;
    }

    public static C1687fu a(C1616eu euVar) {
        return new C1687fu(euVar);
    }

    public static String b(C1616eu euVar) {
        return euVar.e();
    }

    public final /* synthetic */ Object get() {
        return this.f10473a.e();
    }
}
