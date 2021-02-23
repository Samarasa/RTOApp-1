package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Qla {

    /* renamed from: a  reason: collision with root package name */
    public final int f8383a;

    /* renamed from: b  reason: collision with root package name */
    private final Lia[] f8384b;

    /* renamed from: c  reason: collision with root package name */
    private int f8385c;

    public Qla(Lia... liaArr) {
        Cma.b(liaArr.length > 0);
        this.f8384b = liaArr;
        this.f8383a = liaArr.length;
    }

    public final int a(Lia lia) {
        int i = 0;
        while (true) {
            Lia[] liaArr = this.f8384b;
            if (i >= liaArr.length) {
                return -1;
            }
            if (lia == liaArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Lia a(int i) {
        return this.f8384b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Qla.class == obj.getClass()) {
            Qla qla = (Qla) obj;
            return this.f8383a == qla.f8383a && Arrays.equals(this.f8384b, qla.f8384b);
        }
    }

    public final int hashCode() {
        if (this.f8385c == 0) {
            this.f8385c = Arrays.hashCode(this.f8384b) + 527;
        }
        return this.f8385c;
    }
}
