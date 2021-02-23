package h;

import java.util.Arrays;

final class u extends h {

    /* renamed from: f  reason: collision with root package name */
    final transient byte[][] f15365f;

    /* renamed from: g  reason: collision with root package name */
    final transient int[] f15366g;

    u(e eVar, int i) {
        super((byte[]) null);
        z.a(eVar.f15328c, 0, (long) i);
        int i2 = 0;
        s sVar = eVar.f15327b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = sVar.f15358c;
            int i6 = sVar.f15357b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                sVar = sVar.f15361f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f15365f = new byte[i4][];
        this.f15366g = new int[(i4 * 2)];
        s sVar2 = eVar.f15327b;
        int i7 = 0;
        while (i2 < i) {
            this.f15365f[i7] = sVar2.f15356a;
            i2 += sVar2.f15358c - sVar2.f15357b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f15366g;
            iArr[i7] = i2;
            iArr[this.f15365f.length + i7] = sVar2.f15357b;
            sVar2.f15359d = true;
            i7++;
            sVar2 = sVar2.f15361f;
        }
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.f15366g, 0, this.f15365f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private h r() {
        return new h(p());
    }

    public byte a(int i) {
        z.a((long) this.f15366g[this.f15365f.length - 1], (long) i, 1);
        int b2 = b(i);
        int i2 = b2 == 0 ? 0 : this.f15366g[b2 - 1];
        int[] iArr = this.f15366g;
        byte[][] bArr = this.f15365f;
        return bArr[b2][(i - i2) + iArr[bArr.length + b2]];
    }

    public h a(int i, int i2) {
        return r().a(i, i2);
    }

    public String a() {
        return r().a();
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar) {
        int length = this.f15365f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f15366g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            s sVar = new s(this.f15365f[i], i3, (i3 + i4) - i2);
            s sVar2 = eVar.f15327b;
            if (sVar2 == null) {
                sVar.f15362g = sVar;
                sVar.f15361f = sVar;
                eVar.f15327b = sVar;
            } else {
                sVar2.f15362g.a(sVar);
            }
            i++;
            i2 = i4;
        }
        eVar.f15328c += (long) i2;
    }

    public boolean a(int i, h hVar, int i2, int i3) {
        if (i < 0 || i > n() - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.f15366g[b2 - 1];
            int min = Math.min(i3, ((this.f15366g[b2] - i4) + i4) - i);
            int[] iArr = this.f15366g;
            byte[][] bArr = this.f15365f;
            if (!hVar.a(i2, bArr[b2], (i - i4) + iArr[bArr.length + b2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > n() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.f15366g[b2 - 1];
            int min = Math.min(i3, ((this.f15366g[b2] - i4) + i4) - i);
            int[] iArr = this.f15366g;
            byte[][] bArr2 = this.f15365f;
            if (!z.a(bArr2[b2], (i - i4) + iArr[bArr2.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    public String c() {
        return r().c();
    }

    public h d() {
        return r().d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return hVar.n() == n() && a(0, hVar, 0, n());
        }
    }

    public int hashCode() {
        int i = this.f15332d;
        if (i != 0) {
            return i;
        }
        int length = this.f15365f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f15365f[i2];
            int[] iArr = this.f15366g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f15332d = i3;
        return i3;
    }

    public h m() {
        return r().m();
    }

    public int n() {
        return this.f15366g[this.f15365f.length - 1];
    }

    public h o() {
        return r().o();
    }

    public byte[] p() {
        int[] iArr = this.f15366g;
        byte[][] bArr = this.f15365f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f15366g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f15365f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public String q() {
        return r().q();
    }

    public String toString() {
        return r().toString();
    }
}
