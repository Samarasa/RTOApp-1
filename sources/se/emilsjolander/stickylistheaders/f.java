package se.emilsjolander.stickylistheaders;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

class f<TKey, TItemValue> {

    /* renamed from: a  reason: collision with root package name */
    private a<TKey, TItemValue> f15597a;

    /* renamed from: b  reason: collision with root package name */
    LinkedHashMap<Object, List<TItemValue>> f15598b;

    /* renamed from: c  reason: collision with root package name */
    LinkedHashMap<Object, TKey> f15599c;

    interface a<TKey, TItemValue> {
        Object a(TKey tkey);

        Object b(TItemValue titemvalue);
    }

    f() {
        this(new e());
    }

    f(a<TKey, TItemValue> aVar) {
        this.f15598b = new LinkedHashMap<>();
        this.f15599c = new LinkedHashMap<>();
        this.f15597a = aVar;
    }

    public List<TItemValue> a(TKey tkey) {
        LinkedHashMap<Object, List<TItemValue>> linkedHashMap = this.f15598b;
        this.f15597a.a(tkey);
        return linkedHashMap.get(tkey);
    }

    public void a(TKey tkey, TItemValue titemvalue) {
        this.f15597a.a(tkey);
        if (this.f15598b.get(tkey) == null) {
            this.f15598b.put(tkey, new ArrayList());
        }
        Object b2 = b(titemvalue);
        if (b2 != null) {
            LinkedHashMap<Object, List<TItemValue>> linkedHashMap = this.f15598b;
            this.f15597a.a(b2);
            linkedHashMap.get(b2).remove(titemvalue);
        }
        LinkedHashMap<Object, TKey> linkedHashMap2 = this.f15599c;
        this.f15597a.b(titemvalue);
        linkedHashMap2.put(titemvalue, tkey);
        LinkedHashMap<Object, List<TItemValue>> linkedHashMap3 = this.f15598b;
        this.f15597a.a(tkey);
        if (!a(linkedHashMap3.get(tkey), titemvalue)) {
            LinkedHashMap<Object, List<TItemValue>> linkedHashMap4 = this.f15598b;
            this.f15597a.a(tkey);
            linkedHashMap4.get(tkey).add(titemvalue);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(List<TItemValue> list, TItemValue titemvalue) {
        for (TItemValue next : list) {
            this.f15597a.b(next);
            this.f15597a.b(titemvalue);
            if (next.equals(titemvalue)) {
                return true;
            }
        }
        return false;
    }

    public TKey b(TItemValue titemvalue) {
        LinkedHashMap<Object, TKey> linkedHashMap = this.f15599c;
        this.f15597a.b(titemvalue);
        return linkedHashMap.get(titemvalue);
    }
}
