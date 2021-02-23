package com.google.android.gms.internal.ads;

public final class AX<E> extends C2567sX<E> {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f6121d;

    /* renamed from: e  reason: collision with root package name */
    private int f6122e;

    public AX() {
        super(4);
    }

    AX(int i) {
        super(i);
        this.f6121d = new Object[BX.j(i)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.internal.ads.LX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.internal.ads.BX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.gms.internal.ads.LX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.ads.LX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.BX<E> a() {
        /*
            r8 = this;
            int r0 = r8.f12093b
            if (r0 == 0) goto L_0x0059
            r1 = 1
            if (r0 == r1) goto L_0x004f
            java.lang.Object[] r2 = r8.f6121d
            if (r2 == 0) goto L_0x003b
            int r0 = com.google.android.gms.internal.ads.BX.j(r0)
            java.lang.Object[] r2 = r8.f6121d
            int r2 = r2.length
            if (r0 != r2) goto L_0x003b
            int r0 = r8.f12093b
            java.lang.Object[] r2 = r8.f12092a
            int r2 = r2.length
            boolean r0 = com.google.android.gms.internal.ads.BX.b((int) r0, (int) r2)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = r8.f12092a
            int r2 = r8.f12093b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            goto L_0x002a
        L_0x0028:
            java.lang.Object[] r0 = r8.f12092a
        L_0x002a:
            r3 = r0
            com.google.android.gms.internal.ads.LX r0 = new com.google.android.gms.internal.ads.LX
            int r4 = r8.f6122e
            java.lang.Object[] r5 = r8.f6121d
            int r2 = r5.length
            int r6 = r2 + -1
            int r7 = r8.f12093b
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0049
        L_0x003b:
            int r0 = r8.f12093b
            java.lang.Object[] r2 = r8.f12092a
            com.google.android.gms.internal.ads.BX r0 = com.google.android.gms.internal.ads.BX.b((int) r0, (java.lang.Object[]) r2)
            int r2 = r0.size()
            r8.f12093b = r2
        L_0x0049:
            r8.f12094c = r1
            r1 = 0
            r8.f6121d = r1
            return r0
        L_0x004f:
            java.lang.Object[] r0 = r8.f12092a
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.BX r0 = com.google.android.gms.internal.ads.BX.a(r0)
            return r0
        L_0x0059:
            com.google.android.gms.internal.ads.LX<java.lang.Object> r0 = com.google.android.gms.internal.ads.LX.f7679c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AX.a():com.google.android.gms.internal.ads.BX");
    }

    public final /* synthetic */ C2780vX a(Iterable iterable) {
        C1434cX.a(iterable);
        if (this.f6121d != null) {
            for (Object a2 : iterable) {
                a(a2);
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    public final /* synthetic */ C2780vX a(Object obj) {
        C1434cX.a(obj);
        if (this.f6121d != null) {
            int j = BX.j(this.f12093b);
            Object[] objArr = this.f6121d;
            if (j <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a2 = C2426qX.a(hashCode);
                while (true) {
                    int i = a2 & length;
                    Object[] objArr2 = this.f6121d;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a2 = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.f6122e += hashCode;
                        super.b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f6121d = null;
        super.b(obj);
        return this;
    }
}
