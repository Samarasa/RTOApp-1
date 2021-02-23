package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dF  reason: case insensitive filesystem */
public final class C1487dF implements Xga<LY<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f10115a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10116b;

    private C1487dF(C1876iha<VU> iha, C1876iha<Context> iha2) {
        this.f10115a = iha;
        this.f10116b = iha2;
    }

    public static C1487dF a(C1876iha<VU> iha, C1876iha<Context> iha2) {
        return new C1487dF(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        DU<E, O> a2 = this.f10115a.get().a(SU.WEBVIEW_COOKIE).a(new _E(p.e().c(this.f10116b.get()))).a(1, TimeUnit.SECONDS).a(Exception.class, C1416cF.f10003a).a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
