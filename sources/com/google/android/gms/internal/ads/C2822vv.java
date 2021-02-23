package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.vv  reason: case insensitive filesystem */
public final class C2822vv extends C0874Lw<C0613Bv> implements C0872Lu, C2255nv {

    /* renamed from: b  reason: collision with root package name */
    private final C2988yS f12598b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f12599c = new AtomicBoolean();

    public C2822vv(Set<C3108zx<C0613Bv>> set, C2988yS ySVar) {
        super(set);
        this.f12598b = ySVar;
    }

    private final void X() {
        C2603sqa sqa;
        if (((Boolean) Qqa.e().a(F.hf)).booleanValue() && this.f12599c.compareAndSet(false, true) && (sqa = this.f12598b.aa) != null && sqa.f12148a == 3) {
            a(new C3035yv(this));
        }
    }

    public final void I() {
        int i = this.f12598b.f12915b;
        if (i == 2 || i == 5 || i == 4) {
            X();
        }
    }

    public final void Ub() {
        if (this.f12598b.f12915b == 1) {
            X();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C0613Bv bv) {
        bv.a(this.f12598b.aa);
    }
}
