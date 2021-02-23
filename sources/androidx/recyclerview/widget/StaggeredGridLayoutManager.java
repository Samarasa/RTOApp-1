package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.a.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.i implements RecyclerView.t.a {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    c E = new c();
    private int F = 2;
    private boolean G;
    private boolean H;
    private d I;
    private int J;
    private final Rect K = new Rect();
    private final a L = new a();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new J(this);
    private int s = -1;
    e[] t;
    w u;
    w v;
    private int w;
    private int x;
    private final r y;
    boolean z = false;

    class a {

        /* renamed from: a  reason: collision with root package name */
        int f1378a;

        /* renamed from: b  reason: collision with root package name */
        int f1379b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1380c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1381d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1382e;

        /* renamed from: f  reason: collision with root package name */
        int[] f1383f;

        a() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1379b = this.f1380c ? StaggeredGridLayoutManager.this.u.b() : StaggeredGridLayoutManager.this.u.f();
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.f1379b = this.f1380c ? StaggeredGridLayoutManager.this.u.b() - i : StaggeredGridLayoutManager.this.u.f() + i;
        }

        /* access modifiers changed from: package-private */
        public void a(e[] eVarArr) {
            int length = eVarArr.length;
            int[] iArr = this.f1383f;
            if (iArr == null || iArr.length < length) {
                this.f1383f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f1383f[i] = eVarArr[i].b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1378a = -1;
            this.f1379b = Integer.MIN_VALUE;
            this.f1380c = false;
            this.f1381d = false;
            this.f1382e = false;
            int[] iArr = this.f1383f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class b extends RecyclerView.j {

        /* renamed from: e  reason: collision with root package name */
        e f1385e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1386f;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            e eVar = this.f1385e;
            if (eVar == null) {
                return -1;
            }
            return eVar.f1405e;
        }

        public boolean f() {
            return this.f1386f;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        int[] f1387a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f1388b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new K();

            /* renamed from: a  reason: collision with root package name */
            int f1389a;

            /* renamed from: b  reason: collision with root package name */
            int f1390b;

            /* renamed from: c  reason: collision with root package name */
            int[] f1391c;

            /* renamed from: d  reason: collision with root package name */
            boolean f1392d;

            a() {
            }

            a(Parcel parcel) {
                this.f1389a = parcel.readInt();
                this.f1390b = parcel.readInt();
                this.f1392d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f1391c = new int[readInt];
                    parcel.readIntArray(this.f1391c);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i) {
                int[] iArr = this.f1391c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1389a + ", mGapDir=" + this.f1390b + ", mHasUnwantedGapAfter=" + this.f1392d + ", mGapPerSpan=" + Arrays.toString(this.f1391c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1389a);
                parcel.writeInt(this.f1390b);
                parcel.writeInt(this.f1392d ? 1 : 0);
                int[] iArr = this.f1391c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1391c);
            }
        }

        c() {
        }

        private void c(int i, int i2) {
            List<a> list = this.f1388b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f1388b.get(size);
                    int i3 = aVar.f1389a;
                    if (i3 >= i) {
                        aVar.f1389a = i3 + i2;
                    }
                }
            }
        }

        private void d(int i, int i2) {
            List<a> list = this.f1388b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f1388b.get(size);
                    int i4 = aVar.f1389a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f1388b.remove(size);
                        } else {
                            aVar.f1389a = i4 - i2;
                        }
                    }
                }
            }
        }

        private int g(int i) {
            if (this.f1388b == null) {
                return -1;
            }
            a c2 = c(i);
            if (c2 != null) {
                this.f1388b.remove(c2);
            }
            int size = this.f1388b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f1388b.get(i2).f1389a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f1388b.remove(i2);
            return this.f1388b.get(i2).f1389a;
        }

        public a a(int i, int i2, int i3, boolean z) {
            List<a> list = this.f1388b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f1388b.get(i4);
                int i5 = aVar.f1389a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f1390b == i3 || (z && aVar.f1392d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f1387a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1388b = null;
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            int[] iArr = this.f1387a;
            if (iArr == null) {
                this.f1387a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f1387a, -1);
            } else if (i >= iArr.length) {
                this.f1387a = new int[f(i)];
                System.arraycopy(iArr, 0, this.f1387a, 0, iArr.length);
                int[] iArr2 = this.f1387a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i, int i2) {
            int[] iArr = this.f1387a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.f1387a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f1387a, i, i3, -1);
                c(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i, e eVar) {
            a(i);
            this.f1387a[i] = eVar.f1405e;
        }

        public void a(a aVar) {
            if (this.f1388b == null) {
                this.f1388b = new ArrayList();
            }
            int size = this.f1388b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.f1388b.get(i);
                if (aVar2.f1389a == aVar.f1389a) {
                    this.f1388b.remove(i);
                }
                if (aVar2.f1389a >= aVar.f1389a) {
                    this.f1388b.add(i, aVar);
                    return;
                }
            }
            this.f1388b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            List<a> list = this.f1388b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1388b.get(size).f1389a >= i) {
                        this.f1388b.remove(size);
                    }
                }
            }
            return e(i);
        }

        /* access modifiers changed from: package-private */
        public void b(int i, int i2) {
            int[] iArr = this.f1387a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.f1387a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f1387a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                d(i, i2);
            }
        }

        public a c(int i) {
            List<a> list = this.f1388b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1388b.get(size);
                if (aVar.f1389a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int d(int i) {
            int[] iArr = this.f1387a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        public int e(int i) {
            int[] iArr = this.f1387a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g2 = g(i);
            if (g2 == -1) {
                int[] iArr2 = this.f1387a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f1387a.length;
            }
            int i2 = g2 + 1;
            Arrays.fill(this.f1387a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        public int f(int i) {
            int length = this.f1387a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new L();

        /* renamed from: a  reason: collision with root package name */
        int f1393a;

        /* renamed from: b  reason: collision with root package name */
        int f1394b;

        /* renamed from: c  reason: collision with root package name */
        int f1395c;

        /* renamed from: d  reason: collision with root package name */
        int[] f1396d;

        /* renamed from: e  reason: collision with root package name */
        int f1397e;

        /* renamed from: f  reason: collision with root package name */
        int[] f1398f;

        /* renamed from: g  reason: collision with root package name */
        List<c.a> f1399g;

        /* renamed from: h  reason: collision with root package name */
        boolean f1400h;
        boolean i;
        boolean j;

        public d() {
        }

        d(Parcel parcel) {
            this.f1393a = parcel.readInt();
            this.f1394b = parcel.readInt();
            this.f1395c = parcel.readInt();
            int i2 = this.f1395c;
            if (i2 > 0) {
                this.f1396d = new int[i2];
                parcel.readIntArray(this.f1396d);
            }
            this.f1397e = parcel.readInt();
            int i3 = this.f1397e;
            if (i3 > 0) {
                this.f1398f = new int[i3];
                parcel.readIntArray(this.f1398f);
            }
            boolean z = false;
            this.f1400h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z;
            this.f1399g = parcel.readArrayList(c.a.class.getClassLoader());
        }

        public d(d dVar) {
            this.f1395c = dVar.f1395c;
            this.f1393a = dVar.f1393a;
            this.f1394b = dVar.f1394b;
            this.f1396d = dVar.f1396d;
            this.f1397e = dVar.f1397e;
            this.f1398f = dVar.f1398f;
            this.f1400h = dVar.f1400h;
            this.i = dVar.i;
            this.j = dVar.j;
            this.f1399g = dVar.f1399g;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1396d = null;
            this.f1395c = 0;
            this.f1397e = 0;
            this.f1398f = null;
            this.f1399g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1393a);
            parcel.writeInt(this.f1394b);
            parcel.writeInt(this.f1395c);
            if (this.f1395c > 0) {
                parcel.writeIntArray(this.f1396d);
            }
            parcel.writeInt(this.f1397e);
            if (this.f1397e > 0) {
                parcel.writeIntArray(this.f1398f);
            }
            parcel.writeInt(this.f1400h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.f1399g);
        }
    }

    class e {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f1401a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f1402b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f1403c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f1404d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f1405e;

        e(int i) {
            this.f1405e = i;
        }

        /* access modifiers changed from: package-private */
        public int a(int i) {
            int i2 = this.f1403c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1401a.size() == 0) {
                return i;
            }
            a();
            return this.f1403c;
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2, boolean z) {
            return a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1401a.get(i);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d2 < b2 : d2 <= b2;
                if (!z3 ? a2 > f2 : a2 >= f2) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d2 >= f2 && a2 <= b2) {
                        }
                    } else if (d2 >= f2 && a2 <= b2) {
                    }
                    return StaggeredGridLayoutManager.this.l(view);
                }
                i += i3;
            }
            return -1;
        }

        public View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1401a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1401a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1401a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1401a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            c.a c2;
            ArrayList<View> arrayList = this.f1401a;
            View view = arrayList.get(arrayList.size() - 1);
            b b2 = b(view);
            this.f1403c = StaggeredGridLayoutManager.this.u.a(view);
            if (b2.f1386f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f1390b == 1) {
                this.f1403c += c2.a(this.f1405e);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            b b2 = b(view);
            b2.f1385e = this;
            this.f1401a.add(view);
            this.f1403c = Integer.MIN_VALUE;
            if (this.f1401a.size() == 1) {
                this.f1402b = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1404d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z, int i) {
            int a2 = z ? a(Integer.MIN_VALUE) : b(Integer.MIN_VALUE);
            c();
            if (a2 != Integer.MIN_VALUE) {
                if (z && a2 < StaggeredGridLayoutManager.this.u.b()) {
                    return;
                }
                if (z || a2 <= StaggeredGridLayoutManager.this.u.f()) {
                    if (i != Integer.MIN_VALUE) {
                        a2 += i;
                    }
                    this.f1403c = a2;
                    this.f1402b = a2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            int i2 = this.f1402b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1401a.size() == 0) {
                return i;
            }
            b();
            return this.f1402b;
        }

        /* access modifiers changed from: package-private */
        public b b(View view) {
            return (b) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            c.a c2;
            View view = this.f1401a.get(0);
            b b2 = b(view);
            this.f1402b = StaggeredGridLayoutManager.this.u.d(view);
            if (b2.f1386f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f1390b == -1) {
                this.f1402b -= c2.a(this.f1405e);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f1401a.clear();
            i();
            this.f1404d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(int i) {
            int i2 = this.f1402b;
            if (i2 != Integer.MIN_VALUE) {
                this.f1402b = i2 + i;
            }
            int i3 = this.f1403c;
            if (i3 != Integer.MIN_VALUE) {
                this.f1403c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            b b2 = b(view);
            b2.f1385e = this;
            this.f1401a.add(0, view);
            this.f1402b = Integer.MIN_VALUE;
            if (this.f1401a.size() == 1) {
                this.f1403c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1404d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        public int d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = this.f1401a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f1401a.size();
            }
            return a(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        public void d(int i) {
            this.f1402b = i;
            this.f1403c = i;
        }

        public int e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = 0;
                i = this.f1401a.size();
            } else {
                i2 = this.f1401a.size() - 1;
                i = -1;
            }
            return a(i2, i, true);
        }

        public int f() {
            return this.f1404d;
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i = this.f1403c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            a();
            return this.f1403c;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            int i = this.f1402b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            b();
            return this.f1402b;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f1402b = Integer.MIN_VALUE;
            this.f1403c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            int size = this.f1401a.size();
            View remove = this.f1401a.remove(size - 1);
            b b2 = b(remove);
            b2.f1385e = null;
            if (b2.c() || b2.b()) {
                this.f1404d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.f1402b = Integer.MIN_VALUE;
            }
            this.f1403c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            View remove = this.f1401a.remove(0);
            b b2 = b(remove);
            b2.f1385e = null;
            if (this.f1401a.size() == 0) {
                this.f1403c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1404d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.f1402b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.i.b a2 = RecyclerView.i.a(context, attributeSet, i, i2);
        h(a2.f1339a);
        i(a2.f1340b);
        c(a2.f1341c);
        this.y = new r();
        M();
    }

    private void M() {
        this.u = w.a(this, this.w);
        this.v = w.a(this, 1 - this.w);
    }

    private void N() {
        if (this.v.d() != 1073741824) {
            int e2 = e();
            float f2 = 0.0f;
            for (int i = 0; i < e2; i++) {
                View c2 = c(i);
                float b2 = (float) this.v.b(c2);
                if (b2 >= f2) {
                    if (((b) c2.getLayoutParams()).f()) {
                        b2 = (b2 * 1.0f) / ((float) this.s);
                    }
                    f2 = Math.max(f2, b2);
                }
            }
            int i2 = this.x;
            int round = Math.round(f2 * ((float) this.s));
            if (this.v.d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.g());
            }
            j(round);
            if (this.x != i2) {
                for (int i3 = 0; i3 < e2; i3++) {
                    View c3 = c(i3);
                    b bVar = (b) c3.getLayoutParams();
                    if (!bVar.f1386f) {
                        if (!L() || this.w != 1) {
                            int i4 = bVar.f1385e.f1405e;
                            int i5 = this.x * i4;
                            int i6 = i4 * i2;
                            if (this.w == 1) {
                                c3.offsetLeftAndRight(i5 - i6);
                            } else {
                                c3.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.s;
                            int i8 = bVar.f1385e.f1405e;
                            c3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    private void O() {
        this.A = (this.w == 1 || !L()) ? this.z : !this.z;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v4 */
    private int a(RecyclerView.p pVar, r rVar, RecyclerView.u uVar) {
        int i;
        e eVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.p pVar2 = pVar;
        r rVar2 = rVar;
        ? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = rVar2.f1496e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = rVar2.f1496e == 1 ? rVar2.f1498g + rVar2.f1493b : rVar2.f1497f - rVar2.f1493b;
        }
        e(rVar2.f1496e, i);
        int b2 = this.A ? this.u.b() : this.u.f();
        boolean z2 = false;
        while (rVar.a(uVar) && (this.y.i || !this.B.isEmpty())) {
            View a2 = rVar2.a(pVar2);
            b bVar = (b) a2.getLayoutParams();
            int a3 = bVar.a();
            int d2 = this.E.d(a3);
            boolean z3 = d2 == -1;
            if (z3) {
                eVar = bVar.f1386f ? this.t[r9] : a(rVar2);
                this.E.a(a3, eVar);
            } else {
                eVar = this.t[d2];
            }
            e eVar2 = eVar;
            bVar.f1385e = eVar2;
            if (rVar2.f1496e == 1) {
                b(a2);
            } else {
                b(a2, (int) r9);
            }
            a(a2, bVar, (boolean) r9);
            if (rVar2.f1496e == 1) {
                int q = bVar.f1386f ? q(b2) : eVar2.a(b2);
                int b3 = this.u.b(a2) + q;
                if (z3 && bVar.f1386f) {
                    c.a m = m(q);
                    m.f1390b = -1;
                    m.f1389a = a3;
                    this.E.a(m);
                }
                i2 = b3;
                i3 = q;
            } else {
                int t2 = bVar.f1386f ? t(b2) : eVar2.b(b2);
                i3 = t2 - this.u.b(a2);
                if (z3 && bVar.f1386f) {
                    c.a n = n(t2);
                    n.f1390b = 1;
                    n.f1389a = a3;
                    this.E.a(n);
                }
                i2 = t2;
            }
            if (bVar.f1386f && rVar2.f1495d == -1) {
                if (!z3) {
                    if (!(rVar2.f1496e == 1 ? D() : E())) {
                        c.a c2 = this.E.c(a3);
                        if (c2 != null) {
                            c2.f1392d = true;
                        }
                    }
                }
                this.M = true;
            }
            a(a2, bVar, rVar2);
            if (!L() || this.w != 1) {
                int f2 = bVar.f1386f ? this.v.f() : (eVar2.f1405e * this.x) + this.v.f();
                i5 = f2;
                i4 = this.v.b(a2) + f2;
            } else {
                int b4 = bVar.f1386f ? this.v.b() : this.v.b() - (((this.s - 1) - eVar2.f1405e) * this.x);
                i4 = b4;
                i5 = b4 - this.v.b(a2);
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = a2;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = a2;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.a(view, i7, i5, i6, i2);
            if (bVar.f1386f) {
                e(this.y.f1496e, i);
            } else {
                a(eVar2, this.y.f1496e, i);
            }
            a(pVar2, this.y);
            if (this.y.f1499h && a2.hasFocusable()) {
                if (bVar.f1386f) {
                    this.B.clear();
                } else {
                    this.B.set(eVar2.f1405e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            a(pVar2, this.y);
        }
        int f3 = this.y.f1496e == -1 ? this.u.f() - t(this.u.f()) : q(this.u.b()) - this.u.b();
        if (f3 > 0) {
            return Math.min(rVar2.f1493b, f3);
        }
        return 0;
    }

    private e a(r rVar) {
        int i;
        int i2;
        int i3 = -1;
        if (u(rVar.f1496e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        e eVar = null;
        if (rVar.f1496e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f2 = this.u.f();
            while (i2 != i3) {
                e eVar2 = this.t[i2];
                int a2 = eVar2.a(f2);
                if (a2 < i4) {
                    eVar = eVar2;
                    i4 = a2;
                }
                i2 += i;
            }
            return eVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b2 = this.u.b();
        while (i2 != i3) {
            e eVar3 = this.t[i2];
            int b3 = eVar3.b(b2);
            if (b3 > i5) {
                eVar = eVar3;
                i5 = b3;
            }
            i2 += i;
        }
        return eVar;
    }

    private void a(View view, int i, int i2, boolean z2) {
        a(view, this.K);
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.leftMargin;
        Rect rect = this.K;
        int d2 = d(i, i3 + rect.left, bVar.rightMargin + rect.right);
        int i4 = bVar.topMargin;
        Rect rect2 = this.K;
        int d3 = d(i2, i4 + rect2.top, bVar.bottomMargin + rect2.bottom);
        if (z2 ? b(view, d2, d3, bVar) : a(view, d2, d3, (RecyclerView.j) bVar)) {
            view.measure(d2, d3);
        }
    }

    private void a(View view, b bVar, r rVar) {
        if (rVar.f1496e == 1) {
            if (bVar.f1386f) {
                p(view);
            } else {
                bVar.f1385e.a(view);
            }
        } else if (bVar.f1386f) {
            q(view);
        } else {
            bVar.f1385e.c(view);
        }
    }

    private void a(View view, b bVar, boolean z2) {
        int i;
        int i2;
        if (bVar.f1386f) {
            if (this.w == 1) {
                i2 = this.J;
            } else {
                a(view, RecyclerView.i.a(q(), r(), n() + o(), bVar.width, true), this.J, z2);
                return;
            }
        } else if (this.w == 1) {
            i2 = RecyclerView.i.a(this.x, r(), 0, bVar.width, false);
        } else {
            i2 = RecyclerView.i.a(q(), r(), n() + o(), bVar.width, true);
            i = RecyclerView.i.a(this.x, i(), 0, bVar.height, false);
            a(view, i2, i, z2);
        }
        i = RecyclerView.i.a(h(), i(), p() + m(), bVar.height, true);
        a(view, i2, i, z2);
    }

    private void a(RecyclerView.p pVar, int i) {
        int e2 = e() - 1;
        while (e2 >= 0) {
            View c2 = c(e2);
            if (this.u.d(c2) >= i && this.u.f(c2) >= i) {
                b bVar = (b) c2.getLayoutParams();
                if (bVar.f1386f) {
                    int i2 = 0;
                    while (i2 < this.s) {
                        if (this.t[i2].f1401a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].j();
                    }
                } else if (bVar.f1385e.f1401a.size() != 1) {
                    bVar.f1385e.j();
                } else {
                    return;
                }
                a(c2, pVar);
                e2--;
            } else {
                return;
            }
        }
    }

    private void a(RecyclerView.p pVar, RecyclerView.u uVar, boolean z2) {
        int b2;
        int q = q(Integer.MIN_VALUE);
        if (q != Integer.MIN_VALUE && (b2 = this.u.b() - q) > 0) {
            int i = b2 - (-c(-b2, pVar, uVar));
            if (z2 && i > 0) {
                this.u.a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f1496e == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.recyclerview.widget.RecyclerView.p r3, androidx.recyclerview.widget.r r4) {
        /*
            r2 = this;
            boolean r0 = r4.f1492a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f1493b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f1496e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f1498g
        L_0x0014:
            r2.a((androidx.recyclerview.widget.RecyclerView.p) r3, (int) r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f1497f
        L_0x001a:
            r2.b((androidx.recyclerview.widget.RecyclerView.p) r3, (int) r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f1496e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f1497f
            int r1 = r2.r(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f1498g
            int r4 = r4.f1493b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f1498g
            int r0 = r2.s(r0)
            int r1 = r4.f1498g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f1497f
            int r4 = r4.f1493b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.r):void");
    }

    private void a(a aVar) {
        boolean z2;
        d dVar = this.I;
        int i = dVar.f1395c;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].c();
                    d dVar2 = this.I;
                    int i3 = dVar2.f1396d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += dVar2.i ? this.u.b() : this.u.f();
                    }
                    this.t[i2].d(i3);
                }
            } else {
                dVar.a();
                d dVar3 = this.I;
                dVar3.f1393a = dVar3.f1394b;
            }
        }
        d dVar4 = this.I;
        this.H = dVar4.j;
        c(dVar4.f1400h);
        O();
        d dVar5 = this.I;
        int i4 = dVar5.f1393a;
        if (i4 != -1) {
            this.C = i4;
            z2 = dVar5.i;
        } else {
            z2 = this.A;
        }
        aVar.f1380c = z2;
        d dVar6 = this.I;
        if (dVar6.f1397e > 1) {
            c cVar = this.E;
            cVar.f1387a = dVar6.f1398f;
            cVar.f1388b = dVar6.f1399g;
        }
    }

    private void a(e eVar, int i, int i2) {
        int f2 = eVar.f();
        if (i == -1) {
            if (eVar.h() + f2 > i2) {
                return;
            }
        } else if (eVar.g() - f2 < i2) {
            return;
        }
        this.B.set(eVar.f1405e, false);
    }

    private boolean a(e eVar) {
        if (this.A) {
            if (eVar.g() < this.u.b()) {
                ArrayList<View> arrayList = eVar.f1401a;
                return !eVar.b(arrayList.get(arrayList.size() - 1)).f1386f;
            }
        } else if (eVar.h() > this.u.f()) {
            return !eVar.b(eVar.f1401a.get(0)).f1386f;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r5, androidx.recyclerview.widget.RecyclerView.u r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.r r0 = r4.y
            r1 = 0
            r0.f1493b = r1
            r0.f1494c = r5
            boolean r0 = r4.w()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.w r5 = r4.u
            int r5 = r5.g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.w r5 = r4.u
            int r5 = r5.g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.r r0 = r4.y
            androidx.recyclerview.widget.w r3 = r4.u
            int r3 = r3.f()
            int r3 = r3 - r6
            r0.f1497f = r3
            androidx.recyclerview.widget.r r6 = r4.y
            androidx.recyclerview.widget.w r0 = r4.u
            int r0 = r0.b()
            int r0 = r0 + r5
            r6.f1498g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.r r0 = r4.y
            androidx.recyclerview.widget.w r3 = r4.u
            int r3 = r3.a()
            int r3 = r3 + r5
            r0.f1498g = r3
            androidx.recyclerview.widget.r r5 = r4.y
            int r6 = -r6
            r5.f1497f = r6
        L_0x005d:
            androidx.recyclerview.widget.r r5 = r4.y
            r5.f1499h = r1
            r5.f1492a = r2
            androidx.recyclerview.widget.w r6 = r4.u
            int r6 = r6.d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.w r6 = r4.u
            int r6 = r6.a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$u):void");
    }

    private void b(RecyclerView.p pVar, int i) {
        while (e() > 0) {
            View c2 = c(0);
            if (this.u.a(c2) <= i && this.u.e(c2) <= i) {
                b bVar = (b) c2.getLayoutParams();
                if (bVar.f1386f) {
                    int i2 = 0;
                    while (i2 < this.s) {
                        if (this.t[i2].f1401a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].k();
                    }
                } else if (bVar.f1385e.f1401a.size() != 1) {
                    bVar.f1385e.k();
                } else {
                    return;
                }
                a(c2, pVar);
            } else {
                return;
            }
        }
    }

    private void b(RecyclerView.p pVar, RecyclerView.u uVar, boolean z2) {
        int f2;
        int t2 = t(Integer.MAX_VALUE);
        if (t2 != Integer.MAX_VALUE && (f2 = t2 - this.u.f()) > 0) {
            int c2 = f2 - c(f2, pVar, uVar);
            if (z2 && c2 > 0) {
                this.u.a(-c2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.I()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.H()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.E
            r4.e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.E
            r7.a((int) r8, (int) r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.E
            r9.b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.E
            r9.a((int) r7, (int) r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.H()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.I()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.y()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (F() != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(androidx.recyclerview.widget.RecyclerView.p r9, androidx.recyclerview.widget.RecyclerView.u r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.a()
            if (r1 != 0) goto L_0x0018
            r8.b((androidx.recyclerview.widget.RecyclerView.p) r9)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.f1382e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.a) r0)
            goto L_0x003e
        L_0x0037:
            r8.O()
            boolean r5 = r8.A
            r0.f1380c = r5
        L_0x003e:
            r8.b((androidx.recyclerview.widget.RecyclerView.u) r10, (androidx.recyclerview.widget.StaggeredGridLayoutManager.a) r0)
            r0.f1382e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f1380c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.L()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r8.E
            r5.a()
            r0.f1381d = r4
        L_0x0060:
            int r5 = r8.e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f1395c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f1381d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.t
            r5 = r5[r1]
            r5.c()
            int r5 = r0.f1379b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r6 = r8.t
            r6 = r6[r1]
            r6.d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r1 = r8.L
            int[] r1 = r1.f1383f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.t
            r5 = r5[r1]
            r5.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r6 = r8.L
            int[] r6 = r6.f1383f
            r6 = r6[r1]
            r5.d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f1379b
            r5.a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r5 = r8.t
            r1.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.e[]) r5)
        L_0x00c9:
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9)
            androidx.recyclerview.widget.r r1 = r8.y
            r1.f1492a = r3
            r8.M = r3
            androidx.recyclerview.widget.w r1 = r8.v
            int r1 = r1.g()
            r8.j((int) r1)
            int r1 = r0.f1378a
            r8.b((int) r1, (androidx.recyclerview.widget.RecyclerView.u) r10)
            boolean r1 = r0.f1380c
            if (r1 == 0) goto L_0x00f0
            r8.v(r2)
            androidx.recyclerview.widget.r r1 = r8.y
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.r) r1, (androidx.recyclerview.widget.RecyclerView.u) r10)
            r8.v(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.v(r4)
            androidx.recyclerview.widget.r r1 = r8.y
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.r) r1, (androidx.recyclerview.widget.RecyclerView.u) r10)
            r8.v(r2)
        L_0x00fb:
            androidx.recyclerview.widget.r r1 = r8.y
            int r2 = r0.f1378a
            int r5 = r1.f1495d
            int r2 = r2 + r5
            r1.f1494c = r2
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.r) r1, (androidx.recyclerview.widget.RecyclerView.u) r10)
            r8.N()
            int r1 = r8.e()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x011b
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.RecyclerView.u) r10, (boolean) r4)
            r8.b((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.RecyclerView.u) r10, (boolean) r3)
            goto L_0x0121
        L_0x011b:
            r8.b((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.RecyclerView.u) r10, (boolean) r4)
            r8.a((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.RecyclerView.u) r10, (boolean) r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.d()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.e()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.J()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.P
            r8.a((java.lang.Runnable) r11)
            boolean r11 = r8.F()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.d()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r11 = r8.L
            r11.b()
        L_0x015a:
            boolean r11 = r0.f1380c
            r8.G = r11
            boolean r11 = r8.L()
            r8.H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r11 = r8.L
            r11.b()
            r8.c((androidx.recyclerview.widget.RecyclerView.p) r9, (androidx.recyclerview.widget.RecyclerView.u) r10, (boolean) r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.RecyclerView$u, boolean):void");
    }

    private boolean c(RecyclerView.u uVar, a aVar) {
        aVar.f1378a = this.G ? p(uVar.a()) : o(uVar.a());
        aVar.f1379b = Integer.MIN_VALUE;
        return true;
    }

    private int d(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private void e(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f1401a.isEmpty()) {
                a(this.t[i3], i, i2);
            }
        }
    }

    private int h(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        return H.a(uVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int i(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        return H.a(uVar, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    private int j(RecyclerView.u uVar) {
        if (e() == 0) {
            return 0;
        }
        return H.b(uVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int k(int i) {
        if (e() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < H()) != this.A ? -1 : 1;
    }

    private int l(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && L()) ? -1 : 1 : (this.w != 1 && L()) ? 1 : -1;
    }

    private c.a m(int i) {
        c.a aVar = new c.a();
        aVar.f1391c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f1391c[i2] = i - this.t[i2].a(i);
        }
        return aVar;
    }

    private c.a n(int i) {
        c.a aVar = new c.a();
        aVar.f1391c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f1391c[i2] = this.t[i2].b(i) - i;
        }
        return aVar;
    }

    private int o(int i) {
        int e2 = e();
        for (int i2 = 0; i2 < e2; i2++) {
            int l = l(c(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private int p(int i) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            int l = l(c(e2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private void p(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private int q(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private void q(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].c(view);
        }
    }

    private int r(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int s(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int t(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private boolean u(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == L();
    }

    private void v(int i) {
        r rVar = this.y;
        rVar.f1496e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        rVar.f1495d = i2;
    }

    public boolean C() {
        return this.I == null;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        int a2 = this.t[0].a(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].a(Integer.MIN_VALUE) != a2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        int b2 = this.t[0].b(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].b(Integer.MIN_VALUE) != b2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        int i;
        int i2;
        if (e() == 0 || this.F == 0 || !t()) {
            return false;
        }
        if (this.A) {
            i2 = I();
            i = H();
        } else {
            i2 = H();
            i = I();
        }
        if (i2 == 0 && J() != null) {
            this.E.a();
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            c.a a2 = this.E.a(i2, i4, i3, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i4);
                return false;
            }
            c.a a3 = this.E.a(i2, a2.f1389a, i3 * -1, true);
            if (a3 == null) {
                this.E.b(a2.f1389a);
            } else {
                this.E.b(a3.f1389a + 1);
            }
        }
        z();
        y();
        return true;
    }

    /* access modifiers changed from: package-private */
    public int G() {
        View a2 = this.A ? a(true) : b(true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    /* access modifiers changed from: package-private */
    public int H() {
        if (e() == 0) {
            return 0;
        }
        return l(c(0));
    }

    /* access modifiers changed from: package-private */
    public int I() {
        int e2 = e();
        if (e2 == 0) {
            return 0;
        }
        return l(c(e2 - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View J() {
        /*
            r12 = this;
            int r0 = r12.e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.L()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.c((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.b) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f1385e
            int r9 = r9.f1405e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f1385e
            boolean r9 = r12.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.e) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r8.f1385e
            int r9 = r9.f1405e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f1386f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.c((int) r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.w r10 = r12.u
            int r10 = r10.a((android.view.View) r7)
            androidx.recyclerview.widget.w r11 = r12.u
            int r11 = r11.a((android.view.View) r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.w r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.w r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.b) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r8.f1385e
            int r8 = r8.f1405e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r9.f1385e
            int r9 = r9.f1405e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J():android.view.View");
    }

    public void K() {
        this.E.a();
        y();
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        return j() == 1;
    }

    public int a(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        return c(i, pVar, uVar);
    }

    public int a(RecyclerView.p pVar, RecyclerView.u uVar) {
        return this.w == 1 ? this.s : super.a(pVar, uVar);
    }

    public int a(RecyclerView.u uVar) {
        return h(uVar);
    }

    public View a(View view, int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        View c2;
        View a2;
        if (e() == 0 || (c2 = c(view)) == null) {
            return null;
        }
        O();
        int l = l(i);
        if (l == Integer.MIN_VALUE) {
            return null;
        }
        b bVar = (b) c2.getLayoutParams();
        boolean z2 = bVar.f1386f;
        e eVar = bVar.f1385e;
        int I2 = l == 1 ? I() : H();
        b(I2, uVar);
        v(l);
        r rVar = this.y;
        rVar.f1494c = rVar.f1495d + I2;
        rVar.f1493b = (int) (((float) this.u.g()) * 0.33333334f);
        r rVar2 = this.y;
        rVar2.f1499h = true;
        rVar2.f1492a = false;
        a(pVar, rVar2, uVar);
        this.G = this.A;
        if (!z2 && (a2 = eVar.a(I2, l)) != null && a2 != c2) {
            return a2;
        }
        if (u(l)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View a3 = this.t[i2].a(I2, l);
                if (a3 != null && a3 != c2) {
                    return a3;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View a4 = this.t[i3].a(I2, l);
                if (a4 != null && a4 != c2) {
                    return a4;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (l == -1);
        if (!z2) {
            View b2 = b(z3 ? eVar.d() : eVar.e());
            if (!(b2 == null || b2 == c2)) {
                return b2;
            }
        }
        if (u(l)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != eVar.f1405e) {
                    View b3 = b(z3 ? this.t[i4].d() : this.t[i4].e());
                    if (!(b3 == null || b3 == c2)) {
                        return b3;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View b4 = b(z3 ? this.t[i5].d() : this.t[i5].e());
                if (b4 != null && b4 != c2) {
                    return b4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View a(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View c2 = c(e2);
            int d2 = this.u.d(c2);
            int a2 = this.u.a(c2);
            if (a2 > f2 && d2 < b2) {
                if (a2 <= b2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    public RecyclerView.j a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.j a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public void a(int i, int i2, RecyclerView.u uVar, RecyclerView.i.a aVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (e() != 0 && i != 0) {
            a(i, uVar);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.s; i6++) {
                r rVar = this.y;
                if (rVar.f1495d == -1) {
                    i4 = rVar.f1497f;
                    i3 = this.t[i6].b(i4);
                } else {
                    i4 = this.t[i6].a(rVar.f1498g);
                    i3 = this.y.f1498g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.y.a(uVar); i8++) {
                aVar.a(this.y.f1494c, this.O[i8]);
                r rVar2 = this.y;
                rVar2.f1494c += rVar2.f1495d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i, RecyclerView.u uVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = I();
            i2 = 1;
        } else {
            i3 = H();
            i2 = -1;
        }
        this.y.f1492a = true;
        b(i3, uVar);
        v(i2);
        r rVar = this.y;
        rVar.f1494c = i3 + rVar.f1495d;
        rVar.f1493b = Math.abs(i);
    }

    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int n = n() + o();
        int p = p() + m();
        if (this.w == 1) {
            i4 = RecyclerView.i.a(i2, rect.height() + p, k());
            i3 = RecyclerView.i.a(i, (this.x * this.s) + n, l());
        } else {
            i3 = RecyclerView.i.a(i, rect.width() + n, l());
            i4 = RecyclerView.i.a(i2, (this.x * this.s) + p, k());
        }
        c(i3, i4);
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.I = (d) parcelable;
            y();
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 != null && a2 != null) {
                int l = l(b2);
                int l2 = l(a2);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    public void a(RecyclerView.p pVar, RecyclerView.u uVar, View view, b.h.j.a.c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        if (this.w == 0) {
            i4 = bVar.e();
            i3 = bVar.f1386f ? this.s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = bVar.e();
            i = bVar.f1386f ? this.s : 1;
        }
        cVar.b((Object) c.C0035c.a(i4, i3, i2, i, bVar.f1386f, false));
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 1);
    }

    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        c(i, i2, 8);
    }

    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        c(i, i2, 4);
    }

    public void a(String str) {
        if (this.I == null) {
            super.a(str);
        }
    }

    public boolean a() {
        return this.w == 0;
    }

    public boolean a(RecyclerView.j jVar) {
        return jVar instanceof b;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.u uVar, a aVar) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (!uVar.d() && (i = this.C) != -1) {
            if (i < 0 || i >= uVar.a()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                d dVar = this.I;
                if (dVar == null || dVar.f1393a == -1 || dVar.f1395c < 1) {
                    View b2 = b(this.C);
                    if (b2 != null) {
                        aVar.f1378a = this.A ? I() : H();
                        if (this.D != Integer.MIN_VALUE) {
                            if (aVar.f1380c) {
                                i3 = this.u.b() - this.D;
                                i2 = this.u.a(b2);
                            } else {
                                i3 = this.u.f() + this.D;
                                i2 = this.u.d(b2);
                            }
                            aVar.f1379b = i3 - i2;
                            return true;
                        } else if (this.u.b(b2) > this.u.g()) {
                            aVar.f1379b = aVar.f1380c ? this.u.b() : this.u.f();
                            return true;
                        } else {
                            int d2 = this.u.d(b2) - this.u.f();
                            if (d2 < 0) {
                                aVar.f1379b = -d2;
                                return true;
                            }
                            int b3 = this.u.b() - this.u.a(b2);
                            if (b3 < 0) {
                                aVar.f1379b = b3;
                                return true;
                            }
                            aVar.f1379b = Integer.MIN_VALUE;
                        }
                    } else {
                        aVar.f1378a = this.C;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            if (k(aVar.f1378a) == 1) {
                                z2 = true;
                            }
                            aVar.f1380c = z2;
                            aVar.a();
                        } else {
                            aVar.a(i4);
                        }
                        aVar.f1381d = true;
                    }
                } else {
                    aVar.f1379b = Integer.MIN_VALUE;
                    aVar.f1378a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    public int b(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        return c(i, pVar, uVar);
    }

    public int b(RecyclerView.p pVar, RecyclerView.u uVar) {
        return this.w == 0 ? this.s : super.b(pVar, uVar);
    }

    public int b(RecyclerView.u uVar) {
        return i(uVar);
    }

    /* access modifiers changed from: package-private */
    public View b(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int e2 = e();
        View view = null;
        for (int i = 0; i < e2; i++) {
            View c2 = c(i);
            int d2 = this.u.d(c2);
            if (this.u.a(c2) > f2 && d2 < b2) {
                if (d2 >= f2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.u uVar, a aVar) {
        if (!a(uVar, aVar) && !c(uVar, aVar)) {
            aVar.a();
            aVar.f1378a = 0;
        }
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 2);
    }

    public void b(RecyclerView recyclerView, RecyclerView.p pVar) {
        super.b(recyclerView, pVar);
        a(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        recyclerView.requestLayout();
    }

    public boolean b() {
        return this.w == 1;
    }

    /* access modifiers changed from: package-private */
    public int c(int i, RecyclerView.p pVar, RecyclerView.u uVar) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        a(i, uVar);
        int a2 = a(pVar, this.y, uVar);
        if (this.y.f1493b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.u.a(-i);
        this.G = this.A;
        r rVar = this.y;
        rVar.f1493b = 0;
        a(pVar, rVar);
        return i;
    }

    public int c(RecyclerView.u uVar) {
        return j(uVar);
    }

    public RecyclerView.j c() {
        return this.w == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public void c(boolean z2) {
        a((String) null);
        d dVar = this.I;
        if (!(dVar == null || dVar.f1400h == z2)) {
            dVar.f1400h = z2;
        }
        this.z = z2;
        y();
    }

    public int d(RecyclerView.u uVar) {
        return h(uVar);
    }

    public void d(int i) {
        super.d(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    public void d(RecyclerView recyclerView) {
        this.E.a();
        y();
    }

    public int e(RecyclerView.u uVar) {
        return i(uVar);
    }

    public void e(int i) {
        super.e(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    public void e(RecyclerView.p pVar, RecyclerView.u uVar) {
        c(pVar, uVar, true);
    }

    public int f(RecyclerView.u uVar) {
        return j(uVar);
    }

    public void f(int i) {
        if (i == 0) {
            F();
        }
    }

    public void g(RecyclerView.u uVar) {
        super.g(uVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.b();
    }

    public void h(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.w) {
                this.w = i;
                w wVar = this.u;
                this.u = this.v;
                this.v = wVar;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void i(int i) {
        a((String) null);
        if (i != this.s) {
            K();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new e[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new e(i2);
            }
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.d());
    }

    public boolean u() {
        return this.F != 0;
    }

    public Parcelable x() {
        int i;
        int i2;
        int[] iArr;
        d dVar = this.I;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        dVar2.f1400h = this.z;
        dVar2.i = this.G;
        dVar2.j = this.H;
        c cVar = this.E;
        if (cVar == null || (iArr = cVar.f1387a) == null) {
            dVar2.f1397e = 0;
        } else {
            dVar2.f1398f = iArr;
            dVar2.f1397e = dVar2.f1398f.length;
            dVar2.f1399g = cVar.f1388b;
        }
        if (e() > 0) {
            dVar2.f1393a = this.G ? I() : H();
            dVar2.f1394b = G();
            int i3 = this.s;
            dVar2.f1395c = i3;
            dVar2.f1396d = new int[i3];
            for (int i4 = 0; i4 < this.s; i4++) {
                if (this.G) {
                    i = this.t[i4].a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.b();
                    } else {
                        dVar2.f1396d[i4] = i;
                    }
                } else {
                    i = this.t[i4].b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.f();
                    } else {
                        dVar2.f1396d[i4] = i;
                    }
                }
                i -= i2;
                dVar2.f1396d[i4] = i;
            }
        } else {
            dVar2.f1393a = -1;
            dVar2.f1394b = -1;
            dVar2.f1395c = 0;
        }
        return dVar2;
    }
}
