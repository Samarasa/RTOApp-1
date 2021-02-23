package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.jna  reason: case insensitive filesystem */
public final class C1959jna {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10999a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1747gna f11000b;

    public C1959jna(Handler handler, C1747gna gna) {
        Handler handler2;
        if (gna != null) {
            Cma.a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f10999a = handler2;
        this.f11000b = gna;
    }

    public final void a(int i, int i2, int i3, float f2) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2172mna(this, i, i2, i3, f2));
        }
    }

    public final void a(int i, long j) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2243nna(this, i, j));
        }
    }

    public final void a(Surface surface) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2385pna(this, surface));
        }
    }

    public final void a(Jja jja) {
        if (this.f11000b != null) {
            this.f10999a.post(new C1888ina(this, jja));
        }
    }

    public final void a(Lia lia) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2030kna(this, lia));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2101lna(this, str, j, j2));
        }
    }

    public final void b(Jja jja) {
        if (this.f11000b != null) {
            this.f10999a.post(new C2314ona(this, jja));
        }
    }
}
