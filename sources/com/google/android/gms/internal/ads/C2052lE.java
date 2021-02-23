package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lE  reason: case insensitive filesystem */
public final class C2052lE implements Xga<C1910jE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1486dE> f11143a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<C1840iE>> f11144b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<e> f11145c;

    private C2052lE(C1876iha<C1486dE> iha, C1876iha<Set<C1840iE>> iha2, C1876iha<e> iha3) {
        this.f11143a = iha;
        this.f11144b = iha2;
        this.f11145c = iha3;
    }

    public static C2052lE a(C1876iha<C1486dE> iha, C1876iha<Set<C1840iE>> iha2, C1876iha<e> iha3) {
        return new C2052lE(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C1910jE(this.f11143a.get(), this.f11144b.get(), this.f11145c.get());
    }
}
