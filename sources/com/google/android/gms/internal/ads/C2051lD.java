package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1538dpa;
import com.google.android.gms.internal.ads.Cpa;

/* renamed from: com.google.android.gms.internal.ads.lD  reason: case insensitive filesystem */
public final class C2051lD implements Xga<Soa> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11138a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<String> f11139b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f11140c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1538dpa.a> f11141d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<String> f11142e;

    private C2051lD(C1876iha<Context> iha, C1876iha<String> iha2, C1876iha<C1200Yk> iha3, C1876iha<C1538dpa.a> iha4, C1876iha<String> iha5) {
        this.f11138a = iha;
        this.f11139b = iha2;
        this.f11140c = iha3;
        this.f11141d = iha4;
        this.f11142e = iha5;
    }

    public static C2051lD a(C1876iha<Context> iha, C1876iha<String> iha2, C1876iha<C1200Yk> iha3, C1876iha<C1538dpa.a> iha4, C1876iha<String> iha5) {
        return new C2051lD(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        String str = this.f11139b.get();
        C1200Yk yk = this.f11140c.get();
        C1538dpa.a aVar = this.f11141d.get();
        String str2 = this.f11142e.get();
        Soa soa = new Soa(new Woa(this.f11138a.get()));
        Cpa.a o = Cpa.o();
        o.a(yk.f9457b);
        o.b(yk.f9458c);
        o.c(yk.f9459d ? 0 : 2);
        soa.a((Voa) new C2122mD(aVar, str, (Cpa) o.k(), str2));
        C1452cha.a(soa, "Cannot return null from a non-@Nullable @Provides method");
        return soa;
    }
}
