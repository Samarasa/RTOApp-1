package b.f.a.a;

import b.f.a.a.f;
import b.f.a.c;
import b.f.a.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static float f2290a = 0.5f;
    f A = new f(this, f.c.CENTER_X);
    f B = new f(this, f.c.CENTER_Y);
    f C = new f(this, f.c.CENTER);
    protected f[] D = {this.v, this.x, this.w, this.y, this.z, this.C};
    protected ArrayList<f> E = new ArrayList<>();
    protected a[] F;
    h G;
    int H;
    int I;
    protected float J;
    protected int K;
    protected int L;
    protected int M;
    int N;
    int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    protected int T;
    protected int U;
    int V;
    protected int W;
    protected int X;
    private int Y;
    private int Z;
    float aa;

    /* renamed from: b  reason: collision with root package name */
    public int f2291b = -1;
    float ba;

    /* renamed from: c  reason: collision with root package name */
    public int f2292c = -1;
    private Object ca;

    /* renamed from: d  reason: collision with root package name */
    q f2293d;
    private int da;

    /* renamed from: e  reason: collision with root package name */
    q f2294e;
    private int ea;

    /* renamed from: f  reason: collision with root package name */
    int f2295f = 0;
    private String fa;

    /* renamed from: g  reason: collision with root package name */
    int f2296g = 0;
    private String ga;

    /* renamed from: h  reason: collision with root package name */
    int[] f2297h = new int[2];
    boolean ha;
    int i = 0;
    boolean ia;
    int j = 0;
    boolean ja;
    float k = 1.0f;
    boolean ka;
    int l = 0;
    boolean la;
    int m = 0;
    int ma;
    float n = 1.0f;
    int na;
    boolean o;
    boolean oa;
    boolean p;
    boolean pa;
    int q = -1;
    float[] qa;
    float r = 1.0f;
    protected h[] ra;
    j s = null;
    protected h[] sa;
    private int[] t = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    h ta;
    private float u = 0.0f;
    h ua;
    f v = new f(this, f.c.LEFT);
    f w = new f(this, f.c.TOP);
    f x = new f(this, f.c.RIGHT);
    f y = new f(this, f.c.BOTTOM);
    f z = new f(this, f.c.BASELINE);

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public h() {
        a aVar = a.FIXED;
        this.F = new a[]{aVar, aVar};
        this.G = null;
        this.H = 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = -1;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        float f2 = f2290a;
        this.aa = f2;
        this.ba = f2;
        this.da = 0;
        this.ea = 0;
        this.fa = null;
        this.ga = null;
        this.ja = false;
        this.ka = false;
        this.la = false;
        this.ma = 0;
        this.na = 0;
        this.qa = new float[]{-1.0f, -1.0f};
        this.ra = new h[]{null, null};
        this.sa = new h[]{null, null};
        this.ta = null;
        this.ua = null;
        J();
    }

    private void J() {
        this.E.add(this.v);
        this.E.add(this.w);
        this.E.add(this.x);
        this.E.add(this.y);
        this.E.add(this.A);
        this.E.add(this.B);
        this.E.add(this.C);
        this.E.add(this.z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f9, code lost:
        if (r27 != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        if (r27 != false) goto L_0x0202;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(b.f.a.e r26, boolean r27, b.f.a.i r28, b.f.a.i r29, b.f.a.a.h.a r30, boolean r31, b.f.a.a.f r32, b.f.a.a.f r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            r25 = this;
            r0 = r25
            r10 = r26
            r11 = r28
            r12 = r29
            r13 = r32
            r14 = r33
            r1 = r36
            r2 = r37
            b.f.a.i r15 = r10.a((java.lang.Object) r13)
            b.f.a.i r9 = r10.a((java.lang.Object) r14)
            b.f.a.a.f r3 = r32.g()
            b.f.a.i r8 = r10.a((java.lang.Object) r3)
            b.f.a.a.f r3 = r33.g()
            b.f.a.i r7 = r10.a((java.lang.Object) r3)
            boolean r3 = r10.i
            r6 = 1
            r4 = 6
            r5 = 0
            if (r3 == 0) goto L_0x0066
            b.f.a.a.p r3 = r32.d()
            int r3 = r3.f2321b
            if (r3 != r6) goto L_0x0066
            b.f.a.a.p r3 = r33.d()
            int r3 = r3.f2321b
            if (r3 != r6) goto L_0x0066
            b.f.a.f r1 = b.f.a.e.e()
            if (r1 == 0) goto L_0x0050
            b.f.a.f r1 = b.f.a.e.e()
            long r2 = r1.r
            r6 = 1
            long r2 = r2 + r6
            r1.r = r2
        L_0x0050:
            b.f.a.a.p r1 = r32.d()
            r1.a((b.f.a.e) r10)
            b.f.a.a.p r1 = r33.d()
            r1.a((b.f.a.e) r10)
            if (r40 != 0) goto L_0x0065
            if (r27 == 0) goto L_0x0065
            r10.b(r12, r9, r5, r4)
        L_0x0065:
            return
        L_0x0066:
            b.f.a.f r3 = b.f.a.e.e()
            if (r3 == 0) goto L_0x0078
            b.f.a.f r3 = b.f.a.e.e()
            long r4 = r3.z
            r16 = 1
            long r4 = r4 + r16
            r3.z = r4
        L_0x0078:
            boolean r16 = r32.i()
            boolean r17 = r33.i()
            b.f.a.a.f r3 = r0.C
            boolean r20 = r3.i()
            if (r16 == 0) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            if (r17 == 0) goto L_0x008f
            int r3 = r3 + 1
        L_0x008f:
            if (r20 == 0) goto L_0x0093
            int r3 = r3 + 1
        L_0x0093:
            r5 = r3
            if (r39 == 0) goto L_0x0098
            r3 = 3
            goto L_0x009a
        L_0x0098:
            r3 = r41
        L_0x009a:
            int[] r21 = b.f.a.a.g.f2289b
            int r22 = r30.ordinal()
            r4 = r21[r22]
            r14 = 2
            r13 = 4
            if (r4 == r6) goto L_0x00ad
            if (r4 == r14) goto L_0x00ad
            r14 = 3
            if (r4 == r14) goto L_0x00ad
            if (r4 == r13) goto L_0x00af
        L_0x00ad:
            r4 = 0
            goto L_0x00b3
        L_0x00af:
            if (r3 != r13) goto L_0x00b2
            goto L_0x00ad
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            int r14 = r0.ea
            r13 = 8
            if (r14 != r13) goto L_0x00bc
            r4 = 0
            r13 = 0
            goto L_0x00bf
        L_0x00bc:
            r13 = r4
            r4 = r35
        L_0x00bf:
            if (r45 == 0) goto L_0x00da
            if (r16 != 0) goto L_0x00cd
            if (r17 != 0) goto L_0x00cd
            if (r20 != 0) goto L_0x00cd
            r14 = r34
            r10.a((b.f.a.i) r15, (int) r14)
            goto L_0x00da
        L_0x00cd:
            if (r16 == 0) goto L_0x00da
            if (r17 != 0) goto L_0x00da
            int r14 = r32.b()
            r6 = 6
            r10.a((b.f.a.i) r15, (b.f.a.i) r8, (int) r14, (int) r6)
            goto L_0x00db
        L_0x00da:
            r6 = 6
        L_0x00db:
            if (r13 != 0) goto L_0x0109
            if (r31 == 0) goto L_0x00f6
            r6 = 0
            r14 = 3
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r6, (int) r14)
            if (r1 <= 0) goto L_0x00eb
            r4 = 6
            r10.b(r9, r15, r1, r4)
            goto L_0x00ec
        L_0x00eb:
            r4 = 6
        L_0x00ec:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00f4
            r10.c(r9, r15, r2, r4)
        L_0x00f4:
            r6 = 6
            goto L_0x00fa
        L_0x00f6:
            r14 = 3
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r4, (int) r6)
        L_0x00fa:
            r14 = r43
            r34 = r3
            r0 = r5
            r24 = r7
            r23 = r8
            r1 = 0
            r2 = 2
            r3 = r42
            goto L_0x01ec
        L_0x0109:
            r14 = 3
            r2 = -2
            r14 = r42
            if (r14 != r2) goto L_0x0113
            r14 = r43
            r6 = r4
            goto L_0x0116
        L_0x0113:
            r6 = r14
            r14 = r43
        L_0x0116:
            if (r14 != r2) goto L_0x0119
            r14 = r4
        L_0x0119:
            if (r6 <= 0) goto L_0x0124
            r2 = 6
            r10.b(r9, r15, r6, r2)
            int r4 = java.lang.Math.max(r4, r6)
            goto L_0x0125
        L_0x0124:
            r2 = 6
        L_0x0125:
            if (r14 <= 0) goto L_0x012e
            r10.c(r9, r15, r14, r2)
            int r4 = java.lang.Math.min(r4, r14)
        L_0x012e:
            r2 = 1
            if (r3 != r2) goto L_0x0159
            if (r27 == 0) goto L_0x0145
            r2 = 6
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r4, (int) r2)
            r34 = r3
            r0 = r5
            r24 = r7
            r23 = r8
            r35 = r13
            r1 = 0
            r8 = r4
            r13 = r6
            goto L_0x01cf
        L_0x0145:
            r2 = 6
            if (r40 == 0) goto L_0x0150
            r35 = r13
            r13 = 4
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r4, (int) r13)
            goto L_0x01c5
        L_0x0150:
            r35 = r13
            r2 = 1
            r13 = 4
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r4, (int) r2)
            goto L_0x01c5
        L_0x0159:
            r35 = r13
            r2 = 2
            r13 = 4
            if (r3 != r2) goto L_0x01c5
            b.f.a.a.f$c r2 = r32.h()
            b.f.a.a.f$c r13 = b.f.a.a.f.c.TOP
            if (r2 == r13) goto L_0x0183
            b.f.a.a.f$c r2 = r32.h()
            b.f.a.a.f$c r13 = b.f.a.a.f.c.BOTTOM
            if (r2 != r13) goto L_0x0170
            goto L_0x0183
        L_0x0170:
            b.f.a.a.h r2 = r0.G
            b.f.a.a.f$c r13 = b.f.a.a.f.c.LEFT
            b.f.a.a.f r2 = r2.a((b.f.a.a.f.c) r13)
            b.f.a.i r2 = r10.a((java.lang.Object) r2)
            b.f.a.a.h r13 = r0.G
            r31 = r2
            b.f.a.a.f$c r2 = b.f.a.a.f.c.RIGHT
            goto L_0x0195
        L_0x0183:
            b.f.a.a.h r2 = r0.G
            b.f.a.a.f$c r13 = b.f.a.a.f.c.TOP
            b.f.a.a.f r2 = r2.a((b.f.a.a.f.c) r13)
            b.f.a.i r2 = r10.a((java.lang.Object) r2)
            b.f.a.a.h r13 = r0.G
            r31 = r2
            b.f.a.a.f$c r2 = b.f.a.a.f.c.BOTTOM
        L_0x0195:
            b.f.a.a.f r2 = r13.a((b.f.a.a.f.c) r2)
            b.f.a.i r2 = r10.a((java.lang.Object) r2)
            r22 = r31
            r13 = r2
            b.f.a.b r2 = r26.b()
            r31 = r2
            r18 = 1
            r21 = 6
            r0 = r3
            r3 = r9
            r34 = r0
            r23 = r8
            r0 = 6
            r8 = r4
            r4 = r15
            r0 = r5
            r1 = 0
            r5 = r13
            r13 = r6
            r6 = r22
            r24 = r7
            r7 = r44
            r2.a(r3, r4, r5, r6, r7)
            r10.a((b.f.a.b) r2)
            r5 = 0
            goto L_0x01d1
        L_0x01c5:
            r34 = r3
            r0 = r5
            r13 = r6
            r24 = r7
            r23 = r8
            r1 = 0
            r8 = r4
        L_0x01cf:
            r5 = r35
        L_0x01d1:
            if (r5 == 0) goto L_0x01e9
            r2 = 2
            if (r0 == r2) goto L_0x01ea
            if (r39 != 0) goto L_0x01ea
            int r3 = java.lang.Math.max(r13, r8)
            if (r14 <= 0) goto L_0x01e2
            int r3 = java.lang.Math.min(r14, r3)
        L_0x01e2:
            r4 = 6
            r10.a((b.f.a.i) r9, (b.f.a.i) r15, (int) r3, (int) r4)
            r3 = r13
            r13 = 0
            goto L_0x01ec
        L_0x01e9:
            r2 = 2
        L_0x01ea:
            r3 = r13
            r13 = r5
        L_0x01ec:
            if (r45 == 0) goto L_0x0326
            if (r40 == 0) goto L_0x01f2
            goto L_0x0326
        L_0x01f2:
            r0 = 5
            if (r16 != 0) goto L_0x01fc
            if (r17 != 0) goto L_0x01fc
            if (r20 != 0) goto L_0x01fc
            if (r27 == 0) goto L_0x031b
            goto L_0x0202
        L_0x01fc:
            if (r16 == 0) goto L_0x0207
            if (r17 != 0) goto L_0x0207
            if (r27 == 0) goto L_0x031b
        L_0x0202:
            r10.b(r12, r9, r1, r0)
            goto L_0x031b
        L_0x0207:
            if (r16 != 0) goto L_0x021d
            if (r17 == 0) goto L_0x021d
            int r2 = r33.b()
            int r2 = -r2
            r8 = r24
            r3 = 6
            r10.a((b.f.a.i) r9, (b.f.a.i) r8, (int) r2, (int) r3)
            if (r27 == 0) goto L_0x031b
            r10.b(r15, r11, r1, r0)
            goto L_0x031b
        L_0x021d:
            r8 = r24
            if (r16 == 0) goto L_0x031b
            if (r17 == 0) goto L_0x031b
            if (r13 == 0) goto L_0x0293
            if (r27 == 0) goto L_0x022f
            r7 = 0
            if (r36 != 0) goto L_0x0230
            r1 = 6
            r10.b(r9, r15, r7, r1)
            goto L_0x0230
        L_0x022f:
            r7 = 0
        L_0x0230:
            if (r34 != 0) goto L_0x025a
            if (r14 > 0) goto L_0x023a
            if (r3 <= 0) goto L_0x0237
            goto L_0x023a
        L_0x0237:
            r1 = 6
            r6 = 0
            goto L_0x023c
        L_0x023a:
            r1 = 4
            r6 = 1
        L_0x023c:
            int r2 = r32.b()
            r5 = r23
            r10.a((b.f.a.i) r15, (b.f.a.i) r5, (int) r2, (int) r1)
            int r2 = r33.b()
            int r2 = -r2
            r10.a((b.f.a.i) r9, (b.f.a.i) r8, (int) r2, (int) r1)
            if (r14 > 0) goto L_0x0254
            if (r3 <= 0) goto L_0x0252
            goto L_0x0254
        L_0x0252:
            r1 = 0
            goto L_0x0255
        L_0x0254:
            r1 = 1
        L_0x0255:
            r16 = r6
            r6 = 1
            r14 = 5
            goto L_0x0265
        L_0x025a:
            r4 = r34
            r5 = r23
            r6 = 1
            if (r4 != r6) goto L_0x0268
            r1 = 1
            r14 = 6
            r16 = 1
        L_0x0265:
            r4 = r25
            goto L_0x029d
        L_0x0268:
            r1 = 3
            if (r4 != r1) goto L_0x028f
            if (r39 != 0) goto L_0x0278
            r4 = r25
            int r1 = r4.q
            r2 = -1
            if (r1 == r2) goto L_0x027a
            if (r14 > 0) goto L_0x027a
            r1 = 6
            goto L_0x027b
        L_0x0278:
            r4 = r25
        L_0x027a:
            r1 = 4
        L_0x027b:
            int r2 = r32.b()
            r10.a((b.f.a.i) r15, (b.f.a.i) r5, (int) r2, (int) r1)
            int r2 = r33.b()
            int r2 = -r2
            r10.a((b.f.a.i) r9, (b.f.a.i) r8, (int) r2, (int) r1)
            r1 = 1
            r14 = 5
            r16 = 1
            goto L_0x029d
        L_0x028f:
            r4 = r25
            r1 = 0
            goto L_0x029a
        L_0x0293:
            r5 = r23
            r6 = 1
            r7 = 0
            r4 = r25
            r1 = 1
        L_0x029a:
            r14 = 5
            r16 = 0
        L_0x029d:
            if (r1 == 0) goto L_0x02e2
            int r17 = r32.b()
            int r18 = r33.b()
            r1 = r26
            r2 = r15
            r3 = r5
            r4 = r17
            r17 = r5
            r5 = r38
            r19 = 1
            r6 = r8
            r0 = 0
            r7 = r9
            r12 = r8
            r0 = r17
            r8 = r18
            r11 = r9
            r9 = r14
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r32
            b.f.a.a.f r2 = r1.f2268d
            b.f.a.a.h r2 = r2.f2266b
            boolean r2 = r2 instanceof b.f.a.a.b
            r3 = r33
            b.f.a.a.f r4 = r3.f2268d
            b.f.a.a.h r4 = r4.f2266b
            boolean r4 = r4 instanceof b.f.a.a.b
            if (r2 == 0) goto L_0x02da
            if (r4 != 0) goto L_0x02da
            r19 = r27
            r2 = 1
            r4 = 5
            r5 = 6
            goto L_0x02ef
        L_0x02da:
            if (r2 != 0) goto L_0x02e9
            if (r4 == 0) goto L_0x02e9
            r2 = r27
            r4 = 6
            goto L_0x02ee
        L_0x02e2:
            r1 = r32
            r3 = r33
            r0 = r5
            r12 = r8
            r11 = r9
        L_0x02e9:
            r2 = r27
            r19 = r2
            r4 = 5
        L_0x02ee:
            r5 = 5
        L_0x02ef:
            if (r16 == 0) goto L_0x02f3
            r4 = 6
            r5 = 6
        L_0x02f3:
            if (r13 != 0) goto L_0x02f7
            if (r19 != 0) goto L_0x02f9
        L_0x02f7:
            if (r16 == 0) goto L_0x0300
        L_0x02f9:
            int r1 = r32.b()
            r10.b(r15, r0, r1, r4)
        L_0x0300:
            if (r13 != 0) goto L_0x0304
            if (r2 != 0) goto L_0x0306
        L_0x0304:
            if (r16 == 0) goto L_0x030e
        L_0x0306:
            int r0 = r33.b()
            int r0 = -r0
            r10.c(r11, r12, r0, r5)
        L_0x030e:
            if (r27 == 0) goto L_0x0319
            r0 = r28
            r1 = r11
            r2 = 6
            r3 = 0
            r10.b(r15, r0, r3, r2)
            goto L_0x031e
        L_0x0319:
            r1 = r11
            goto L_0x031c
        L_0x031b:
            r1 = r9
        L_0x031c:
            r2 = 6
            r3 = 0
        L_0x031e:
            if (r27 == 0) goto L_0x0325
            r4 = r29
            r10.b(r4, r1, r3, r2)
        L_0x0325:
            return
        L_0x0326:
            r5 = r0
            r1 = r9
            r0 = r11
            r4 = r12
            r2 = 6
            r3 = 0
            r6 = 2
            if (r5 >= r6) goto L_0x0337
            if (r27 == 0) goto L_0x0337
            r10.b(r15, r0, r3, r2)
            r10.b(r4, r1, r3, r2)
        L_0x0337:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.h.a(b.f.a.e, boolean, b.f.a.i, b.f.a.i, b.f.a.a.h$a, boolean, b.f.a.a.f, b.f.a.a.f, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    private boolean t(int i2) {
        int i3 = i2 * 2;
        f[] fVarArr = this.D;
        if (!(fVarArr[i3].f2268d == null || fVarArr[i3].f2268d.f2268d == fVarArr[i3])) {
            int i4 = i3 + 1;
            return fVarArr[i4].f2268d != null && fVarArr[i4].f2268d.f2268d == fVarArr[i4];
        }
    }

    public boolean A() {
        f fVar = this.w;
        f fVar2 = fVar.f2268d;
        if (fVar2 != null && fVar2.f2268d == fVar) {
            return true;
        }
        f fVar3 = this.y;
        f fVar4 = fVar3.f2268d;
        return fVar4 != null && fVar4.f2268d == fVar3;
    }

    public boolean B() {
        return this.f2296g == 0 && this.J == 0.0f && this.l == 0 && this.m == 0 && this.F[1] == a.MATCH_CONSTRAINT;
    }

    public boolean C() {
        return this.f2295f == 0 && this.J == 0.0f && this.i == 0 && this.j == 0 && this.F[0] == a.MATCH_CONSTRAINT;
    }

    public void D() {
        this.v.j();
        this.w.j();
        this.x.j();
        this.y.j();
        this.z.j();
        this.A.j();
        this.B.j();
        this.C.j();
        this.G = null;
        this.u = 0.0f;
        this.H = 0;
        this.I = 0;
        this.J = 0.0f;
        this.K = -1;
        this.L = 0;
        this.M = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        float f2 = f2290a;
        this.aa = f2;
        this.ba = f2;
        a[] aVarArr = this.F;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.ca = null;
        this.da = 0;
        this.ea = 0;
        this.ga = null;
        this.ha = false;
        this.ia = false;
        this.ma = 0;
        this.na = 0;
        this.oa = false;
        this.pa = false;
        float[] fArr = this.qa;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2291b = -1;
        this.f2292c = -1;
        int[] iArr = this.t;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2295f = 0;
        this.f2296g = 0;
        this.k = 1.0f;
        this.n = 1.0f;
        this.j = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.i = 0;
        this.l = 0;
        this.q = -1;
        this.r = 1.0f;
        q qVar = this.f2293d;
        if (qVar != null) {
            qVar.d();
        }
        q qVar2 = this.f2294e;
        if (qVar2 != null) {
            qVar2.d();
        }
        this.s = null;
        this.ja = false;
        this.ka = false;
        this.la = false;
    }

    public void E() {
        h k2 = k();
        if (k2 == null || !(k2 instanceof i) || !((i) k()).N()) {
            int size = this.E.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.E.get(i2).j();
            }
        }
    }

    public void F() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.D[i2].d().d();
        }
    }

    public void G() {
    }

    public void H() {
        int i2 = this.L;
        int i3 = this.M;
        this.P = i2;
        this.Q = i3;
        this.R = (this.H + i2) - i2;
        this.S = (this.I + i3) - i3;
    }

    public void I() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.D[i2].d().g();
        }
    }

    public f a(f.c cVar) {
        switch (g.f2288a[cVar.ordinal()]) {
            case 1:
                return this.v;
            case 2:
                return this.w;
            case 3:
                return this.x;
            case 4:
                return this.y;
            case 5:
                return this.z;
            case 6:
                return this.C;
            case 7:
                return this.A;
            case 8:
                return this.B;
            case 9:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public void a(float f2) {
        this.aa = f2;
    }

    public void a(int i2) {
        n.a(i2, this);
    }

    public void a(int i2, int i3) {
        this.L = i2;
        this.H = i3 - i2;
        int i4 = this.H;
        int i5 = this.W;
        if (i4 < i5) {
            this.H = i5;
        }
    }

    public void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            a(i2, i3);
        } else if (i4 == 1) {
            e(i2, i3);
        }
        this.ka = true;
    }

    public void a(int i2, int i3, int i4, float f2) {
        this.f2295f = i2;
        this.i = i3;
        this.j = i4;
        this.k = f2;
        if (f2 < 1.0f && this.f2295f == 0) {
            this.f2295f = 2;
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.L = i2;
        this.M = i3;
        if (this.ea == 8) {
            this.H = 0;
            this.I = 0;
            return;
        }
        if (this.F[0] != a.FIXED || i8 >= (i6 = this.H)) {
            i6 = i8;
        }
        if (this.F[1] != a.FIXED || i9 >= (i7 = this.I)) {
            i7 = i9;
        }
        this.H = i6;
        this.I = i7;
        int i10 = this.I;
        int i11 = this.X;
        if (i10 < i11) {
            this.I = i11;
        }
        int i12 = this.H;
        int i13 = this.W;
        if (i12 < i13) {
            this.H = i13;
        }
        this.ka = true;
    }

    public void a(f.c cVar, h hVar, f.c cVar2, int i2, int i3) {
        a(cVar).a(hVar.a(cVar2), i2, i3, f.b.STRONG, 0, true);
    }

    public void a(a aVar) {
        this.F[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            o(this.Y);
        }
    }

    public void a(h hVar) {
        this.G = hVar;
    }

    public void a(h hVar, float f2, int i2) {
        f.c cVar = f.c.CENTER;
        a(cVar, hVar, cVar, i2, 0);
        this.u = f2;
    }

    public void a(c cVar) {
        this.v.a(cVar);
        this.w.a(cVar);
        this.x.a(cVar);
        this.y.a(cVar);
        this.z.a(cVar);
        this.C.a(cVar);
        this.A.a(cVar);
        this.B.a(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b0, code lost:
        if (r1 == -1) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0254 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.f.a.e r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            b.f.a.a.f r0 = r15.v
            b.f.a.i r21 = r14.a((java.lang.Object) r0)
            b.f.a.a.f r0 = r15.x
            b.f.a.i r10 = r14.a((java.lang.Object) r0)
            b.f.a.a.f r0 = r15.w
            b.f.a.i r6 = r14.a((java.lang.Object) r0)
            b.f.a.a.f r0 = r15.y
            b.f.a.i r4 = r14.a((java.lang.Object) r0)
            b.f.a.a.f r0 = r15.z
            b.f.a.i r3 = r14.a((java.lang.Object) r0)
            b.f.a.a.h r0 = r15.G
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00b0
            if (r0 == 0) goto L_0x0036
            b.f.a.a.h$a[] r0 = r0.F
            r0 = r0[r13]
            b.f.a.a.h$a r5 = b.f.a.a.h.a.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            b.f.a.a.h r5 = r15.G
            if (r5 == 0) goto L_0x0045
            b.f.a.a.h$a[] r5 = r5.F
            r5 = r5[r2]
            b.f.a.a.h$a r7 = b.f.a.a.h.a.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r7 = r15.t(r13)
            if (r7 == 0) goto L_0x0055
            b.f.a.a.h r7 = r15.G
            b.f.a.a.i r7 = (b.f.a.a.i) r7
            r7.a((b.f.a.a.h) r15, (int) r13)
            r7 = 1
            goto L_0x0059
        L_0x0055:
            boolean r7 = r38.z()
        L_0x0059:
            boolean r8 = r15.t(r2)
            if (r8 == 0) goto L_0x0068
            b.f.a.a.h r8 = r15.G
            b.f.a.a.i r8 = (b.f.a.a.i) r8
            r8.a((b.f.a.a.h) r15, (int) r2)
            r8 = 1
            goto L_0x006c
        L_0x0068:
            boolean r8 = r38.A()
        L_0x006c:
            if (r0 == 0) goto L_0x0089
            int r9 = r15.ea
            if (r9 == r1) goto L_0x0089
            b.f.a.a.f r9 = r15.v
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0089
            b.f.a.a.f r9 = r15.x
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x0089
            b.f.a.a.h r9 = r15.G
            b.f.a.a.f r9 = r9.x
            b.f.a.i r9 = r14.a((java.lang.Object) r9)
            r14.b(r9, r10, r13, r2)
        L_0x0089:
            if (r5 == 0) goto L_0x00aa
            int r9 = r15.ea
            if (r9 == r1) goto L_0x00aa
            b.f.a.a.f r9 = r15.w
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x00aa
            b.f.a.a.f r9 = r15.y
            b.f.a.a.f r9 = r9.f2268d
            if (r9 != 0) goto L_0x00aa
            b.f.a.a.f r9 = r15.z
            if (r9 != 0) goto L_0x00aa
            b.f.a.a.h r9 = r15.G
            b.f.a.a.f r9 = r9.y
            b.f.a.i r9 = r14.a((java.lang.Object) r9)
            r14.b(r9, r4, r13, r2)
        L_0x00aa:
            r12 = r5
            r16 = r7
            r22 = r8
            goto L_0x00b6
        L_0x00b0:
            r0 = 0
            r12 = 0
            r16 = 0
            r22 = 0
        L_0x00b6:
            int r5 = r15.H
            int r7 = r15.W
            if (r5 >= r7) goto L_0x00bd
            r5 = r7
        L_0x00bd:
            int r7 = r15.I
            int r8 = r15.X
            if (r7 >= r8) goto L_0x00c4
            r7 = r8
        L_0x00c4:
            b.f.a.a.h$a[] r8 = r15.F
            r8 = r8[r13]
            b.f.a.a.h$a r9 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x00ce
            r8 = 1
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            b.f.a.a.h$a[] r9 = r15.F
            r9 = r9[r2]
            b.f.a.a.h$a r11 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r9 == r11) goto L_0x00d9
            r9 = 1
            goto L_0x00da
        L_0x00d9:
            r9 = 0
        L_0x00da:
            int r11 = r15.K
            r15.q = r11
            float r11 = r15.J
            r15.r = r11
            int r2 = r15.f2295f
            int r13 = r15.f2296g
            r18 = 0
            r19 = 4
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0195
            int r11 = r15.ea
            r1 = 8
            if (r11 == r1) goto L_0x0195
            b.f.a.a.h$a[] r1 = r15.F
            r11 = 0
            r1 = r1[r11]
            b.f.a.a.h$a r11 = b.f.a.a.h.a.MATCH_CONSTRAINT
            r23 = r3
            if (r1 != r11) goto L_0x0102
            if (r2 != 0) goto L_0x0102
            r2 = 3
        L_0x0102:
            b.f.a.a.h$a[] r1 = r15.F
            r11 = 1
            r1 = r1[r11]
            b.f.a.a.h$a r11 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x010e
            if (r13 != 0) goto L_0x010e
            r13 = 3
        L_0x010e:
            b.f.a.a.h$a[] r1 = r15.F
            r11 = 0
            r3 = r1[r11]
            b.f.a.a.h$a r11 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0126
            r3 = 1
            r1 = r1[r3]
            if (r1 != r11) goto L_0x0126
            r1 = 3
            if (r2 != r1) goto L_0x0127
            if (r13 != r1) goto L_0x0127
            r15.a((boolean) r0, (boolean) r12, (boolean) r8, (boolean) r9)
            goto L_0x018a
        L_0x0126:
            r1 = 3
        L_0x0127:
            b.f.a.a.h$a[] r3 = r15.F
            r8 = 0
            r9 = r3[r8]
            b.f.a.a.h$a r11 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x014f
            if (r2 != r1) goto L_0x014f
            r15.q = r8
            float r1 = r15.r
            int r5 = r15.I
            float r5 = (float) r5
            float r1 = r1 * r5
            int r1 = (int) r1
            r8 = 1
            r3 = r3[r8]
            if (r3 == r11) goto L_0x014a
            r28 = r1
            r29 = r7
            r26 = r13
            r25 = 4
            goto L_0x019f
        L_0x014a:
            r28 = r1
            r25 = r2
            goto L_0x018e
        L_0x014f:
            r8 = 1
            b.f.a.a.h$a[] r1 = r15.F
            r1 = r1[r8]
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x018a
            r1 = 3
            if (r13 != r1) goto L_0x018a
            r15.q = r8
            int r1 = r15.K
            r3 = -1
            if (r1 != r3) goto L_0x0169
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r15.r
            float r1 = r1 / r3
            r15.r = r1
        L_0x0169:
            float r1 = r15.r
            int r3 = r15.H
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            b.f.a.a.h$a[] r3 = r15.F
            r7 = 0
            r3 = r3[r7]
            b.f.a.a.h$a r7 = b.f.a.a.h.a.MATCH_CONSTRAINT
            if (r3 == r7) goto L_0x0183
            r29 = r1
            r25 = r2
            r28 = r5
            r26 = 4
            goto L_0x019f
        L_0x0183:
            r29 = r1
            r25 = r2
            r28 = r5
            goto L_0x0190
        L_0x018a:
            r25 = r2
            r28 = r5
        L_0x018e:
            r29 = r7
        L_0x0190:
            r26 = r13
            r27 = 1
            goto L_0x01a1
        L_0x0195:
            r23 = r3
            r25 = r2
            r28 = r5
            r29 = r7
            r26 = r13
        L_0x019f:
            r27 = 0
        L_0x01a1:
            int[] r1 = r15.f2297h
            r2 = 0
            r1[r2] = r25
            r2 = 1
            r1[r2] = r26
            if (r27 == 0) goto L_0x01b7
            int r1 = r15.q
            if (r1 == 0) goto L_0x01b3
            r2 = -1
            if (r1 != r2) goto L_0x01b8
            goto L_0x01b4
        L_0x01b3:
            r2 = -1
        L_0x01b4:
            r24 = 1
            goto L_0x01ba
        L_0x01b7:
            r2 = -1
        L_0x01b8:
            r24 = 0
        L_0x01ba:
            b.f.a.a.h$a[] r1 = r15.F
            r3 = 0
            r1 = r1[r3]
            b.f.a.a.h$a r3 = b.f.a.a.h.a.WRAP_CONTENT
            if (r1 != r3) goto L_0x01ca
            boolean r1 = r15 instanceof b.f.a.a.i
            if (r1 == 0) goto L_0x01ca
            r30 = 1
            goto L_0x01cc
        L_0x01ca:
            r30 = 0
        L_0x01cc:
            b.f.a.a.f r1 = r15.C
            boolean r1 = r1.i()
            r3 = 1
            r31 = r1 ^ 1
            int r1 = r15.f2291b
            r13 = 2
            r32 = 0
            if (r1 == r13) goto L_0x0243
            b.f.a.a.h r1 = r15.G
            if (r1 == 0) goto L_0x01e9
            b.f.a.a.f r1 = r1.x
            b.f.a.i r1 = r14.a((java.lang.Object) r1)
            r20 = r1
            goto L_0x01eb
        L_0x01e9:
            r20 = r32
        L_0x01eb:
            b.f.a.a.h r1 = r15.G
            if (r1 == 0) goto L_0x01f8
            b.f.a.a.f r1 = r1.v
            b.f.a.i r1 = r14.a((java.lang.Object) r1)
            r33 = r1
            goto L_0x01fa
        L_0x01f8:
            r33 = r32
        L_0x01fa:
            b.f.a.a.h$a[] r1 = r15.F
            r17 = 0
            r5 = r1[r17]
            b.f.a.a.f r7 = r15.v
            b.f.a.a.f r8 = r15.x
            int r9 = r15.L
            int r11 = r15.W
            int[] r1 = r15.t
            r1 = r1[r17]
            r34 = r12
            r12 = r1
            float r1 = r15.aa
            r13 = r1
            int r1 = r15.i
            r17 = r1
            int r1 = r15.j
            r18 = r1
            float r1 = r15.k
            r19 = r1
            r35 = r0
            r0 = r38
            r1 = r39
            r3 = -1
            r2 = r35
            r36 = r23
            r3 = r33
            r23 = r4
            r4 = r20
            r37 = r6
            r6 = r30
            r30 = r10
            r10 = r28
            r14 = r24
            r15 = r16
            r16 = r25
            r20 = r31
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x024d
        L_0x0243:
            r37 = r6
            r30 = r10
            r34 = r12
            r36 = r23
            r23 = r4
        L_0x024d:
            r15 = r38
            int r0 = r15.f2292c
            r1 = 2
            if (r0 != r1) goto L_0x0255
            return
        L_0x0255:
            b.f.a.a.h$a[] r0 = r15.F
            r14 = 1
            r0 = r0[r14]
            b.f.a.a.h$a r1 = b.f.a.a.h.a.WRAP_CONTENT
            if (r0 != r1) goto L_0x0264
            boolean r0 = r15 instanceof b.f.a.a.i
            if (r0 == 0) goto L_0x0264
            r6 = 1
            goto L_0x0265
        L_0x0264:
            r6 = 0
        L_0x0265:
            if (r27 == 0) goto L_0x0271
            int r0 = r15.q
            if (r0 == r14) goto L_0x026e
            r1 = -1
            if (r0 != r1) goto L_0x0271
        L_0x026e:
            r16 = 1
            goto L_0x0273
        L_0x0271:
            r16 = 0
        L_0x0273:
            int r0 = r15.V
            if (r0 <= 0) goto L_0x02ac
            b.f.a.a.f r0 = r15.z
            b.f.a.a.p r0 = r0.d()
            int r0 = r0.f2321b
            if (r0 != r14) goto L_0x028d
            b.f.a.a.f r0 = r15.z
            b.f.a.a.p r0 = r0.d()
            r10 = r39
            r0.a((b.f.a.e) r10)
            goto L_0x02ae
        L_0x028d:
            r10 = r39
            int r0 = r38.c()
            r1 = 6
            r2 = r36
            r4 = r37
            r10.a((b.f.a.i) r2, (b.f.a.i) r4, (int) r0, (int) r1)
            b.f.a.a.f r0 = r15.z
            b.f.a.a.f r0 = r0.f2268d
            if (r0 == 0) goto L_0x02b0
            b.f.a.i r0 = r10.a((java.lang.Object) r0)
            r3 = 0
            r10.a((b.f.a.i) r2, (b.f.a.i) r0, (int) r3, (int) r1)
            r20 = 0
            goto L_0x02b2
        L_0x02ac:
            r10 = r39
        L_0x02ae:
            r4 = r37
        L_0x02b0:
            r20 = r31
        L_0x02b2:
            b.f.a.a.h r0 = r15.G
            if (r0 == 0) goto L_0x02bf
            b.f.a.a.f r0 = r0.y
            b.f.a.i r0 = r10.a((java.lang.Object) r0)
            r24 = r0
            goto L_0x02c1
        L_0x02bf:
            r24 = r32
        L_0x02c1:
            b.f.a.a.h r0 = r15.G
            if (r0 == 0) goto L_0x02cd
            b.f.a.a.f r0 = r0.w
            b.f.a.i r0 = r10.a((java.lang.Object) r0)
            r3 = r0
            goto L_0x02cf
        L_0x02cd:
            r3 = r32
        L_0x02cf:
            b.f.a.a.h$a[] r0 = r15.F
            r5 = r0[r14]
            b.f.a.a.f r7 = r15.w
            b.f.a.a.f r8 = r15.y
            int r9 = r15.M
            int r11 = r15.X
            int[] r0 = r15.t
            r12 = r0[r14]
            float r13 = r15.ba
            int r0 = r15.l
            r17 = r0
            int r0 = r15.m
            r18 = r0
            float r0 = r15.n
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r34
            r25 = r4
            r4 = r24
            r10 = r29
            r14 = r16
            r15 = r22
            r16 = r26
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r27 == 0) goto L_0x032a
            r6 = 6
            r7 = r38
            int r0 = r7.q
            r1 = 1
            if (r0 != r1) goto L_0x0319
            float r5 = r7.r
            r0 = r39
            r1 = r23
            r2 = r25
            r3 = r30
            r4 = r21
            goto L_0x0326
        L_0x0319:
            float r5 = r7.r
            r6 = 6
            r0 = r39
            r1 = r30
            r2 = r21
            r3 = r23
            r4 = r25
        L_0x0326:
            r0.a((b.f.a.i) r1, (b.f.a.i) r2, (b.f.a.i) r3, (b.f.a.i) r4, (float) r5, (int) r6)
            goto L_0x032c
        L_0x032a:
            r7 = r38
        L_0x032c:
            b.f.a.a.f r0 = r7.C
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0354
            b.f.a.a.f r0 = r7.C
            b.f.a.a.f r0 = r0.g()
            b.f.a.a.h r0 = r0.c()
            float r1 = r7.u
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            b.f.a.a.f r2 = r7.C
            int r2 = r2.b()
            r3 = r39
            r3.a((b.f.a.a.h) r7, (b.f.a.a.h) r0, (float) r1, (int) r2)
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.h.a(b.f.a.e):void");
    }

    public void a(Object obj) {
        this.ca = obj;
    }

    public void a(String str) {
        this.fa = str;
    }

    public void a(boolean z2) {
        this.p = z2;
    }

    public void a(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.q == -1) {
            if (z4 && !z5) {
                this.q = 0;
            } else if (!z4 && z5) {
                this.q = 1;
                if (this.K == -1) {
                    this.r = 1.0f / this.r;
                }
            }
        }
        if (this.q == 0 && (!this.w.i() || !this.y.i())) {
            this.q = 1;
        } else if (this.q == 1 && (!this.v.i() || !this.x.i())) {
            this.q = 0;
        }
        if (this.q == -1 && (!this.w.i() || !this.y.i() || !this.v.i() || !this.x.i())) {
            if (this.w.i() && this.y.i()) {
                this.q = 0;
            } else if (this.v.i() && this.x.i()) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1) {
            if (z2 && !z3) {
                this.q = 0;
            } else if (!z2 && z3) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1) {
            if (this.i > 0 && this.l == 0) {
                this.q = 0;
            } else if (this.i == 0 && this.l > 0) {
                this.r = 1.0f / this.r;
                this.q = 1;
            }
        }
        if (this.q == -1 && z2 && z3) {
            this.r = 1.0f / this.r;
            this.q = 1;
        }
    }

    public boolean a() {
        return this.ea != 8;
    }

    public float b(int i2) {
        if (i2 == 0) {
            return this.aa;
        }
        if (i2 == 1) {
            return this.ba;
        }
        return -1.0f;
    }

    public ArrayList<f> b() {
        return this.E;
    }

    public void b(float f2) {
        this.qa[0] = f2;
    }

    public void b(int i2, int i3) {
        this.T = i2;
        this.U = i3;
    }

    public void b(int i2, int i3, int i4, float f2) {
        this.f2296g = i2;
        this.l = i3;
        this.m = i4;
        this.n = f2;
        if (f2 < 1.0f && this.f2296g == 0) {
            this.f2296g = 2;
        }
    }

    public void b(a aVar) {
        this.F[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            g(this.Z);
        }
    }

    public void b(e eVar) {
        eVar.a((Object) this.v);
        eVar.a((Object) this.w);
        eVar.a((Object) this.x);
        eVar.a((Object) this.y);
        if (this.V > 0) {
            eVar.a((Object) this.z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.J = r9
            r8.K = r1
        L_0x008d:
            return
        L_0x008e:
            r8.J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.h.b(java.lang.String):void");
    }

    public void b(boolean z2) {
        this.o = z2;
    }

    public int c() {
        return this.V;
    }

    public a c(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return q();
        }
        return null;
    }

    public void c(float f2) {
        this.ba = f2;
    }

    public void c(int i2, int i3) {
        this.L = i2;
        this.M = i3;
    }

    public void c(e eVar) {
        int b2 = eVar.b((Object) this.v);
        int b3 = eVar.b((Object) this.w);
        int b4 = eVar.b((Object) this.x);
        int b5 = eVar.b((Object) this.y);
        int i2 = b5 - b3;
        if (b4 - b2 < 0 || i2 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        a(b2, b3, b4, b5);
    }

    public int d() {
        return w() + this.I;
    }

    public int d(int i2) {
        if (i2 == 0) {
            return s();
        }
        if (i2 == 1) {
            return i();
        }
        return 0;
    }

    public void d(float f2) {
        this.qa[1] = f2;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2, int i3) {
        if (i3 == 0) {
            this.N = i2;
        } else if (i3 == 1) {
            this.O = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public int e(int i2) {
        if (i2 == 0) {
            return this.N;
        }
        if (i2 == 1) {
            return this.O;
        }
        return 0;
    }

    public Object e() {
        return this.ca;
    }

    public void e(int i2, int i3) {
        this.M = i2;
        this.I = i3 - i2;
        int i4 = this.I;
        int i5 = this.X;
        if (i4 < i5) {
            this.I = i5;
        }
    }

    public String f() {
        return this.fa;
    }

    public void f(int i2) {
        this.V = i2;
    }

    public int g() {
        return this.P + this.T;
    }

    public void g(int i2) {
        this.I = i2;
        int i3 = this.I;
        int i4 = this.X;
        if (i3 < i4) {
            this.I = i4;
        }
    }

    public int h() {
        return this.Q + this.U;
    }

    public void h(int i2) {
        this.ma = i2;
    }

    public int i() {
        if (this.ea == 8) {
            return 0;
        }
        return this.I;
    }

    public void i(int i2) {
        this.t[1] = i2;
    }

    public a j() {
        return this.F[0];
    }

    public void j(int i2) {
        this.t[0] = i2;
    }

    public h k() {
        return this.G;
    }

    public void k(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.X = i2;
    }

    public q l() {
        if (this.f2294e == null) {
            this.f2294e = new q();
        }
        return this.f2294e;
    }

    public void l(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.W = i2;
    }

    public q m() {
        if (this.f2293d == null) {
            this.f2293d = new q();
        }
        return this.f2293d;
    }

    public void m(int i2) {
        this.na = i2;
    }

    public int n() {
        return v() + this.H;
    }

    public void n(int i2) {
        this.ea = i2;
    }

    /* access modifiers changed from: protected */
    public int o() {
        return this.L + this.T;
    }

    public void o(int i2) {
        this.H = i2;
        int i3 = this.H;
        int i4 = this.W;
        if (i3 < i4) {
            this.H = i4;
        }
    }

    /* access modifiers changed from: protected */
    public int p() {
        return this.M + this.U;
    }

    public void p(int i2) {
        this.Z = i2;
    }

    public a q() {
        return this.F[1];
    }

    public void q(int i2) {
        this.Y = i2;
    }

    public int r() {
        return this.ea;
    }

    public void r(int i2) {
        this.L = i2;
    }

    public int s() {
        if (this.ea == 8) {
            return 0;
        }
        return this.H;
    }

    public void s(int i2) {
        this.M = i2;
    }

    public int t() {
        return this.Z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.ga;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.ga + " ";
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.fa != null) {
            str3 = "id: " + this.fa + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.L);
        sb.append(", ");
        sb.append(this.M);
        sb.append(") - (");
        sb.append(this.H);
        sb.append(" x ");
        sb.append(this.I);
        sb.append(") wrap: (");
        sb.append(this.Y);
        sb.append(" x ");
        sb.append(this.Z);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.Y;
    }

    public int v() {
        return this.L;
    }

    public int w() {
        return this.M;
    }

    public boolean x() {
        return this.V > 0;
    }

    public boolean y() {
        return this.v.d().f2321b == 1 && this.x.d().f2321b == 1 && this.w.d().f2321b == 1 && this.y.d().f2321b == 1;
    }

    public boolean z() {
        f fVar = this.v;
        f fVar2 = fVar.f2268d;
        if (fVar2 != null && fVar2.f2268d == fVar) {
            return true;
        }
        f fVar3 = this.x;
        f fVar4 = fVar3.f2268d;
        return fVar4 != null && fVar4.f2268d == fVar3;
    }
}
