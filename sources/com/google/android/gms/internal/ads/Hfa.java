package com.google.android.gms.internal.ads;

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

class Hfa<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f7168a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<Mfa> f7169b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f7170c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7171d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Ofa f7172e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f7173f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Ifa f7174g;

    private Hfa(int i) {
        this.f7168a = i;
        this.f7169b = Collections.emptyList();
        this.f7170c = Collections.emptyMap();
        this.f7173f = Collections.emptyMap();
    }

    /* synthetic */ Hfa(int i, Gfa gfa) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f7169b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f7169b.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f7169b.get(i2).getKey());
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

    static <FieldDescriptorType extends C2367pea<FieldDescriptorType>> Hfa<FieldDescriptorType, Object> a(int i) {
        return new Gfa(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V value = this.f7169b.remove(i).getValue();
        if (!this.f7170c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.f7169b.add(new Mfa(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.f7171d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.f7170c.isEmpty() && !(this.f7170c instanceof TreeMap)) {
            this.f7170c = new TreeMap();
            this.f7173f = ((TreeMap) this.f7170c).descendingMap();
        }
        return (SortedMap) this.f7170c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.f7169b.get(a2).setValue(v);
        }
        f();
        if (this.f7169b.isEmpty() && !(this.f7169b instanceof ArrayList)) {
            this.f7169b = new ArrayList(this.f7168a);
        }
        int i = -(a2 + 1);
        if (i >= this.f7168a) {
            return g().put(k, v);
        }
        int size = this.f7169b.size();
        int i2 = this.f7168a;
        if (size == i2) {
            Mfa remove = this.f7169b.remove(i2 - 1);
            g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f7169b.add(i, new Mfa(this, k, v));
        return null;
    }

    public final boolean a() {
        return this.f7171d;
    }

    public final Map.Entry<K, V> b(int i) {
        return this.f7169b.get(i);
    }

    public void b() {
        if (!this.f7171d) {
            this.f7170c = this.f7170c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7170c);
            this.f7173f = this.f7173f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7173f);
            this.f7171d = true;
        }
    }

    public final int c() {
        return this.f7169b.size();
    }

    public void clear() {
        f();
        if (!this.f7169b.isEmpty()) {
            this.f7169b.clear();
        }
        if (!this.f7170c.isEmpty()) {
            this.f7170c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f7170c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f7170c.isEmpty() ? Lfa.a() : this.f7170c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.f7174g == null) {
            this.f7174g = new Ifa(this, (Gfa) null);
        }
        return this.f7174g;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f7172e == null) {
            this.f7172e = new Ofa(this, (Gfa) null);
        }
        return this.f7172e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hfa)) {
            return super.equals(obj);
        }
        Hfa hfa = (Hfa) obj;
        int size = size();
        if (size != hfa.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != hfa.c()) {
            return entrySet().equals(hfa.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(hfa.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.f7170c.equals(hfa.f7170c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.f7169b.get(a2).getValue() : this.f7170c.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f7169b.get(i2).hashCode();
        }
        return this.f7170c.size() > 0 ? i + this.f7170c.hashCode() : i;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.f7170c.isEmpty()) {
            return null;
        }
        return this.f7170c.remove(comparable);
    }

    public int size() {
        return this.f7169b.size() + this.f7170c.size();
    }
}
