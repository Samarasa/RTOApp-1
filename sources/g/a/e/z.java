package g.a.e;

import java.util.Arrays;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private int f15185a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f15186b = new int[10];

    /* access modifiers changed from: package-private */
    public int a(int i) {
        return this.f15186b[i];
    }

    /* access modifiers changed from: package-private */
    public z a(int i, int i2) {
        int[] iArr = this.f15186b;
        if (i >= iArr.length) {
            return this;
        }
        this.f15185a = (1 << i) | this.f15185a;
        iArr[i] = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f15185a = 0;
        Arrays.fill(this.f15186b, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(z zVar) {
        for (int i = 0; i < 10; i++) {
            if (zVar.d(i)) {
                a(i, zVar.a(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if ((this.f15185a & 2) != 0) {
            return this.f15186b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        return (this.f15185a & 16) != 0 ? this.f15186b[4] : i;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.f15185a & 128) != 0) {
            return this.f15186b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int c(int i) {
        return (this.f15185a & 32) != 0 ? this.f15186b[5] : i;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Integer.bitCount(this.f15185a);
    }

    /* access modifiers changed from: package-private */
    public boolean d(int i) {
        return ((1 << i) & this.f15185a) != 0;
    }
}
