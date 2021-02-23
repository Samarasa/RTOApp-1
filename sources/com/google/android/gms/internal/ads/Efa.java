package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class Efa {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f6723a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final Vfa<?, ?> f6724b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final Vfa<?, ?> f6725c = a(true);

    /* renamed from: d  reason: collision with root package name */
    private static final Vfa<?, ?> f6726d = new Xfa();

    static int a(int i, Object obj, Cfa cfa) {
        return obj instanceof Nea ? C1658fea.a(i, (Nea) obj) : C1658fea.b(i, (C1872ifa) obj, cfa);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e2 = C1658fea.e(i) * size;
        if (list instanceof Pea) {
            Pea pea = (Pea) list;
            while (i2 < size) {
                Object i3 = pea.i(i2);
                e2 += i3 instanceof Lda ? C1658fea.a((Lda) i3) : C1658fea.a((String) i3);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e2 += obj instanceof Lda ? C1658fea.a((Lda) obj) : C1658fea.a((String) obj);
                i2++;
            }
        }
        return e2;
    }

    static int a(int i, List<?> list, Cfa cfa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = C1658fea.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e2 += obj instanceof Nea ? C1658fea.a((Nea) obj) : C1658fea.a((C1872ifa) obj, cfa);
        }
        return e2;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * C1658fea.e(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.d(xea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Vfa<?, ?> a() {
        return f6724b;
    }

    private static Vfa<?, ?> a(boolean z) {
        try {
            Class<?> e2 = e();
            if (e2 == null) {
                return null;
            }
            return (Vfa) e2.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, Vfa<UT, UB> vfa) {
        if (ub == null) {
            ub = vfa.a();
        }
        vfa.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, Bea bea, UB ub, Vfa<UT, UB> vfa) {
        UB ub2;
        if (bea == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!bea.a(intValue)) {
                        ub = a(i, intValue, ub2, vfa);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (bea.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, vfa);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, C2583sga sga) {
        if (list != null && !list.isEmpty()) {
            sga.b(i, list);
        }
    }

    public static void a(int i, List<?> list, C2583sga sga, Cfa cfa) {
        if (list != null && !list.isEmpty()) {
            sga.a(i, list, cfa);
        }
    }

    public static void a(int i, List<Double> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.m(i, list, z);
        }
    }

    static <T, UT, UB> void a(Vfa<UT, UB> vfa, T t, T t2) {
        vfa.a((Object) t, vfa.c(vfa.d(t), vfa.d(t2)));
    }

    static <T> void a(C1377bfa bfa, T t, T t2, long j) {
        C1308aga.a((Object) t, j, bfa.a(C1308aga.f(t, j), C1308aga.f(t2, j)));
    }

    static <T, FT extends C2367pea<FT>> void a(C2154mea<FT> mea, T t, T t2) {
        C2225nea<FT> a2 = mea.a((Object) t2);
        if (!a2.f11484b.isEmpty()) {
            mea.b(t).a(a2);
        }
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!C2934xea.class.isAssignableFrom(cls) && (cls2 = f6723a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i, List<Lda> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = size * C1658fea.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e2 += C1658fea.a(list.get(i2));
        }
        return e2;
    }

    static int b(int i, List<C1872ifa> list, Cfa cfa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C1658fea.c(i, list.get(i3), cfa);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * C1658fea.e(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.e(xea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Vfa<?, ?> b() {
        return f6725c;
    }

    public static void b(int i, List<Lda> list, C2583sga sga) {
        if (list != null && !list.isEmpty()) {
            sga.a(i, list);
        }
    }

    public static void b(int i, List<?> list, C2583sga sga, Cfa cfa) {
        if (list != null && !list.isEmpty()) {
            sga.b(i, list, cfa);
        }
    }

    public static void b(int i, List<Float> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.n(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * C1658fea.e(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Xea) {
            Xea xea = (Xea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.f(xea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Vfa<?, ?> c() {
        return f6726d;
    }

    public static void c(int i, List<Long> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.d(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * C1658fea.e(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.k(yea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.k(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * C1658fea.e(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.f(yea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.j(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * C1658fea.e(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.g(yea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.i(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * C1658fea.e(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3005yea) {
            C3005yea yea = (C3005yea) list;
            i = 0;
            while (i2 < size) {
                i += C1658fea.h(yea.j(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1658fea.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.e(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1658fea.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.b(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1658fea.g(i, 0);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.g(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1658fea.b(i, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.l(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.f(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.h(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.c(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, C2583sga sga, boolean z) {
        if (list != null && !list.isEmpty()) {
            sga.a(i, list, z);
        }
    }
}
