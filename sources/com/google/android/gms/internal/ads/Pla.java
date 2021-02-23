package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Pla {

    /* renamed from: a  reason: collision with root package name */
    public static final Pla f8251a = new Pla(new Qla[0]);

    /* renamed from: b  reason: collision with root package name */
    public final int f8252b;

    /* renamed from: c  reason: collision with root package name */
    private final Qla[] f8253c;

    /* renamed from: d  reason: collision with root package name */
    private int f8254d;

    public Pla(Qla... qlaArr) {
        this.f8253c = qlaArr;
        this.f8252b = qlaArr.length;
    }

    public final int a(Qla qla) {
        for (int i = 0; i < this.f8252b; i++) {
            if (this.f8253c[i] == qla) {
                return i;
            }
        }
        return -1;
    }

    public final Qla a(int i) {
        return this.f8253c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Pla.class == obj.getClass()) {
            Pla pla = (Pla) obj;
            return this.f8252b == pla.f8252b && Arrays.equals(this.f8253c, pla.f8253c);
        }
    }

    public final int hashCode() {
        if (this.f8254d == 0) {
            this.f8254d = Arrays.hashCode(this.f8253c);
        }
        return this.f8254d;
    }
}
