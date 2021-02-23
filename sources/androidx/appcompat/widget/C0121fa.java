package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.fa  reason: case insensitive filesystem */
class C0121fa {

    /* renamed from: a  reason: collision with root package name */
    private int f628a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f629b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f630c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f631d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f632e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f633f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f634g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f635h = false;

    C0121fa() {
    }

    public int a() {
        return this.f634g ? this.f628a : this.f629b;
    }

    public void a(int i, int i2) {
        this.f635h = false;
        if (i != Integer.MIN_VALUE) {
            this.f632e = i;
            this.f628a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f633f = i2;
            this.f629b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f634g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f634g = r2
            boolean r0 = r1.f635h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f631d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f632e
        L_0x0016:
            r1.f628a = r2
            int r2 = r1.f630c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f630c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f632e
        L_0x0024:
            r1.f628a = r2
            int r2 = r1.f631d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f632e
            r1.f628a = r2
        L_0x002f:
            int r2 = r1.f633f
        L_0x0031:
            r1.f629b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0121fa.a(boolean):void");
    }

    public int b() {
        return this.f628a;
    }

    public void b(int i, int i2) {
        this.f630c = i;
        this.f631d = i2;
        this.f635h = true;
        if (this.f634g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f628a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f629b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f628a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f629b = i2;
        }
    }

    public int c() {
        return this.f629b;
    }

    public int d() {
        return this.f634g ? this.f629b : this.f628a;
    }
}
