package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Et  reason: case insensitive filesystem */
public final class C0689Et implements Xga<C3108zx<q>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f6782a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6783b;

    private C0689Et(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f6782a = iha;
        this.f6783b = iha2;
    }

    public static C0689Et a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C0689Et(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6782a.get(), this.f6783b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
