package c.b.e;

import c.b.e.C0485j;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class z<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f5070a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<z<K, V>.b> f5071b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f5072c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5073d;

    /* renamed from: e  reason: collision with root package name */
    private volatile z<K, V>.d f5074e;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f5075a = new x();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f5076b = new y();

        static <T> Iterable<T> b() {
            return f5076b;
        }
    }

    private class b implements Map.Entry<K, V>, Comparable<z<K, V>.b> {

        /* renamed from: a  reason: collision with root package name */
        private final K f5077a;

        /* renamed from: b  reason: collision with root package name */
        private V f5078b;

        b(K k, V v) {
            this.f5077a = k;
            this.f5078b = v;
        }

        b(z zVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean a(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(z<K, V>.b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a(this.f5077a, entry.getKey()) && a(this.f5078b, entry.getValue());
        }

        public K getKey() {
            return this.f5077a;
        }

        public V getValue() {
            return this.f5078b;
        }

        public int hashCode() {
            K k = this.f5077a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f5078b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            z.this.f();
            V v2 = this.f5078b;
            this.f5078b = v;
            return v2;
        }

        public String toString() {
            return this.f5077a + "=" + this.f5078b;
        }
    }

    private class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f5080a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5081b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f5082c;

        private c() {
            this.f5080a = -1;
        }

        /* synthetic */ c(z zVar, w wVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f5082c == null) {
                this.f5082c = z.this.f5072c.entrySet().iterator();
            }
            return this.f5082c;
        }

        public boolean hasNext() {
            return this.f5080a + 1 < z.this.f5071b.size() || b().hasNext();
        }

        public Map.Entry<K, V> next() {
            this.f5081b = true;
            int i = this.f5080a + 1;
            this.f5080a = i;
            return (Map.Entry) (i < z.this.f5071b.size() ? z.this.f5071b.get(this.f5080a) : b().next());
        }

        public void remove() {
            if (this.f5081b) {
                this.f5081b = false;
                z.this.f();
                if (this.f5080a < z.this.f5071b.size()) {
                    z zVar = z.this;
                    int i = this.f5080a;
                    this.f5080a = i - 1;
                    Object unused = zVar.c(i);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        /* synthetic */ d(z zVar, w wVar) {
            this();
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            z.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            z.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = z.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(z.this, (w) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            z.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return z.this.size();
        }
    }

    private z(int i) {
        this.f5070a = i;
        this.f5071b = Collections.emptyList();
        this.f5072c = Collections.emptyMap();
    }

    /* synthetic */ z(int i, w wVar) {
        this(i);
    }

    private int a(K k) {
        int size = this.f5071b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f5071b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f5071b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends C0485j.a<FieldDescriptorType>> z<FieldDescriptorType, Object> b(int i) {
        return new w(i);
    }

    /* access modifiers changed from: private */
    public V c(int i) {
        f();
        V value = this.f5071b.remove(i).getValue();
        if (!this.f5072c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            this.f5071b.add(new b(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public void f() {
        if (this.f5073d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (this.f5071b.isEmpty() && !(this.f5071b instanceof ArrayList)) {
            this.f5071b = new ArrayList(this.f5070a);
        }
    }

    private SortedMap<K, V> h() {
        f();
        if (this.f5072c.isEmpty() && !(this.f5072c instanceof TreeMap)) {
            this.f5072c = new TreeMap();
        }
        return (SortedMap) this.f5072c;
    }

    public int a() {
        return this.f5071b.size();
    }

    /* renamed from: a */
    public V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.f5071b.get(a2).setValue(v);
        }
        g();
        int i = -(a2 + 1);
        if (i >= this.f5070a) {
            return h().put(k, v);
        }
        int size = this.f5071b.size();
        int i2 = this.f5070a;
        if (size == i2) {
            b remove = this.f5071b.remove(i2 - 1);
            h().put(remove.getKey(), remove.getValue());
        }
        this.f5071b.add(i, new b(k, v));
        return null;
    }

    public Map.Entry<K, V> a(int i) {
        return this.f5071b.get(i);
    }

    public int b() {
        return this.f5072c.size();
    }

    public Iterable<Map.Entry<K, V>> c() {
        return this.f5072c.isEmpty() ? a.b() : this.f5072c.entrySet();
    }

    public void clear() {
        f();
        if (!this.f5071b.isEmpty()) {
            this.f5071b.clear();
        }
        if (!this.f5072c.isEmpty()) {
            this.f5072c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f5072c.containsKey(comparable);
    }

    public boolean d() {
        return this.f5073d;
    }

    public void e() {
        if (!this.f5073d) {
            this.f5072c = this.f5072c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5072c);
            this.f5073d = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f5074e == null) {
            this.f5074e = new d(this, (w) null);
        }
        return this.f5074e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        int size = size();
        if (size != zVar.size()) {
            return false;
        }
        int a2 = a();
        if (a2 != zVar.a()) {
            return entrySet().equals(zVar.entrySet());
        }
        for (int i = 0; i < a2; i++) {
            if (!a(i).equals(zVar.a(i))) {
                return false;
            }
        }
        if (a2 != size) {
            return this.f5072c.equals(zVar.f5072c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.f5071b.get(a2).getValue() : this.f5072c.get(comparable);
    }

    public int hashCode() {
        int a2 = a();
        int i = 0;
        for (int i2 = 0; i2 < a2; i2++) {
            i += this.f5071b.get(i2).hashCode();
        }
        return b() > 0 ? i + this.f5072c.hashCode() : i;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.f5072c.isEmpty()) {
            return null;
        }
        return this.f5072c.remove(comparable);
    }

    public int size() {
        return this.f5071b.size() + this.f5072c.size();
    }
}
