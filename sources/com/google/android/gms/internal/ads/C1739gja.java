package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.gja  reason: case insensitive filesystem */
public final class C1739gja {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f10569a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1527dja f10570b;

    public C1739gja(Handler handler, C1527dja dja) {
        Handler handler2;
        if (dja != null) {
            Cma.a(handler);
            handler2 = handler;
        } else {
            handler2 = null;
        }
        this.f10569a = handler2;
        this.f10570b = dja;
    }

    public final void a(int i) {
        if (this.f10570b != null) {
            this.f10569a.post(new C2164mja(this, i));
        }
    }

    public final void a(int i, long j, long j2) {
        if (this.f10570b != null) {
            this.f10569a.post(new C2022kja(this, i, j, j2));
        }
    }

    public final void a(Jja jja) {
        if (this.f10570b != null) {
            this.f10569a.post(new C1668fja(this, jja));
        }
    }

    public final void a(Lia lia) {
        if (this.f10570b != null) {
            this.f10569a.post(new C1810hja(this, lia));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.f10570b != null) {
            this.f10569a.post(new C1880ija(this, str, j, j2));
        }
    }

    public final void b(Jja jja) {
        if (this.f10570b != null) {
            this.f10569a.post(new C1951jja(this, jja));
        }
    }
}
