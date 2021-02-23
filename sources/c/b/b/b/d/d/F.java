package c.b.b.b.d.d;

import java.util.Map;

final class F<K, V> extends B<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static final B<Object, Object> f3961e = new F((Object) null, new Object[0], 0);

    /* renamed from: f  reason: collision with root package name */
    private final transient Object f3962f;

    /* renamed from: g  reason: collision with root package name */
    private final transient Object[] f3963g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f3964h;

    private F(Object obj, Object[] objArr, int i) {
        this.f3962f = obj;
        this.f3963g = objArr;
        this.f3964h = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v4 ?, r2v1 ?, r2v5 ?, r2v6 ?, r2v8 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    static <K, V> c.b.b.b.d.d.F<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            c.b.b.b.d.d.B<java.lang.Object, java.lang.Object> r10 = f3961e
            c.b.b.b.d.d.F r10 = (c.b.b.b.d.d.F) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            c.b.b.b.d.d.C0285v.a(r10, r1)
            c.b.b.b.d.d.F r10 = new c.b.b.b.d.d.F
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            c.b.b.b.d.d.C0277m.b(r10, r3)
            r3 = 2
            int r3 = java.lang.Math.max(r10, r3)
            r4 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 >= r4) goto L_0x0045
            int r4 = r3 + -1
            int r4 = java.lang.Integer.highestOneBit(r4)
            int r4 = r4 << r2
            r5 = r4
        L_0x0032:
            double r6 = (double) r5
            r8 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            double r8 = (double) r3
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            int r5 = r5 << 1
            goto L_0x0032
        L_0x0045:
            if (r3 >= r5) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r3 == 0) goto L_0x010f
        L_0x004c:
            if (r10 != r2) goto L_0x0058
            r1 = r11[r1]
            r2 = r11[r2]
            c.b.b.b.d.d.C0285v.a(r1, r2)
            r2 = r0
            goto L_0x0109
        L_0x0058:
            int r0 = r5 + -1
            r2 = 128(0x80, float:1.794E-43)
            r3 = -1
            if (r5 > r2) goto L_0x0097
            byte[] r2 = new byte[r5]
            java.util.Arrays.fill(r2, r3)
        L_0x0064:
            if (r1 >= r10) goto L_0x0109
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            c.b.b.b.d.d.C0285v.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = c.b.b.b.d.d.C0284u.a(r6)
        L_0x0079:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x0087
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0087:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0092
            int r6 = r6 + 1
            goto L_0x0079
        L_0x0092:
            java.lang.IllegalArgumentException r10 = a(r4, r5, r11, r7)
            throw r10
        L_0x0097:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r5 > r2) goto L_0x00d5
            short[] r2 = new short[r5]
            java.util.Arrays.fill(r2, r3)
        L_0x00a1:
            if (r1 >= r10) goto L_0x0109
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            c.b.b.b.d.d.C0285v.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = c.b.b.b.d.d.C0284u.a(r6)
        L_0x00b6:
            r6 = r6 & r0
            short r7 = r2[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x00c5
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x00a1
        L_0x00c5:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00d0
            int r6 = r6 + 1
            goto L_0x00b6
        L_0x00d0:
            java.lang.IllegalArgumentException r10 = a(r4, r5, r11, r7)
            throw r10
        L_0x00d5:
            int[] r2 = new int[r5]
            java.util.Arrays.fill(r2, r3)
        L_0x00da:
            if (r1 >= r10) goto L_0x0109
            int r4 = r1 * 2
            r5 = r11[r4]
            r6 = r4 ^ 1
            r6 = r11[r6]
            c.b.b.b.d.d.C0285v.a(r5, r6)
            int r7 = r5.hashCode()
            int r7 = c.b.b.b.d.d.C0284u.a(r7)
        L_0x00ef:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r3) goto L_0x00f9
            r2[r7] = r4
            int r1 = r1 + 1
            goto L_0x00da
        L_0x00f9:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0104
            int r7 = r7 + 1
            goto L_0x00ef
        L_0x0104:
            java.lang.IllegalArgumentException r10 = a(r5, r6, r11, r8)
            throw r10
        L_0x0109:
            c.b.b.b.d.d.F r0 = new c.b.b.b.d.d.F
            r0.<init>(r2, r11, r10)
            return r0
        L_0x010f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "collection too large"
            r10.<init>(r11)
            goto L_0x0118
        L_0x0117:
            throw r10
        L_0x0118:
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.d.F.a(int, java.lang.Object[]):c.b.b.b.d.d.F");
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
    public final D<Map.Entry<K, V>> b() {
        return new E(this, this.f3963g, 0, this.f3964h);
    }

    /* access modifiers changed from: package-private */
    public final D<K> c() {
        return new G(this, new J(this.f3963g, 0, this.f3964h));
    }

    /* access modifiers changed from: package-private */
    public final C0287x<V> d() {
        return new J(this.f3963g, 1, this.f3964h);
    }

    public final V get(Object obj) {
        Object obj2 = this.f3962f;
        V[] vArr = this.f3963g;
        int i = this.f3964h;
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
                int a2 = C0284u.a(obj.hashCode());
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
                int a3 = C0284u.a(obj.hashCode());
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
                int a4 = C0284u.a(obj.hashCode());
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
        return this.f3964h;
    }
}
