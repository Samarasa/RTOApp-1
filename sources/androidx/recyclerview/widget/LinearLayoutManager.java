package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.i implements q, RecyclerView.t.a {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    w u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        w f1279a;

        /* renamed from: b  reason: collision with root package name */
        int f1280b;

        /* renamed from: c  reason: collision with root package name */
        int f1281c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1282d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1283e;

        a() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1281c = this.f1282d ? this.f1279a.b() : this.f1279a.f();
        }

        public void a(View view, int i) {
            this.f1281c = this.f1282d ? this.f1279a.a(view) + this.f1279a.h() : this.f1279a.d(view);
            this.f1280b = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View view, RecyclerView.u uVar) {
            RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
            return !jVar.c() && jVar.a() >= 0 && jVar.a() < uVar.a();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1280b = -1;
            this.f1281c = Integer.MIN_VALUE;
            this.f1282d = false;
            this.f1283e = false;
        }

        public void b(View view, int i) {
            int h2 = this.f1279a.h();
            if (h2 >= 0) {
                a(view, i);
                return;
            }
            this.f1280b = i;
            if (this.f1282d) {
                int b2 = (this.f1279a.b() - h2) - this.f1279a.a(view);
                this.f1281c = this.f1279a.b() - b2;
                if (b2 > 0) {
                    int b3 = this.f1281c - this.f1279a.b(view);
                    int f2 = this.f1279a.f();
                    int min = b3 - (f2 + Math.min(this.f1279a.d(view) - f2, 0));
                    if (min < 0) {
                        this.f1281c += Math.min(b2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d2 = this.f1279a.d(view);
            int f3 = d2 - this.f1279a.f();
            this.f1281c = d2;
            if (f3 > 0) {
                int b4 = (this.f1279a.b() - Math.min(0, (this.f1279a.b() - h2) - this.f1279a.a(view))) - (d2 + this.f1279a.b(view));
                if (b4 < 0) {
                    this.f1281c -= Math.min(f3, -b4);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1280b + ", mCoordinate=" + this.f1281c + ", mLayoutFromEnd=" + this.f1282d + ", mValid=" + this.f1283e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1284a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1285b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1286c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1287d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1284a = 0;
            this.f1285b = false;
            this.f1286c = false;
            this.f1287d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f1288a = true;

        /* renamed from: b  reason: collision with root package name */
        int f1289b;

        /* renamed from: c  reason: collision with root package name */
        int f1290c;

        /* renamed from: d  reason: collision with root package name */
        int f1291d;

        /* renamed from: e  reason: collision with root package name */
        int f1292e;

        /* renamed from: f  reason: collision with root package name */
        int f1293f;

        /* renamed from: g  reason: collision with root package name */
        int f1294g;

        /* renamed from: h  reason: collision with root package name */
        int f1295h = 0;
        int i = 0;
        boolean j = false;
        int k;
        List<RecyclerView.x> l = null;
        boolean m;

        c() {
        }

        private View b() {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.l.get(i2).itemView;
                RecyclerView.j jVar = (RecyclerView.j) view.getLayoutParams();
                if (!jVar.c() && this.f1291d == jVar.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public View a(RecyclerView.p pVar) {
            if (this.l != null) {
                return b();
            }
            View d2 = pVar.d(this.f1291d);
            this.f1291d += this.f1292e;
            return d2;
        }

        public void a() {
            a((View) null);
        }

        public void a(View view) {
            View b2 = b(view);
            this.f1291d = b2 == null ? -1 : ((RecyclerView.j) b2.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean a(RecyclerView.u uVar) {
            int i2 = this.f1291d;
            return i2 >= 0 && i2 < uVar.a();
        }

        public View b(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.l.get(i3).itemView;
                RecyclerView.j jVar = (RecyclerView.j) view3.getLayoutParams();
                if (view3 != view && !jVar.c() && (a2 = (jVar.a() - this.f1291d) * this.f1292e) >= 0 && a2 < i2) {
                    if (a2 == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new s();

        /* renamed from: a  reason: collision with root package name */
        int f1296a;

        /* renamed from: b  reason: collision with root package name */
        int f1297b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1298c;

        public d() {
        }

        d(Parcel parcel) {
            this.f1296a = parcel.readInt();
            this.f1297b = parcel.readInt();
            this.f1298c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1296a = dVar.f1296a;
            this.f1297b = dVar.f1297b;
            this.f1298c = dVar.f1298c;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f1296a >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1296a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1296a);
            parcel.writeInt(this.f1297b);
            parcel.writeInt(this.f1298c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        i(i);
        a(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.i.b a2 = RecyclerView.i.a(context, attributeSet, i, i2);
        i(a2.f1339a);
        a(a2.f1341c);
        b(a2.f1342d);
    }

    private View L() {
        return e(0, e());
    }

    private View M() {
        return e(e() - 1, -1);
    }

    private View N() {
        return this.x ? L() : M();
    }

    private View O() {
        return this.x ? M() : L();
    }

    private View P() {
        return c(this.x ? 0 : e() - 1);
    }

    private View Q() {
        return c(this.x ? e() - 1 : 0);
    }

    private void R() {
        this.x = (this.s == 1 || !I()) ? this.w : !this.w;
    }

    private int a(int i, RecyclerView.p pVar, RecyclerView.u uVar, boolean z2) {
        int b2;
        int b3 = this.u.b() - i;
        if (b3 <= 0) {
            return 0;
        }
        int i2 = -c(-b3, pVar, uVar);
        int i3 = i + i2;
        if (!z2 || (b2 = this.u.b() - i3) <= 0) {
            return i2;
        }
        this.u.a(b2);
        return b2 + i2;
    }

    private void a(int i, int i2, boolean z2, RecyclerView.u uVar) {
        int i3;
        this.t.m = K();
        this.t.f1293f = i;
        int[] iArr = this.H;
        boolean z3 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        a(uVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z3 = true;
        }
        this.t.f1295h = z3 ? max2 : max;
        c cVar = this.t;
        if (!z3) {
            max = max2;
        }
        cVar.i = max;
        int i4 = -1;
        if (z3) {
            this.t.f1295h += this.u.c();
            View P = P();
            c cVar2 = this.t;
            if (!this.x) {
                i4 = 1;
            }
            cVar2.f1292e = i4;
            c cVar3 = this.t;
            int l = l(P);
            c cVar4 = this.t;
            cVar3.f1291d = l + cVar4.f1292e;
            cVar4.f1289b = this.u.a(P);
            i3 = this.u.a(P) - this.u.b();
        } else {
            View Q = Q();
            this.t.f1295h += this.u.f();
            c cVar5 = this.t;
            if (this.x) {
                i4 = 1;
            }
            cVar5.f1292e = i4;
            c cVar6 = this.t;
            int l2 = l(Q);
            c cVar7 = this.t;
            cVar6.f1291d = l2 + cVar7.f1292e;
            cVar7.f1289b = this.u.d(Q);
            i3 = (-this.u.d(Q)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.f1290c = i2;
        if (z2) {
            cVar8.f1290c -= i3;
        }
        this.t.f1294g = i3;
    }

    private void a(a aVar) {
        f(aVar.f1280b, aVar.f1281c);
    }

    private void a(RecyclerView.p pVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, pVar);
                }
                return;
            }
            while (i > i2) {
                a(i, pVar);
                i--;
            }
        }
    }

    private void a(RecyclerView.p pVar, c cVar) {
        if (cVar.f1288a && !cVar.m) {
            int i = cVar.f1294g;
            int i2 = cVar.i;
            if (cVar.f1293f == -1) {
                b(pVar, i, i2);
            } else {
                c(pVar, i, i2);
            }
        }
    }

    private boolean a(RecyclerView.p pVar, RecyclerView.u uVar, a aVar) {
        boolean z2 = false;
        if (e() == 0) {
            return false;
        }
        View g2 = g();
        if (g2 != null && aVar.a(g2, uVar)) {
            aVar.b(g2, l(g2));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View h2 = aVar.f1282d ? h(pVar, uVar) : i(pVar, uVar);
            if (h2 == null) {
                return false;
            }
            aVar.a(h2, l(h2));
            if (!uVar.d() && C()) {
                if (this.u.d(h2) >= this.u.b() || this.u.a(h2) < this.u.f()) {
                    z2 = true;
                }
                if (z2) {
                    aVar.f1281c = aVar.f1282d ? this.u.b() : this.u.f();
                }
            }
            return true;
        }
    }

    private boolean a(RecyclerView.u uVar, a aVar) {
        int i;
        boolean z2 = false;
        if (!uVar.d() && (i = this.A) != -1) {
            if (i < 0 || i >= uVar.a()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f1280b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    aVar.f1282d = this.D.f1298c;
                    aVar.f1281c = aVar.f1282d ? this.u.b() - this.D.f1297b : this.u.f() + this.D.f1297b;
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View b2 = b(this.A);
                    if (b2 == null) {
                        if (e() > 0) {
                            if ((this.A < l(c(0))) == this.x) {
                                z2 = true;
                            }
                            aVar.f1282d = z2;
                        }
                        aVar.a();
                    } else if (this.u.b(b2) > this.u.g()) {
                        aVar.a();
                        return true;
                    } else if (this.u.d(b2) - this.u.f() < 0) {
                        aVar.f1281c = this.u.f();
                        aVar.f1282d = false;
                        return true;
                    } else if (this.u.b() - this.u.a(b2) < 0) {
                        aVar.f1281c = this.u.b();
                        aVar.f1282d = true;
                        return true;
                    } else {
                        aVar.f1281c = aVar.f1282d ? this.u.a(b2) + this.u.h() : this.u.d(b2);
                    }
                    return true;
                } else {
                    boolean z3 = this.x;
                    aVar.f1282d = z3;
                    aVar.f1281c = z3 ? this.u.b() - this.B : this.u.f() + this.B;
                    return true;
                }
            }
        }
        return false;
    }

    private int b(int i, RecyclerView.p pVar, RecyclerView.u uVar, boolean z2) {
        int f2;
        int f3 = i - this.u.f();
        if (f3 <= 0) {
            return 0;
        }
        int i2 = -c(f3, pVar, uVar);
        int i3 = i + i2;
        if (!z2 || (f2 = i3 - this.u.f()) <= 0) {
            return i2;
        }
        this.u.a(-f2);
        return i2 - f2;
    }

    private void b(a aVar) {
        g(aVar.f1280b, aVar.f1281c);
    }

    private void b(RecyclerView.p pVar, int i, int i2) {
        int e2 = e();
        if (i >= 0) {
            int a2 = (this.u.a() - i) + i2;
            if (this.x) {
                for (int i3 = 0; i3 < e2; i3++) {
                    View c2 = c(i3);
                    if (this.u.d(c2) < a2 || this.u.f(c2) < a2) {
                        a(pVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = e2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View c3 = c(i5);
                if (this.u.d(c3) < a2 || this.u.f(c3) < a2) {
                    a(pVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void b(RecyclerView.p pVar, RecyclerView.u uVar, int i, int i2) {
        RecyclerView.p pVar2 = pVar;
        RecyclerView.u uVar2 = uVar;
        if (uVar.e() && e() != 0 && !uVar.d() && C()) {
            List<RecyclerView.x> f2 = pVar.f();
            int size = f2.size();
            int l = l(c(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.x xVar = f2.get(i5);
                if (!xVar.isRemoved()) {
                    char c2 = 1;
                    if ((xVar.getLayoutPosition() < l) != this.x) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.u.b(xVar.itemView);
                    } else {
                        i4 += this.u.b(xVar.itemView);
                    }
                }
            }
            this.t.l = f2;
            if (i3 > 0) {
                g(l(Q()), i);
                c cVar = this.t;
                cVar.f1295h = i3;
                cVar.f1290c = 0;
                cVar.a();
                a(pVar2, this.t, uVar2, false);
            }
            if (i4 > 0) {
                f(l(P()), i2);
                c cVar2 = this.t;
                cVar2.f1295h = i4;
                cVar2.f1290c = 0;
                cVar2.a();
                a(pVar2, this.t, uVar2, false);
            }
            this.t.l = null;
        }
    }

    private void b(RecyclerView.p pVar, RecyclerView.u uVar, a aVar) {
        if (!a(uVar, aVar) && !a(pVar, uVar, aVar)) {
            aVar.a();
            aVar.f1280b = this.y ? uVar.a() - 1 : 0;
        }
    }

    private void c(RecyclerView.p pVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int e2 = e();
            if (this.x) {
                int i4 = e2 - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View c2 = c(i5);
                    if (this.u.a(c2) > i3 || this.u.e(c2) > i3) {
                        a(pVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < e2; i6++) {
                View c3 = c(i6);
                if (this.u.a(c3) > i3 || this.u.e(c3) > i3) {
                    a(pVar, 0, i6);
                    return;
                }
            }
        }
    }

    private View f(RecyclerView.p pVar, RecyclerView.u uVar) {
        return a(pVar, uVar, 0, e(), uVar.a());
    }

    private void f(int i, int i2) {
        this.t.f1290c = this.u.b() - i2;
        this.t.f1292e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f1291d = i;
        cVar.f1293f = 1;
        cVar.f1289b = i2;
        cVar.f1294g = Integer.MIN_VALUE;
    }

    private View g(RecyclerView.p pVar, RecyclerView.u uVar) {
        return a(pVar, uVar, e() - 1, -1, uVar.a());
    }

    private void g(int i, int i2) {
        this.t.f1290c = i2 - this.u.f();
        c cVar = this.t;
        cVar.f1291d = i;
        cVar.f1292e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f1293f = -1;
        cVar2.f1289b = i2;
        cVar2.f1294g = Integer.MIN_VALUE;
    }

    private View h(RecyclerView.p pVar, RecyclerView.u uVar) {
        return this.x ? f(pVar, uVar) : g(pVar, uVar);
    }

    private int i(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        E();
        w wVar = this.u;
        View b2 = b(!this.z, true);
        return H.a(uVar, wVar, b2, a(!this.z, true), this, this.z);
    }

    private View i(RecyclerView.p pVar, RecyclerView.u uVar) {
        return this.x ? g(pVar, uVar) : f(pVar, uVar);
    }

    private int j(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        E();
        w wVar = this.u;
        View b2 = b(!this.z, true);
        return H.a(uVar, wVar, b2, a(!this.z, true), this, this.z, this.x);
    }

    private int k(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        E();
        w wVar = this.u;
        View b2 = b(!this.z, true);
        return H.b(uVar, wVar, b2, a(!this.z, true), this, this.z);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return (i() == 1073741824 || r() == 1073741824 || !s()) ? false : true;
    }

    public boolean C() {
        return this.D == null && this.v == this.y;
    }

    /* access modifiers changed from: package-private */
    public c D() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (this.t == null) {
            this.t = D();
        }
    }

    public int F() {
        View a2 = a(0, e(), false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int G() {
        View a2 = a(e() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int H() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return j() == 1;
    }

    public boolean J() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    public int a(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        if (this.s == 1) {
            return 0;
        }
        return c(i, pVar, uVar);
    }

    /* access modifiers changed from: package-private */
    public int a(RecyclerView.p pVar, c cVar, RecyclerView.u uVar, boolean z2) {
        int i = cVar.f1290c;
        int i2 = cVar.f1294g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f1294g = i2 + i;
            }
            a(pVar, cVar);
        }
        int i3 = cVar.f1290c + cVar.f1295h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.a(uVar)) {
                break;
            }
            bVar.a();
            a(pVar, uVar, cVar, bVar);
            if (!bVar.f1285b) {
                cVar.f1289b += bVar.f1284a * cVar.f1293f;
                if (!bVar.f1286c || cVar.l != null || !uVar.d()) {
                    int i4 = cVar.f1290c;
                    int i5 = bVar.f1284a;
                    cVar.f1290c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f1294g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f1294g = i6 + bVar.f1284a;
                    int i7 = cVar.f1290c;
                    if (i7 < 0) {
                        cVar.f1294g += i7;
                    }
                    a(pVar, cVar);
                }
                if (z2 && bVar.f1287d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1290c;
    }

    public int a(RecyclerView.u uVar) {
        return i(uVar);
    }

    /* access modifiers changed from: package-private */
    public View a(int i, int i2, boolean z2, boolean z3) {
        E();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return (this.s == 0 ? this.f1335e : this.f1336f).a(i, i2, i4, i3);
    }

    public View a(View view, int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        int h2;
        R();
        if (e() == 0 || (h2 = h(i)) == Integer.MIN_VALUE) {
            return null;
        }
        E();
        a(h2, (int) (((float) this.u.g()) * 0.33333334f), false, uVar);
        c cVar = this.t;
        cVar.f1294g = Integer.MIN_VALUE;
        cVar.f1288a = false;
        a(pVar, cVar, uVar, true);
        View O = h2 == -1 ? O() : N();
        View Q = h2 == -1 ? Q() : P();
        if (!Q.hasFocusable()) {
            return O;
        }
        if (O == null) {
            return null;
        }
        return Q;
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.p pVar, RecyclerView.u uVar, int i, int i2, int i3) {
        E();
        int f2 = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c2 = c(i);
            int l = l(c2);
            if (l >= 0 && l < i3) {
                if (((RecyclerView.j) c2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = c2;
                    }
                } else if (this.u.d(c2) < b2 && this.u.a(c2) >= f2) {
                    return c2;
                } else {
                    if (view == null) {
                        view = c2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    public View a(boolean z2, boolean z3) {
        int e2;
        int i;
        if (this.x) {
            e2 = 0;
            i = e();
        } else {
            e2 = e() - 1;
            i = -1;
        }
        return a(e2, i, z2, z3);
    }

    public void a(int i, int i2, RecyclerView.u uVar, RecyclerView.i.a aVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (e() != 0 && i != 0) {
            E();
            a(i > 0 ? 1 : -1, Math.abs(i), true, uVar);
            a(uVar, this.t, aVar);
        }
    }

    public void a(int i, RecyclerView.i.a aVar) {
        boolean z2;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            R();
            z2 = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z2 = dVar2.f1298c;
            i2 = dVar2.f1296a;
        }
        if (!z2) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.G && i4 >= 0 && i4 < i; i5++) {
            aVar.a(i4, 0);
            i4 += i3;
        }
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            y();
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            accessibilityEvent.setFromIndex(F());
            accessibilityEvent.setToIndex(G());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.p pVar, RecyclerView.u uVar, a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.p pVar, RecyclerView.u uVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a2 = cVar.a(pVar);
        if (a2 == null) {
            bVar.f1285b = true;
            return;
        }
        RecyclerView.j jVar = (RecyclerView.j) a2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f1293f == -1)) {
                b(a2);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.x == (cVar.f1293f == -1)) {
                a(a2);
            } else {
                a(a2, 0);
            }
        }
        a(a2, 0, 0);
        bVar.f1284a = this.u.b(a2);
        if (this.s == 1) {
            if (I()) {
                i5 = q() - o();
                i4 = i5 - this.u.c(a2);
            } else {
                i4 = n();
                i5 = this.u.c(a2) + i4;
            }
            if (cVar.f1293f == -1) {
                int i6 = cVar.f1289b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f1284a;
            } else {
                int i7 = cVar.f1289b;
                i3 = i7;
                i2 = i5;
                i = bVar.f1284a + i7;
            }
        } else {
            int p = p();
            int c2 = this.u.c(a2) + p;
            if (cVar.f1293f == -1) {
                int i8 = cVar.f1289b;
                i2 = i8;
                i3 = p;
                i = c2;
                i4 = i8 - bVar.f1284a;
            } else {
                int i9 = cVar.f1289b;
                i3 = p;
                i2 = bVar.f1284a + i9;
                i = c2;
                i4 = i9;
            }
        }
        a(a2, i4, i3, i2, i);
        if (jVar.c() || jVar.b()) {
            bVar.f1286c = true;
        }
        bVar.f1287d = a2.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.u uVar, c cVar, RecyclerView.i.a aVar) {
        int i = cVar.f1291d;
        if (i >= 0 && i < uVar.a()) {
            aVar.a(i, Math.max(0, cVar.f1294g));
        }
    }

    /* access modifiers changed from: protected */
    public void a(RecyclerView.u uVar, int[] iArr) {
        int i;
        int h2 = h(uVar);
        if (this.t.f1293f == -1) {
            i = 0;
        } else {
            i = h2;
            h2 = 0;
        }
        iArr[0] = h2;
        iArr[1] = i;
    }

    public void a(String str) {
        if (this.D == null) {
            super.a(str);
        }
    }

    public void a(boolean z2) {
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            y();
        }
    }

    public boolean a() {
        return this.s == 0;
    }

    public int b(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        if (this.s == 0) {
            return 0;
        }
        return c(i, pVar, uVar);
    }

    public int b(RecyclerView.u uVar) {
        return j(uVar);
    }

    public View b(int i) {
        int e2 = e();
        if (e2 == 0) {
            return null;
        }
        int l = i - l(c(0));
        if (l >= 0 && l < e2) {
            View c2 = c(l);
            if (l(c2) == i) {
                return c2;
            }
        }
        return super.b(i);
    }

    /* access modifiers changed from: package-private */
    public View b(boolean z2, boolean z3) {
        int i;
        int e2;
        if (this.x) {
            i = e() - 1;
            e2 = -1;
        } else {
            i = 0;
            e2 = e();
        }
        return a(i, e2, z2, z3);
    }

    public void b(RecyclerView recyclerView, RecyclerView.p pVar) {
        super.b(recyclerView, pVar);
        if (this.C) {
            b(pVar);
            pVar.a();
        }
    }

    public void b(boolean z2) {
        a((String) null);
        if (this.y != z2) {
            this.y = z2;
            y();
        }
    }

    public boolean b() {
        return this.s == 1;
    }

    /* access modifiers changed from: package-private */
    public int c(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        E();
        this.t.f1288a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, uVar);
        c cVar = this.t;
        int a2 = cVar.f1294g + a(pVar, cVar, uVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.a(-i);
        this.t.k = i;
        return i;
    }

    public int c(RecyclerView.u uVar) {
        return k(uVar);
    }

    public RecyclerView.j c() {
        return new RecyclerView.j(-2, -2);
    }

    public int d(RecyclerView.u uVar) {
        return i(uVar);
    }

    public int e(RecyclerView.u uVar) {
        return j(uVar);
    }

    /* access modifiers changed from: package-private */
    public View e(int i, int i2) {
        int i3;
        int i4;
        E();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return c(i);
        }
        if (this.u.d(c(i)) < this.u.f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.s == 0 ? this.f1335e : this.f1336f).a(i, i2, i4, i3);
    }

    public void e(RecyclerView.p pVar, RecyclerView.u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View b2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.D == null && this.A == -1) && uVar.a() == 0) {
            b(pVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f1296a;
        }
        E();
        this.t.f1288a = false;
        R();
        View g2 = g();
        if (!this.E.f1283e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.f1282d = this.x ^ this.y;
            b(pVar, uVar, aVar);
            this.E.f1283e = true;
        } else if (g2 != null && (this.u.d(g2) >= this.u.b() || this.u.a(g2) <= this.u.f())) {
            this.E.b(g2, l(g2));
        }
        c cVar = this.t;
        cVar.f1293f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        a(uVar, iArr);
        int max = Math.max(0, this.H[0]) + this.u.f();
        int max2 = Math.max(0, this.H[1]) + this.u.c();
        if (!(!uVar.d() || (i6 = this.A) == -1 || this.B == Integer.MIN_VALUE || (b2 = b(i6)) == null)) {
            if (this.x) {
                i7 = this.u.b() - this.u.a(b2);
                i8 = this.B;
            } else {
                i8 = this.u.d(b2) - this.u.f();
                i7 = this.B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.E.f1282d ? !this.x : this.x) {
            i9 = 1;
        }
        a(pVar, uVar, this.E, i9);
        a(pVar);
        this.t.m = K();
        this.t.j = uVar.d();
        this.t.i = 0;
        a aVar2 = this.E;
        if (aVar2.f1282d) {
            b(aVar2);
            c cVar2 = this.t;
            cVar2.f1295h = max;
            a(pVar, cVar2, uVar, false);
            c cVar3 = this.t;
            i2 = cVar3.f1289b;
            int i11 = cVar3.f1291d;
            int i12 = cVar3.f1290c;
            if (i12 > 0) {
                max2 += i12;
            }
            a(this.E);
            c cVar4 = this.t;
            cVar4.f1295h = max2;
            cVar4.f1291d += cVar4.f1292e;
            a(pVar, cVar4, uVar, false);
            c cVar5 = this.t;
            i = cVar5.f1289b;
            int i13 = cVar5.f1290c;
            if (i13 > 0) {
                g(i11, i2);
                c cVar6 = this.t;
                cVar6.f1295h = i13;
                a(pVar, cVar6, uVar, false);
                i2 = this.t.f1289b;
            }
        } else {
            a(aVar2);
            c cVar7 = this.t;
            cVar7.f1295h = max2;
            a(pVar, cVar7, uVar, false);
            c cVar8 = this.t;
            i = cVar8.f1289b;
            int i14 = cVar8.f1291d;
            int i15 = cVar8.f1290c;
            if (i15 > 0) {
                max += i15;
            }
            b(this.E);
            c cVar9 = this.t;
            cVar9.f1295h = max;
            cVar9.f1291d += cVar9.f1292e;
            a(pVar, cVar9, uVar, false);
            c cVar10 = this.t;
            i2 = cVar10.f1289b;
            int i16 = cVar10.f1290c;
            if (i16 > 0) {
                f(i14, i);
                c cVar11 = this.t;
                cVar11.f1295h = i16;
                a(pVar, cVar11, uVar, false);
                i = this.t.f1289b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int a2 = a(i, pVar, uVar, true);
                i4 = i2 + a2;
                i3 = i + a2;
                i5 = b(i4, pVar, uVar, false);
            } else {
                int b3 = b(i2, pVar, uVar, true);
                i4 = i2 + b3;
                i3 = i + b3;
                i5 = a(i3, pVar, uVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        b(pVar, uVar, i2, i);
        if (!uVar.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    public int f(RecyclerView.u uVar) {
        return k(uVar);
    }

    public void g(RecyclerView.u uVar) {
        super.g(uVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.b();
    }

    /* access modifiers changed from: package-private */
    public int h(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && I()) ? -1 : 1 : (this.s != 1 && I()) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int h(RecyclerView.u uVar) {
        if (uVar.c()) {
            return this.u.g();
        }
        return 0;
    }

    public void i(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.s || this.u == null) {
                this.u = w.a(this, i);
                this.E.f1279a = this.u;
                this.s = i;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public boolean u() {
        return true;
    }

    public Parcelable x() {
        d dVar = this.D;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (e() > 0) {
            E();
            boolean z2 = this.v ^ this.x;
            dVar2.f1298c = z2;
            if (z2) {
                View P = P();
                dVar2.f1297b = this.u.b() - this.u.a(P);
                dVar2.f1296a = l(P);
            } else {
                View Q = Q();
                dVar2.f1296a = l(Q);
                dVar2.f1297b = this.u.d(Q) - this.u.f();
            }
        } else {
            dVar2.b();
        }
        return dVar2;
    }
}
