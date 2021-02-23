package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wt  reason: case insensitive filesystem */
public final class C1157Wt implements Xga<C0587Av> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0587Av> f9187a;

    private C1157Wt(C1876iha<C0587Av> iha) {
        this.f9187a = iha;
    }

    public static C1157Wt a(C1876iha<C0587Av> iha) {
        return new C1157Wt(iha);
    }

    public final /* synthetic */ Object get() {
        C0587Av av = this.f9187a.get();
        C1452cha.a(av, "Cannot return null from a non-@Nullable @Provides method");
        return av;
    }
}
