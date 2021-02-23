package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f2148a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f2149b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f2150c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f2151d = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2155d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2154c;
        }
    }

    /* renamed from: b.b.a.b.b$b  reason: collision with other inner class name */
    private static class C0028b<K, V> extends e<K, V> {
        C0028b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2154c;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2155d;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f2152a;

        /* renamed from: b  reason: collision with root package name */
        final V f2153b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f2154c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f2155d;

        c(K k, V v) {
            this.f2152a = k;
            this.f2153b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2152a.equals(cVar.f2152a) && this.f2153b.equals(cVar.f2153b);
        }

        public K getKey() {
            return this.f2152a;
        }

        public V getValue() {
            return this.f2153b;
        }

        public int hashCode() {
            return this.f2152a.hashCode() ^ this.f2153b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2152a + "=" + this.f2153b;
        }
    }

    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f2156a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f2157b = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2156a;
            if (cVar == cVar2) {
                this.f2156a = cVar2.f2155d;
                this.f2157b = this.f2156a == null;
            }
        }

        public boolean hasNext() {
            if (this.f2157b) {
                return b.this.f2148a != null;
            }
            c<K, V> cVar = this.f2156a;
            return (cVar == null || cVar.f2154c == null) ? false : true;
        }

        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f2157b) {
                this.f2157b = false;
                cVar = b.this.f2148a;
            } else {
                c<K, V> cVar2 = this.f2156a;
                cVar = cVar2 != null ? cVar2.f2154c : null;
            }
            this.f2156a = cVar;
            return this.f2156a;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f2159a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f2160b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2159a = cVar2;
            this.f2160b = cVar;
        }

        private c<K, V> b() {
            c<K, V> cVar = this.f2160b;
            c<K, V> cVar2 = this.f2159a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f2159a == cVar && cVar == this.f2160b) {
                this.f2160b = null;
                this.f2159a = null;
            }
            c<K, V> cVar2 = this.f2159a;
            if (cVar2 == cVar) {
                this.f2159a = b(cVar2);
            }
            if (this.f2160b == cVar) {
                this.f2160b = b();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f2160b != null;
        }

        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2160b;
            this.f2160b = b();
            return cVar;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        c<K, V> cVar = this.f2148a;
        while (cVar != null && !cVar.f2152a.equals(k)) {
            cVar = cVar.f2154c;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f2151d++;
        c<K, V> cVar2 = this.f2149b;
        if (cVar2 == null) {
            this.f2148a = cVar;
            this.f2149b = this.f2148a;
            return cVar;
        }
        cVar2.f2154c = cVar;
        cVar.f2155d = cVar2;
        this.f2149b = cVar;
        return cVar;
    }

    public V b(K k, V v) {
        c a2 = a(k);
        if (a2 != null) {
            return a2.f2153b;
        }
        a(k, v);
        return null;
    }

    public Map.Entry<K, V> c() {
        return this.f2148a;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f2150c.put(dVar, false);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0028b bVar = new C0028b(this.f2149b, this.f2148a);
        this.f2150c.put(bVar, false);
        return bVar;
    }

    public Map.Entry<K, V> e() {
        return this.f2149b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2148a, this.f2149b);
        this.f2150c.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.f2151d--;
        if (!this.f2150c.isEmpty()) {
            for (f<K, V> a3 : this.f2150c.keySet()) {
                a3.a(a2);
            }
        }
        c<K, V> cVar = a2.f2155d;
        if (cVar != null) {
            cVar.f2154c = a2.f2154c;
        } else {
            this.f2148a = a2.f2154c;
        }
        c<K, V> cVar2 = a2.f2154c;
        if (cVar2 != null) {
            cVar2.f2155d = a2.f2155d;
        } else {
            this.f2149b = a2.f2155d;
        }
        a2.f2154c = null;
        a2.f2155d = null;
        return a2.f2153b;
    }

    public int size() {
        return this.f2151d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
