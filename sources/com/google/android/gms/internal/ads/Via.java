package com.google.android.gms.internal.ads;

public abstract class Via {

    /* renamed from: a  reason: collision with root package name */
    public static final Via f9067a = new Zia();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((b() - 1) == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r3, com.google.android.gms.internal.ads.Yia r4, com.google.android.gms.internal.ads.C1314aja r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.a((int) r3, (com.google.android.gms.internal.ads.Yia) r4, (boolean) r0)
            r2.a((int) r0, (com.google.android.gms.internal.ads.C1314aja) r5, (boolean) r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.b()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.a((int) r4, (com.google.android.gms.internal.ads.C1314aja) r5, (boolean) r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Via.a(int, com.google.android.gms.internal.ads.Yia, com.google.android.gms.internal.ads.aja, int):int");
    }

    public abstract int a(Object obj);

    public abstract Yia a(int i, Yia yia, boolean z);

    public final C1314aja a(int i, C1314aja aja, boolean z) {
        return a(i, aja, false, 0);
    }

    public abstract C1314aja a(int i, C1314aja aja, boolean z, long j);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public abstract int c();
}
