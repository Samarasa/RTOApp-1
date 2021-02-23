package g;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.TimeUnit;

/* renamed from: g.e  reason: case insensitive filesystem */
public final class C3344e {

    /* renamed from: a  reason: collision with root package name */
    public static final C3344e f15235a;

    /* renamed from: b  reason: collision with root package name */
    public static final C3344e f15236b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15237c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15238d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15239e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15240f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15241g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15242h;
    private final boolean i;
    private final int j;
    private final int k;
    private final boolean l;
    private final boolean m;
    String n;

    /* renamed from: g.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f15243a;

        /* renamed from: b  reason: collision with root package name */
        boolean f15244b;

        /* renamed from: c  reason: collision with root package name */
        int f15245c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f15246d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f15247e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f15248f;

        /* renamed from: g  reason: collision with root package name */
        boolean f15249g;

        public a a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f15246d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public C3344e a() {
            return new C3344e(this);
        }

        public a b() {
            this.f15243a = true;
            return this;
        }

        public a c() {
            this.f15248f = true;
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.b();
        f15235a = aVar.a();
        a aVar2 = new a();
        aVar2.c();
        aVar2.a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f15236b = aVar2.a();
    }

    C3344e(a aVar) {
        this.f15237c = aVar.f15243a;
        this.f15238d = aVar.f15244b;
        this.f15239e = aVar.f15245c;
        this.f15240f = -1;
        this.f15241g = false;
        this.f15242h = false;
        this.i = false;
        this.j = aVar.f15246d;
        this.k = aVar.f15247e;
        this.l = aVar.f15248f;
        this.m = aVar.f15249g;
    }

    private C3344e(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, String str) {
        this.f15237c = z;
        this.f15238d = z2;
        this.f15239e = i2;
        this.f15240f = i3;
        this.f15241g = z3;
        this.f15242h = z4;
        this.i = z5;
        this.j = i4;
        this.k = i5;
        this.l = z6;
        this.m = z7;
        this.n = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g.C3344e a(g.z r21) {
        /*
            r0 = r21
            int r1 = r21.b()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0138
            java.lang.String r2 = r0.a((int) r6)
            java.lang.String r4 = r0.b((int) r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0131
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0131
            java.lang.String r3 = "=,;"
            int r3 = g.a.c.f.a((java.lang.String) r4, (int) r2, (java.lang.String) r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = g.a.c.f.b(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = g.a.c.f.a((java.lang.String) r4, (int) r0, (java.lang.String) r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = g.a.c.f.a((java.lang.String) r4, (int) r0, (java.lang.String) r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x012c
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x012c
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c3
            r5 = -1
            int r0 = g.a.c.f.a(r0, r5)
            r11 = r0
            goto L_0x012c
        L_0x00c3:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r0 = g.a.c.f.a(r0, r5)
            r12 = r0
            goto L_0x012c
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x012c
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x012c
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x012c
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0106
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = g.a.c.f.a(r0, r2)
            r16 = r0
            r5 = -1
            goto L_0x012c
        L_0x0106:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0116
            r5 = -1
            int r0 = g.a.c.f.a(r0, r5)
            r17 = r0
            goto L_0x012c
        L_0x0116:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0122
            r18 = 1
            goto L_0x012c
        L_0x0122:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x012c
            r19 = 1
        L_0x012c:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x0131:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0138:
            if (r7 != 0) goto L_0x013d
            r20 = 0
            goto L_0x013f
        L_0x013d:
            r20 = r8
        L_0x013f:
            g.e r0 = new g.e
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.C3344e.a(g.z):g.e");
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        if (this.f15237c) {
            sb.append("no-cache, ");
        }
        if (this.f15238d) {
            sb.append("no-store, ");
        }
        if (this.f15239e != -1) {
            sb.append("max-age=");
            sb.append(this.f15239e);
            sb.append(", ");
        }
        if (this.f15240f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f15240f);
            sb.append(", ");
        }
        if (this.f15241g) {
            sb.append("private, ");
        }
        if (this.f15242h) {
            sb.append("public, ");
        }
        if (this.i) {
            sb.append("must-revalidate, ");
        }
        if (this.j != -1) {
            sb.append("max-stale=");
            sb.append(this.j);
            sb.append(", ");
        }
        if (this.k != -1) {
            sb.append("min-fresh=");
            sb.append(this.k);
            sb.append(", ");
        }
        if (this.l) {
            sb.append("only-if-cached, ");
        }
        if (this.m) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean a() {
        return this.f15241g;
    }

    public boolean b() {
        return this.f15242h;
    }

    public int c() {
        return this.f15239e;
    }

    public int d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.f15237c;
    }

    public boolean h() {
        return this.f15238d;
    }

    public boolean i() {
        return this.l;
    }

    public String toString() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        String j2 = j();
        this.n = j2;
        return j2;
    }
}
