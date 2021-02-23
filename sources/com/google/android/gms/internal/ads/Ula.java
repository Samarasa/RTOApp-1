package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class Ula implements C1391bma {

    /* renamed from: a  reason: collision with root package name */
    private final Qla f8942a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8943b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f8944c;

    /* renamed from: d  reason: collision with root package name */
    private final Lia[] f8945d;

    /* renamed from: e  reason: collision with root package name */
    private final long[] f8946e;

    /* renamed from: f  reason: collision with root package name */
    private int f8947f;

    public Ula(Qla qla, int... iArr) {
        int i = 0;
        Cma.b(iArr.length > 0);
        Cma.a(qla);
        this.f8942a = qla;
        this.f8943b = iArr.length;
        this.f8945d = new Lia[this.f8943b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f8945d[i2] = qla.a(iArr[i2]);
        }
        Arrays.sort(this.f8945d, new Wla());
        this.f8944c = new int[this.f8943b];
        while (true) {
            int i3 = this.f8943b;
            if (i < i3) {
                this.f8944c[i] = qla.a(this.f8945d[i]);
                i++;
            } else {
                this.f8946e = new long[i3];
                return;
            }
        }
    }

    public final Lia a(int i) {
        return this.f8945d[i];
    }

    public final Qla a() {
        return this.f8942a;
    }

    public final int b(int i) {
        return this.f8944c[0];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Ula ula = (Ula) obj;
            return this.f8942a == ula.f8942a && Arrays.equals(this.f8944c, ula.f8944c);
        }
    }

    public int hashCode() {
        if (this.f8947f == 0) {
            this.f8947f = (System.identityHashCode(this.f8942a) * 31) + Arrays.hashCode(this.f8944c);
        }
        return this.f8947f;
    }

    public final int length() {
        return this.f8944c.length;
    }
}
