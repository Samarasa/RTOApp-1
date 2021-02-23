package c.a.a.f;

import b.e.b;
import c.a.a.i.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<h> f3559a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final b<h, List<Class<?>>> f3560b = new b<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2) {
        List<Class<?>> list;
        h andSet = this.f3559a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new h(cls, cls2);
        } else {
            andSet.a(cls, cls2);
        }
        synchronized (this.f3560b) {
            list = this.f3560b.get(andSet);
        }
        this.f3559a.set(andSet);
        return list;
    }

    public void a(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.f3560b) {
            this.f3560b.put(new h(cls, cls2), list);
        }
    }
}
