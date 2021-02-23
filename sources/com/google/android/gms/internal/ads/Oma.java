package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class Oma implements Gma {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8143a;

    /* renamed from: b  reason: collision with root package name */
    private long f8144b;

    /* renamed from: c  reason: collision with root package name */
    private long f8145c;

    /* renamed from: d  reason: collision with root package name */
    private Ria f8146d = Ria.f8504a;

    public final Ria a(Ria ria) {
        if (this.f8143a) {
            a(c());
        }
        this.f8146d = ria;
        return ria;
    }

    public final void a() {
        if (!this.f8143a) {
            this.f8145c = SystemClock.elapsedRealtime();
            this.f8143a = true;
        }
    }

    public final void a(long j) {
        this.f8144b = j;
        if (this.f8143a) {
            this.f8145c = SystemClock.elapsedRealtime();
        }
    }

    public final void a(Gma gma) {
        a(gma.c());
        this.f8146d = gma.b();
    }

    public final Ria b() {
        return this.f8146d;
    }

    public final long c() {
        long j = this.f8144b;
        if (!this.f8143a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8145c;
        Ria ria = this.f8146d;
        return j + (ria.f8505b == 1.0f ? C2942xia.b(elapsedRealtime) : ria.a(elapsedRealtime));
    }

    public final void d() {
        if (this.f8143a) {
            a(c());
            this.f8143a = false;
        }
    }
}
