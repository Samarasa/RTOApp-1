package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b.f.a.a.h;
import b.f.a.a.i;
import b.f.a.a.l;
import b.f.a.f;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f778a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<b> f779b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<h> f780c = new ArrayList<>(100);

    /* renamed from: d  reason: collision with root package name */
    i f781d = new i();

    /* renamed from: e  reason: collision with root package name */
    private int f782e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f783f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f784g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f785h = Integer.MAX_VALUE;
    private boolean i = true;
    private int j = 7;
    private d k = null;
    private int l = -1;
    private HashMap<String, Integer> m = new HashMap<>();
    private int n = -1;
    private int o = -1;
    int p = -1;
    int q = -1;
    int r = 0;
    int s = 0;
    private f t;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        float C = 0.0f;
        int D = 1;
        public float E = -1.0f;
        public float F = -1.0f;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public float O = 1.0f;
        public float P = 1.0f;
        public int Q = -1;
        public int R = -1;
        public int S = -1;
        public boolean T = false;
        public boolean U = false;
        boolean V = true;
        boolean W = true;
        boolean X = false;
        boolean Y = false;
        boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f786a = -1;
        boolean aa = false;

        /* renamed from: b  reason: collision with root package name */
        public int f787b = -1;
        int ba = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f788c = -1.0f;
        int ca = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f789d = -1;
        int da = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f790e = -1;
        int ea = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f791f = -1;
        int fa = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f792g = -1;
        int ga = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f793h = -1;
        float ha = 0.5f;
        public int i = -1;
        int ia;
        public int j = -1;
        int ja;
        public int k = -1;
        float ka;
        public int l = -1;
        h la = new h();
        public int m = -1;
        public boolean ma = false;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        private static class C0012a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f794a = new SparseIntArray();

            static {
                f794a.append(i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f794a.append(i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f794a.append(i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f794a.append(i.ConstraintLayout_Layout_android_orientation, 1);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f794a.append(i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f794a.append(i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f794a.append(i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f794a.append(i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0214, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f786a = r0
                r9.f787b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f788c = r1
                r9.f789d = r0
                r9.f790e = r0
                r9.f791f = r0
                r9.f792g = r0
                r9.f793h = r0
                r9.i = r0
                r9.j = r0
                r9.k = r0
                r9.l = r0
                r9.m = r0
                r2 = 0
                r9.n = r2
                r3 = 0
                r9.o = r3
                r9.p = r0
                r9.q = r0
                r9.r = r0
                r9.s = r0
                r9.t = r0
                r9.u = r0
                r9.v = r0
                r9.w = r0
                r9.x = r0
                r9.y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.z = r4
                r9.A = r4
                r5 = 0
                r9.B = r5
                r9.C = r3
                r5 = 1
                r9.D = r5
                r9.E = r1
                r9.F = r1
                r9.G = r2
                r9.H = r2
                r9.I = r2
                r9.J = r2
                r9.K = r2
                r9.L = r2
                r9.M = r2
                r9.N = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.O = r1
                r9.P = r1
                r9.Q = r0
                r9.R = r0
                r9.S = r0
                r9.T = r2
                r9.U = r2
                r9.V = r5
                r9.W = r5
                r9.X = r2
                r9.Y = r2
                r9.Z = r2
                r9.aa = r2
                r9.ba = r0
                r9.ca = r0
                r9.da = r0
                r9.ea = r0
                r9.fa = r0
                r9.ga = r0
                r9.ha = r4
                b.f.a.a.h r1 = new b.f.a.a.h
                r1.<init>()
                r9.la = r1
                r9.ma = r2
                int[] r1 = androidx.constraintlayout.widget.i.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = 0
            L_0x009a:
                if (r1 >= r11) goto L_0x03d9
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.a.C0012a.f794a
                int r6 = r6.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = -2
                switch(r6) {
                    case 0: goto L_0x03d5;
                    case 1: goto L_0x03cd;
                    case 2: goto L_0x03ba;
                    case 3: goto L_0x03b1;
                    case 4: goto L_0x039a;
                    case 5: goto L_0x0391;
                    case 6: goto L_0x0388;
                    case 7: goto L_0x037f;
                    case 8: goto L_0x036c;
                    case 9: goto L_0x0359;
                    case 10: goto L_0x0345;
                    case 11: goto L_0x0331;
                    case 12: goto L_0x031d;
                    case 13: goto L_0x0309;
                    case 14: goto L_0x02f5;
                    case 15: goto L_0x02e1;
                    case 16: goto L_0x02cd;
                    case 17: goto L_0x02b9;
                    case 18: goto L_0x02a5;
                    case 19: goto L_0x0291;
                    case 20: goto L_0x027d;
                    case 21: goto L_0x0273;
                    case 22: goto L_0x0269;
                    case 23: goto L_0x025f;
                    case 24: goto L_0x0255;
                    case 25: goto L_0x024b;
                    case 26: goto L_0x0241;
                    case 27: goto L_0x0237;
                    case 28: goto L_0x022d;
                    case 29: goto L_0x0223;
                    case 30: goto L_0x0219;
                    case 31: goto L_0x0208;
                    case 32: goto L_0x01fb;
                    case 33: goto L_0x01e4;
                    case 34: goto L_0x01cd;
                    case 35: goto L_0x01bf;
                    case 36: goto L_0x01a8;
                    case 37: goto L_0x0191;
                    case 38: goto L_0x0183;
                    case 39: goto L_0x03d5;
                    case 40: goto L_0x03d5;
                    case 41: goto L_0x03d5;
                    case 42: goto L_0x03d5;
                    case 43: goto L_0x00ac;
                    case 44: goto L_0x00e6;
                    case 45: goto L_0x00dc;
                    case 46: goto L_0x00d2;
                    case 47: goto L_0x00ca;
                    case 48: goto L_0x00c2;
                    case 49: goto L_0x00b8;
                    case 50: goto L_0x00ae;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                goto L_0x03d5
            L_0x00ae:
                int r6 = r9.R
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.R = r4
                goto L_0x03d5
            L_0x00b8:
                int r6 = r9.Q
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.Q = r4
                goto L_0x03d5
            L_0x00c2:
                int r4 = r10.getInt(r4, r2)
                r9.H = r4
                goto L_0x03d5
            L_0x00ca:
                int r4 = r10.getInt(r4, r2)
                r9.G = r4
                goto L_0x03d5
            L_0x00d2:
                float r6 = r9.F
                float r4 = r10.getFloat(r4, r6)
                r9.F = r4
                goto L_0x03d5
            L_0x00dc:
                float r6 = r9.E
                float r4 = r10.getFloat(r4, r6)
                r9.E = r4
                goto L_0x03d5
            L_0x00e6:
                java.lang.String r4 = r10.getString(r4)
                r9.B = r4
                r4 = 2143289344(0x7fc00000, float:NaN)
                r9.C = r4
                r9.D = r0
                java.lang.String r4 = r9.B
                if (r4 == 0) goto L_0x03d5
                int r4 = r4.length()
                java.lang.String r6 = r9.B
                r7 = 44
                int r6 = r6.indexOf(r7)
                if (r6 <= 0) goto L_0x0126
                int r7 = r4 + -1
                if (r6 >= r7) goto L_0x0126
                java.lang.String r7 = r9.B
                java.lang.String r7 = r7.substring(r2, r6)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0119
                r9.D = r2
                goto L_0x0123
            L_0x0119:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0123
                r9.D = r5
            L_0x0123:
                int r6 = r6 + 1
                goto L_0x0127
            L_0x0126:
                r6 = 0
            L_0x0127:
                java.lang.String r7 = r9.B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0172
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0172
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r6, r7)
                java.lang.String r6 = r9.B
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03d5
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x03d5
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03d5 }
                float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03d5 }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03d5
                int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03d5
                int r7 = r9.D     // Catch:{ NumberFormatException -> 0x03d5 }
                if (r7 != r5) goto L_0x016c
                float r6 = r6 / r4
                float r4 = java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03d5 }
            L_0x0168:
                r9.C = r4     // Catch:{ NumberFormatException -> 0x03d5 }
                goto L_0x03d5
            L_0x016c:
                float r4 = r4 / r6
                float r4 = java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03d5 }
                goto L_0x0168
            L_0x0172:
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r6)
                int r6 = r4.length()
                if (r6 <= 0) goto L_0x03d5
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03d5 }
                goto L_0x0168
            L_0x0183:
                float r6 = r9.P
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.P = r4
                goto L_0x03d5
            L_0x0191:
                int r6 = r9.N     // Catch:{ Exception -> 0x019b }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x019b }
                r9.N = r6     // Catch:{ Exception -> 0x019b }
                goto L_0x03d5
            L_0x019b:
                int r6 = r9.N
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03d5
                r9.N = r8
                goto L_0x03d5
            L_0x01a8:
                int r6 = r9.L     // Catch:{ Exception -> 0x01b2 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01b2 }
                r9.L = r6     // Catch:{ Exception -> 0x01b2 }
                goto L_0x03d5
            L_0x01b2:
                int r6 = r9.L
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03d5
                r9.L = r8
                goto L_0x03d5
            L_0x01bf:
                float r6 = r9.O
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.O = r4
                goto L_0x03d5
            L_0x01cd:
                int r6 = r9.M     // Catch:{ Exception -> 0x01d7 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01d7 }
                r9.M = r6     // Catch:{ Exception -> 0x01d7 }
                goto L_0x03d5
            L_0x01d7:
                int r6 = r9.M
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03d5
                r9.M = r8
                goto L_0x03d5
            L_0x01e4:
                int r6 = r9.K     // Catch:{ Exception -> 0x01ee }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01ee }
                r9.K = r6     // Catch:{ Exception -> 0x01ee }
                goto L_0x03d5
            L_0x01ee:
                int r6 = r9.K
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03d5
                r9.K = r8
                goto L_0x03d5
            L_0x01fb:
                int r4 = r10.getInt(r4, r2)
                r9.J = r4
                int r4 = r9.J
                if (r4 != r5) goto L_0x03d5
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0214
            L_0x0208:
                int r4 = r10.getInt(r4, r2)
                r9.I = r4
                int r4 = r9.I
                if (r4 != r5) goto L_0x03d5
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0214:
                android.util.Log.e(r7, r4)
                goto L_0x03d5
            L_0x0219:
                float r6 = r9.A
                float r4 = r10.getFloat(r4, r6)
                r9.A = r4
                goto L_0x03d5
            L_0x0223:
                float r6 = r9.z
                float r4 = r10.getFloat(r4, r6)
                r9.z = r4
                goto L_0x03d5
            L_0x022d:
                boolean r6 = r9.U
                boolean r4 = r10.getBoolean(r4, r6)
                r9.U = r4
                goto L_0x03d5
            L_0x0237:
                boolean r6 = r9.T
                boolean r4 = r10.getBoolean(r4, r6)
                r9.T = r4
                goto L_0x03d5
            L_0x0241:
                int r6 = r9.y
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.y = r4
                goto L_0x03d5
            L_0x024b:
                int r6 = r9.x
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.x = r4
                goto L_0x03d5
            L_0x0255:
                int r6 = r9.w
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.w = r4
                goto L_0x03d5
            L_0x025f:
                int r6 = r9.v
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.v = r4
                goto L_0x03d5
            L_0x0269:
                int r6 = r9.u
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.u = r4
                goto L_0x03d5
            L_0x0273:
                int r6 = r9.t
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.t = r4
                goto L_0x03d5
            L_0x027d:
                int r6 = r9.s
                int r6 = r10.getResourceId(r4, r6)
                r9.s = r6
                int r6 = r9.s
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.s = r4
                goto L_0x03d5
            L_0x0291:
                int r6 = r9.r
                int r6 = r10.getResourceId(r4, r6)
                r9.r = r6
                int r6 = r9.r
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.r = r4
                goto L_0x03d5
            L_0x02a5:
                int r6 = r9.q
                int r6 = r10.getResourceId(r4, r6)
                r9.q = r6
                int r6 = r9.q
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.q = r4
                goto L_0x03d5
            L_0x02b9:
                int r6 = r9.p
                int r6 = r10.getResourceId(r4, r6)
                r9.p = r6
                int r6 = r9.p
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.p = r4
                goto L_0x03d5
            L_0x02cd:
                int r6 = r9.l
                int r6 = r10.getResourceId(r4, r6)
                r9.l = r6
                int r6 = r9.l
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.l = r4
                goto L_0x03d5
            L_0x02e1:
                int r6 = r9.k
                int r6 = r10.getResourceId(r4, r6)
                r9.k = r6
                int r6 = r9.k
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.k = r4
                goto L_0x03d5
            L_0x02f5:
                int r6 = r9.j
                int r6 = r10.getResourceId(r4, r6)
                r9.j = r6
                int r6 = r9.j
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.j = r4
                goto L_0x03d5
            L_0x0309:
                int r6 = r9.i
                int r6 = r10.getResourceId(r4, r6)
                r9.i = r6
                int r6 = r9.i
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.i = r4
                goto L_0x03d5
            L_0x031d:
                int r6 = r9.f793h
                int r6 = r10.getResourceId(r4, r6)
                r9.f793h = r6
                int r6 = r9.f793h
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.f793h = r4
                goto L_0x03d5
            L_0x0331:
                int r6 = r9.f792g
                int r6 = r10.getResourceId(r4, r6)
                r9.f792g = r6
                int r6 = r9.f792g
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.f792g = r4
                goto L_0x03d5
            L_0x0345:
                int r6 = r9.f791f
                int r6 = r10.getResourceId(r4, r6)
                r9.f791f = r6
                int r6 = r9.f791f
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.f791f = r4
                goto L_0x03d5
            L_0x0359:
                int r6 = r9.f790e
                int r6 = r10.getResourceId(r4, r6)
                r9.f790e = r6
                int r6 = r9.f790e
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.f790e = r4
                goto L_0x03d5
            L_0x036c:
                int r6 = r9.f789d
                int r6 = r10.getResourceId(r4, r6)
                r9.f789d = r6
                int r6 = r9.f789d
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.f789d = r4
                goto L_0x03d5
            L_0x037f:
                float r6 = r9.f788c
                float r4 = r10.getFloat(r4, r6)
                r9.f788c = r4
                goto L_0x03d5
            L_0x0388:
                int r6 = r9.f787b
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f787b = r4
                goto L_0x03d5
            L_0x0391:
                int r6 = r9.f786a
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f786a = r4
                goto L_0x03d5
            L_0x039a:
                float r6 = r9.o
                float r4 = r10.getFloat(r4, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r6
                r9.o = r4
                float r4 = r9.o
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03d5
                float r4 = r6 - r4
                float r4 = r4 % r6
                r9.o = r4
                goto L_0x03d5
            L_0x03b1:
                int r6 = r9.n
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.n = r4
                goto L_0x03d5
            L_0x03ba:
                int r6 = r9.m
                int r6 = r10.getResourceId(r4, r6)
                r9.m = r6
                int r6 = r9.m
                if (r6 != r0) goto L_0x03d5
                int r4 = r10.getInt(r4, r0)
                r9.m = r4
                goto L_0x03d5
            L_0x03cd:
                int r6 = r9.S
                int r4 = r10.getInt(r4, r6)
                r9.S = r4
            L_0x03d5:
                int r1 = r1 + 1
                goto L_0x009a
            L_0x03d9:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (this.width == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (this.height == -2 && this.U) {
                this.W = false;
                this.J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.V = false;
                if (this.width == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.W = false;
                if (this.height == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.f788c != -1.0f || this.f786a != -1 || this.f787b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.la instanceof l)) {
                    this.la = new l();
                }
                ((l) this.la).v(this.S);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.da = r7
                r6.ea = r7
                r6.ba = r7
                r6.ca = r7
                r6.fa = r7
                r6.ga = r7
                int r2 = r6.t
                r6.fa = r2
                int r2 = r6.v
                r6.ga = r2
                float r2 = r6.z
                r6.ha = r2
                int r2 = r6.f786a
                r6.ia = r2
                int r2 = r6.f787b
                r6.ja = r2
                float r2 = r6.f788c
                r6.ka = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.p
                if (r2 == r7) goto L_0x0041
                r6.da = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.q
                if (r2 == r7) goto L_0x0048
                r6.ea = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.r
                if (r2 == r7) goto L_0x004f
                r6.ca = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.s
                if (r2 == r7) goto L_0x0056
                r6.ba = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.x
                if (r2 == r7) goto L_0x005c
                r6.ga = r2
            L_0x005c:
                int r2 = r6.y
                if (r2 == r7) goto L_0x0062
                r6.fa = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.z
                float r3 = r2 - r3
                r6.ha = r3
            L_0x006c:
                boolean r3 = r6.Y
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.S
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.f788c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.ka = r2
                r6.ia = r7
                r6.ja = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.f786a
                if (r2 == r7) goto L_0x008f
                r6.ja = r2
                r6.ia = r7
            L_0x008c:
                r6.ka = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.f787b
                if (r2 == r7) goto L_0x00bc
                r6.ia = r2
                r6.ja = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.p
                if (r2 == r7) goto L_0x009e
                r6.ca = r2
            L_0x009e:
                int r2 = r6.q
                if (r2 == r7) goto L_0x00a4
                r6.ba = r2
            L_0x00a4:
                int r2 = r6.r
                if (r2 == r7) goto L_0x00aa
                r6.da = r2
            L_0x00aa:
                int r2 = r6.s
                if (r2 == r7) goto L_0x00b0
                r6.ea = r2
            L_0x00b0:
                int r2 = r6.x
                if (r2 == r7) goto L_0x00b6
                r6.fa = r2
            L_0x00b6:
                int r2 = r6.y
                if (r2 == r7) goto L_0x00bc
                r6.ga = r2
            L_0x00bc:
                int r2 = r6.r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f791f
                if (r2 == r7) goto L_0x00db
                r6.da = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.f792g
                if (r2 == r7) goto L_0x00e8
                r6.ea = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.f789d
                if (r1 == r7) goto L_0x00f7
                r6.ba = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.f790e
                if (r1 == r7) goto L_0x0104
                r6.ca = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x024d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.isInEditMode()
            int r2 = r26.getChildCount()
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0048
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0048
            android.view.View r6 = r0.getChildAt(r5)
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            r0.a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0045 }
            r8 = 47
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            if (r8 == r4) goto L_0x003a
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x003a:
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            b.f.a.a.h r6 = r0.b(r6)     // Catch:{ NotFoundException -> 0x0045 }
            r6.a((java.lang.String) r7)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 >= r2) goto L_0x005c
            android.view.View r6 = r0.getChildAt(r5)
            b.f.a.a.h r6 = r0.a((android.view.View) r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.D()
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x005c:
            int r5 = r0.l
            if (r5 == r4) goto L_0x007e
            r5 = 0
        L_0x0061:
            if (r5 >= r2) goto L_0x007e
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getId()
            int r8 = r0.l
            if (r7 != r8) goto L_0x007b
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.e
            if (r7 == 0) goto L_0x007b
            androidx.constraintlayout.widget.e r6 = (androidx.constraintlayout.widget.e) r6
            androidx.constraintlayout.widget.d r6 = r6.getConstraintSet()
            r0.k = r6
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0061
        L_0x007e:
            androidx.constraintlayout.widget.d r5 = r0.k
            if (r5 == 0) goto L_0x0085
            r5.a((androidx.constraintlayout.widget.ConstraintLayout) r0)
        L_0x0085:
            b.f.a.a.i r5 = r0.f781d
            r5.L()
            java.util.ArrayList<androidx.constraintlayout.widget.b> r5 = r0.f779b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a3
            r6 = 0
        L_0x0093:
            if (r6 >= r5) goto L_0x00a3
            java.util.ArrayList<androidx.constraintlayout.widget.b> r7 = r0.f779b
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.b r7 = (androidx.constraintlayout.widget.b) r7
            r7.c(r0)
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 >= r2) goto L_0x00b6
            android.view.View r6 = r0.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.g
            if (r7 == 0) goto L_0x00b3
            androidx.constraintlayout.widget.g r6 = (androidx.constraintlayout.widget.g) r6
            r6.b(r0)
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 >= r2) goto L_0x03d4
            android.view.View r6 = r0.getChildAt(r5)
            b.f.a.a.h r13 = r0.a((android.view.View) r6)
            if (r13 != 0) goto L_0x00c5
            goto L_0x03d0
        L_0x00c5:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r14 = r7
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.a) r14
            r14.a()
            boolean r7 = r14.ma
            if (r7 == 0) goto L_0x00d6
            r14.ma = r3
            goto L_0x0108
        L_0x00d6:
            if (r1 == 0) goto L_0x0108
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r0.a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r8 = "id/"
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            b.f.a.a.h r8 = r0.b(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r8.a((java.lang.String) r7)     // Catch:{ NotFoundException -> 0x0107 }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            int r7 = r6.getVisibility()
            r13.n(r7)
            boolean r7 = r14.aa
            if (r7 == 0) goto L_0x0118
            r7 = 8
            r13.n(r7)
        L_0x0118:
            r13.a((java.lang.Object) r6)
            b.f.a.a.i r6 = r0.f781d
            r6.b(r13)
            boolean r6 = r14.W
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.V
            if (r6 != 0) goto L_0x012d
        L_0x0128:
            java.util.ArrayList<b.f.a.a.h> r6 = r0.f780c
            r6.add(r13)
        L_0x012d:
            boolean r6 = r14.Y
            r7 = 17
            if (r6 == 0) goto L_0x015e
            b.f.a.a.l r13 = (b.f.a.a.l) r13
            int r6 = r14.ia
            int r8 = r14.ja
            float r9 = r14.ka
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 >= r7) goto L_0x0145
            int r6 = r14.f786a
            int r8 = r14.f787b
            float r9 = r14.f788c
        L_0x0145:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0150
            r13.e(r9)
            goto L_0x03d0
        L_0x0150:
            if (r6 == r4) goto L_0x0157
            r13.t(r6)
            goto L_0x03d0
        L_0x0157:
            if (r8 == r4) goto L_0x03d0
            r13.u(r8)
            goto L_0x03d0
        L_0x015e:
            int r6 = r14.f789d
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f790e
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f791f
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f792g
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.p
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.r
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.s
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f793h
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.i
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.j
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.k
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.l
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.Q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.R
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.m
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.width
            if (r6 == r4) goto L_0x01a6
            int r6 = r14.height
            if (r6 != r4) goto L_0x03d0
        L_0x01a6:
            int r6 = r14.ba
            int r8 = r14.ca
            int r9 = r14.da
            int r10 = r14.ea
            int r11 = r14.fa
            int r12 = r14.ga
            float r15 = r14.ha
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r7) goto L_0x01f7
            int r3 = r14.f789d
            int r6 = r14.f790e
            int r9 = r14.f791f
            int r10 = r14.f792g
            int r7 = r14.t
            int r8 = r14.v
            float r15 = r14.z
            if (r3 != r4) goto L_0x01d9
            if (r6 != r4) goto L_0x01d9
            int r11 = r14.q
            if (r11 == r4) goto L_0x01d4
            r25 = r11
            r11 = r6
            r6 = r25
            goto L_0x01db
        L_0x01d4:
            int r11 = r14.p
            if (r11 == r4) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r6
        L_0x01da:
            r6 = r3
        L_0x01db:
            if (r9 != r4) goto L_0x01f2
            if (r10 != r4) goto L_0x01f2
            int r3 = r14.r
            if (r3 == r4) goto L_0x01e7
            r12 = r7
            r16 = r8
            goto L_0x01fc
        L_0x01e7:
            int r3 = r14.s
            if (r3 == r4) goto L_0x01f2
            r12 = r7
            r16 = r8
            r10 = r15
            r15 = r3
            r3 = r9
            goto L_0x0201
        L_0x01f2:
            r12 = r7
            r16 = r8
            r3 = r9
            goto L_0x01fc
        L_0x01f7:
            r3 = r9
            r16 = r12
            r12 = r11
            r11 = r8
        L_0x01fc:
            r25 = r15
            r15 = r10
            r10 = r25
        L_0x0201:
            int r7 = r14.m
            if (r7 == r4) goto L_0x0214
            b.f.a.a.h r3 = r0.b(r7)
            if (r3 == 0) goto L_0x0323
            float r6 = r14.o
            int r7 = r14.n
            r13.a((b.f.a.a.h) r3, (float) r6, (int) r7)
            goto L_0x0323
        L_0x0214:
            if (r6 == r4) goto L_0x0229
            b.f.a.a.h r9 = r0.b(r6)
            if (r9 == 0) goto L_0x0226
            b.f.a.a.f$c r6 = b.f.a.a.f.c.LEFT
            int r11 = r14.leftMargin
            r7 = r13
            r8 = r6
            r17 = r10
            r10 = r6
            goto L_0x023a
        L_0x0226:
            r17 = r10
            goto L_0x023d
        L_0x0229:
            r17 = r10
            if (r11 == r4) goto L_0x023d
            b.f.a.a.h r9 = r0.b(r11)
            if (r9 == 0) goto L_0x023d
            b.f.a.a.f$c r8 = b.f.a.a.f.c.LEFT
            b.f.a.a.f$c r10 = b.f.a.a.f.c.RIGHT
            int r11 = r14.leftMargin
            r7 = r13
        L_0x023a:
            r7.a(r8, r9, r10, r11, r12)
        L_0x023d:
            if (r3 == r4) goto L_0x024d
            b.f.a.a.h r9 = r0.b(r3)
            if (r9 == 0) goto L_0x0260
            b.f.a.a.f$c r8 = b.f.a.a.f.c.RIGHT
            b.f.a.a.f$c r10 = b.f.a.a.f.c.LEFT
            int r11 = r14.rightMargin
            r7 = r13
            goto L_0x025b
        L_0x024d:
            if (r15 == r4) goto L_0x0260
            b.f.a.a.h r9 = r0.b(r15)
            if (r9 == 0) goto L_0x0260
            b.f.a.a.f$c r10 = b.f.a.a.f.c.RIGHT
            int r11 = r14.rightMargin
            r7 = r13
            r8 = r10
        L_0x025b:
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
        L_0x0260:
            int r3 = r14.f793h
            if (r3 == r4) goto L_0x0273
            b.f.a.a.h r9 = r0.b(r3)
            if (r9 == 0) goto L_0x0289
            b.f.a.a.f$c r10 = b.f.a.a.f.c.TOP
            int r11 = r14.topMargin
            int r12 = r14.u
            r7 = r13
            r8 = r10
            goto L_0x0286
        L_0x0273:
            int r3 = r14.i
            if (r3 == r4) goto L_0x0289
            b.f.a.a.h r9 = r0.b(r3)
            if (r9 == 0) goto L_0x0289
            b.f.a.a.f$c r8 = b.f.a.a.f.c.TOP
            b.f.a.a.f$c r10 = b.f.a.a.f.c.BOTTOM
            int r11 = r14.topMargin
            int r12 = r14.u
            r7 = r13
        L_0x0286:
            r7.a(r8, r9, r10, r11, r12)
        L_0x0289:
            int r3 = r14.j
            if (r3 == r4) goto L_0x029d
            b.f.a.a.h r9 = r0.b(r3)
            if (r9 == 0) goto L_0x02b2
            b.f.a.a.f$c r8 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f$c r10 = b.f.a.a.f.c.TOP
            int r11 = r14.bottomMargin
            int r12 = r14.w
            r7 = r13
            goto L_0x02af
        L_0x029d:
            int r3 = r14.k
            if (r3 == r4) goto L_0x02b2
            b.f.a.a.h r9 = r0.b(r3)
            if (r9 == 0) goto L_0x02b2
            b.f.a.a.f$c r10 = b.f.a.a.f.c.BOTTOM
            int r11 = r14.bottomMargin
            int r12 = r14.w
            r7 = r13
            r8 = r10
        L_0x02af:
            r7.a(r8, r9, r10, r11, r12)
        L_0x02b2:
            int r3 = r14.l
            if (r3 == r4) goto L_0x0306
            android.util.SparseArray<android.view.View> r6 = r0.f778a
            java.lang.Object r3 = r6.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r6 = r14.l
            b.f.a.a.h r6 = r0.b(r6)
            if (r6 == 0) goto L_0x0306
            if (r3 == 0) goto L_0x0306
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r7 == 0) goto L_0x0306
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.a) r3
            r7 = 1
            r14.X = r7
            r3.X = r7
            b.f.a.a.f$c r3 = b.f.a.a.f.c.BASELINE
            b.f.a.a.f r18 = r13.a((b.f.a.a.f.c) r3)
            b.f.a.a.f$c r3 = b.f.a.a.f.c.BASELINE
            b.f.a.a.f r19 = r6.a((b.f.a.a.f.c) r3)
            r20 = 0
            r21 = -1
            b.f.a.a.f$b r22 = b.f.a.a.f.b.STRONG
            r23 = 0
            r24 = 1
            r18.a(r19, r20, r21, r22, r23, r24)
            b.f.a.a.f$c r3 = b.f.a.a.f.c.TOP
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            r3.j()
            b.f.a.a.f$c r3 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            r3.j()
        L_0x0306:
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r15 = r17
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0316
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0316
            r13.a((float) r15)
        L_0x0316:
            float r7 = r14.A
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0323
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0323
            r13.c((float) r7)
        L_0x0323:
            if (r1 == 0) goto L_0x0334
            int r3 = r14.Q
            if (r3 != r4) goto L_0x032d
            int r3 = r14.R
            if (r3 == r4) goto L_0x0334
        L_0x032d:
            int r3 = r14.Q
            int r6 = r14.R
            r13.c(r3, r6)
        L_0x0334:
            boolean r3 = r14.V
            if (r3 != 0) goto L_0x035d
            int r3 = r14.width
            if (r3 != r4) goto L_0x0356
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_PARENT
            r13.a((b.f.a.a.h.a) r3)
            b.f.a.a.f$c r3 = b.f.a.a.f.c.LEFT
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            int r6 = r14.leftMargin
            r3.f2269e = r6
            b.f.a.a.f$c r3 = b.f.a.a.f.c.RIGHT
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            int r6 = r14.rightMargin
            r3.f2269e = r6
            goto L_0x0367
        L_0x0356:
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_CONSTRAINT
            r13.a((b.f.a.a.h.a) r3)
            r3 = 0
            goto L_0x0364
        L_0x035d:
            b.f.a.a.h$a r3 = b.f.a.a.h.a.FIXED
            r13.a((b.f.a.a.h.a) r3)
            int r3 = r14.width
        L_0x0364:
            r13.o(r3)
        L_0x0367:
            boolean r3 = r14.W
            if (r3 != 0) goto L_0x0394
            int r3 = r14.height
            if (r3 != r4) goto L_0x038a
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_PARENT
            r13.b((b.f.a.a.h.a) r3)
            b.f.a.a.f$c r3 = b.f.a.a.f.c.TOP
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            int r6 = r14.topMargin
            r3.f2269e = r6
            b.f.a.a.f$c r3 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f r3 = r13.a((b.f.a.a.f.c) r3)
            int r6 = r14.bottomMargin
            r3.f2269e = r6
            r3 = 0
            goto L_0x039f
        L_0x038a:
            b.f.a.a.h$a r3 = b.f.a.a.h.a.MATCH_CONSTRAINT
            r13.b((b.f.a.a.h.a) r3)
            r3 = 0
            r13.g(r3)
            goto L_0x039f
        L_0x0394:
            r3 = 0
            b.f.a.a.h$a r6 = b.f.a.a.h.a.FIXED
            r13.b((b.f.a.a.h.a) r6)
            int r6 = r14.height
            r13.g(r6)
        L_0x039f:
            java.lang.String r6 = r14.B
            if (r6 == 0) goto L_0x03a6
            r13.b((java.lang.String) r6)
        L_0x03a6:
            float r6 = r14.E
            r13.b((float) r6)
            float r6 = r14.F
            r13.d((float) r6)
            int r6 = r14.G
            r13.h(r6)
            int r6 = r14.H
            r13.m(r6)
            int r6 = r14.I
            int r7 = r14.K
            int r8 = r14.M
            float r9 = r14.O
            r13.a((int) r6, (int) r7, (int) r8, (float) r9)
            int r6 = r14.J
            int r7 = r14.L
            int r8 = r14.N
            float r9 = r14.P
            r13.b(r6, r7, r8, r9)
        L_0x03d0:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a():void");
    }

    private void a(int i2, int i3) {
        boolean z;
        boolean z2;
        int baseline;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                h hVar = aVar.la;
                if (!aVar.Y && !aVar.Z) {
                    hVar.n(childAt.getVisibility());
                    int i9 = aVar.width;
                    int i10 = aVar.height;
                    boolean z3 = aVar.V;
                    if (z3 || aVar.W || (!z3 && aVar.I == 1) || aVar.width == -1 || (!aVar.W && (aVar.J == 1 || aVar.height == -1))) {
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, -2);
                            z2 = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingLeft, i9);
                        }
                        if (i10 == 0) {
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, -2);
                            z = true;
                        } else if (i10 == -1) {
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, -1);
                            z = false;
                        } else {
                            z = i10 == -2;
                            i5 = ViewGroup.getChildMeasureSpec(i7, paddingTop, i10);
                        }
                        childAt.measure(i4, i5);
                        f fVar = this.t;
                        if (fVar != null) {
                            fVar.f2348a++;
                        }
                        hVar.b(i9 == -2);
                        hVar.a(i10 == -2);
                        i9 = childAt.getMeasuredWidth();
                        i10 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    hVar.o(i9);
                    hVar.g(i10);
                    if (z2) {
                        hVar.q(i9);
                    }
                    if (z) {
                        hVar.p(i10);
                    }
                    if (aVar.X && (baseline = childAt.getBaseline()) != -1) {
                        hVar.f(baseline);
                    }
                }
            }
        }
    }

    private void a(AttributeSet attributeSet) {
        this.f781d.a((Object) this);
        this.f778a.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.ConstraintLayout_Layout_android_minWidth) {
                    this.f782e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f782e);
                } else if (index == i.ConstraintLayout_Layout_android_minHeight) {
                    this.f783f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f783f);
                } else if (index == i.ConstraintLayout_Layout_android_maxWidth) {
                    this.f784g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f784g);
                } else if (index == i.ConstraintLayout_Layout_android_maxHeight) {
                    this.f785h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f785h);
                } else if (index == i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.j = obtainStyledAttributes.getInt(index, this.j);
                } else if (index == i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.k = new d();
                        this.k.a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.k = null;
                    }
                    this.l = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f781d.u(this.j);
    }

    private final h b(int i2) {
        if (i2 == 0) {
            return this.f781d;
        }
        View view = this.f778a.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f781d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).la;
    }

    private void b() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            this.f780c.clear();
            a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00de
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 != r10) goto L_0x0030
            goto L_0x00d6
        L_0x0030:
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r10 = (androidx.constraintlayout.widget.ConstraintLayout.a) r10
            b.f.a.a.h r15 = r10.la
            boolean r6 = r10.Y
            if (r6 != 0) goto L_0x00d6
            boolean r6 = r10.Z
            if (r6 == 0) goto L_0x0042
            goto L_0x00d6
        L_0x0042:
            int r6 = r14.getVisibility()
            r15.n(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c6
            if (r13 != 0) goto L_0x0053
            goto L_0x00c6
        L_0x0053:
            if (r6 != r12) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            b.f.a.f r11 = r0.t
            if (r11 == 0) goto L_0x0077
            r12 = r3
            long r2 = r11.f2348a
            long r2 = r2 + r8
            r11.f2348a = r2
            goto L_0x0078
        L_0x0077:
            r12 = r3
        L_0x0078:
            r2 = -2
            if (r6 != r2) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            r15.b((boolean) r3)
            if (r13 != r2) goto L_0x0085
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r15.a((boolean) r2)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.o(r2)
            r15.g(r3)
            if (r16 == 0) goto L_0x009c
            r15.q(r2)
        L_0x009c:
            if (r17 == 0) goto L_0x00a1
            r15.p(r3)
        L_0x00a1:
            boolean r6 = r10.X
            if (r6 == 0) goto L_0x00af
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00af
            r15.f(r6)
        L_0x00af:
            boolean r6 = r10.V
            if (r6 == 0) goto L_0x00d7
            boolean r6 = r10.W
            if (r6 == 0) goto L_0x00d7
            b.f.a.a.q r6 = r15.m()
            r6.a(r2)
            b.f.a.a.q r2 = r15.l()
            r2.a(r3)
            goto L_0x00d7
        L_0x00c6:
            r12 = r3
            b.f.a.a.q r2 = r15.m()
            r2.b()
            b.f.a.a.q r2 = r15.l()
            r2.b()
            goto L_0x00d7
        L_0x00d6:
            r12 = r3
        L_0x00d7:
            int r7 = r7 + 1
            r2 = r25
            r3 = r12
            goto L_0x001d
        L_0x00de:
            r12 = r3
            b.f.a.a.i r2 = r0.f781d
            r2.U()
            r2 = 0
        L_0x00e5:
            if (r2 >= r5) goto L_0x02e2
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 != r10) goto L_0x00f3
            goto L_0x02ce
        L_0x00f3:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.a) r6
            b.f.a.a.h r7 = r6.la
            boolean r11 = r6.Y
            if (r11 != 0) goto L_0x02ce
            boolean r11 = r6.Z
            if (r11 == 0) goto L_0x0105
            goto L_0x02ce
        L_0x0105:
            int r11 = r3.getVisibility()
            r7.n(r11)
            int r11 = r6.width
            int r13 = r6.height
            if (r11 == 0) goto L_0x0116
            if (r13 == 0) goto L_0x0116
            goto L_0x02ce
        L_0x0116:
            b.f.a.a.f$c r14 = b.f.a.a.f.c.LEFT
            b.f.a.a.f r14 = r7.a((b.f.a.a.f.c) r14)
            b.f.a.a.p r14 = r14.d()
            b.f.a.a.f$c r15 = b.f.a.a.f.c.RIGHT
            b.f.a.a.f r15 = r7.a((b.f.a.a.f.c) r15)
            b.f.a.a.p r15 = r15.d()
            b.f.a.a.f$c r10 = b.f.a.a.f.c.LEFT
            b.f.a.a.f r10 = r7.a((b.f.a.a.f.c) r10)
            b.f.a.a.f r10 = r10.g()
            if (r10 == 0) goto L_0x0144
            b.f.a.a.f$c r10 = b.f.a.a.f.c.RIGHT
            b.f.a.a.f r10 = r7.a((b.f.a.a.f.c) r10)
            b.f.a.a.f r10 = r10.g()
            if (r10 == 0) goto L_0x0144
            r10 = 1
            goto L_0x0145
        L_0x0144:
            r10 = 0
        L_0x0145:
            b.f.a.a.f$c r8 = b.f.a.a.f.c.TOP
            b.f.a.a.f r8 = r7.a((b.f.a.a.f.c) r8)
            b.f.a.a.p r8 = r8.d()
            b.f.a.a.f$c r9 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f r9 = r7.a((b.f.a.a.f.c) r9)
            b.f.a.a.p r9 = r9.d()
            r17 = r5
            b.f.a.a.f$c r5 = b.f.a.a.f.c.TOP
            b.f.a.a.f r5 = r7.a((b.f.a.a.f.c) r5)
            b.f.a.a.f r5 = r5.g()
            if (r5 == 0) goto L_0x0175
            b.f.a.a.f$c r5 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f r5 = r7.a((b.f.a.a.f.c) r5)
            b.f.a.a.f r5 = r5.g()
            if (r5 == 0) goto L_0x0175
            r5 = 1
            goto L_0x0176
        L_0x0175:
            r5 = 0
        L_0x0176:
            if (r11 != 0) goto L_0x0188
            if (r13 != 0) goto L_0x0188
            if (r10 == 0) goto L_0x0188
            if (r5 == 0) goto L_0x0188
            r5 = r25
            r20 = r2
            r3 = -1
            r10 = -2
            r18 = 1
            goto L_0x02d8
        L_0x0188:
            r20 = r2
            b.f.a.a.i r2 = r0.f781d
            b.f.a.a.h$a r2 = r2.j()
            r21 = r6
            b.f.a.a.h$a r6 = b.f.a.a.h.a.WRAP_CONTENT
            if (r2 == r6) goto L_0x0198
            r6 = 1
            goto L_0x0199
        L_0x0198:
            r6 = 0
        L_0x0199:
            b.f.a.a.i r2 = r0.f781d
            b.f.a.a.h$a r2 = r2.q()
            b.f.a.a.h$a r0 = b.f.a.a.h.a.WRAP_CONTENT
            if (r2 == r0) goto L_0x01a5
            r0 = 1
            goto L_0x01a6
        L_0x01a5:
            r0 = 0
        L_0x01a6:
            if (r6 != 0) goto L_0x01af
            b.f.a.a.q r2 = r7.m()
            r2.b()
        L_0x01af:
            if (r0 != 0) goto L_0x01b8
            b.f.a.a.q r2 = r7.l()
            r2.b()
        L_0x01b8:
            if (r11 != 0) goto L_0x01f0
            if (r6 == 0) goto L_0x01e7
            boolean r2 = r7.C()
            if (r2 == 0) goto L_0x01e7
            if (r10 == 0) goto L_0x01e7
            boolean r2 = r14.c()
            if (r2 == 0) goto L_0x01e7
            boolean r2 = r15.c()
            if (r2 == 0) goto L_0x01e7
            float r2 = r15.f()
            float r10 = r14.f()
            float r2 = r2 - r10
            int r11 = (int) r2
            b.f.a.a.q r2 = r7.m()
            r2.a(r11)
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r2
            goto L_0x01f8
        L_0x01e7:
            r2 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r2)
            r14 = r6
            r2 = 1
            r6 = 0
            goto L_0x0204
        L_0x01f0:
            r2 = -2
            r10 = -1
            if (r11 != r10) goto L_0x01fa
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
        L_0x01f8:
            r2 = 0
            goto L_0x0204
        L_0x01fa:
            if (r11 != r2) goto L_0x01fe
            r2 = 1
            goto L_0x01ff
        L_0x01fe:
            r2 = 0
        L_0x01ff:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r10
        L_0x0204:
            if (r13 != 0) goto L_0x0240
            if (r0 == 0) goto L_0x0236
            boolean r10 = r7.B()
            if (r10 == 0) goto L_0x0236
            if (r5 == 0) goto L_0x0236
            boolean r5 = r8.c()
            if (r5 == 0) goto L_0x0236
            boolean r5 = r9.c()
            if (r5 == 0) goto L_0x0236
            float r5 = r9.f()
            float r8 = r8.f()
            float r5 = r5 - r8
            int r13 = (int) r5
            b.f.a.a.q r5 = r7.l()
            r5.a(r13)
            r5 = r25
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r9 = r0
            r0 = r8
            goto L_0x024c
        L_0x0236:
            r5 = r25
            r8 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r8)
            r8 = 1
            r9 = 0
            goto L_0x025c
        L_0x0240:
            r5 = r25
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x024e
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r9)
            r9 = r0
            r0 = r10
        L_0x024c:
            r8 = 0
            goto L_0x025c
        L_0x024e:
            if (r13 != r8) goto L_0x0252
            r8 = 1
            goto L_0x0253
        L_0x0252:
            r8 = 0
        L_0x0253:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r22 = r9
            r9 = r0
            r0 = r22
        L_0x025c:
            r3.measure(r14, r0)
            r0 = r23
            b.f.a.f r10 = r0.t
            if (r10 == 0) goto L_0x026e
            long r14 = r10.f2348a
            r18 = 1
            long r14 = r14 + r18
            r10.f2348a = r14
            goto L_0x0270
        L_0x026e:
            r18 = 1
        L_0x0270:
            r10 = -2
            if (r11 != r10) goto L_0x0275
            r11 = 1
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            r7.b((boolean) r11)
            if (r13 != r10) goto L_0x027d
            r11 = 1
            goto L_0x027e
        L_0x027d:
            r11 = 0
        L_0x027e:
            r7.a((boolean) r11)
            int r11 = r3.getMeasuredWidth()
            int r13 = r3.getMeasuredHeight()
            r7.o(r11)
            r7.g(r13)
            if (r2 == 0) goto L_0x0294
            r7.q(r11)
        L_0x0294:
            if (r8 == 0) goto L_0x0299
            r7.p(r13)
        L_0x0299:
            if (r6 == 0) goto L_0x02a3
            b.f.a.a.q r2 = r7.m()
            r2.a(r11)
            goto L_0x02aa
        L_0x02a3:
            b.f.a.a.q r2 = r7.m()
            r2.f()
        L_0x02aa:
            if (r9 == 0) goto L_0x02b4
            b.f.a.a.q r2 = r7.l()
            r2.a(r13)
            goto L_0x02bb
        L_0x02b4:
            b.f.a.a.q r2 = r7.l()
            r2.f()
        L_0x02bb:
            r6 = r21
            boolean r2 = r6.X
            if (r2 == 0) goto L_0x02cc
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02d8
            r7.f(r2)
            goto L_0x02d8
        L_0x02cc:
            r3 = -1
            goto L_0x02d8
        L_0x02ce:
            r20 = r2
            r17 = r5
            r18 = r8
            r3 = -1
            r10 = -2
            r5 = r25
        L_0x02d8:
            int r2 = r20 + 1
            r5 = r17
            r8 = r18
            r10 = 8
            goto L_0x00e5
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b(int, int):void");
    }

    private void c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof g) {
                ((g) childAt).a(this);
            }
        }
        int size = this.f779b.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.f779b.get(i3).b(this);
            }
        }
    }

    private void c(int i2, int i3) {
        h.a aVar;
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        h.a aVar2 = h.a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = h.a.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                aVar = aVar2;
            } else {
                i4 = Math.min(this.f784g, size) - paddingLeft;
                aVar = aVar2;
            }
            i4 = 0;
        } else {
            i4 = size;
            aVar = h.a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = h.a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f785h, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = h.a.WRAP_CONTENT;
        }
        this.f781d.l(0);
        this.f781d.k(0);
        this.f781d.a(aVar);
        this.f781d.o(i4);
        this.f781d.b(aVar2);
        this.f781d.g(size2);
        this.f781d.l((this.f782e - getPaddingLeft()) - getPaddingRight());
        this.f781d.k((this.f783f - getPaddingTop()) - getPaddingBottom());
    }

    public View a(int i2) {
        return this.f778a.get(i2);
    }

    public final h a(View view) {
        if (view == this) {
            return this.f781d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).la;
    }

    public Object a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.m.get(str);
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.f781d.K();
        f fVar = this.t;
        if (fVar != null) {
            fVar.f2350c++;
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i3;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = (float) i4;
                        float f5 = f2;
                        float f6 = f2;
                        float f7 = f4;
                        Paint paint2 = paint;
                        float f8 = f3;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f5, f7, f8, f4, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f3;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f7, f8, f10, paint3);
                        float f11 = parseInt4;
                        float f12 = f6;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f6;
                        canvas2.drawLine(f13, f11, f12, f4, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f3;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f4, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f4, paint6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f785h;
    }

    public int getMaxWidth() {
        return this.f784g;
    }

    public int getMinHeight() {
        return this.f783f;
    }

    public int getMinWidth() {
        return this.f782e;
    }

    public int getOptimizationLevel() {
        return this.f781d.M();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            h hVar = aVar.la;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.aa) {
                int g2 = hVar.g();
                int h2 = hVar.h();
                int s2 = hVar.s() + g2;
                int i7 = hVar.i() + h2;
                childAt.layout(g2, h2, s2, i7);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(g2, h2, s2, i7);
                }
            }
        }
        int size = this.f779b.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f779b.get(i8).a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r25)
            int r4 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = android.view.View.MeasureSpec.getMode(r26)
            int r6 = android.view.View.MeasureSpec.getSize(r26)
            int r7 = r24.getPaddingLeft()
            int r8 = r24.getPaddingTop()
            b.f.a.a.i r9 = r0.f781d
            r9.r(r7)
            b.f.a.a.i r9 = r0.f781d
            r9.s(r8)
            b.f.a.a.i r9 = r0.f781d
            int r10 = r0.f784g
            r9.j(r10)
            b.f.a.a.i r9 = r0.f781d
            int r10 = r0.f785h
            r9.i(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 0
            r11 = 1
            r12 = 17
            if (r9 < r12) goto L_0x004f
            b.f.a.a.i r9 = r0.f781d
            int r12 = r24.getLayoutDirection()
            if (r12 != r11) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            r9.c(r12)
        L_0x004f:
            r24.c(r25, r26)
            b.f.a.a.i r9 = r0.f781d
            int r9 = r9.s()
            b.f.a.a.i r12 = r0.f781d
            int r12 = r12.i()
            boolean r13 = r0.i
            if (r13 == 0) goto L_0x0069
            r0.i = r10
            r24.b()
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            int r14 = r0.j
            r15 = 8
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x0084
            b.f.a.a.i r15 = r0.f781d
            r15.T()
            b.f.a.a.i r15 = r0.f781d
            r15.f(r9, r12)
            r24.b(r25, r26)
            goto L_0x0087
        L_0x0084:
            r24.a((int) r25, (int) r26)
        L_0x0087:
            r24.c()
            int r15 = r24.getChildCount()
            if (r15 <= 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            b.f.a.a.i r13 = r0.f781d
            b.f.a.a.a.a((b.f.a.a.i) r13)
        L_0x0097:
            b.f.a.a.i r13 = r0.f781d
            boolean r15 = r13.Ia
            if (r15 == 0) goto L_0x00c9
            boolean r15 = r13.Ja
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x00b3
            if (r3 != r11) goto L_0x00b3
            int r15 = r13.La
            if (r15 >= r4) goto L_0x00ac
            r13.o(r15)
        L_0x00ac:
            b.f.a.a.i r13 = r0.f781d
            b.f.a.a.h$a r15 = b.f.a.a.h.a.FIXED
            r13.a((b.f.a.a.h.a) r15)
        L_0x00b3:
            b.f.a.a.i r13 = r0.f781d
            boolean r15 = r13.Ka
            if (r15 == 0) goto L_0x00c9
            if (r5 != r11) goto L_0x00c9
            int r11 = r13.Ma
            if (r11 >= r6) goto L_0x00c2
            r13.g(r11)
        L_0x00c2:
            b.f.a.a.i r11 = r0.f781d
            b.f.a.a.h$a r13 = b.f.a.a.h.a.FIXED
            r11.b((b.f.a.a.h.a) r13)
        L_0x00c9:
            int r11 = r0.j
            r13 = 32
            r11 = r11 & r13
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x011d
            b.f.a.a.i r11 = r0.f781d
            int r11 = r11.s()
            b.f.a.a.i r13 = r0.f781d
            int r13 = r13.i()
            int r10 = r0.n
            if (r10 == r11) goto L_0x00ec
            if (r3 != r15) goto L_0x00ec
            b.f.a.a.i r3 = r0.f781d
            java.util.List<b.f.a.a.j> r3 = r3.Ha
            r10 = 0
            b.f.a.a.a.a((java.util.List<b.f.a.a.j>) r3, (int) r10, (int) r11)
        L_0x00ec:
            int r3 = r0.o
            if (r3 == r13) goto L_0x00fa
            if (r5 != r15) goto L_0x00fa
            b.f.a.a.i r3 = r0.f781d
            java.util.List<b.f.a.a.j> r3 = r3.Ha
            r5 = 1
            b.f.a.a.a.a((java.util.List<b.f.a.a.j>) r3, (int) r5, (int) r13)
        L_0x00fa:
            b.f.a.a.i r3 = r0.f781d
            boolean r5 = r3.Ja
            if (r5 == 0) goto L_0x010b
            int r5 = r3.La
            if (r5 <= r4) goto L_0x010b
            java.util.List<b.f.a.a.j> r3 = r3.Ha
            r10 = 0
            b.f.a.a.a.a((java.util.List<b.f.a.a.j>) r3, (int) r10, (int) r4)
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            b.f.a.a.i r3 = r0.f781d
            boolean r4 = r3.Ka
            if (r4 == 0) goto L_0x011d
            int r4 = r3.Ma
            if (r4 <= r6) goto L_0x011d
            java.util.List<b.f.a.a.j> r3 = r3.Ha
            r4 = 1
            b.f.a.a.a.a((java.util.List<b.f.a.a.j>) r3, (int) r4, (int) r6)
            goto L_0x011e
        L_0x011d:
            r4 = 1
        L_0x011e:
            int r3 = r24.getChildCount()
            if (r3 <= 0) goto L_0x0129
            java.lang.String r3 = "First pass"
            r0.a((java.lang.String) r3)
        L_0x0129:
            java.util.ArrayList<b.f.a.a.h> r3 = r0.f780c
            int r3 = r3.size()
            int r5 = r24.getPaddingBottom()
            int r8 = r8 + r5
            int r5 = r24.getPaddingRight()
            int r7 = r7 + r5
            if (r3 <= 0) goto L_0x035b
            b.f.a.a.i r6 = r0.f781d
            b.f.a.a.h$a r6 = r6.j()
            b.f.a.a.h$a r11 = b.f.a.a.h.a.WRAP_CONTENT
            if (r6 != r11) goto L_0x0147
            r6 = 1
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            b.f.a.a.i r11 = r0.f781d
            b.f.a.a.h$a r11 = r11.q()
            b.f.a.a.h$a r13 = b.f.a.a.h.a.WRAP_CONTENT
            if (r11 != r13) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            b.f.a.a.i r13 = r0.f781d
            int r13 = r13.s()
            int r4 = r0.f782e
            int r4 = java.lang.Math.max(r13, r4)
            b.f.a.a.i r13 = r0.f781d
            int r13 = r13.i()
            int r10 = r0.f783f
            int r10 = java.lang.Math.max(r13, r10)
            r13 = r4
            r5 = r10
            r4 = 0
            r10 = 0
            r17 = 0
        L_0x0173:
            r18 = 1
            if (r4 >= r3) goto L_0x02b4
            java.util.ArrayList<b.f.a.a.h> r15 = r0.f780c
            java.lang.Object r15 = r15.get(r4)
            b.f.a.a.h r15 = (b.f.a.a.h) r15
            java.lang.Object r20 = r15.e()
            r21 = r3
            r3 = r20
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0193
            r20 = r9
            r23 = r10
            r22 = r12
            goto L_0x02a0
        L_0x0193:
            android.view.ViewGroup$LayoutParams r20 = r3.getLayoutParams()
            r22 = r12
            r12 = r20
            androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.a) r12
            r20 = r9
            boolean r9 = r12.Z
            if (r9 != 0) goto L_0x029e
            boolean r9 = r12.Y
            if (r9 == 0) goto L_0x01a9
            goto L_0x029e
        L_0x01a9:
            int r9 = r3.getVisibility()
            r23 = r10
            r10 = 8
            if (r9 != r10) goto L_0x01b5
        L_0x01b3:
            goto L_0x02a0
        L_0x01b5:
            if (r14 == 0) goto L_0x01cc
            b.f.a.a.q r9 = r15.m()
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x01cc
            b.f.a.a.q r9 = r15.l()
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x01cc
            goto L_0x01b3
        L_0x01cc:
            int r9 = r12.width
            r10 = -2
            if (r9 != r10) goto L_0x01dc
            boolean r9 = r12.V
            if (r9 == 0) goto L_0x01dc
            int r9 = r12.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r9)
            goto L_0x01e6
        L_0x01dc:
            int r9 = r15.s()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
        L_0x01e6:
            int r10 = r12.height
            r1 = -2
            if (r10 != r1) goto L_0x01f6
            boolean r1 = r12.W
            if (r1 == 0) goto L_0x01f6
            int r1 = r12.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r8, r1)
            goto L_0x0200
        L_0x01f6:
            int r1 = r15.i()
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x0200:
            r3.measure(r9, r1)
            b.f.a.f r1 = r0.t
            if (r1 == 0) goto L_0x020d
            long r9 = r1.f2349b
            long r9 = r9 + r18
            r1.f2349b = r9
        L_0x020d:
            int r1 = r3.getMeasuredWidth()
            int r9 = r3.getMeasuredHeight()
            int r10 = r15.s()
            if (r1 == r10) goto L_0x0244
            r15.o(r1)
            if (r14 == 0) goto L_0x0227
            b.f.a.a.q r10 = r15.m()
            r10.a(r1)
        L_0x0227:
            if (r6 == 0) goto L_0x0242
            int r1 = r15.n()
            if (r1 <= r13) goto L_0x0242
            int r1 = r15.n()
            b.f.a.a.f$c r10 = b.f.a.a.f.c.RIGHT
            b.f.a.a.f r10 = r15.a((b.f.a.a.f.c) r10)
            int r10 = r10.b()
            int r1 = r1 + r10
            int r13 = java.lang.Math.max(r13, r1)
        L_0x0242:
            r23 = 1
        L_0x0244:
            int r1 = r15.i()
            if (r9 == r1) goto L_0x0274
            r15.g(r9)
            if (r14 == 0) goto L_0x0256
            b.f.a.a.q r1 = r15.l()
            r1.a(r9)
        L_0x0256:
            if (r11 == 0) goto L_0x0272
            int r1 = r15.d()
            if (r1 <= r5) goto L_0x0272
            int r1 = r15.d()
            b.f.a.a.f$c r9 = b.f.a.a.f.c.BOTTOM
            b.f.a.a.f r9 = r15.a((b.f.a.a.f.c) r9)
            int r9 = r9.b()
            int r1 = r1 + r9
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r1
        L_0x0272:
            r23 = 1
        L_0x0274:
            boolean r1 = r12.X
            if (r1 == 0) goto L_0x028a
            int r1 = r3.getBaseline()
            r9 = -1
            if (r1 == r9) goto L_0x028a
            int r9 = r15.c()
            if (r1 == r9) goto L_0x028a
            r15.f(r1)
            r23 = 1
        L_0x028a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r1 < r9) goto L_0x029b
            int r1 = r3.getMeasuredState()
            r3 = r17
            int r17 = android.view.ViewGroup.combineMeasuredStates(r3, r1)
            goto L_0x02a4
        L_0x029b:
            r3 = r17
            goto L_0x02a4
        L_0x029e:
            r23 = r10
        L_0x02a0:
            r3 = r17
            r17 = r3
        L_0x02a4:
            r10 = r23
            int r4 = r4 + 1
            r1 = r25
            r9 = r20
            r3 = r21
            r12 = r22
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0173
        L_0x02b4:
            r21 = r3
            r20 = r9
            r23 = r10
            r22 = r12
            r3 = r17
            if (r23 == 0) goto L_0x0303
            b.f.a.a.i r1 = r0.f781d
            r4 = r20
            r1.o(r4)
            b.f.a.a.i r1 = r0.f781d
            r4 = r22
            r1.g(r4)
            if (r14 == 0) goto L_0x02d5
            b.f.a.a.i r1 = r0.f781d
            r1.U()
        L_0x02d5:
            java.lang.String r1 = "2nd pass"
            r0.a((java.lang.String) r1)
            b.f.a.a.i r1 = r0.f781d
            int r1 = r1.s()
            if (r1 >= r13) goto L_0x02e9
            b.f.a.a.i r1 = r0.f781d
            r1.o(r13)
            r11 = 1
            goto L_0x02ea
        L_0x02e9:
            r11 = 0
        L_0x02ea:
            b.f.a.a.i r1 = r0.f781d
            int r1 = r1.i()
            if (r1 >= r5) goto L_0x02fa
            b.f.a.a.i r1 = r0.f781d
            r1.g(r5)
            r16 = 1
            goto L_0x02fc
        L_0x02fa:
            r16 = r11
        L_0x02fc:
            if (r16 == 0) goto L_0x0303
            java.lang.String r1 = "3rd pass"
            r0.a((java.lang.String) r1)
        L_0x0303:
            r1 = r21
            r4 = 0
        L_0x0306:
            if (r4 >= r1) goto L_0x035c
            java.util.ArrayList<b.f.a.a.h> r5 = r0.f780c
            java.lang.Object r5 = r5.get(r4)
            b.f.a.a.h r5 = (b.f.a.a.h) r5
            java.lang.Object r6 = r5.e()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x031d
        L_0x0318:
            r10 = 8
        L_0x031a:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0358
        L_0x031d:
            int r9 = r6.getMeasuredWidth()
            int r10 = r5.s()
            if (r9 != r10) goto L_0x0331
            int r9 = r6.getMeasuredHeight()
            int r10 = r5.i()
            if (r9 == r10) goto L_0x0318
        L_0x0331:
            int r9 = r5.r()
            r10 = 8
            if (r9 == r10) goto L_0x031a
            int r9 = r5.s()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r5 = r5.i()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            r6.measure(r9, r5)
            b.f.a.f r5 = r0.t
            if (r5 == 0) goto L_0x0358
            long r12 = r5.f2349b
            long r12 = r12 + r18
            r5.f2349b = r12
        L_0x0358:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x035b:
            r3 = 0
        L_0x035c:
            b.f.a.a.i r1 = r0.f781d
            int r1 = r1.s()
            int r1 = r1 + r7
            b.f.a.a.i r4 = r0.f781d
            int r4 = r4.i()
            int r4 = r4 + r8
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r5 < r6) goto L_0x03a9
            r5 = r25
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r5, r3)
            int r3 = r3 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r4, r2, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f784g
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f785h
            int r2 = java.lang.Math.min(r3, r2)
            b.f.a.a.i r3 = r0.f781d
            boolean r3 = r3.Q()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0398
            r1 = r1 | r4
        L_0x0398:
            b.f.a.a.i r3 = r0.f781d
            boolean r3 = r3.O()
            if (r3 == 0) goto L_0x03a1
            r2 = r2 | r4
        L_0x03a1:
            r0.setMeasuredDimension(r1, r2)
            r0.n = r1
            r0.o = r2
            goto L_0x03b0
        L_0x03a9:
            r0.setMeasuredDimension(r1, r4)
            r0.n = r1
            r0.o = r4
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        h a2 = a(view);
        if ((view instanceof f) && !(a2 instanceof l)) {
            a aVar = (a) view.getLayoutParams();
            aVar.la = new l();
            aVar.Y = true;
            ((l) aVar.la).v(aVar.S);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.a();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f779b.contains(bVar)) {
                this.f779b.add(bVar);
            }
        }
        this.f778a.put(view.getId(), view);
        this.i = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f778a.remove(view.getId());
        h a2 = a(view);
        this.f781d.c(a2);
        this.f779b.remove(view);
        this.f780c.remove(a2);
        this.i = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.i = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void setConstraintSet(d dVar) {
        this.k = dVar;
    }

    public void setId(int i2) {
        this.f778a.remove(getId());
        super.setId(i2);
        this.f778a.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f785h) {
            this.f785h = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f784g) {
            this.f784g = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f783f) {
            this.f783f = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f782e) {
            this.f782e = i2;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f781d.u(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
