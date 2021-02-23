package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.Rp  reason: case insensitive filesystem */
public final class C1023Rp implements Xga<AV> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8543a;

    public C1023Rp(C1876iha<Context> iha) {
        this.f8543a = iha;
    }

    public final /* synthetic */ Object get() {
        AV av = new AV(this.f8543a.get(), p.q().b());
        C1452cha.a(av, "Cannot return null from a non-@Nullable @Provides method");
        return av;
    }
}
