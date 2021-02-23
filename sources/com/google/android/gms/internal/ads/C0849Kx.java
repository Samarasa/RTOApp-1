package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Kx  reason: case insensitive filesystem */
public final class C0849Kx implements C0771Hx {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f7637a;

    /* renamed from: b  reason: collision with root package name */
    private final C1644fV f7638b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7639c;

    public C0849Kx(C2988yS ySVar, C1644fV fVVar) {
        this.f7637a = ySVar.o;
        this.f7638b = fVVar;
    }

    public final void a() {
        if (!this.f7639c) {
            this.f7638b.a(this.f7637a);
            this.f7639c = true;
        }
    }
}
