package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.ha;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lA  reason: case insensitive filesystem */
public final class C2048lA implements Xga<C1765hA> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ha> f11129a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<SS> f11130b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0981Pz> f11131c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C0877Lz> f11132d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C2332pA> f11133e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<C2899xA> f11134f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<Executor> f11135g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<Executor> f11136h;
    private final C1876iha<C0721Fz> i;

    private C2048lA(C1876iha<ha> iha, C1876iha<SS> iha2, C1876iha<C0981Pz> iha3, C1876iha<C0877Lz> iha4, C1876iha<C2332pA> iha5, C1876iha<C2899xA> iha6, C1876iha<Executor> iha7, C1876iha<Executor> iha8, C1876iha<C0721Fz> iha9) {
        this.f11129a = iha;
        this.f11130b = iha2;
        this.f11131c = iha3;
        this.f11132d = iha4;
        this.f11133e = iha5;
        this.f11134f = iha6;
        this.f11135g = iha7;
        this.f11136h = iha8;
        this.i = iha9;
    }

    public static C2048lA a(C1876iha<ha> iha, C1876iha<SS> iha2, C1876iha<C0981Pz> iha3, C1876iha<C0877Lz> iha4, C1876iha<C2332pA> iha5, C1876iha<C2899xA> iha6, C1876iha<Executor> iha7, C1876iha<Executor> iha8, C1876iha<C0721Fz> iha9) {
        return new C2048lA(iha, iha2, iha3, iha4, iha5, iha6, iha7, iha8, iha9);
    }

    public final /* synthetic */ Object get() {
        return new C1765hA(this.f11129a.get(), this.f11130b.get(), this.f11131c.get(), this.f11132d.get(), this.f11133e.get(), this.f11134f.get(), this.f11135g.get(), this.f11136h.get(), this.i.get());
    }
}
