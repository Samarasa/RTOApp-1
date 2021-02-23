package com.google.android.gms.internal.ads;

import java.util.Map;

public final class RD implements Xga<QD> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Soa> f8449a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Map<SU, SD>> f8450b;

    private RD(C1876iha<Soa> iha, C1876iha<Map<SU, SD>> iha2) {
        this.f8449a = iha;
        this.f8450b = iha2;
    }

    public static RD a(C1876iha<Soa> iha, C1876iha<Map<SU, SD>> iha2) {
        return new RD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new QD(this.f8449a.get(), this.f8450b.get());
    }
}
