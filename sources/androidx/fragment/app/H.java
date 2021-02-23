package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.s;
import b.e.b;
import b.h.j.r;
import b.h.j.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class H {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1060a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    private static final Q f1061b = (Build.VERSION.SDK_INT >= 21 ? new M() : null);

    /* renamed from: c  reason: collision with root package name */
    private static final Q f1062c = a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public C0158h f1063a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1064b;

        /* renamed from: c  reason: collision with root package name */
        public C0151a f1065c;

        /* renamed from: d  reason: collision with root package name */
        public C0158h f1066d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1067e;

        /* renamed from: f  reason: collision with root package name */
        public C0151a f1068f;

        a() {
        }
    }

    static View a(b<String, View> bVar, a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0151a aVar2 = aVar.f1065c;
        if (obj == null || bVar == null || (arrayList = aVar2.o) == null || arrayList.isEmpty()) {
            return null;
        }
        return bVar.get((z ? aVar2.o : aVar2.p).get(0));
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    private static Q a() {
        try {
            return (Q) Class.forName("b.q.t").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Q a(C0158h hVar, C0158h hVar2) {
        ArrayList arrayList = new ArrayList();
        if (hVar != null) {
            Object k = hVar.k();
            if (k != null) {
                arrayList.add(k);
            }
            Object u = hVar.u();
            if (u != null) {
                arrayList.add(u);
            }
            Object w = hVar.w();
            if (w != null) {
                arrayList.add(w);
            }
        }
        if (hVar2 != null) {
            Object i = hVar2.i();
            if (i != null) {
                arrayList.add(i);
            }
            Object r = hVar2.r();
            if (r != null) {
                arrayList.add(r);
            }
            Object v = hVar2.v();
            if (v != null) {
                arrayList.add(v);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Q q = f1061b;
        if (q != null && a(q, (List<Object>) arrayList)) {
            return f1061b;
        }
        Q q2 = f1062c;
        if (q2 != null && a(q2, (List<Object>) arrayList)) {
            return f1062c;
        }
        if (f1061b == null && f1062c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static b<String, String> a(int i, ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b<String, String> bVar = new b<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0151a aVar = arrayList.get(i4);
            if (aVar.b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.o;
                        arrayList4 = aVar.p;
                    } else {
                        ArrayList<String> arrayList6 = aVar.o;
                        arrayList3 = aVar.p;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = bVar.remove(str2);
                        if (remove != null) {
                            bVar.put(str, remove);
                        } else {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    static b<String, View> a(Q q, b<String, String> bVar, Object obj, a aVar) {
        s sVar;
        ArrayList<String> arrayList;
        String a2;
        C0158h hVar = aVar.f1063a;
        View z = hVar.z();
        if (bVar.isEmpty() || obj == null || z == null) {
            bVar.clear();
            return null;
        }
        b<String, View> bVar2 = new b<>();
        q.a((Map<String, View>) bVar2, z);
        C0151a aVar2 = aVar.f1065c;
        if (aVar.f1064b) {
            sVar = hVar.l();
            arrayList = aVar2.o;
        } else {
            sVar = hVar.j();
            arrayList = aVar2.p;
        }
        if (arrayList != null) {
            bVar2.a(arrayList);
            bVar2.a(bVar.values());
        }
        if (sVar != null) {
            sVar.a((List<String>) arrayList, (Map<String, View>) bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    String a3 = a(bVar, str);
                    if (a3 != null) {
                        bVar.remove(a3);
                    }
                } else if (!str.equals(y.s(view)) && (a2 = a(bVar, str)) != null) {
                    bVar.put(a2, y.s(view));
                }
            }
        } else {
            a(bVar, bVar2);
        }
        return bVar2;
    }

    private static Object a(Q q, ViewGroup viewGroup, View view, b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        b<String, String> bVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        Q q2 = q;
        a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        C0158h hVar = aVar2.f1063a;
        C0158h hVar2 = aVar2.f1066d;
        if (hVar == null || hVar2 == null) {
            return null;
        }
        boolean z = aVar2.f1064b;
        if (bVar.isEmpty()) {
            bVar2 = bVar;
            obj3 = null;
        } else {
            obj3 = a(q2, hVar, hVar2, z);
            bVar2 = bVar;
        }
        b<String, View> b2 = b(q2, bVar2, obj3, aVar2);
        if (bVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b2.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        a(hVar, hVar2, z, b2, true);
        if (obj4 != null) {
            rect = new Rect();
            q2.b(obj4, view, arrayList3);
            a(q, obj4, obj2, b2, aVar2.f1067e, aVar2.f1068f);
            if (obj5 != null) {
                q2.a(obj5, rect);
            }
        } else {
            rect = null;
        }
        G g2 = r0;
        G g3 = new G(q, bVar, obj4, aVar, arrayList2, view, hVar, hVar2, z, arrayList, obj, rect);
        r.a(viewGroup, g2);
        return obj4;
    }

    private static Object a(Q q, C0158h hVar, C0158h hVar2, boolean z) {
        if (hVar == null || hVar2 == null) {
            return null;
        }
        return q.c(q.b(z ? hVar2.w() : hVar.v()));
    }

    private static Object a(Q q, C0158h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return q.b(z ? hVar.r() : hVar.i());
    }

    private static Object a(Q q, Object obj, Object obj2, Object obj3, C0158h hVar, boolean z) {
        return (obj == null || obj2 == null || hVar == null) ? true : z ? hVar.d() : hVar.c() ? q.b(obj2, obj, obj3) : q.a(obj2, obj, obj3);
    }

    private static String a(b<String, String> bVar, String str) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(bVar.d(i))) {
                return bVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(Q q, Object obj, C0158h hVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View z = hVar.z();
        if (z != null) {
            q.a(arrayList2, z);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        q.a(obj, arrayList2);
        return arrayList2;
    }

    private static void a(Q q, ViewGroup viewGroup, C0158h hVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        r.a(viewGroup, new E(obj, q, view, hVar, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(Q q, Object obj, C0158h hVar, ArrayList<View> arrayList) {
        if (hVar != null && obj != null && hVar.k && hVar.y && hVar.M) {
            hVar.f(true);
            q.a(obj, hVar.z(), arrayList);
            r.a(hVar.F, new D(arrayList));
        }
    }

    private static void a(Q q, Object obj, Object obj2, b<String, View> bVar, boolean z, C0151a aVar) {
        ArrayList<String> arrayList = aVar.o;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = bVar.get((z ? aVar.p : aVar.o).get(0));
            q.c(obj, view);
            if (obj2 != null) {
                q.c(obj2, view);
            }
        }
    }

    public static void a(C0151a aVar, SparseArray<a> sparseArray, boolean z) {
        int size = aVar.f1019a.size();
        for (int i = 0; i < size; i++) {
            a(aVar, aVar.f1019a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.k != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.y == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(androidx.fragment.app.C0151a r16, androidx.fragment.app.C.a r17, android.util.SparseArray<androidx.fragment.app.H.a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.h r10 = r1.f1028b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.w
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f1060a
            int r1 = r1.f1027a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f1027a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.M
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.y
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.y
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.M
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.y
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.y
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.k
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.G
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.N
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.y
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.L
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.k
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.y
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.H$a r6 = (androidx.fragment.app.H.a) r6
            if (r4 == 0) goto L_0x00ac
            androidx.fragment.app.H$a r6 = a((androidx.fragment.app.H.a) r6, (android.util.SparseArray<androidx.fragment.app.H.a>) r2, (int) r11)
            r6.f1063a = r10
            r6.f1064b = r3
            r6.f1065c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            androidx.fragment.app.h r1 = r14.f1066d
            if (r1 != r10) goto L_0x00ba
            r14.f1066d = r15
        L_0x00ba:
            androidx.fragment.app.v r4 = r0.s
            int r1 = r10.f1108b
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.s
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.q
            if (r1 != 0) goto L_0x00d3
            r4.i(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.a((androidx.fragment.app.C0158h) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            androidx.fragment.app.h r1 = r14.f1066d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            androidx.fragment.app.H$a r14 = a((androidx.fragment.app.H.a) r14, (android.util.SparseArray<androidx.fragment.app.H.a>) r2, (int) r11)
            r14.f1066d = r10
            r14.f1067e = r3
            r14.f1068f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            androidx.fragment.app.h r0 = r14.f1063a
            if (r0 != r10) goto L_0x00f1
            r14.f1063a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.a(androidx.fragment.app.a, androidx.fragment.app.C$a, android.util.SparseArray, boolean, boolean):void");
    }

    static void a(C0158h hVar, C0158h hVar2, boolean z, b<String, View> bVar, boolean z2) {
        s j = z ? hVar2.j() : hVar.j();
        if (j != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = bVar == null ? 0 : bVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(bVar.b(i));
                arrayList.add(bVar.d(i));
            }
            if (z2) {
                j.b(arrayList2, arrayList, (List<View>) null);
            } else {
                j.a((List<String>) arrayList2, (List<View>) arrayList, (List<View>) null);
            }
        }
    }

    private static void a(v vVar, int i, a aVar, View view, b<String, String> bVar) {
        C0158h hVar;
        C0158h hVar2;
        Q a2;
        Object obj;
        v vVar2 = vVar;
        a aVar2 = aVar;
        View view2 = view;
        b<String, String> bVar2 = bVar;
        ViewGroup viewGroup = vVar2.u.a() ? (ViewGroup) vVar2.u.a(i) : null;
        if (viewGroup != null && (a2 = a(hVar2, hVar)) != null) {
            boolean z = aVar2.f1064b;
            boolean z2 = aVar2.f1067e;
            Object a3 = a(a2, (hVar = aVar2.f1063a), z);
            Object b2 = b(a2, (hVar2 = aVar2.f1066d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = b2;
            Q q = a2;
            Object a4 = a(a2, viewGroup, view, bVar, aVar, (ArrayList<View>) arrayList, (ArrayList<View>) arrayList2, a3, obj2);
            Object obj3 = a3;
            if (obj3 == null && a4 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> a5 = a(q, obj, hVar2, (ArrayList<View>) arrayList3, view2);
            Object obj4 = (a5 == null || a5.isEmpty()) ? null : obj;
            q.a(obj3, view2);
            Object a6 = a(q, obj3, obj4, a4, hVar, aVar2.f1064b);
            if (a6 != null) {
                ArrayList arrayList4 = new ArrayList();
                Q q2 = q;
                q2.a(a6, obj3, arrayList4, obj4, a5, a4, arrayList2);
                a(q2, viewGroup, hVar, view, (ArrayList<View>) arrayList2, obj3, (ArrayList<View>) arrayList4, obj4, a5);
                ArrayList arrayList5 = arrayList2;
                q.a((View) viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) bVar2);
                q.a(viewGroup, a6);
                q.a(viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) bVar2);
            }
        }
    }

    static void a(v vVar, ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (vVar.s >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0151a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    b(aVar, (SparseArray<a>) sparseArray, z);
                } else {
                    a(aVar, (SparseArray<a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(vVar.t.c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    b<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
                    a aVar2 = (a) sparseArray.valueAt(i4);
                    if (z) {
                        b(vVar, keyAt, aVar2, view, a2);
                    } else {
                        a(vVar, keyAt, aVar2, view, a2);
                    }
                }
            }
        }
    }

    private static void a(b<String, String> bVar, b<String, View> bVar2) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            if (!bVar2.containsKey(bVar.d(size))) {
                bVar.c(size);
            }
        }
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, b<String, View> bVar, Collection<String> collection) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View d2 = bVar.d(size);
            if (collection.contains(y.s(d2))) {
                arrayList.add(d2);
            }
        }
    }

    private static boolean a(Q q, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!q.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static b<String, View> b(Q q, b<String, String> bVar, Object obj, a aVar) {
        s sVar;
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        C0158h hVar = aVar.f1066d;
        b<String, View> bVar2 = new b<>();
        q.a((Map<String, View>) bVar2, hVar.da());
        C0151a aVar2 = aVar.f1068f;
        if (aVar.f1067e) {
            sVar = hVar.j();
            arrayList = aVar2.p;
        } else {
            sVar = hVar.l();
            arrayList = aVar2.o;
        }
        bVar2.a(arrayList);
        if (sVar != null) {
            sVar.a((List<String>) arrayList, (Map<String, View>) bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    bVar.remove(str);
                } else if (!str.equals(y.s(view))) {
                    bVar.put(y.s(view), bVar.remove(str));
                }
            }
        } else {
            bVar.a(bVar2.keySet());
        }
        return bVar2;
    }

    private static Object b(Q q, ViewGroup viewGroup, View view, b<String, String> bVar, a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        Q q2 = q;
        View view3 = view;
        b<String, String> bVar2 = bVar;
        a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        C0158h hVar = aVar2.f1063a;
        C0158h hVar2 = aVar2.f1066d;
        if (hVar != null) {
            hVar.da().setVisibility(0);
        }
        if (hVar == null || hVar2 == null) {
            return null;
        }
        boolean z = aVar2.f1064b;
        Object a2 = bVar.isEmpty() ? null : a(q, hVar, hVar2, z);
        b<String, View> b2 = b(q, bVar2, a2, aVar2);
        b<String, View> a3 = a(q, bVar2, a2, aVar2);
        if (bVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, b2, (Collection<String>) bVar.keySet());
            a(arrayList4, a3, bVar.values());
            obj3 = a2;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(hVar, hVar2, z, b2, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            q.b(obj3, view3, arrayList3);
            a(q, obj3, obj2, b2, aVar2.f1067e, aVar2.f1068f);
            Rect rect2 = new Rect();
            View a4 = a(a3, aVar2, obj4, z);
            if (a4 != null) {
                q.a(obj4, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        r.a(viewGroup, new F(hVar, hVar2, z, a3, view2, q, rect));
        return obj3;
    }

    private static Object b(Q q, C0158h hVar, boolean z) {
        if (hVar == null) {
            return null;
        }
        return q.b(z ? hVar.u() : hVar.k());
    }

    public static void b(C0151a aVar, SparseArray<a> sparseArray, boolean z) {
        if (aVar.s.u.a()) {
            for (int size = aVar.f1019a.size() - 1; size >= 0; size--) {
                a(aVar, aVar.f1019a.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f1063a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.v r17, int r18, androidx.fragment.app.H.a r19, android.view.View r20, b.e.b<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            androidx.fragment.app.j r1 = r0.u
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0019
            androidx.fragment.app.j r0 = r0.u
            r1 = r18
            android.view.View r0 = r0.a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            androidx.fragment.app.h r11 = r4.f1063a
            androidx.fragment.app.h r12 = r4.f1066d
            androidx.fragment.app.Q r13 = a((androidx.fragment.app.C0158h) r12, (androidx.fragment.app.C0158h) r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f1064b
            boolean r0 = r4.f1067e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = a((androidx.fragment.app.Q) r13, (androidx.fragment.app.C0158h) r11, (boolean) r14)
            java.lang.Object r6 = b((androidx.fragment.app.Q) r13, (androidx.fragment.app.C0158h) r12, (boolean) r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = a((androidx.fragment.app.Q) r13, (java.lang.Object) r7, (androidx.fragment.app.C0158h) r12, (java.util.ArrayList<android.view.View>) r10, (android.view.View) r9)
            java.util.ArrayList r9 = a((androidx.fragment.app.Q) r13, (java.lang.Object) r6, (androidx.fragment.app.C0158h) r11, (java.util.ArrayList<android.view.View>) r15, (android.view.View) r9)
            r0 = 4
            a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = a((androidx.fragment.app.Q) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (androidx.fragment.app.C0158h) r4, (boolean) r5)
            if (r14 == 0) goto L_0x00a4
            a((androidx.fragment.app.Q) r13, (java.lang.Object) r7, (androidx.fragment.app.C0158h) r12, (java.util.ArrayList<android.view.View>) r11)
            java.util.ArrayList r12 = r13.a((java.util.ArrayList<android.view.View>) r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.a((android.view.ViewGroup) r0, (java.lang.Object) r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.a(r2, r3, r4, r5, r6)
            r0 = 0
            a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r13.b((java.lang.Object) r8, (java.util.ArrayList<android.view.View>) r10, (java.util.ArrayList<android.view.View>) r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.b(androidx.fragment.app.v, int, androidx.fragment.app.H$a, android.view.View, b.e.b):void");
    }
}
