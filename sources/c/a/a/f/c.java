package c.a.a.f;

import b.e.b;
import b.h.i.d;
import c.a.a.c.b.C;
import c.a.a.c.b.k;
import c.a.a.c.d.f.g;
import c.a.a.i.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final C<?, ?, ?> f3556a = new C(Object.class, Object.class, Object.class, Collections.singletonList(new k(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (d<List<Throwable>>) null)), (d<List<Throwable>>) null);

    /* renamed from: b  reason: collision with root package name */
    private final b<h, C<?, ?, ?>> f3557b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<h> f3558c = new AtomicReference<>();

    private h b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        h andSet = this.f3558c.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new h();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> C<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C<Data, TResource, Transcode> c2;
        h b2 = b(cls, cls2, cls3);
        synchronized (this.f3557b) {
            c2 = this.f3557b.get(b2);
        }
        this.f3558c.set(b2);
        return c2;
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, C<?, ?, ?> c2) {
        synchronized (this.f3557b) {
            b<h, C<?, ?, ?>> bVar = this.f3557b;
            h hVar = new h(cls, cls2, cls3);
            if (c2 == null) {
                c2 = f3556a;
            }
            bVar.put(hVar, c2);
        }
    }

    public boolean a(C<?, ?, ?> c2) {
        return f3556a.equals(c2);
    }
}
