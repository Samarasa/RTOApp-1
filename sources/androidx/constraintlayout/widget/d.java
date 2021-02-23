package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f803a = {0, 4, 8};

    /* renamed from: b  reason: collision with root package name */
    private static SparseIntArray f804b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, a> f805c = new HashMap<>();

    private static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;

        /* renamed from: a  reason: collision with root package name */
        boolean f806a;
        public float aa;

        /* renamed from: b  reason: collision with root package name */
        public int f807b;
        public float ba;

        /* renamed from: c  reason: collision with root package name */
        public int f808c;
        public float ca;

        /* renamed from: d  reason: collision with root package name */
        int f809d;
        public float da;

        /* renamed from: e  reason: collision with root package name */
        public int f810e;
        public float ea;

        /* renamed from: f  reason: collision with root package name */
        public int f811f;
        public float fa;

        /* renamed from: g  reason: collision with root package name */
        public float f812g;
        public float ga;

        /* renamed from: h  reason: collision with root package name */
        public int f813h;
        public boolean ha;
        public int i;
        public boolean ia;
        public int j;
        public int ja;
        public int k;
        public int ka;
        public int l;
        public int la;
        public int m;
        public int ma;
        public int n;
        public int na;
        public int o;
        public int oa;
        public int p;
        public float pa;
        public int q;
        public float qa;
        public int r;
        public boolean ra;
        public int s;
        public int sa;
        public int t;
        public int ta;
        public float u;
        public int[] ua;
        public float v;
        public String va;
        public String w;
        public int x;
        public int y;
        public float z;

        private a() {
            this.f806a = false;
            this.f810e = -1;
            this.f811f = -1;
            this.f812g = -1.0f;
            this.f813h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 1.0f;
            this.ba = 1.0f;
            this.ca = Float.NaN;
            this.da = Float.NaN;
            this.ea = 0.0f;
            this.fa = 0.0f;
            this.ga = 0.0f;
            this.ha = false;
            this.ia = false;
            this.ja = 0;
            this.ka = 0;
            this.la = -1;
            this.ma = -1;
            this.na = -1;
            this.oa = -1;
            this.pa = 1.0f;
            this.qa = 1.0f;
            this.ra = false;
            this.sa = -1;
            this.ta = -1;
        }

        private void a(int i2, ConstraintLayout.a aVar) {
            this.f809d = i2;
            this.f813h = aVar.f789d;
            this.i = aVar.f790e;
            this.j = aVar.f791f;
            this.k = aVar.f792g;
            this.l = aVar.f793h;
            this.m = aVar.i;
            this.n = aVar.j;
            this.o = aVar.k;
            this.p = aVar.l;
            this.q = aVar.p;
            this.r = aVar.q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.m;
            this.y = aVar.n;
            this.z = aVar.o;
            this.A = aVar.Q;
            this.B = aVar.R;
            this.C = aVar.S;
            this.f812g = aVar.f788c;
            this.f810e = aVar.f786a;
            this.f811f = aVar.f787b;
            this.f807b = aVar.width;
            this.f808c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.F;
            this.R = aVar.E;
            this.T = aVar.H;
            this.S = aVar.G;
            boolean z2 = aVar.T;
            this.ha = z2;
            this.ia = aVar.U;
            this.ja = aVar.I;
            this.ka = aVar.J;
            this.ha = z2;
            this.la = aVar.M;
            this.ma = aVar.N;
            this.na = aVar.K;
            this.oa = aVar.L;
            this.pa = aVar.O;
            this.qa = aVar.P;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        public void a(int i2, e.a aVar) {
            a(i2, (ConstraintLayout.a) aVar);
            this.U = aVar.na;
            this.X = aVar.qa;
            this.Y = aVar.ra;
            this.Z = aVar.sa;
            this.aa = aVar.ta;
            this.ba = aVar.ua;
            this.ca = aVar.va;
            this.da = aVar.wa;
            this.ea = aVar.xa;
            this.fa = aVar.ya;
            this.ga = aVar.za;
            this.W = aVar.pa;
            this.V = aVar.oa;
        }

        /* access modifiers changed from: private */
        public void a(b bVar, int i2, e.a aVar) {
            a(i2, aVar);
            if (bVar instanceof a) {
                this.ta = 1;
                a aVar2 = (a) bVar;
                this.sa = aVar2.getType();
                this.ua = aVar2.getReferencedIds();
            }
        }

        public void a(ConstraintLayout.a aVar) {
            aVar.f789d = this.f813h;
            aVar.f790e = this.i;
            aVar.f791f = this.j;
            aVar.f792g = this.k;
            aVar.f793h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.Q = this.A;
            aVar.R = this.B;
            aVar.F = this.Q;
            aVar.E = this.R;
            aVar.H = this.T;
            aVar.G = this.S;
            aVar.T = this.ha;
            aVar.U = this.ia;
            aVar.I = this.ja;
            aVar.J = this.ka;
            aVar.M = this.la;
            aVar.N = this.ma;
            aVar.K = this.na;
            aVar.L = this.oa;
            aVar.O = this.pa;
            aVar.P = this.qa;
            aVar.S = this.C;
            aVar.f788c = this.f812g;
            aVar.f786a = this.f810e;
            aVar.f787b = this.f811f;
            aVar.width = this.f807b;
            aVar.height = this.f808c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }

        public a clone() {
            a aVar = new a();
            aVar.f806a = this.f806a;
            aVar.f807b = this.f807b;
            aVar.f808c = this.f808c;
            aVar.f810e = this.f810e;
            aVar.f811f = this.f811f;
            aVar.f812g = this.f812g;
            aVar.f813h = this.f813h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.aa = this.aa;
            aVar.ba = this.ba;
            aVar.ca = this.ca;
            aVar.da = this.da;
            aVar.ea = this.ea;
            aVar.fa = this.fa;
            aVar.ga = this.ga;
            aVar.ha = this.ha;
            aVar.ia = this.ia;
            aVar.ja = this.ja;
            aVar.ka = this.ka;
            aVar.la = this.la;
            aVar.ma = this.ma;
            aVar.na = this.na;
            aVar.oa = this.oa;
            aVar.pa = this.pa;
            aVar.qa = this.qa;
            aVar.sa = this.sa;
            aVar.ta = this.ta;
            int[] iArr = this.ua;
            if (iArr != null) {
                aVar.ua = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.ra = this.ra;
            return aVar;
        }
    }

    static {
        f804b.append(i.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f804b.append(i.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f804b.append(i.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f804b.append(i.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f804b.append(i.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f804b.append(i.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f804b.append(i.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f804b.append(i.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f804b.append(i.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f804b.append(i.ConstraintSet_layout_editor_absoluteX, 6);
        f804b.append(i.ConstraintSet_layout_editor_absoluteY, 7);
        f804b.append(i.ConstraintSet_layout_constraintGuide_begin, 17);
        f804b.append(i.ConstraintSet_layout_constraintGuide_end, 18);
        f804b.append(i.ConstraintSet_layout_constraintGuide_percent, 19);
        f804b.append(i.ConstraintSet_android_orientation, 27);
        f804b.append(i.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f804b.append(i.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f804b.append(i.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f804b.append(i.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f804b.append(i.ConstraintSet_layout_goneMarginLeft, 13);
        f804b.append(i.ConstraintSet_layout_goneMarginTop, 16);
        f804b.append(i.ConstraintSet_layout_goneMarginRight, 14);
        f804b.append(i.ConstraintSet_layout_goneMarginBottom, 11);
        f804b.append(i.ConstraintSet_layout_goneMarginStart, 15);
        f804b.append(i.ConstraintSet_layout_goneMarginEnd, 12);
        f804b.append(i.ConstraintSet_layout_constraintVertical_weight, 40);
        f804b.append(i.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f804b.append(i.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f804b.append(i.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f804b.append(i.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f804b.append(i.ConstraintSet_layout_constraintVertical_bias, 37);
        f804b.append(i.ConstraintSet_layout_constraintDimensionRatio, 5);
        f804b.append(i.ConstraintSet_layout_constraintLeft_creator, 75);
        f804b.append(i.ConstraintSet_layout_constraintTop_creator, 75);
        f804b.append(i.ConstraintSet_layout_constraintRight_creator, 75);
        f804b.append(i.ConstraintSet_layout_constraintBottom_creator, 75);
        f804b.append(i.ConstraintSet_layout_constraintBaseline_creator, 75);
        f804b.append(i.ConstraintSet_android_layout_marginLeft, 24);
        f804b.append(i.ConstraintSet_android_layout_marginRight, 28);
        f804b.append(i.ConstraintSet_android_layout_marginStart, 31);
        f804b.append(i.ConstraintSet_android_layout_marginEnd, 8);
        f804b.append(i.ConstraintSet_android_layout_marginTop, 34);
        f804b.append(i.ConstraintSet_android_layout_marginBottom, 2);
        f804b.append(i.ConstraintSet_android_layout_width, 23);
        f804b.append(i.ConstraintSet_android_layout_height, 21);
        f804b.append(i.ConstraintSet_android_visibility, 22);
        f804b.append(i.ConstraintSet_android_alpha, 43);
        f804b.append(i.ConstraintSet_android_elevation, 44);
        f804b.append(i.ConstraintSet_android_rotationX, 45);
        f804b.append(i.ConstraintSet_android_rotationY, 46);
        f804b.append(i.ConstraintSet_android_rotation, 60);
        f804b.append(i.ConstraintSet_android_scaleX, 47);
        f804b.append(i.ConstraintSet_android_scaleY, 48);
        f804b.append(i.ConstraintSet_android_transformPivotX, 49);
        f804b.append(i.ConstraintSet_android_transformPivotY, 50);
        f804b.append(i.ConstraintSet_android_translationX, 51);
        f804b.append(i.ConstraintSet_android_translationY, 52);
        f804b.append(i.ConstraintSet_android_translationZ, 53);
        f804b.append(i.ConstraintSet_layout_constraintWidth_default, 54);
        f804b.append(i.ConstraintSet_layout_constraintHeight_default, 55);
        f804b.append(i.ConstraintSet_layout_constraintWidth_max, 56);
        f804b.append(i.ConstraintSet_layout_constraintHeight_max, 57);
        f804b.append(i.ConstraintSet_layout_constraintWidth_min, 58);
        f804b.append(i.ConstraintSet_layout_constraintHeight_min, 59);
        f804b.append(i.ConstraintSet_layout_constraintCircle, 61);
        f804b.append(i.ConstraintSet_layout_constraintCircleRadius, 62);
        f804b.append(i.ConstraintSet_layout_constraintCircleAngle, 63);
        f804b.append(i.ConstraintSet_android_id, 38);
        f804b.append(i.ConstraintSet_layout_constraintWidth_percent, 69);
        f804b.append(i.ConstraintSet_layout_constraintHeight_percent, 70);
        f804b.append(i.ConstraintSet_chainUseRtl, 71);
        f804b.append(i.ConstraintSet_barrierDirection, 72);
        f804b.append(i.ConstraintSet_constraint_referenced_ids, 73);
        f804b.append(i.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.ConstraintSet);
        a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private void a(a aVar, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f804b.get(index);
            switch (i2) {
                case 1:
                    aVar.p = a(typedArray, index, aVar.p);
                    break;
                case 2:
                    aVar.G = typedArray.getDimensionPixelSize(index, aVar.G);
                    break;
                case 3:
                    aVar.o = a(typedArray, index, aVar.o);
                    break;
                case 4:
                    aVar.n = a(typedArray, index, aVar.n);
                    break;
                case 5:
                    aVar.w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.A = typedArray.getDimensionPixelOffset(index, aVar.A);
                    break;
                case 7:
                    aVar.B = typedArray.getDimensionPixelOffset(index, aVar.B);
                    break;
                case 8:
                    aVar.H = typedArray.getDimensionPixelSize(index, aVar.H);
                    break;
                case 9:
                    aVar.t = a(typedArray, index, aVar.t);
                    break;
                case 10:
                    aVar.s = a(typedArray, index, aVar.s);
                    break;
                case 11:
                    aVar.N = typedArray.getDimensionPixelSize(index, aVar.N);
                    break;
                case 12:
                    aVar.O = typedArray.getDimensionPixelSize(index, aVar.O);
                    break;
                case 13:
                    aVar.K = typedArray.getDimensionPixelSize(index, aVar.K);
                    break;
                case 14:
                    aVar.M = typedArray.getDimensionPixelSize(index, aVar.M);
                    break;
                case 15:
                    aVar.P = typedArray.getDimensionPixelSize(index, aVar.P);
                    break;
                case 16:
                    aVar.L = typedArray.getDimensionPixelSize(index, aVar.L);
                    break;
                case 17:
                    aVar.f810e = typedArray.getDimensionPixelOffset(index, aVar.f810e);
                    break;
                case 18:
                    aVar.f811f = typedArray.getDimensionPixelOffset(index, aVar.f811f);
                    break;
                case 19:
                    aVar.f812g = typedArray.getFloat(index, aVar.f812g);
                    break;
                case 20:
                    aVar.u = typedArray.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.f808c = typedArray.getLayoutDimension(index, aVar.f808c);
                    break;
                case 22:
                    aVar.J = typedArray.getInt(index, aVar.J);
                    aVar.J = f803a[aVar.J];
                    break;
                case 23:
                    aVar.f807b = typedArray.getLayoutDimension(index, aVar.f807b);
                    break;
                case 24:
                    aVar.D = typedArray.getDimensionPixelSize(index, aVar.D);
                    break;
                case 25:
                    aVar.f813h = a(typedArray, index, aVar.f813h);
                    break;
                case 26:
                    aVar.i = a(typedArray, index, aVar.i);
                    break;
                case 27:
                    aVar.C = typedArray.getInt(index, aVar.C);
                    break;
                case 28:
                    aVar.E = typedArray.getDimensionPixelSize(index, aVar.E);
                    break;
                case 29:
                    aVar.j = a(typedArray, index, aVar.j);
                    break;
                case 30:
                    aVar.k = a(typedArray, index, aVar.k);
                    break;
                case 31:
                    aVar.I = typedArray.getDimensionPixelSize(index, aVar.I);
                    break;
                case 32:
                    aVar.q = a(typedArray, index, aVar.q);
                    break;
                case 33:
                    aVar.r = a(typedArray, index, aVar.r);
                    break;
                case 34:
                    aVar.F = typedArray.getDimensionPixelSize(index, aVar.F);
                    break;
                case 35:
                    aVar.m = a(typedArray, index, aVar.m);
                    break;
                case 36:
                    aVar.l = a(typedArray, index, aVar.l);
                    break;
                case 37:
                    aVar.v = typedArray.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.f809d = typedArray.getResourceId(index, aVar.f809d);
                    break;
                case 39:
                    aVar.R = typedArray.getFloat(index, aVar.R);
                    break;
                case 40:
                    aVar.Q = typedArray.getFloat(index, aVar.Q);
                    break;
                case 41:
                    aVar.S = typedArray.getInt(index, aVar.S);
                    break;
                case 42:
                    aVar.T = typedArray.getInt(index, aVar.T);
                    break;
                case 43:
                    aVar.U = typedArray.getFloat(index, aVar.U);
                    break;
                case 44:
                    aVar.V = true;
                    aVar.W = typedArray.getDimension(index, aVar.W);
                    break;
                case 45:
                    aVar.Y = typedArray.getFloat(index, aVar.Y);
                    break;
                case 46:
                    aVar.Z = typedArray.getFloat(index, aVar.Z);
                    break;
                case 47:
                    aVar.aa = typedArray.getFloat(index, aVar.aa);
                    break;
                case 48:
                    aVar.ba = typedArray.getFloat(index, aVar.ba);
                    break;
                case 49:
                    aVar.ca = typedArray.getFloat(index, aVar.ca);
                    break;
                case 50:
                    aVar.da = typedArray.getFloat(index, aVar.da);
                    break;
                case 51:
                    aVar.ea = typedArray.getDimension(index, aVar.ea);
                    break;
                case 52:
                    aVar.fa = typedArray.getDimension(index, aVar.fa);
                    break;
                case 53:
                    aVar.ga = typedArray.getDimension(index, aVar.ga);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.X = typedArray.getFloat(index, aVar.X);
                            break;
                        case 61:
                            aVar.x = a(typedArray, index, aVar.x);
                            break;
                        case 62:
                            aVar.y = typedArray.getDimensionPixelSize(index, aVar.y);
                            break;
                        case 63:
                            aVar.z = typedArray.getFloat(index, aVar.z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    aVar.pa = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    aVar.qa = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    aVar.sa = typedArray.getInt(index, aVar.sa);
                                    continue;
                                case 73:
                                    aVar.va = typedArray.getString(index);
                                    continue;
                                case 74:
                                    aVar.ra = typedArray.getBoolean(index, aVar.ra);
                                    continue;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    break;
                            }
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f804b.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                    }
            }
        }
    }

    private int[] a(View view, String str) {
        int i;
        Object a2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = h.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) view.getParent()).a(0, (Object) trim)) != null && (a2 instanceof Integer)) {
                i = ((Integer) a2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.f806a = true;
                    }
                    this.f805c.put(Integer.valueOf(a2.f809d), a2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f805c.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f805c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f805c.get(Integer.valueOf(id));
                    if (childAt instanceof a) {
                        aVar.ta = 1;
                    }
                    int i2 = aVar.ta;
                    if (i2 != -1 && i2 == 1) {
                        a aVar2 = (a) childAt;
                        aVar2.setId(id);
                        aVar2.setType(aVar.sa);
                        aVar2.setAllowsGoneWidget(aVar.ra);
                        int[] iArr = aVar.ua;
                        if (iArr != null) {
                            aVar2.setReferencedIds(iArr);
                        } else {
                            String str = aVar.va;
                            if (str != null) {
                                aVar.ua = a((View) aVar2, str);
                                aVar2.setReferencedIds(aVar.ua);
                            }
                        }
                    }
                    ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                    aVar.a(aVar3);
                    childAt.setLayoutParams(aVar3);
                    childAt.setVisibility(aVar.J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.U);
                        childAt.setRotation(aVar.X);
                        childAt.setRotationX(aVar.Y);
                        childAt.setRotationY(aVar.Z);
                        childAt.setScaleX(aVar.aa);
                        childAt.setScaleY(aVar.ba);
                        if (!Float.isNaN(aVar.ca)) {
                            childAt.setPivotX(aVar.ca);
                        }
                        if (!Float.isNaN(aVar.da)) {
                            childAt.setPivotY(aVar.da);
                        }
                        childAt.setTranslationX(aVar.ea);
                        childAt.setTranslationY(aVar.fa);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.ga);
                            if (aVar.V) {
                                childAt.setElevation(aVar.W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar4 = this.f805c.get(num);
            int i3 = aVar4.ta;
            if (i3 != -1 && i3 == 1) {
                a aVar5 = new a(constraintLayout.getContext());
                aVar5.setId(num.intValue());
                int[] iArr2 = aVar4.ua;
                if (iArr2 != null) {
                    aVar5.setReferencedIds(iArr2);
                } else {
                    String str2 = aVar4.va;
                    if (str2 != null) {
                        aVar4.ua = a((View) aVar5, str2);
                        aVar5.setReferencedIds(aVar4.ua);
                    }
                }
                aVar5.setType(aVar4.sa);
                ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar5.a();
                aVar4.a(generateDefaultLayoutParams);
                constraintLayout.addView(aVar5, generateDefaultLayoutParams);
            }
            if (aVar4.f806a) {
                f fVar = new f(constraintLayout.getContext());
                fVar.setId(num.intValue());
                ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar4.a(generateDefaultLayoutParams2);
                constraintLayout.addView(fVar, generateDefaultLayoutParams2);
            }
        }
    }

    public void a(e eVar) {
        int childCount = eVar.getChildCount();
        this.f805c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f805c.containsKey(Integer.valueOf(id))) {
                    this.f805c.put(Integer.valueOf(id), new a());
                }
                a aVar2 = this.f805c.get(Integer.valueOf(id));
                if (childAt instanceof b) {
                    aVar2.a((b) childAt, id, aVar);
                }
                aVar2.a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
