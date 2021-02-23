package b.e;

public class j<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2243a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2244b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f2245c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f2246d;

    /* renamed from: e  reason: collision with root package name */
    private int f2247e;

    public j() {
        this(10);
    }

    public j(int i) {
        this.f2244b = false;
        if (i == 0) {
            this.f2245c = e.f2205a;
            this.f2246d = e.f2207c;
            return;
        }
        int b2 = e.b(i);
        this.f2245c = new int[b2];
        this.f2246d = new Object[b2];
    }

    private void e() {
        int i = this.f2247e;
        int[] iArr = this.f2245c;
        Object[] objArr = this.f2246d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2243a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2244b = false;
        this.f2247e = i2;
    }

    public int a(E e2) {
        if (this.f2244b) {
            e();
        }
        for (int i = 0; i < this.f2247e; i++) {
            if (this.f2246d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public E a(int i) {
        return b(i, (Object) null);
    }

    public void a() {
        int i = this.f2247e;
        Object[] objArr = this.f2246d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2247e = 0;
        this.f2244b = false;
    }

    public void a(int i, E e2) {
        int i2 = this.f2247e;
        if (i2 == 0 || i > this.f2245c[i2 - 1]) {
            if (this.f2244b && this.f2247e >= this.f2245c.length) {
                e();
            }
            int i3 = this.f2247e;
            if (i3 >= this.f2245c.length) {
                int b2 = e.b(i3 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.f2245c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2246d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2245c = iArr;
                this.f2246d = objArr;
            }
            this.f2245c[i3] = i;
            this.f2246d[i3] = e2;
            this.f2247e = i3 + 1;
            return;
        }
        c(i, e2);
    }

    public int b() {
        if (this.f2244b) {
            e();
        }
        return this.f2247e;
    }

    public int b(int i) {
        if (this.f2244b) {
            e();
        }
        return e.a(this.f2245c, this.f2247e, i);
    }

    public E b(int i, E e2) {
        int a2 = e.a(this.f2245c, this.f2247e, i);
        if (a2 >= 0) {
            E[] eArr = this.f2246d;
            if (eArr[a2] != f2243a) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public int c(int i) {
        if (this.f2244b) {
            e();
        }
        return this.f2245c[i];
    }

    public void c(int i, E e2) {
        int a2 = e.a(this.f2245c, this.f2247e, i);
        if (a2 >= 0) {
            this.f2246d[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 < this.f2247e) {
            Object[] objArr = this.f2246d;
            if (objArr[i2] == f2243a) {
                this.f2245c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2244b && this.f2247e >= this.f2245c.length) {
            e();
            i2 = e.a(this.f2245c, this.f2247e, i) ^ -1;
        }
        int i3 = this.f2247e;
        if (i3 >= this.f2245c.length) {
            int b2 = e.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f2245c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2246d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2245c = iArr;
            this.f2246d = objArr2;
        }
        int i4 = this.f2247e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f2245c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f2246d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f2247e - i2);
        }
        this.f2245c[i2] = i;
        this.f2246d[i2] = e2;
        this.f2247e++;
    }

    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f2245c = (int[]) this.f2245c.clone();
            jVar.f2246d = (Object[]) this.f2246d.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f2246d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f2245c
            int r1 = r3.f2247e
            int r4 = b.e.e.a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f2246d
            r1 = r0[r4]
            java.lang.Object r2 = f2243a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f2244b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.j.d(int):void");
    }

    public E e(int i) {
        if (this.f2244b) {
            e();
        }
        return this.f2246d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2247e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2247e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            Object e2 = e(i);
            if (e2 != this) {
                sb.append(e2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
