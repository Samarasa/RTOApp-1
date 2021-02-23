package c.a.a.c.b.a;

import c.a.a.c.b.a.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f3038a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, a<K, V>> f3039b = new HashMap();

    private static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f3040a;

        /* renamed from: b  reason: collision with root package name */
        private List<V> f3041b;

        /* renamed from: c  reason: collision with root package name */
        a<K, V> f3042c;

        /* renamed from: d  reason: collision with root package name */
        a<K, V> f3043d;

        a() {
            this((Object) null);
        }

        a(K k) {
            this.f3043d = this;
            this.f3042c = this;
            this.f3040a = k;
        }

        public V a() {
            int b2 = b();
            if (b2 > 0) {
                return this.f3041b.remove(b2 - 1);
            }
            return null;
        }

        public void a(V v) {
            if (this.f3041b == null) {
                this.f3041b = new ArrayList();
            }
            this.f3041b.add(v);
        }

        public int b() {
            List<V> list = this.f3041b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    h() {
    }

    private void a(a<K, V> aVar) {
        c(aVar);
        a<K, V> aVar2 = this.f3038a;
        aVar.f3043d = aVar2;
        aVar.f3042c = aVar2.f3042c;
        d(aVar);
    }

    private void b(a<K, V> aVar) {
        c(aVar);
        a<K, V> aVar2 = this.f3038a;
        aVar.f3043d = aVar2.f3043d;
        aVar.f3042c = aVar2;
        d(aVar);
    }

    private static <K, V> void c(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f3043d;
        aVar2.f3042c = aVar.f3042c;
        aVar.f3042c.f3043d = aVar2;
    }

    private static <K, V> void d(a<K, V> aVar) {
        aVar.f3042c.f3043d = aVar;
        aVar.f3043d.f3042c = aVar;
    }

    public V a() {
        a<K, V> aVar = this.f3038a;
        while (true) {
            aVar = aVar.f3043d;
            if (aVar.equals(this.f3038a)) {
                return null;
            }
            V a2 = aVar.a();
            if (a2 != null) {
                return a2;
            }
            c(aVar);
            this.f3039b.remove(aVar.f3040a);
            ((m) aVar.f3040a).a();
        }
    }

    public V a(K k) {
        a aVar = this.f3039b.get(k);
        if (aVar == null) {
            aVar = new a(k);
            this.f3039b.put(k, aVar);
        } else {
            k.a();
        }
        a(aVar);
        return aVar.a();
    }

    public void a(K k, V v) {
        a aVar = this.f3039b.get(k);
        if (aVar == null) {
            aVar = new a(k);
            b(aVar);
            this.f3039b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.f3038a.f3042c; !aVar.equals(this.f3038a); aVar = aVar.f3042c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f3040a);
            sb.append(':');
            sb.append(aVar.b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
