package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.ads.KO;

final class YM<S extends KO<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final LY<S> f9345a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9346b;

    /* renamed from: c  reason: collision with root package name */
    private final e f9347c;

    public YM(LY<S> ly, long j, e eVar) {
        this.f9345a = ly;
        this.f9347c = eVar;
        this.f9346b = eVar.b() + j;
    }

    public final boolean a() {
        return this.f9346b < this.f9347c.b();
    }
}
