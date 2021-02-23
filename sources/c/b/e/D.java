package c.b.e;

import java.util.Arrays;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private static final D f4968a = new D(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f4969b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4970c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f4971d;

    /* renamed from: e  reason: collision with root package name */
    private int f4972e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4973f;

    private D() {
        this(0, new int[8], new Object[8], true);
    }

    private D(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f4972e = -1;
        this.f4969b = i;
        this.f4970c = iArr;
        this.f4971d = objArr;
        this.f4973f = z;
    }

    static D a(D d2, D d3) {
        int i = d2.f4969b + d3.f4969b;
        int[] copyOf = Arrays.copyOf(d2.f4970c, i);
        System.arraycopy(d3.f4970c, 0, copyOf, d2.f4969b, d3.f4969b);
        Object[] copyOf2 = Arrays.copyOf(d2.f4971d, i);
        System.arraycopy(d3.f4971d, 0, copyOf2, d2.f4969b, d3.f4969b);
        return new D(i, copyOf, copyOf2, true);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private c.b.e.D a(c.b.e.C0481f r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.q()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.a((int) r0, (c.b.e.C0481f) r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.D.a(c.b.e.f):c.b.e.D");
    }

    private void a(int i, Object obj) {
        e();
        int[] iArr = this.f4970c;
        int i2 = this.f4969b;
        iArr[i2] = i;
        this.f4971d[i2] = obj;
        this.f4969b = i2 + 1;
    }

    public static D b() {
        return f4968a;
    }

    static D d() {
        return new D();
    }

    private void e() {
        int i = this.f4969b;
        if (i == this.f4970c.length) {
            int i2 = this.f4969b + (i < 4 ? 8 : i >> 1);
            this.f4970c = Arrays.copyOf(this.f4970c, i2);
            this.f4971d = Arrays.copyOf(this.f4971d, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f4973f) {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f4969b; i2++) {
            t.a(sb, i, String.valueOf(M.a(this.f4970c[i2])), this.f4971d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i, C0481f fVar) {
        a();
        int a2 = M.a(i);
        int b2 = M.b(i);
        if (b2 == 0) {
            a(i, (Object) Long.valueOf(fVar.h()));
            return true;
        } else if (b2 == 1) {
            a(i, (Object) Long.valueOf(fVar.f()));
            return true;
        } else if (b2 == 2) {
            a(i, (Object) fVar.c());
            return true;
        } else if (b2 == 3) {
            D d2 = new D();
            d2.a(fVar);
            fVar.a(M.a(a2, 4));
            a(i, (Object) d2);
            return true;
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(i, (Object) Integer.valueOf(fVar.e()));
                return true;
            }
            throw n.d();
        }
    }

    public void c() {
        this.f4973f = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        return this.f4969b == d2.f4969b && Arrays.equals(this.f4970c, d2.f4970c) && Arrays.deepEquals(this.f4971d, d2.f4971d);
    }

    public int hashCode() {
        return ((((527 + this.f4969b) * 31) + Arrays.hashCode(this.f4970c)) * 31) + Arrays.deepHashCode(this.f4971d);
    }
}
