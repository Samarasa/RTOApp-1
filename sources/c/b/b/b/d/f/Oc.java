package c.b.b.b.d.f;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class Oc<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4251a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<Tc> f4252b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f4253c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4254d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Vc f4255e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f4256f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Pc f4257g;

    private Oc(int i) {
        this.f4251a = i;
        this.f4252b = Collections.emptyList();
        this.f4253c = Collections.emptyMap();
        this.f4256f = Collections.emptyMap();
    }

    /* synthetic */ Oc(int i, Nc nc) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f4252b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f4252b.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f4252b.get(i2).getKey());
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

    static <FieldDescriptorType extends Fb<FieldDescriptorType>> Oc<FieldDescriptorType, Object> a(int i) {
        return new Nc(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V value = this.f4252b.remove(i).getValue();
        if (!this.f4253c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.f4252b.add(new Tc(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.f4254d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.f4253c.isEmpty() && !(this.f4253c instanceof TreeMap)) {
            this.f4253c = new TreeMap();
            this.f4256f = ((TreeMap) this.f4253c).descendingMap();
        }
        return (SortedMap) this.f4253c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.f4252b.get(a2).setValue(v);
        }
        f();
        if (this.f4252b.isEmpty() && !(this.f4252b instanceof ArrayList)) {
            this.f4252b = new ArrayList(this.f4251a);
        }
        int i = -(a2 + 1);
        if (i >= this.f4251a) {
            return g().put(k, v);
        }
        int size = this.f4252b.size();
        int i2 = this.f4251a;
        if (size == i2) {
            Tc remove = this.f4252b.remove(i2 - 1);
            g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f4252b.add(i, new Tc(this, k, v));
        return null;
    }

    public void a() {
        if (!this.f4254d) {
            this.f4253c = this.f4253c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4253c);
            this.f4256f = this.f4256f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4256f);
            this.f4254d = true;
        }
    }

    public final Map.Entry<K, V> b(int i) {
        return this.f4252b.get(i);
    }

    public final boolean b() {
        return this.f4254d;
    }

    public final int c() {
        return this.f4252b.size();
    }

    public void clear() {
        f();
        if (!this.f4252b.isEmpty()) {
            this.f4252b.clear();
        }
        if (!this.f4253c.isEmpty()) {
            this.f4253c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4253c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f4253c.isEmpty() ? Sc.a() : this.f4253c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.f4257g == null) {
            this.f4257g = new Pc(this, (Nc) null);
        }
        return this.f4257g;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4255e == null) {
            this.f4255e = new Vc(this, (Nc) null);
        }
        return this.f4255e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oc)) {
            return super.equals(obj);
        }
        Oc oc = (Oc) obj;
        int size = size();
        if (size != oc.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != oc.c()) {
            return entrySet().equals(oc.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(oc.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.f4253c.equals(oc.f4253c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.f4252b.get(a2).getValue() : this.f4253c.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f4252b.get(i2).hashCode();
        }
        return this.f4253c.size() > 0 ? i + this.f4253c.hashCode() : i;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.f4253c.isEmpty()) {
            return null;
        }
        return this.f4253c.remove(comparable);
    }

    public int size() {
        return this.f4252b.size() + this.f4253c.size();
    }
}
