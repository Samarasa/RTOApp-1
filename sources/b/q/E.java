package b.q;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import b.e.f;
import b.e.i;
import b.h.j.y;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class E implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2678a = {2, 1, 3, 4};

    /* renamed from: b  reason: collision with root package name */
    private static final C0224v f2679b = new B();

    /* renamed from: c  reason: collision with root package name */
    private static ThreadLocal<b.e.b<Animator, a>> f2680c = new ThreadLocal<>();
    ArrayList<Animator> A = new ArrayList<>();
    private int B = 0;
    private boolean C = false;
    private boolean D = false;
    private ArrayList<c> E = null;
    private ArrayList<Animator> F = new ArrayList<>();
    I G;
    private b H;
    private b.e.b<String, String> I;
    private C0224v J = f2679b;

    /* renamed from: d  reason: collision with root package name */
    private String f2681d = getClass().getName();

    /* renamed from: e  reason: collision with root package name */
    private long f2682e = -1;

    /* renamed from: f  reason: collision with root package name */
    long f2683f = -1;

    /* renamed from: g  reason: collision with root package name */
    private TimeInterpolator f2684g = null;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<Integer> f2685h = new ArrayList<>();
    ArrayList<View> i = new ArrayList<>();
    private ArrayList<String> j = null;
    private ArrayList<Class> k = null;
    private ArrayList<Integer> l = null;
    private ArrayList<View> m = null;
    private ArrayList<Class> n = null;
    private ArrayList<String> o = null;
    private ArrayList<Integer> p = null;
    private ArrayList<View> q = null;
    private ArrayList<Class> r = null;
    private N s = new N();
    private N t = new N();
    K u = null;
    private int[] v = f2678a;
    private ArrayList<M> w;
    private ArrayList<M> x;
    private ViewGroup y = null;
    boolean z = false;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        View f2686a;

        /* renamed from: b  reason: collision with root package name */
        String f2687b;

        /* renamed from: c  reason: collision with root package name */
        M f2688c;

        /* renamed from: d  reason: collision with root package name */
        ka f2689d;

        /* renamed from: e  reason: collision with root package name */
        E f2690e;

        a(View view, String str, E e2, ka kaVar, M m) {
            this.f2686a = view;
            this.f2687b = str;
            this.f2688c = m;
            this.f2689d = kaVar;
            this.f2690e = e2;
        }
    }

    public static abstract class b {
    }

    public interface c {
        void a(E e2);

        void b(E e2);

        void c(E e2);

        void d(E e2);
    }

    private void a(Animator animator, b.e.b<Animator, a> bVar) {
        if (animator != null) {
            animator.addListener(new C(this, bVar));
            a(animator);
        }
    }

    private void a(b.e.b<View, M> bVar, b.e.b<View, M> bVar2) {
        for (int i2 = 0; i2 < bVar.size(); i2++) {
            M d2 = bVar.d(i2);
            if (b(d2.f2705b)) {
                this.w.add(d2);
                this.x.add((Object) null);
            }
        }
        for (int i3 = 0; i3 < bVar2.size(); i3++) {
            M d3 = bVar2.d(i3);
            if (b(d3.f2705b)) {
                this.x.add(d3);
                this.w.add((Object) null);
            }
        }
    }

    private void a(b.e.b<View, M> bVar, b.e.b<View, M> bVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && b(view)) {
                M m2 = bVar.get(valueAt);
                M m3 = bVar2.get(view);
                if (!(m2 == null || m3 == null)) {
                    this.w.add(m2);
                    this.x.add(m3);
                    bVar.remove(valueAt);
                    bVar2.remove(view);
                }
            }
        }
    }

    private void a(b.e.b<View, M> bVar, b.e.b<View, M> bVar2, b.e.b<String, View> bVar3, b.e.b<String, View> bVar4) {
        View view;
        int size = bVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View d2 = bVar3.d(i2);
            if (d2 != null && b(d2) && (view = bVar4.get(bVar3.b(i2))) != null && b(view)) {
                M m2 = bVar.get(d2);
                M m3 = bVar2.get(view);
                if (!(m2 == null || m3 == null)) {
                    this.w.add(m2);
                    this.x.add(m3);
                    bVar.remove(d2);
                    bVar2.remove(view);
                }
            }
        }
    }

    private void a(b.e.b<View, M> bVar, b.e.b<View, M> bVar2, f<View> fVar, f<View> fVar2) {
        View b2;
        int b3 = fVar.b();
        for (int i2 = 0; i2 < b3; i2++) {
            View c2 = fVar.c(i2);
            if (c2 != null && b(c2) && (b2 = fVar2.b(fVar.a(i2))) != null && b(b2)) {
                M m2 = bVar.get(c2);
                M m3 = bVar2.get(b2);
                if (!(m2 == null || m3 == null)) {
                    this.w.add(m2);
                    this.x.add(m3);
                    bVar.remove(c2);
                    bVar2.remove(b2);
                }
            }
        }
    }

    private static void a(N n2, View view, M m2) {
        n2.f2707a.put(view, m2);
        int id = view.getId();
        if (id >= 0) {
            if (n2.f2708b.indexOfKey(id) >= 0) {
                n2.f2708b.put(id, (Object) null);
            } else {
                n2.f2708b.put(id, view);
            }
        }
        String s2 = y.s(view);
        if (s2 != null) {
            if (n2.f2710d.containsKey(s2)) {
                n2.f2710d.put(s2, null);
            } else {
                n2.f2710d.put(s2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (n2.f2709c.c(itemIdAtPosition) >= 0) {
                    View b2 = n2.f2709c.b(itemIdAtPosition);
                    if (b2 != null) {
                        y.b(b2, false);
                        n2.f2709c.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                y.b(view, true);
                n2.f2709c.c(itemIdAtPosition, view);
            }
        }
    }

    private void a(N n2, N n3) {
        b.e.b bVar = new b.e.b((i) n2.f2707a);
        b.e.b bVar2 = new b.e.b((i) n3.f2707a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.v;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    b((b.e.b<View, M>) bVar, (b.e.b<View, M>) bVar2);
                } else if (i3 == 2) {
                    a((b.e.b<View, M>) bVar, (b.e.b<View, M>) bVar2, n2.f2710d, n3.f2710d);
                } else if (i3 == 3) {
                    a((b.e.b<View, M>) bVar, (b.e.b<View, M>) bVar2, n2.f2708b, n3.f2708b);
                } else if (i3 == 4) {
                    a((b.e.b<View, M>) bVar, (b.e.b<View, M>) bVar2, n2.f2709c, n3.f2709c);
                }
                i2++;
            } else {
                a((b.e.b<View, M>) bVar, (b.e.b<View, M>) bVar2);
                return;
            }
        }
    }

    private static boolean a(M m2, M m3, String str) {
        Object obj = m2.f2704a.get(str);
        Object obj2 = m3.f2704a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void b(b.e.b<View, M> bVar, b.e.b<View, M> bVar2) {
        M remove;
        View view;
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View b2 = bVar.b(size);
            if (!(b2 == null || !b(b2) || (remove = bVar2.remove(b2)) == null || (view = remove.f2705b) == null || !b(view))) {
                this.w.add(bVar.c(size));
                this.x.add(remove);
            }
        }
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.n.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        M m2 = new M();
                        m2.f2705b = view;
                        if (z2) {
                            c(m2);
                        } else {
                            a(m2);
                        }
                        m2.f2706c.add(this);
                        b(m2);
                        a(z2 ? this.s : this.t, view, m2);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.r.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    c(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static b.e.b<Animator, a> r() {
        b.e.b<Animator, a> bVar = f2680c.get();
        if (bVar != null) {
            return bVar;
        }
        b.e.b<Animator, a> bVar2 = new b.e.b<>();
        f2680c.set(bVar2);
        return bVar2;
    }

    public Animator a(ViewGroup viewGroup, M m2, M m3) {
        return null;
    }

    public E a(long j2) {
        this.f2683f = j2;
        return this;
    }

    public E a(TimeInterpolator timeInterpolator) {
        this.f2684g = timeInterpolator;
        return this;
    }

    public E a(View view) {
        this.i.add(view);
        return this;
    }

    public E a(c cVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(cVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public M a(View view, boolean z2) {
        K k2 = this.u;
        if (k2 != null) {
            return k2.a(view, z2);
        }
        ArrayList<M> arrayList = z2 ? this.w : this.x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            M m2 = arrayList.get(i3);
            if (m2 == null) {
                return null;
            }
            if (m2.f2705b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.x : this.w).get(i2);
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2683f != -1) {
            str2 = str2 + "dur(" + this.f2683f + ") ";
        }
        if (this.f2682e != -1) {
            str2 = str2 + "dly(" + this.f2682e + ") ";
        }
        if (this.f2684g != null) {
            str2 = str2 + "interp(" + this.f2684g + ") ";
        }
        if (this.f2685h.size() <= 0 && this.i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f2685h.size() > 0) {
            String str4 = str3;
            for (int i2 = 0; i2 < this.f2685h.size(); i2++) {
                if (i2 > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f2685h.get(i2);
            }
            str3 = str4;
        }
        if (this.i.size() > 0) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.i.get(i3);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.B--;
        if (this.B == 0) {
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < this.s.f2709c.b(); i3++) {
                View c2 = this.s.f2709c.c(i3);
                if (c2 != null) {
                    y.b(c2, false);
                }
            }
            for (int i4 = 0; i4 < this.t.f2709c.b(); i4++) {
                View c3 = this.t.f2709c.c(i4);
                if (c3 != null) {
                    y.b(c3, false);
                }
            }
            this.D = true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Animator animator) {
        if (animator == null) {
            a();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (j() >= 0) {
            animator.setStartDelay(j());
        }
        if (f() != null) {
            animator.setInterpolator(f());
        }
        animator.addListener(new D(this));
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        a aVar;
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        a(this.s, this.t);
        b.e.b<Animator, a> r2 = r();
        int size = r2.size();
        ka d2 = ba.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator b2 = r2.b(i2);
            if (!(b2 == null || (aVar = r2.get(b2)) == null || aVar.f2686a == null || !d2.equals(aVar.f2689d))) {
                M m2 = aVar.f2688c;
                View view = aVar.f2686a;
                M b3 = b(view, true);
                M a2 = a(view, true);
                if (b3 == null && a2 == null) {
                    a2 = this.t.f2707a.get(view);
                }
                if (!(b3 == null && a2 == null) && aVar.f2690e.a(m2, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        r2.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.s, this.t, this.w, this.x);
        p();
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, N n2, N n3, ArrayList<M> arrayList, ArrayList<M> arrayList2) {
        int i2;
        int i3;
        Animator a2;
        View view;
        Animator animator;
        M m2;
        M m3;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        b.e.b<Animator, a> r2 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            M m4 = arrayList.get(i4);
            M m5 = arrayList2.get(i4);
            if (m4 != null && !m4.f2706c.contains(this)) {
                m4 = null;
            }
            if (m5 != null && !m5.f2706c.contains(this)) {
                m5 = null;
            }
            if (!(m4 == null && m5 == null)) {
                if ((m4 == null || m5 == null || a(m4, m5)) && (a2 = a(viewGroup2, m4, m5)) != null) {
                    if (m5 != null) {
                        view = m5.f2705b;
                        String[] o2 = o();
                        if (view != null && o2 != null && o2.length > 0) {
                            m3 = new M();
                            m3.f2705b = view;
                            Animator animator3 = a2;
                            i3 = size;
                            M m6 = n3.f2707a.get(view);
                            if (m6 != null) {
                                int i5 = 0;
                                while (i5 < o2.length) {
                                    m3.f2704a.put(o2[i5], m6.f2704a.get(o2[i5]));
                                    i5++;
                                    ArrayList<M> arrayList3 = arrayList2;
                                    i4 = i4;
                                    m6 = m6;
                                }
                            }
                            i2 = i4;
                            int size2 = r2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                a aVar = r2.get(r2.b(i6));
                                if (aVar.f2688c != null && aVar.f2686a == view && aVar.f2687b.equals(g()) && aVar.f2688c.equals(m3)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = a2;
                            m3 = null;
                        }
                        animator = animator2;
                        m2 = m3;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = m4.f2705b;
                        animator = a2;
                        m2 = null;
                    }
                    if (animator != null) {
                        I i7 = this.G;
                        if (i7 != null) {
                            long a3 = i7.a(viewGroup2, this, m4, m5);
                            sparseIntArray.put(this.F.size(), (int) a3);
                            j2 = Math.min(a3, j2);
                        }
                        r2.put(animator, new a(view, g(), this, ba.d(viewGroup), m2));
                        this.F.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator4 = this.F.get(sparseIntArray.keyAt(i8));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i8)) - j2) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z2) {
        b.e.b<String, String> bVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        a(z2);
        if ((this.f2685h.size() > 0 || this.i.size() > 0) && (((arrayList = this.j) == null || arrayList.isEmpty()) && ((arrayList2 = this.k) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f2685h.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f2685h.get(i2).intValue());
                if (findViewById != null) {
                    M m2 = new M();
                    m2.f2705b = findViewById;
                    if (z2) {
                        c(m2);
                    } else {
                        a(m2);
                    }
                    m2.f2706c.add(this);
                    b(m2);
                    a(z2 ? this.s : this.t, findViewById, m2);
                }
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                View view = this.i.get(i3);
                M m3 = new M();
                m3.f2705b = view;
                if (z2) {
                    c(m3);
                } else {
                    a(m3);
                }
                m3.f2706c.add(this);
                b(m3);
                a(z2 ? this.s : this.t, view, m3);
            }
        } else {
            c(viewGroup, z2);
        }
        if (!z2 && (bVar = this.I) != null) {
            int size = bVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.s.f2710d.remove(this.I.b(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.s.f2710d.put(this.I.d(i5), view2);
                }
            }
        }
    }

    public void a(b bVar) {
        this.H = bVar;
    }

    public void a(I i2) {
        this.G = i2;
    }

    public abstract void a(M m2);

    public void a(C0224v vVar) {
        if (vVar == null) {
            vVar = f2679b;
        }
        this.J = vVar;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        N n2;
        if (z2) {
            this.s.f2707a.clear();
            this.s.f2708b.clear();
            n2 = this.s;
        } else {
            this.t.f2707a.clear();
            this.t.f2708b.clear();
            n2 = this.t;
        }
        n2.f2709c.a();
    }

    public boolean a(M m2, M m3) {
        if (m2 == null || m3 == null) {
            return false;
        }
        String[] o2 = o();
        if (o2 != null) {
            int length = o2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!a(m2, m3, o2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String a2 : m2.f2704a.keySet()) {
            if (a(m2, m3, a2)) {
            }
        }
        return false;
        return true;
    }

    public long b() {
        return this.f2683f;
    }

    public E b(long j2) {
        this.f2682e = j2;
        return this;
    }

    public E b(c cVar) {
        ArrayList<c> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public M b(View view, boolean z2) {
        K k2 = this.u;
        if (k2 != null) {
            return k2.b(view, z2);
        }
        return (z2 ? this.s : this.t).f2707a.get(view);
    }

    /* access modifiers changed from: package-private */
    public void b(M m2) {
        String[] a2;
        if (this.G != null && !m2.f2704a.isEmpty() && (a2 = this.G.a()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= a2.length) {
                    z2 = true;
                    break;
                } else if (!m2.f2704a.containsKey(a2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.G.a(m2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.n.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.o != null && y.s(view) != null && this.o.contains(y.s(view))) {
            return false;
        }
        if ((this.f2685h.size() == 0 && this.i.size() == 0 && (((arrayList = this.k) == null || arrayList.isEmpty()) && ((arrayList2 = this.j) == null || arrayList2.isEmpty()))) || this.f2685h.contains(Integer.valueOf(id)) || this.i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.j;
        if (arrayList6 != null && arrayList6.contains(y.s(view))) {
            return true;
        }
        if (this.k != null) {
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                if (this.k.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c(View view) {
        if (!this.D) {
            b.e.b<Animator, a> r2 = r();
            int size = r2.size();
            ka d2 = ba.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a d3 = r2.d(i2);
                if (d3.f2686a != null && d2.equals(d3.f2689d)) {
                    C0204a.a(r2.b(i2));
                }
            }
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((c) arrayList2.get(i3)).b(this);
                }
            }
            this.C = true;
        }
    }

    public abstract void c(M m2);

    public E clone() {
        try {
            E e2 = (E) super.clone();
            e2.F = new ArrayList<>();
            e2.s = new N();
            e2.t = new N();
            e2.w = null;
            e2.x = null;
            return e2;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public E d(View view) {
        this.i.remove(view);
        return this;
    }

    public b e() {
        return this.H;
    }

    public void e(View view) {
        if (this.C) {
            if (!this.D) {
                b.e.b<Animator, a> r2 = r();
                int size = r2.size();
                ka d2 = ba.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a d3 = r2.d(i2);
                    if (d3.f2686a != null && d2.equals(d3.f2689d)) {
                        C0204a.b(r2.b(i2));
                    }
                }
                ArrayList<c> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((c) arrayList2.get(i3)).d(this);
                    }
                }
            }
            this.C = false;
        }
    }

    public TimeInterpolator f() {
        return this.f2684g;
    }

    public String g() {
        return this.f2681d;
    }

    public C0224v h() {
        return this.J;
    }

    public I i() {
        return this.G;
    }

    public long j() {
        return this.f2682e;
    }

    public List<Integer> k() {
        return this.f2685h;
    }

    public List<String> l() {
        return this.j;
    }

    public List<Class> m() {
        return this.k;
    }

    public List<View> n() {
        return this.i;
    }

    public String[] o() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void p() {
        q();
        b.e.b<Animator, a> r2 = r();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r2.containsKey(next)) {
                q();
                a(next, r2);
            }
        }
        this.F.clear();
        a();
    }

    /* access modifiers changed from: protected */
    public void q() {
        if (this.B == 0) {
            ArrayList<c> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).a(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public String toString() {
        return a(BuildConfig.FLAVOR);
    }
}
