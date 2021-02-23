package com.google.android.gms.internal.ads;

import android.util.Log;

final class Hia {

    /* renamed from: a  reason: collision with root package name */
    public final C2877wla f7177a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7178b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7179c;

    /* renamed from: d  reason: collision with root package name */
    public final Mla[] f7180d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean[] f7181e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7182f;

    /* renamed from: g  reason: collision with root package name */
    public int f7183g;

    /* renamed from: h  reason: collision with root package name */
    public long f7184h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Hia l;
    public C1886ima m;
    private final Uia[] n;
    private final Tia[] o;
    private final C1745gma p;
    private final Pia q;
    private final C3090zla r;
    private C1886ima s;

    public Hia(Uia[] uiaArr, Tia[] tiaArr, long j2, C1745gma gma, Pia pia, C3090zla zla, Object obj, int i2, int i3, boolean z, long j3) {
        this.n = uiaArr;
        this.o = tiaArr;
        this.f7182f = j2;
        this.p = gma;
        this.q = pia;
        this.r = zla;
        Cma.a(obj);
        this.f7178b = obj;
        this.f7179c = i2;
        this.f7183g = i3;
        this.i = z;
        this.f7184h = j3;
        this.f7180d = new Mla[uiaArr.length];
        this.f7181e = new boolean[uiaArr.length];
        this.f7177a = zla.a(i3, pia.b());
    }

    public final long a(long j2, boolean z) {
        return a(j2, false, new boolean[this.n.length]);
    }

    public final long a(long j2, boolean z, boolean[] zArr) {
        C1533dma dma = this.m.f10840b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= dma.f10183a) {
                break;
            }
            boolean[] zArr2 = this.f7181e;
            if (z || !this.m.a(this.s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long a2 = this.f7177a.a(dma.a(), this.f7181e, this.f7180d, zArr, j2);
        this.s = this.m;
        this.k = false;
        int i3 = 0;
        while (true) {
            Mla[] mlaArr = this.f7180d;
            if (i3 < mlaArr.length) {
                if (mlaArr[i3] != null) {
                    Cma.b(dma.a(i3) != null);
                    this.k = true;
                } else {
                    Cma.b(dma.a(i3) == null);
                }
                i3++;
            } else {
                this.q.a(this.n, this.m.f10839a, dma);
                return a2;
            }
        }
    }

    public final void a() {
        try {
            this.r.a(this.f7177a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final void a(int i2, boolean z) {
        this.f7183g = i2;
        this.i = z;
    }

    public final long b() {
        return this.f7182f - this.f7184h;
    }

    public final boolean c() {
        if (this.j) {
            return !this.k || this.f7177a.a() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.gma r0 = r6.p
            com.google.android.gms.internal.ads.Tia[] r1 = r6.o
            com.google.android.gms.internal.ads.wla r2 = r6.f7177a
            com.google.android.gms.internal.ads.Pla r2 = r2.e()
            com.google.android.gms.internal.ads.ima r0 = r0.a(r1, r2)
            com.google.android.gms.internal.ads.ima r1 = r6.s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.dma r5 = r0.f10840b
            int r5 = r5.f10183a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Hia.d():boolean");
    }
}
