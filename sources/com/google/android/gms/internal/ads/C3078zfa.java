package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.zfa  reason: case insensitive filesystem */
final class C3078zfa extends Lda {

    /* renamed from: e  reason: collision with root package name */
    static final int[] f13088e = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: f  reason: collision with root package name */
    private final int f13089f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Lda f13090g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Lda f13091h;
    private final int i;
    private final int j;

    private C3078zfa(Lda lda, Lda lda2) {
        this.f13090g = lda;
        this.f13091h = lda2;
        this.i = lda.size();
        this.f13089f = this.i + lda2.size();
        this.j = Math.max(lda.i(), lda2.i()) + 1;
    }

    /* synthetic */ C3078zfa(Lda lda, Lda lda2, C3007yfa yfa) {
        this(lda, lda2);
    }

    static Lda a(Lda lda, Lda lda2) {
        if (lda2.size() == 0) {
            return lda;
        }
        if (lda.size() == 0) {
            return lda2;
        }
        int size = lda.size() + lda2.size();
        if (size < 128) {
            return b(lda, lda2);
        }
        if (lda instanceof C3078zfa) {
            C3078zfa zfa = (C3078zfa) lda;
            if (zfa.f13091h.size() + lda2.size() < 128) {
                return new C3078zfa(zfa.f13090g, b(zfa.f13091h, lda2));
            } else if (zfa.f13090g.i() > zfa.f13091h.i() && zfa.i() > lda2.i()) {
                return new C3078zfa(zfa.f13090g, new C3078zfa(zfa.f13091h, lda2));
            }
        }
        return size >= m(Math.max(lda.i(), lda2.i()) + 1) ? new C3078zfa(lda, lda2) : new Bfa((C3007yfa) null).a(lda, lda2);
    }

    private static Lda b(Lda lda, Lda lda2) {
        int size = lda.size();
        int size2 = lda2.size();
        byte[] bArr = new byte[(size + size2)];
        lda.a(bArr, 0, 0, size);
        lda2.a(bArr, 0, size, size2);
        return Lda.b(bArr);
    }

    static int m(int i2) {
        int[] iArr = f13088e;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    /* access modifiers changed from: protected */
    public final int a(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            return this.f13090g.a(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f13091h.a(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f13091h.a(this.f13090g.a(i2, i3, i7), 0, i4 - i7);
    }

    public final Lda a(int i2, int i3) {
        int c2 = Lda.c(i2, i3, this.f13089f);
        if (c2 == 0) {
            return Lda.f7691a;
        }
        if (c2 == this.f13089f) {
            return this;
        }
        int i4 = this.i;
        if (i3 <= i4) {
            return this.f13090g.a(i2, i3);
        }
        if (i2 >= i4) {
            return this.f13091h.a(i2 - i4, i3 - i4);
        }
        Lda lda = this.f13090g;
        return new C3078zfa(lda.a(i2, lda.size()), this.f13091h.a(0, i3 - this.i));
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(c(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void a(Mda mda) {
        this.f13090g.a(mda);
        this.f13091h.a(mda);
    }

    /* access modifiers changed from: protected */
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            return this.f13090g.b(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f13091h.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f13091h.b(this.f13090g.b(i2, i3, i7), 0, i4 - i7);
    }

    /* access modifiers changed from: protected */
    public final void b(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            this.f13090g.b(bArr, i2, i3, i4);
        } else if (i2 >= i6) {
            this.f13091h.b(bArr, i2 - i6, i3, i4);
        } else {
            int i7 = i6 - i2;
            this.f13090g.b(bArr, i2, i3, i7);
            this.f13091h.b(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    /* renamed from: d */
    public final Vda iterator() {
        return new C3007yfa(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lda)) {
            return false;
        }
        Lda lda = (Lda) obj;
        if (this.f13089f != lda.size()) {
            return false;
        }
        if (this.f13089f == 0) {
            return true;
        }
        int k = k();
        int k2 = lda.k();
        if (k != 0 && k2 != 0 && k != k2) {
            return false;
        }
        Afa afa = new Afa(this, (C3007yfa) null);
        Xda xda = (Xda) afa.next();
        Afa afa2 = new Afa(lda, (C3007yfa) null);
        Xda xda2 = (Xda) afa2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = xda.size() - i2;
            int size2 = xda2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? xda.a(xda2, i3, min) : xda2.a(xda, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f13089f;
            if (i4 < i5) {
                if (min == size) {
                    xda = (Xda) afa.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    xda2 = (Xda) afa2.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final boolean f() {
        int a2 = this.f13090g.a(0, 0, this.i);
        Lda lda = this.f13091h;
        return lda.a(a2, 0, lda.size()) == 0;
    }

    public final C1304aea g() {
        return new C1375bea(new Dfa(this));
    }

    /* access modifiers changed from: protected */
    public final int i() {
        return this.j;
    }

    public final byte j(int i2) {
        Lda.b(i2, this.f13089f);
        return k(i2);
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return this.f13089f >= m(this.j);
    }

    /* access modifiers changed from: package-private */
    public final byte k(int i2) {
        int i3 = this.i;
        return i2 < i3 ? this.f13090g.k(i2) : this.f13091h.k(i2 - i3);
    }

    public final int size() {
        return this.f13089f;
    }
}
