package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.h;

/* renamed from: com.google.android.gms.internal.ads.qc  reason: case insensitive filesystem */
public final class C2433qc {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h.b f11861a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h.a f11862b;

    /* renamed from: c  reason: collision with root package name */
    private h f11863c;

    public C2433qc(h.b bVar, h.a aVar) {
        this.f11861a = bVar;
        this.f11862b = aVar;
    }

    /* access modifiers changed from: private */
    public final synchronized h a(C0749Hb hb) {
        if (this.f11863c != null) {
            return this.f11863c;
        }
        C0775Ib ib = new C0775Ib(hb);
        this.f11863c = ib;
        return ib;
    }

    public final C1035Sb a() {
        return new C2503rc(this);
    }

    public final C1009Rb b() {
        if (this.f11862b == null) {
            return null;
        }
        return new C2574sc(this);
    }
}
