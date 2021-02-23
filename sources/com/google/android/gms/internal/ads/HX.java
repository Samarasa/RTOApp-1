package com.google.android.gms.internal.ads;

import java.util.Map;

final class HX<K, V> extends C2993yX<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private static final C2993yX<Object, Object> f7153e = new HX((Object) null, new Object[0], 0);

    /* renamed from: f  reason: collision with root package name */
    private final transient Object f7154f;

    /* renamed from: g  reason: collision with root package name */
    private final transient Object[] f7155g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f7156h;

    private HX(Object obj, Object[] objArr, int i) {
        this.f7154f = obj;
        this.f7155g = objArr;
        this.f7156h = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v4 ?, r2v1 ?, r2v5 ?, r2v6 ?, r2v8 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    static <K, V> com.google.android.gms.internal.ads.HX<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            com.google.android.gms.internal.ads.yX<java.lang.Object, java.lang.Object> r10 = f7153e
            com.google.android.gms.internal.ads.HX r10 = (com.google.android.gms.internal.ads.HX) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            com.google.android.gms.internal.ads.C2284oX.a((java.lang.Object) r10, (java.lang.Object) r1)
            com.google.android.gms.internal.ads.HX r10 = new com.google.android.gms.internal.ads.HX
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            com.google.android.gms.internal.ads.C1434cX.b(r10, r3)
            int r3 = com.google.android.gms.internal.ads.BX.j(r10)
            if (r10 != r2) goto L_0x002e
            r1 = r11[r1]
            r2 = r11[r2]
            com.google.android.gms.internal.ads.C2284oX.a((java.lang.Object) r1, (java.lang.Object) r2)
            r2 = r0
            goto L_0x00df
        L_0x002e:
            int r0 = r3 + -1
            r2 = 128(0x80, float:1.794E-43)
            r4 = -1
            if (r3 > r2) goto L_0x006d
            byte[] r2 = new byte[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x003a:
            if (r1 >= r10) goto L_0x00df
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.C2284oX.a((java.lang.Object) r4, (java.lang.Object) r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.C2426qX.a(r6)
        L_0x004f:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x005d
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x003a
        L_0x005d:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0068
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0068:
            java.lang.IllegalArgumentException r10 = a(r4, r5, r11, r7)
            throw r10
        L_0x006d:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r3 > r2) goto L_0x00ab
            short[] r2 = new short[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0077:
            if (r1 >= r10) goto L_0x00df
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.C2284oX.a((java.lang.Object) r4, (java.lang.Object) r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.C2426qX.a(r6)
        L_0x008c:
            r6 = r6 & r0
            short r7 = r2[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x009b
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0077
        L_0x009b:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00a6
            int r6 = r6 + 1
            goto L_0x008c
        L_0x00a6:
            java.lang.IllegalArgumentException r10 = a(r4, r5, r11, r7)
            throw r10
        L_0x00ab:
            int[] r2 = new int[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x00b0:
            if (r1 >= r10) goto L_0x00df
            int r3 = r1 * 2
            r5 = r11[r3]
            r6 = r3 ^ 1
            r6 = r11[r6]
            com.google.android.gms.internal.ads.C2284oX.a((java.lang.Object) r5, (java.lang.Object) r6)
            int r7 = r5.hashCode()
            int r7 = com.google.android.gms.internal.ads.C2426qX.a(r7)
        L_0x00c5:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r4) goto L_0x00cf
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00cf:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00da
            int r7 = r7 + 1
            goto L_0x00c5
        L_0x00da:
            java.lang.IllegalArgumentException r10 = a(r5, r6, r11, r8)
            throw r10
        L_0x00df:
            com.google.android.gms.internal.ads.HX r0 = new com.google.android.gms.internal.ads.HX
            r0.<init>(r2, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HX.a(int, java.lang.Object[]):com.google.android.gms.internal.ads.HX");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final BX<Map.Entry<K, V>> a() {
        return new GX(this, this.f7155g, 0, this.f7156h);
    }

    /* access modifiers changed from: package-private */
    public final BX<K> b() {
        return new JX(this, new MX(this.f7155g, 0, this.f7156h));
    }

    /* access modifiers changed from: package-private */
    public final C2638tX<V> c() {
        return new MX(this.f7155g, 1, this.f7156h);
    }

    public final V get(Object obj) {
        Object obj2 = this.f7154f;
        V[] vArr = this.f7155g;
        int i = this.f7156h;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = C2426qX.a(obj.hashCode());
                while (true) {
                    int i2 = a2 & length;
                    byte b2 = bArr[i2] & 255;
                    if (b2 == 255) {
                        return null;
                    }
                    if (vArr[b2].equals(obj)) {
                        return vArr[b2 ^ 1];
                    }
                    a2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = C2426qX.a(obj.hashCode());
                while (true) {
                    int i3 = a3 & length2;
                    short s = sArr[i3] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    a3 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = C2426qX.a(obj.hashCode());
                while (true) {
                    int i4 = a4 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr[i5].equals(obj)) {
                        return vArr[i5 ^ 1];
                    }
                    a4 = i4 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.f7156h;
    }
}
