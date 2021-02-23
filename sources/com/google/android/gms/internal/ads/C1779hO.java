package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hO  reason: case insensitive filesystem */
public final class C1779hO implements Xga<C1566eO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f10664a;

    private C1779hO(C1876iha<String> iha) {
        this.f10664a = iha;
    }

    public static C1779hO a(C1876iha<String> iha) {
        return new C1779hO(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1566eO(this.f10664a.get());
    }
}
