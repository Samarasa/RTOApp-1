package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Yfa {

    /* renamed from: a  reason: collision with root package name */
    private static final Yfa f9427a = new Yfa(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f9428b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f9429c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f9430d;

    /* renamed from: e  reason: collision with root package name */
    private int f9431e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9432f;

    private Yfa() {
        this(0, new int[8], new Object[8], true);
    }

    private Yfa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9431e = -1;
        this.f9428b = i;
        this.f9429c = iArr;
        this.f9430d = objArr;
        this.f9432f = z;
    }

    static Yfa a(Yfa yfa, Yfa yfa2) {
        int i = yfa.f9428b + yfa2.f9428b;
        int[] copyOf = Arrays.copyOf(yfa.f9429c, i);
        System.arraycopy(yfa2.f9429c, 0, copyOf, yfa.f9428b, yfa2.f9428b);
        Object[] copyOf2 = Arrays.copyOf(yfa.f9430d, i);
        System.arraycopy(yfa2.f9430d, 0, copyOf2, yfa.f9428b, yfa2.f9428b);
        return new Yfa(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, C2583sga sga) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            sga.c(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            sga.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            sga.a(i2, (Lda) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                sga.c(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Iea.f());
        } else if (sga.a() == C2512rga.f12004a) {
            sga.a(i2);
            ((Yfa) obj).b(sga);
            sga.b(i2);
        } else {
            sga.b(i2);
            ((Yfa) obj).b(sga);
            sga.a(i2);
        }
    }

    public static Yfa c() {
        return f9427a;
    }

    static Yfa d() {
        return new Yfa();
    }

    public final void a() {
        this.f9432f = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (this.f9432f) {
            int i2 = this.f9428b;
            if (i2 == this.f9429c.length) {
                int i3 = this.f9428b + (i2 < 4 ? 8 : i2 >> 1);
                this.f9429c = Arrays.copyOf(this.f9429c, i3);
                this.f9430d = Arrays.copyOf(this.f9430d, i3);
            }
            int[] iArr = this.f9429c;
            int i4 = this.f9428b;
            iArr[i4] = i;
            this.f9430d[i4] = obj;
            this.f9428b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void a(C2583sga sga) {
        if (sga.a() == C2512rga.f12005b) {
            for (int i = this.f9428b - 1; i >= 0; i--) {
                sga.a(this.f9429c[i] >>> 3, this.f9430d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9428b; i2++) {
            sga.a(this.f9429c[i2] >>> 3, this.f9430d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9428b; i2++) {
            C1943jfa.a(sb, i, String.valueOf(this.f9429c[i2] >>> 3), this.f9430d[i2]);
        }
    }

    public final int b() {
        int i;
        int i2 = this.f9431e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9428b; i4++) {
            int i5 = this.f9429c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C1658fea.e(i6, ((Long) this.f9430d[i4]).longValue());
            } else if (i7 == 1) {
                i = C1658fea.g(i6, ((Long) this.f9430d[i4]).longValue());
            } else if (i7 == 2) {
                i = C1658fea.c(i6, (Lda) this.f9430d[i4]);
            } else if (i7 == 3) {
                i = (C1658fea.e(i6) << 1) + ((Yfa) this.f9430d[i4]).b();
            } else if (i7 == 5) {
                i = C1658fea.i(i6, ((Integer) this.f9430d[i4]).intValue());
            } else {
                throw new IllegalStateException(Iea.f());
            }
            i3 += i;
        }
        this.f9431e = i3;
        return i3;
    }

    public final void b(C2583sga sga) {
        if (this.f9428b != 0) {
            if (sga.a() == C2512rga.f12004a) {
                for (int i = 0; i < this.f9428b; i++) {
                    a(this.f9429c[i], this.f9430d[i], sga);
                }
                return;
            }
            for (int i2 = this.f9428b - 1; i2 >= 0; i2--) {
                a(this.f9429c[i2], this.f9430d[i2], sga);
            }
        }
    }

    public final int e() {
        int i = this.f9431e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9428b; i3++) {
            i2 += C1658fea.d(this.f9429c[i3] >>> 3, (Lda) this.f9430d[i3]);
        }
        this.f9431e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Yfa)) {
            return false;
        }
        Yfa yfa = (Yfa) obj;
        int i = this.f9428b;
        if (i == yfa.f9428b) {
            int[] iArr = this.f9429c;
            int[] iArr2 = yfa.f9429c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f9430d;
                Object[] objArr2 = yfa.f9430d;
                int i3 = this.f9428b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f9428b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9429c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9430d;
        int i7 = this.f9428b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
