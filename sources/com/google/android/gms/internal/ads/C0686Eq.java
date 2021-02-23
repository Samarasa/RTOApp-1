package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Eq  reason: case insensitive filesystem */
public final class C0686Eq implements Xga<C0660Dq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2084lf> f6766a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0608Bq> f6767b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f6768c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2673tq> f6769d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<e> f6770e;

    private C0686Eq(C1876iha<C2084lf> iha, C1876iha<C0608Bq> iha2, C1876iha<Executor> iha3, C1876iha<C2673tq> iha4, C1876iha<e> iha5) {
        this.f6766a = iha;
        this.f6767b = iha2;
        this.f6768c = iha3;
        this.f6769d = iha4;
        this.f6770e = iha5;
    }

    public static C0686Eq a(C1876iha<C2084lf> iha, C1876iha<C0608Bq> iha2, C1876iha<Executor> iha3, C1876iha<C2673tq> iha4, C1876iha<e> iha5) {
        return new C0686Eq(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C0660Dq(this.f6766a.get(), this.f6767b.get(), this.f6768c.get(), this.f6769d.get(), this.f6770e.get());
    }
}
