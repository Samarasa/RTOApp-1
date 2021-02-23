package c.b.b.b.d.d;

abstract class r extends C0260c<String> {

    /* renamed from: c  reason: collision with root package name */
    final CharSequence f4036c;

    /* renamed from: d  reason: collision with root package name */
    private final C0262d f4037d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4038e;

    /* renamed from: f  reason: collision with root package name */
    private int f4039f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f4040g;

    protected r(C0276l lVar, CharSequence charSequence) {
        this.f4037d = lVar.f4012a;
        this.f4038e = false;
        this.f4040g = lVar.f4015d;
        this.f4036c = charSequence;
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 >= r1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r6.f4037d.a(r6.f4036c.charAt(r0)) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 <= r0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r6.f4037d.a(r6.f4036c.charAt(r1 - 1)) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r6.f4038e == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.f4039f
        L_0x0002:
            int r1 = r6.f4039f
            r2 = -1
            if (r1 == r2) goto L_0x0090
            int r1 = r6.a(r1)
            if (r1 != r2) goto L_0x0016
            java.lang.CharSequence r1 = r6.f4036c
            int r1 = r1.length()
            r6.f4039f = r2
            goto L_0x001c
        L_0x0016:
            int r3 = r6.b(r1)
            r6.f4039f = r3
        L_0x001c:
            int r3 = r6.f4039f
            if (r3 != r0) goto L_0x0031
            int r3 = r3 + 1
            r6.f4039f = r3
            int r1 = r6.f4039f
            java.lang.CharSequence r3 = r6.f4036c
            int r3 = r3.length()
            if (r1 <= r3) goto L_0x0002
            r6.f4039f = r2
            goto L_0x0002
        L_0x0031:
            if (r0 >= r1) goto L_0x0044
            c.b.b.b.d.d.d r3 = r6.f4037d
            java.lang.CharSequence r4 = r6.f4036c
            char r4 = r4.charAt(r0)
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L_0x0044
            int r0 = r0 + 1
            goto L_0x0031
        L_0x0044:
            if (r1 <= r0) goto L_0x0059
            c.b.b.b.d.d.d r3 = r6.f4037d
            java.lang.CharSequence r4 = r6.f4036c
            int r5 = r1 + -1
            char r4 = r4.charAt(r5)
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L_0x0059
            int r1 = r1 + -1
            goto L_0x0044
        L_0x0059:
            boolean r3 = r6.f4038e
            if (r3 == 0) goto L_0x0060
            if (r0 != r1) goto L_0x0060
            goto L_0x0000
        L_0x0060:
            int r3 = r6.f4040g
            r4 = 1
            if (r3 != r4) goto L_0x0082
            java.lang.CharSequence r1 = r6.f4036c
            int r1 = r1.length()
            r6.f4039f = r2
        L_0x006d:
            if (r1 <= r0) goto L_0x0085
            c.b.b.b.d.d.d r2 = r6.f4037d
            java.lang.CharSequence r3 = r6.f4036c
            int r4 = r1 + -1
            char r3 = r3.charAt(r4)
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0085
            int r1 = r1 + -1
            goto L_0x006d
        L_0x0082:
            int r3 = r3 - r4
            r6.f4040g = r3
        L_0x0085:
            java.lang.CharSequence r2 = r6.f4036c
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0090:
            r6.b()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.d.r.a():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public abstract int b(int i);
}
