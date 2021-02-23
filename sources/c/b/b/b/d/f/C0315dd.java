package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import java.util.Arrays;

/* renamed from: c.b.b.b.d.f.dd  reason: case insensitive filesystem */
public final class C0315dd {

    /* renamed from: a  reason: collision with root package name */
    private static final C0315dd f4406a = new C0315dd(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f4407b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4408c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f4409d;

    /* renamed from: e  reason: collision with root package name */
    private int f4410e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4411f;

    private C0315dd() {
        this(0, new int[8], new Object[8], true);
    }

    private C0315dd(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f4410e = -1;
        this.f4407b = i;
        this.f4408c = iArr;
        this.f4409d = objArr;
        this.f4411f = z;
    }

    public static C0315dd a() {
        return f4406a;
    }

    static C0315dd a(C0315dd ddVar, C0315dd ddVar2) {
        int i = ddVar.f4407b + ddVar2.f4407b;
        int[] copyOf = Arrays.copyOf(ddVar.f4408c, i);
        System.arraycopy(ddVar2.f4408c, 0, copyOf, ddVar.f4407b, ddVar2.f4407b);
        Object[] copyOf2 = Arrays.copyOf(ddVar.f4409d, i);
        System.arraycopy(ddVar2.f4409d, 0, copyOf2, ddVar.f4407b, ddVar2.f4407b);
        return new C0315dd(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, C0453xd xdVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            xdVar.a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            xdVar.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            xdVar.a(i2, (C0320eb) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                xdVar.e(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Wb.d());
        } else if (xdVar.a() == Lb.e.l) {
            xdVar.a(i2);
            ((C0315dd) obj).b(xdVar);
            xdVar.b(i2);
        } else {
            xdVar.b(i2);
            ((C0315dd) obj).b(xdVar);
            xdVar.a(i2);
        }
    }

    static C0315dd b() {
        return new C0315dd();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (this.f4411f) {
            int i2 = this.f4407b;
            if (i2 == this.f4408c.length) {
                int i3 = this.f4407b + (i2 < 4 ? 8 : i2 >> 1);
                this.f4408c = Arrays.copyOf(this.f4408c, i3);
                this.f4409d = Arrays.copyOf(this.f4409d, i3);
            }
            int[] iArr = this.f4408c;
            int i4 = this.f4407b;
            iArr[i4] = i;
            this.f4409d[i4] = obj;
            this.f4407b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void a(C0453xd xdVar) {
        if (xdVar.a() == Lb.e.m) {
            for (int i = this.f4407b - 1; i >= 0; i--) {
                xdVar.a(this.f4408c[i] >>> 3, this.f4409d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f4407b; i2++) {
            xdVar.a(this.f4408c[i2] >>> 3, this.f4409d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4407b; i2++) {
            C0452xc.a(sb, i, String.valueOf(this.f4408c[i2] >>> 3), this.f4409d[i2]);
        }
    }

    public final void b(C0453xd xdVar) {
        if (this.f4407b != 0) {
            if (xdVar.a() == Lb.e.l) {
                for (int i = 0; i < this.f4407b; i++) {
                    a(this.f4408c[i], this.f4409d[i], xdVar);
                }
                return;
            }
            for (int i2 = this.f4407b - 1; i2 >= 0; i2--) {
                a(this.f4408c[i2], this.f4409d[i2], xdVar);
            }
        }
    }

    public final void c() {
        this.f4411f = false;
    }

    public final int d() {
        int i = this.f4410e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4407b; i3++) {
            i2 += C0437vb.d(this.f4408c[i3] >>> 3, (C0320eb) this.f4409d[i3]);
        }
        this.f4410e = i2;
        return i2;
    }

    public final int e() {
        int i;
        int i2 = this.f4410e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4407b; i4++) {
            int i5 = this.f4408c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C0437vb.e(i6, ((Long) this.f4409d[i4]).longValue());
            } else if (i7 == 1) {
                i = C0437vb.g(i6, ((Long) this.f4409d[i4]).longValue());
            } else if (i7 == 2) {
                i = C0437vb.c(i6, (C0320eb) this.f4409d[i4]);
            } else if (i7 == 3) {
                i = (C0437vb.e(i6) << 1) + ((C0315dd) this.f4409d[i4]).e();
            } else if (i7 == 5) {
                i = C0437vb.i(i6, ((Integer) this.f4409d[i4]).intValue());
            } else {
                throw new IllegalStateException(Wb.d());
            }
            i3 += i;
        }
        this.f4410e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0315dd)) {
            return false;
        }
        C0315dd ddVar = (C0315dd) obj;
        int i = this.f4407b;
        if (i == ddVar.f4407b) {
            int[] iArr = this.f4408c;
            int[] iArr2 = ddVar.f4408c;
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
                Object[] objArr = this.f4409d;
                Object[] objArr2 = ddVar.f4409d;
                int i3 = this.f4407b;
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
        int i = this.f4407b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f4408c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f4409d;
        int i7 = this.f4407b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
