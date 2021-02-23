package b.e;

public class f<E> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2208a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2209b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f2210c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f2211d;

    /* renamed from: e  reason: collision with root package name */
    private int f2212e;

    public f() {
        this(10);
    }

    public f(int i) {
        this.f2209b = false;
        if (i == 0) {
            this.f2210c = e.f2206b;
            this.f2211d = e.f2207c;
            return;
        }
        int c2 = e.c(i);
        this.f2210c = new long[c2];
        this.f2211d = new Object[c2];
    }

    private void e() {
        int i = this.f2212e;
        long[] jArr = this.f2210c;
        Object[] objArr = this.f2211d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2208a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2209b = false;
        this.f2212e = i2;
    }

    public long a(int i) {
        if (this.f2209b) {
            e();
        }
        return this.f2210c[i];
    }

    public void a() {
        int i = this.f2212e;
        Object[] objArr = this.f2211d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2212e = 0;
        this.f2209b = false;
    }

    @Deprecated
    public void a(long j) {
        d(j);
    }

    public void a(long j, E e2) {
        int i = this.f2212e;
        if (i == 0 || j > this.f2210c[i - 1]) {
            if (this.f2209b && this.f2212e >= this.f2210c.length) {
                e();
            }
            int i2 = this.f2212e;
            if (i2 >= this.f2210c.length) {
                int c2 = e.c(i2 + 1);
                long[] jArr = new long[c2];
                Object[] objArr = new Object[c2];
                long[] jArr2 = this.f2210c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2211d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2210c = jArr;
                this.f2211d = objArr;
            }
            this.f2210c[i2] = j;
            this.f2211d[i2] = e2;
            this.f2212e = i2 + 1;
            return;
        }
        c(j, e2);
    }

    public int b() {
        if (this.f2209b) {
            e();
        }
        return this.f2212e;
    }

    public E b(long j) {
        return b(j, (Object) null);
    }

    public E b(long j, E e2) {
        int a2 = e.a(this.f2210c, this.f2212e, j);
        if (a2 >= 0) {
            E[] eArr = this.f2211d;
            if (eArr[a2] != f2208a) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public void b(int i) {
        Object[] objArr = this.f2211d;
        Object obj = objArr[i];
        Object obj2 = f2208a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2209b = true;
        }
    }

    public int c(long j) {
        if (this.f2209b) {
            e();
        }
        return e.a(this.f2210c, this.f2212e, j);
    }

    public E c(int i) {
        if (this.f2209b) {
            e();
        }
        return this.f2211d[i];
    }

    public void c(long j, E e2) {
        int a2 = e.a(this.f2210c, this.f2212e, j);
        if (a2 >= 0) {
            this.f2211d[a2] = e2;
            return;
        }
        int i = a2 ^ -1;
        if (i < this.f2212e) {
            Object[] objArr = this.f2211d;
            if (objArr[i] == f2208a) {
                this.f2210c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f2209b && this.f2212e >= this.f2210c.length) {
            e();
            i = e.a(this.f2210c, this.f2212e, j) ^ -1;
        }
        int i2 = this.f2212e;
        if (i2 >= this.f2210c.length) {
            int c2 = e.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f2210c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2211d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2210c = jArr;
            this.f2211d = objArr2;
        }
        int i3 = this.f2212e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f2210c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f2211d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f2212e - i);
        }
        this.f2210c[i] = j;
        this.f2211d[i] = e2;
        this.f2212e++;
    }

    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f2210c = (long[]) this.f2210c.clone();
            fVar.f2211d = (Object[]) this.f2211d.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f2211d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f2210c
            int r1 = r2.f2212e
            int r3 = b.e.e.a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f2211d
            r0 = r4[r3]
            java.lang.Object r1 = f2208a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f2209b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.f.d(long):void");
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2212e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2212e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
