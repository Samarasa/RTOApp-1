package c.a.a.c.a;

import c.a.a.c.a.e;
import c.a.a.i.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final e.a<?> f2969a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f2970b = new HashMap();

    private static final class a implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2971a;

        a(Object obj) {
            this.f2971a = obj;
        }

        public Object a() {
            return this.f2971a;
        }

        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t) {
        e.a<?> aVar;
        i.a(t);
        aVar = this.f2970b.get(t.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.f2970b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f2969a;
        }
        return aVar.a(t);
    }

    public synchronized void a(e.a<?> aVar) {
        this.f2970b.put(aVar.a(), aVar);
    }
}
