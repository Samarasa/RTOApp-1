package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.ula  reason: case insensitive filesystem */
public final class C2735ula implements C3090zla, Cla {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f12395a;

    /* renamed from: b  reason: collision with root package name */
    private final C2099lma f12396b;

    /* renamed from: c  reason: collision with root package name */
    private final Zja f12397c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12398d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f12399e;

    /* renamed from: f  reason: collision with root package name */
    private final C2948xla f12400f;

    /* renamed from: g  reason: collision with root package name */
    private final Yia f12401g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12402h = null;
    private final int i;
    private Cla j;
    private Via k;
    private boolean l;

    public C2735ula(Uri uri, C2099lma lma, Zja zja, int i2, Handler handler, C2948xla xla, String str, int i3) {
        this.f12395a = uri;
        this.f12396b = lma;
        this.f12397c = zja;
        this.f12398d = i2;
        this.f12399e = handler;
        this.f12400f = xla;
        this.i = i3;
        this.f12401g = new Yia();
    }

    public final C2877wla a(int i2, C2028kma kma) {
        Cma.a(i2 == 0);
        return new C2168mla(this.f12395a, this.f12396b.a(), this.f12397c.a(), this.f12398d, this.f12399e, this.f12400f, this, kma, (String) null, this.i);
    }

    public final void a() {
    }

    public final void a(Via via, Object obj) {
        boolean z = false;
        if (via.a(0, this.f12401g, false).f9448d != -9223372036854775807L) {
            z = true;
        }
        if (!this.l || z) {
            this.k = via;
            this.l = z;
            this.j.a(this.k, (Object) null);
        }
    }

    public final void a(C2877wla wla) {
        ((C2168mla) wla).g();
    }

    public final void a(C3084zia zia, boolean z, Cla cla) {
        this.j = cla;
        this.k = new Nla(-9223372036854775807L, false);
        cla.a(this.k, (Object) null);
    }

    public final void b() {
        this.j = null;
    }
}
