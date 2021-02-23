package c.a.a.i.a;

import android.util.Log;
import b.h.i.e;
import b.h.i.f;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final C0058d<Object> f3639a = new a();

    public interface a<T> {
        T a();
    }

    private static final class b<T> implements b.h.i.d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f3640a;

        /* renamed from: b  reason: collision with root package name */
        private final C0058d<T> f3641b;

        /* renamed from: c  reason: collision with root package name */
        private final b.h.i.d<T> f3642c;

        b(b.h.i.d<T> dVar, a<T> aVar, C0058d<T> dVar2) {
            this.f3642c = dVar;
            this.f3640a = aVar;
            this.f3641b = dVar2;
        }

        public T a() {
            T a2 = this.f3642c.a();
            if (a2 == null) {
                a2 = this.f3640a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + a2.getClass());
                }
            }
            if (a2 instanceof c) {
                ((c) a2).d().a(false);
            }
            return a2;
        }

        public boolean a(T t) {
            if (t instanceof c) {
                ((c) t).d().a(true);
            }
            this.f3641b.a(t);
            return this.f3642c.a(t);
        }
    }

    public interface c {
        g d();
    }

    /* renamed from: c.a.a.i.a.d$d  reason: collision with other inner class name */
    public interface C0058d<T> {
        void a(T t);
    }

    public static <T> b.h.i.d<List<T>> a() {
        return a(20);
    }

    public static <T> b.h.i.d<List<T>> a(int i) {
        return a(new f(i), new b(), new c());
    }

    public static <T extends c> b.h.i.d<T> a(int i, a<T> aVar) {
        return a(new e(i), aVar);
    }

    private static <T extends c> b.h.i.d<T> a(b.h.i.d<T> dVar, a<T> aVar) {
        return a(dVar, aVar, b());
    }

    private static <T> b.h.i.d<T> a(b.h.i.d<T> dVar, a<T> aVar, C0058d<T> dVar2) {
        return new b(dVar, aVar, dVar2);
    }

    public static <T extends c> b.h.i.d<T> b(int i, a<T> aVar) {
        return a(new f(i), aVar);
    }

    private static <T> C0058d<T> b() {
        return f3639a;
    }
}
