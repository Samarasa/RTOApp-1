package c.a.a.c.c;

import b.h.i.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.i;
import c.a.a.i.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private static final c f3341a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final u<Object, Object> f3342b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final List<b<?, ?>> f3343c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3344d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<b<?, ?>> f3345e;

    /* renamed from: f  reason: collision with root package name */
    private final d<List<Throwable>> f3346f;

    private static class a implements u<Object, Object> {
        a() {
        }

        public u.a<Object> a(Object obj, int i, int i2, k kVar) {
            return null;
        }

        public boolean a(Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f3347a;

        /* renamed from: b  reason: collision with root package name */
        final Class<Data> f3348b;

        /* renamed from: c  reason: collision with root package name */
        final v<? extends Model, ? extends Data> f3349c;

        public b(Class<Model> cls, Class<Data> cls2, v<? extends Model, ? extends Data> vVar) {
            this.f3347a = cls;
            this.f3348b = cls2;
            this.f3349c = vVar;
        }

        public boolean a(Class<?> cls) {
            return this.f3347a.isAssignableFrom(cls);
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f3348b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> x<Model, Data> a(List<u<Model, Data>> list, d<List<Throwable>> dVar) {
            return new x<>(list, dVar);
        }
    }

    public y(d<List<Throwable>> dVar) {
        this(dVar, f3341a);
    }

    y(d<List<Throwable>> dVar, c cVar) {
        this.f3343c = new ArrayList();
        this.f3345e = new HashSet();
        this.f3346f = dVar;
        this.f3344d = cVar;
    }

    private static <Model, Data> u<Model, Data> a() {
        return f3342b;
    }

    private <Model, Data> u<Model, Data> a(b<?, ?> bVar) {
        u<? extends Model, ? extends Data> a2 = bVar.f3349c.a(this);
        i.a(a2);
        return a2;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, v<? extends Model, ? extends Data> vVar, boolean z) {
        b bVar = new b(cls, cls2, vVar);
        List<b<?, ?>> list = this.f3343c;
        list.add(z ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> u<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b next : this.f3343c) {
                if (this.f3345e.contains(next)) {
                    z = true;
                } else if (next.a(cls, cls2)) {
                    this.f3345e.add(next);
                    arrayList.add(a((b<?, ?>) next));
                    this.f3345e.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f3344d.a(arrayList, this.f3346f);
            } else if (arrayList.size() == 1) {
                return (u) arrayList.get(0);
            } else if (z) {
                return a();
            } else {
                throw new i.c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f3345e.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model> List<u<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.f3343c) {
                if (!this.f3345e.contains(next)) {
                    if (next.a(cls)) {
                        this.f3345e.add(next);
                        arrayList.add(a((b<?, ?>) next));
                        this.f3345e.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f3345e.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, v<? extends Model, ? extends Data> vVar) {
        a(cls, cls2, vVar, true);
    }

    /* access modifiers changed from: package-private */
    public synchronized List<Class<?>> b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.f3343c) {
            if (!arrayList.contains(next.f3348b) && next.a(cls)) {
                arrayList.add(next.f3348b);
            }
        }
        return arrayList;
    }
}
