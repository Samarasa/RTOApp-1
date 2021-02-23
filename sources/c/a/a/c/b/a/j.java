package c.a.a.c.b.a;

import android.util.Log;
import c.a.a.i.i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h<a, Object> f3044a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    private final b f3045b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f3046c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f3047d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f3048e;

    /* renamed from: f  reason: collision with root package name */
    private int f3049f;

    private static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f3050a;

        /* renamed from: b  reason: collision with root package name */
        int f3051b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f3052c;

        a(b bVar) {
            this.f3050a = bVar;
        }

        public void a() {
            this.f3050a.a(this);
        }

        /* access modifiers changed from: package-private */
        public void a(int i, Class<?> cls) {
            this.f3051b = i;
            this.f3052c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3051b == aVar.f3051b && this.f3052c == aVar.f3052c;
        }

        public int hashCode() {
            int i = this.f3051b * 31;
            Class<?> cls = this.f3052c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f3051b + "array=" + this.f3052c + '}';
        }
    }

    private static final class b extends d<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a a(int i, Class<?> cls) {
            a aVar = (a) b();
            aVar.a(i, cls);
            return aVar;
        }
    }

    public j(int i) {
        this.f3048e = i;
    }

    private <T> a<T> a(Class<T> cls) {
        a<T> aVar = this.f3047d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else if (cls.equals(byte[].class)) {
                aVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f3047d.put(cls, aVar);
        }
        return aVar;
    }

    private <T> a<T> a(T t) {
        return a(t.getClass());
    }

    private <T> T a(a aVar) {
        return this.f3044a.a(aVar);
    }

    private <T> T a(a aVar, Class<T> cls) {
        a<T> a2 = a(cls);
        T a3 = a(aVar);
        if (a3 != null) {
            this.f3049f -= a2.a(a3) * a2.a();
            c(a2.a(a3), cls);
        }
        if (a3 != null) {
            return a3;
        }
        if (Log.isLoggable(a2.getTag(), 2)) {
            Log.v(a2.getTag(), "Allocated " + aVar.f3051b + " bytes");
        }
        return a2.newArray(aVar.f3051b);
    }

    private boolean a(int i, Integer num) {
        return num != null && (c() || num.intValue() <= i * 8);
    }

    private NavigableMap<Integer, Integer> b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f3046c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3046c.put(cls, treeMap);
        return treeMap;
    }

    private void b() {
        b(this.f3048e);
    }

    private void b(int i) {
        while (this.f3049f > i) {
            Object a2 = this.f3044a.a();
            i.a(a2);
            a a3 = a(a2);
            this.f3049f -= a3.a(a2) * a3.a();
            c(a3.a(a2), a2.getClass());
            if (Log.isLoggable(a3.getTag(), 2)) {
                Log.v(a3.getTag(), "evicted: " + a3.a(a2));
            }
        }
    }

    private void c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> b2 = b(cls);
        Integer num = (Integer) b2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            b2.remove(Integer.valueOf(i));
        } else {
            b2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private boolean c() {
        int i = this.f3049f;
        return i == 0 || this.f3048e / i >= 2;
    }

    private boolean c(int i) {
        return i <= this.f3048e / 2;
    }

    public synchronized <T> T a(int i, Class<T> cls) {
        return a(this.f3045b.a(i, cls), cls);
    }

    public synchronized void a() {
        b(0);
    }

    public synchronized void a(int i) {
        if (i >= 40) {
            try {
                a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            b(this.f3048e / 2);
        }
    }

    public synchronized <T> T b(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = b((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        return a(a(i, ceilingKey) ? this.f3045b.a(ceilingKey.intValue(), cls) : this.f3045b.a(i, cls), cls);
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        a<?> a2 = a(cls);
        int a3 = a2.a(t);
        int a4 = a2.a() * a3;
        if (c(a4)) {
            a a5 = this.f3045b.a(a3, cls);
            this.f3044a.a(a5, t);
            NavigableMap<Integer, Integer> b2 = b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a5.f3051b));
            Integer valueOf = Integer.valueOf(a5.f3051b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f3049f += a4;
            b();
        }
    }
}
