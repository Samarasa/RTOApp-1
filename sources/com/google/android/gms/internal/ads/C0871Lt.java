package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.ha;

/* renamed from: com.google.android.gms.internal.ads.Lt  reason: case insensitive filesystem */
public final class C0871Lt implements Xga<C0897Mt> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f7772a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<SS> f7773b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f7774c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<ha> f7775d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<FE> f7776e;

    private C0871Lt(C1876iha<Context> iha, C1876iha<SS> iha2, C1876iha<C1200Yk> iha3, C1876iha<ha> iha4, C1876iha<FE> iha5) {
        this.f7772a = iha;
        this.f7773b = iha2;
        this.f7774c = iha3;
        this.f7775d = iha4;
        this.f7776e = iha5;
    }

    public static C0871Lt a(C1876iha<Context> iha, C1876iha<SS> iha2, C1876iha<C1200Yk> iha3, C1876iha<ha> iha4, C1876iha<FE> iha5) {
        return new C0871Lt(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C0897Mt(this.f7772a.get(), this.f7773b.get(), this.f7774c.get(), this.f7775d.get(), this.f7776e.get());
    }
}
