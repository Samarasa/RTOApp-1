package c.b.b.b.d.f;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class Lc {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4219a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final C0294ad<?, ?> f4220b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final C0294ad<?, ?> f4221c = a(true);

    /* renamed from: d  reason: collision with root package name */
    private static final C0294ad<?, ?> f4222d = new C0308cd();

    static int a(int i, Object obj, Kc kc) {
        return obj instanceof C0293ac ? C0437vb.a(i, (C0293ac) obj) : C0437vb.b(i, (C0445wc) obj, kc);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e2 = C0437vb.e(i) * size;
        if (list instanceof C0307cc) {
            C0307cc ccVar = (C0307cc) list;
            while (i2 < size) {
                Object b2 = ccVar.b(i2);
                e2 += b2 instanceof C0320eb ? C0437vb.a((C0320eb) b2) : C0437vb.a((String) b2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e2 += obj instanceof C0320eb ? C0437vb.a((C0320eb) obj) : C0437vb.a((String) obj);
                i2++;
            }
        }
        return e2;
    }

    static int a(int i, List<?> list, Kc kc) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = C0437vb.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e2 += obj instanceof C0293ac ? C0437vb.a((C0293ac) obj) : C0437vb.a((C0445wc) obj, kc);
        }
        return e2;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * C0437vb.e(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0362kc) {
            C0362kc kcVar = (C0362kc) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.d(kcVar.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0294ad<?, ?> a() {
        return f4220b;
    }

    private static C0294ad<?, ?> a(boolean z) {
        try {
            Class<?> e2 = e();
            if (e2 == null) {
                return null;
            }
            return (C0294ad) e2.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, C0294ad<UT, UB> adVar) {
        if (ub == null) {
            ub = adVar.a();
        }
        adVar.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, Sb sb, UB ub, C0294ad<UT, UB> adVar) {
        UB ub2;
        if (sb == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!sb.a(intValue)) {
                        ub = a(i, intValue, ub2, adVar);
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
                if (sb.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, adVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, C0453xd xdVar) {
        if (list != null && !list.isEmpty()) {
            xdVar.b(i, list);
        }
    }

    public static void a(int i, List<?> list, C0453xd xdVar, Kc kc) {
        if (list != null && !list.isEmpty()) {
            xdVar.b(i, list, kc);
        }
    }

    public static void a(int i, List<Double> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.m(i, list, z);
        }
    }

    static <T, FT extends Fb<FT>> void a(Ab<FT> ab, T t, T t2) {
        Db<FT> a2 = ab.a((Object) t2);
        if (!a2.f4120b.isEmpty()) {
            ab.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(C0294ad<UT, UB> adVar, T t, T t2) {
        adVar.a((Object) t, adVar.c(adVar.a(t), adVar.a(t2)));
    }

    static <T> void a(C0397pc pcVar, T t, T t2, long j) {
        C0336gd.a((Object) t, j, pcVar.a(C0336gd.f(t, j), C0336gd.f(t2, j)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!Lb.class.isAssignableFrom(cls) && (cls2 = f4219a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i, List<C0320eb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = size * C0437vb.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e2 += C0437vb.a(list.get(i2));
        }
        return e2;
    }

    static int b(int i, List<C0445wc> list, Kc kc) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0437vb.c(i, list.get(i3), kc);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * C0437vb.e(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0362kc) {
            C0362kc kcVar = (C0362kc) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.e(kcVar.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0294ad<?, ?> b() {
        return f4221c;
    }

    public static void b(int i, List<C0320eb> list, C0453xd xdVar) {
        if (list != null && !list.isEmpty()) {
            xdVar.a(i, list);
        }
    }

    public static void b(int i, List<?> list, C0453xd xdVar, Kc kc) {
        if (list != null && !list.isEmpty()) {
            xdVar.a(i, list, kc);
        }
    }

    public static void b(int i, List<Float> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.n(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * C0437vb.e(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0362kc) {
            C0362kc kcVar = (C0362kc) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.f(kcVar.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0294ad<?, ?> c() {
        return f4222d;
    }

    public static void c(int i, List<Long> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.d(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * C0437vb.e(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ob) {
            Ob ob = (Ob) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.k(ob.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.k(list.get(i2).intValue());
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

    public static void d(int i, List<Long> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.k(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * C0437vb.e(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ob) {
            Ob ob = (Ob) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.f(ob.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.f(list.get(i2).intValue());
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

    public static void e(int i, List<Long> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.j(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * C0437vb.e(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ob) {
            Ob ob = (Ob) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.g(ob.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.i(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * C0437vb.e(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Ob) {
            Ob ob = (Ob) list;
            i = 0;
            while (i2 < size) {
                i += C0437vb.h(ob.h(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0437vb.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.e(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0437vb.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.b(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0437vb.g(i, 0);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.g(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0437vb.b(i, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.l(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.f(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.h(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.c(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, C0453xd xdVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xdVar.a(i, list, z);
        }
    }
}
