package c.a.a.c.d.f;

import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?, ?>> f3480a = new ArrayList();

    private static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Z> f3481a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<R> f3482b;

        /* renamed from: c  reason: collision with root package name */
        final e<Z, R> f3483c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f3481a = cls;
            this.f3482b = cls2;
            this.f3483c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f3481a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3482b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.a();
        }
        for (a next : this.f3480a) {
            if (next.a(cls, cls2)) {
                return next.f3483c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> void a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f3480a.add(new a(cls, cls2, eVar));
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a2 : this.f3480a) {
            if (a2.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
