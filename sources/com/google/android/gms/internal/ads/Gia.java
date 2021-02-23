package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class Gia implements C3084zia {

    /* renamed from: a  reason: collision with root package name */
    private final Uia[] f7060a;

    /* renamed from: b  reason: collision with root package name */
    private final C1745gma f7061b;

    /* renamed from: c  reason: collision with root package name */
    private final C1533dma f7062c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f7063d;

    /* renamed from: e  reason: collision with root package name */
    private final Iia f7064e;

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArraySet<Cia> f7065f;

    /* renamed from: g  reason: collision with root package name */
    private final C1314aja f7066g;

    /* renamed from: h  reason: collision with root package name */
    private final Yia f7067h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private Via p;
    private Object q;
    private Pla r;
    private C1533dma s;
    private Ria t;
    private Kia u;
    private int v;
    private int w;
    private long x;

    @SuppressLint({"HandlerLeak"})
    public Gia(Uia[] uiaArr, C1745gma gma, Pia pia) {
        String str = Tma.f8825e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        Cma.b(uiaArr.length > 0);
        Cma.a(uiaArr);
        this.f7060a = uiaArr;
        Cma.a(gma);
        this.f7061b = gma;
        this.j = false;
        this.k = 0;
        this.l = 1;
        this.f7065f = new CopyOnWriteArraySet<>();
        this.f7062c = new C1533dma(new C1391bma[uiaArr.length]);
        this.p = Via.f9067a;
        this.f7066g = new C1314aja();
        this.f7067h = new Yia();
        this.r = Pla.f8251a;
        this.s = this.f7062c;
        this.t = Ria.f8504a;
        this.f7063d = new Fia(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.u = new Kia(0, 0);
        this.f7064e = new Iia(uiaArr, gma, pia, this.j, 0, this.f7063d, this.u, this);
    }

    private final int b() {
        if (this.p.a() || this.m > 0) {
            return this.v;
        }
        this.p.a(this.u.f7588a, this.f7067h, false);
        return 0;
    }

    public final void a() {
        this.f7064e.b();
        this.f7063d.removeCallbacksAndMessages((Object) null);
    }

    public final void a(long j2) {
        int b2 = b();
        if (b2 < 0 || (!this.p.a() && b2 >= this.p.b())) {
            throw new Qia(this.p, b2, j2);
        }
        this.m++;
        this.v = b2;
        if (!this.p.a()) {
            this.p.a(b2, this.f7066g, false);
            long b3 = (j2 == -9223372036854775807L ? 0 : C2942xia.b(j2)) + 0;
            long j3 = this.p.a(0, this.f7067h, false).f9448d;
            if (j3 != -9223372036854775807L) {
                int i2 = (b3 > j3 ? 1 : (b3 == j3 ? 0 : -1));
            }
        }
        this.w = 0;
        if (j2 == -9223372036854775807L) {
            this.x = 0;
            this.f7064e.a(this.p, b2, -9223372036854775807L);
            return;
        }
        this.x = j2;
        this.f7064e.a(this.p, b2, C2942xia.b(j2));
        Iterator<Cia> it = this.f7065f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.n--;
                return;
            case 1:
                this.l = message.arg1;
                Iterator<Cia> it = this.f7065f.iterator();
                while (it.hasNext()) {
                    it.next().a(this.j, this.l);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.o = z;
                Iterator<Cia> it2 = this.f7065f.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.o);
                }
                return;
            case 3:
                if (this.n == 0) {
                    C1886ima ima = (C1886ima) message.obj;
                    this.i = true;
                    this.r = ima.f10839a;
                    this.s = ima.f10840b;
                    this.f7061b.a(ima.f10841c);
                    Iterator<Cia> it3 = this.f7065f.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this.r, this.s);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.m - 1;
                this.m = i2;
                if (i2 == 0) {
                    this.u = (Kia) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<Cia> it4 = this.f7065f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.m == 0) {
                    this.u = (Kia) message.obj;
                    Iterator<Cia> it5 = this.f7065f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                Mia mia = (Mia) message.obj;
                this.m -= mia.f7882d;
                if (this.n == 0) {
                    this.p = mia.f7879a;
                    this.q = mia.f7880b;
                    this.u = mia.f7881c;
                    Iterator<Cia> it6 = this.f7065f.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this.p, this.q);
                    }
                    return;
                }
                return;
            case 7:
                Ria ria = (Ria) message.obj;
                if (!this.t.equals(ria)) {
                    this.t = ria;
                    Iterator<Cia> it7 = this.f7065f.iterator();
                    while (it7.hasNext()) {
                        it7.next().a(ria);
                    }
                    return;
                }
                return;
            case 8:
                Aia aia = (Aia) message.obj;
                Iterator<Cia> it8 = this.f7065f.iterator();
                while (it8.hasNext()) {
                    it8.next().a(aia);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a(Cia cia) {
        this.f7065f.remove(cia);
    }

    public final void a(C3090zla zla) {
        if (!this.p.a() || this.q != null) {
            this.p = Via.f9067a;
            this.q = null;
            Iterator<Cia> it = this.f7065f.iterator();
            while (it.hasNext()) {
                it.next().a(this.p, this.q);
            }
        }
        if (this.i) {
            this.i = false;
            this.r = Pla.f8251a;
            this.s = this.f7062c;
            this.f7061b.a((Object) null);
            Iterator<Cia> it2 = this.f7065f.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.r, this.s);
            }
        }
        this.n++;
        this.f7064e.a(zla, true);
    }

    public final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.f7064e.a(z);
            Iterator<Cia> it = this.f7065f.iterator();
            while (it.hasNext()) {
                it.next().a(z, this.l);
            }
        }
    }

    public final void a(Eia... eiaArr) {
        this.f7064e.a(eiaArr);
    }

    public final void b(Cia cia) {
        this.f7065f.add(cia);
    }

    public final void b(Eia... eiaArr) {
        this.f7064e.b(eiaArr);
    }

    public final int ca() {
        return this.l;
    }

    public final boolean da() {
        return this.j;
    }

    public final int ea() {
        return this.f7060a.length;
    }

    public final long fa() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.a(this.u.f7588a, this.f7067h, false);
        return this.f7067h.a() + C2942xia.a(this.u.f7591d);
    }

    public final long ga() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.a(this.u.f7588a, this.f7067h, false);
        return this.f7067h.a() + C2942xia.a(this.u.f7590c);
    }

    public final long getDuration() {
        if (this.p.a()) {
            return -9223372036854775807L;
        }
        return C2942xia.a(this.p.a(b(), this.f7066g, false).i);
    }

    public final void stop() {
        this.f7064e.c();
    }
}
