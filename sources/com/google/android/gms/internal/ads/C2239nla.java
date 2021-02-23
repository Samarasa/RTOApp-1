package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nla  reason: case insensitive filesystem */
public final class C2239nla implements Lla {

    /* renamed from: a  reason: collision with root package name */
    private final Lla[] f11503a;

    public C2239nla(Lla[] llaArr) {
        this.f11503a = llaArr;
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long b2 = b();
            if (b2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (Lla lla : this.f11503a) {
                if (lla.b() == b2) {
                    z |= lla.a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long b() {
        long j = Long.MAX_VALUE;
        for (Lla b2 : this.f11503a) {
            long b3 = b2.b();
            if (b3 != Long.MIN_VALUE) {
                j = Math.min(j, b3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
