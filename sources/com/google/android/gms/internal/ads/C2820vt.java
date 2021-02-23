package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;

/* renamed from: com.google.android.gms.internal.ads.vt  reason: case insensitive filesystem */
public final class C2820vt implements Xga<a> {

    /* renamed from: a  reason: collision with root package name */
    private final C2607st f12595a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f12596b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0835Kj> f12597c;

    private C2820vt(C2607st stVar, C1876iha<Context> iha, C1876iha<C0835Kj> iha2) {
        this.f12595a = stVar;
        this.f12596b = iha;
        this.f12597c = iha2;
    }

    public static C2820vt a(C2607st stVar, C1876iha<Context> iha, C1876iha<C0835Kj> iha2) {
        return new C2820vt(stVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        a aVar = new a(this.f12596b.get(), this.f12597c.get(), (C1382bi) null);
        C1452cha.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
