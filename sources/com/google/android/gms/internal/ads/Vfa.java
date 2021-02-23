package com.google.android.gms.internal.ads;

abstract class Vfa<T, B> {
    Vfa() {
    }

    /* access modifiers changed from: package-private */
    public abstract B a();

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void a(B b2, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void a(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void a(B b2, int i, Lda lda);

    /* access modifiers changed from: package-private */
    public abstract void a(B b2, int i, T t);

    /* access modifiers changed from: package-private */
    public abstract void a(T t, C2583sga sga);

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean a(C2865wfa wfa);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(B r7, com.google.android.gms.internal.ads.C2865wfa r8) {
        /*
            r6 = this;
            int r0 = r8.getTag()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.e()
            r6.a(r7, (int) r1, (int) r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.Hea r7 = com.google.android.gms.internal.ads.Iea.f()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.a()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.j()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.a(r0, (com.google.android.gms.internal.ads.C2865wfa) r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.b(r0)
            r6.a(r7, (int) r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.ads.Iea r7 = com.google.android.gms.internal.ads.Iea.e()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.ads.Lda r8 = r8.l()
            r6.a(r7, (int) r1, (com.google.android.gms.internal.ads.Lda) r8)
            return r2
        L_0x0059:
            long r3 = r8.c()
            r6.b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.o()
            r6.a(r7, (int) r1, (long) r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vfa.a(java.lang.Object, com.google.android.gms.internal.ads.wfa):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract T b(B b2);

    /* access modifiers changed from: package-private */
    public abstract void b(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void b(T t, C2583sga sga);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, B b2);

    /* access modifiers changed from: package-private */
    public abstract int c(T t);

    /* access modifiers changed from: package-private */
    public abstract T c(T t, T t2);

    /* access modifiers changed from: package-private */
    public abstract T d(Object obj);

    /* access modifiers changed from: package-private */
    public abstract B e(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int f(T t);
}
