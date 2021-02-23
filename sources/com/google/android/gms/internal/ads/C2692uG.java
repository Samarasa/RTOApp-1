package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.uG  reason: case insensitive filesystem */
final /* synthetic */ class C2692uG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2054lG f12302a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f12303b;

    /* renamed from: c  reason: collision with root package name */
    private final LY f12304c;

    C2692uG(C2054lG lGVar, LY ly, LY ly2) {
        this.f12302a = lGVar;
        this.f12303b = ly;
        this.f12304c = ly2;
    }

    public final Object call() {
        return this.f12302a.a(this.f12303b, this.f12304c);
    }
}
