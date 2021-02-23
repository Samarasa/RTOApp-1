package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

final class Bla implements C2877wla, Ala {

    /* renamed from: a  reason: collision with root package name */
    public final C2877wla[] f6357a;

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<Mla, Integer> f6358b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Ala f6359c;

    /* renamed from: d  reason: collision with root package name */
    private int f6360d;

    /* renamed from: e  reason: collision with root package name */
    private Pla f6361e;

    /* renamed from: f  reason: collision with root package name */
    private C2877wla[] f6362f;

    /* renamed from: g  reason: collision with root package name */
    private Lla f6363g;

    public Bla(C2877wla... wlaArr) {
        this.f6357a = wlaArr;
    }

    public final long a() {
        long j = Long.MAX_VALUE;
        for (C2877wla a2 : this.f6362f) {
            long a3 = a2.a();
            if (a3 != Long.MIN_VALUE) {
                j = Math.min(j, a3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long a(C1391bma[] bmaArr, boolean[] zArr, Mla[] mlaArr, boolean[] zArr2, long j) {
        C1391bma[] bmaArr2 = bmaArr;
        Mla[] mlaArr2 = mlaArr;
        int[] iArr = new int[bmaArr2.length];
        int[] iArr2 = new int[bmaArr2.length];
        for (int i = 0; i < bmaArr2.length; i++) {
            iArr[i] = mlaArr2[i] == null ? -1 : this.f6358b.get(mlaArr2[i]).intValue();
            iArr2[i] = -1;
            if (bmaArr2[i] != null) {
                Qla a2 = bmaArr2[i].a();
                int i2 = 0;
                while (true) {
                    C2877wla[] wlaArr = this.f6357a;
                    if (i2 >= wlaArr.length) {
                        break;
                    } else if (wlaArr[i2].e().a(a2) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f6358b.clear();
        Mla[] mlaArr3 = new Mla[bmaArr2.length];
        Mla[] mlaArr4 = new Mla[bmaArr2.length];
        C1391bma[] bmaArr3 = new C1391bma[bmaArr2.length];
        ArrayList arrayList = new ArrayList(this.f6357a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f6357a.length) {
            for (int i4 = 0; i4 < bmaArr2.length; i4++) {
                C1391bma bma = null;
                mlaArr4[i4] = iArr[i4] == i3 ? mlaArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    bma = bmaArr2[i4];
                }
                bmaArr3[i4] = bma;
            }
            ArrayList arrayList2 = arrayList;
            C1391bma[] bmaArr4 = bmaArr3;
            int i5 = i3;
            long a3 = this.f6357a[i3].a(bmaArr3, zArr, mlaArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = a3;
            } else if (a3 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < bmaArr2.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    Cma.b(mlaArr4[i6] != null);
                    mlaArr3[i6] = mlaArr4[i6];
                    this.f6358b.put(mlaArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (mlaArr4[i6] != null) {
                        z2 = false;
                    }
                    Cma.b(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f6357a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            bmaArr3 = bmaArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(mlaArr3, 0, mlaArr2, 0, mlaArr3.length);
        this.f6362f = new C2877wla[arrayList3.size()];
        arrayList3.toArray(this.f6362f);
        this.f6363g = new C2239nla(this.f6362f);
        return j2;
    }

    public final void a(Ala ala, long j) {
        this.f6359c = ala;
        C2877wla[] wlaArr = this.f6357a;
        this.f6360d = wlaArr.length;
        for (C2877wla a2 : wlaArr) {
            a2.a(this, j);
        }
    }

    public final /* synthetic */ void a(Lla lla) {
        if (this.f6361e != null) {
            this.f6359c.a(this);
        }
    }

    public final void a(C2877wla wla) {
        int i = this.f6360d - 1;
        this.f6360d = i;
        if (i <= 0) {
            int i2 = 0;
            for (C2877wla e2 : this.f6357a) {
                i2 += e2.e().f8252b;
            }
            Qla[] qlaArr = new Qla[i2];
            C2877wla[] wlaArr = this.f6357a;
            int length = wlaArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                Pla e3 = wlaArr[i3].e();
                int i5 = e3.f8252b;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    qlaArr[i6] = e3.a(i7);
                    i7++;
                    i6++;
                }
                i3++;
                i4 = i6;
            }
            this.f6361e = new Pla(qlaArr);
            this.f6359c.a(this);
        }
    }

    public final boolean a(long j) {
        return this.f6363g.a(j);
    }

    public final long b() {
        return this.f6363g.b();
    }

    public final long b(long j) {
        long b2 = this.f6362f[0].b(j);
        int i = 1;
        while (true) {
            C2877wla[] wlaArr = this.f6362f;
            if (i >= wlaArr.length) {
                return b2;
            }
            if (wlaArr[i].b(b2) == b2) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final long c() {
        long c2 = this.f6357a[0].c();
        int i = 1;
        while (true) {
            C2877wla[] wlaArr = this.f6357a;
            if (i >= wlaArr.length) {
                if (c2 != -9223372036854775807L) {
                    C2877wla[] wlaArr2 = this.f6362f;
                    int length = wlaArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C2877wla wla = wlaArr2[i2];
                        if (wla == this.f6357a[0] || wla.b(c2) == c2) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return c2;
            } else if (wlaArr[i].c() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final void c(long j) {
        for (C2877wla c2 : this.f6362f) {
            c2.c(j);
        }
    }

    public final void d() {
        for (C2877wla d2 : this.f6357a) {
            d2.d();
        }
    }

    public final Pla e() {
        return this.f6361e;
    }
}
