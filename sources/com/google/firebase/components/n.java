package com.google.firebase.components;

import c.b.d.c.c;
import c.b.d.c.d;
import c.b.d.e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class n extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final a<Set<Object>> f14459a = m.a();

    /* renamed from: b  reason: collision with root package name */
    private final Map<e<?>, v<?>> f14460b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, v<?>> f14461c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, v<Set<?>>> f14462d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final u f14463e;

    public n(Executor executor, Iterable<j> iterable, e<?>... eVarArr) {
        this.f14463e = new u(executor);
        ArrayList<e> arrayList = new ArrayList<>();
        arrayList.add(e.a(this.f14463e, u.class, d.class, c.class));
        for (j components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (e<?> eVar : eVarArr) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        p.a((List<e<?>>) arrayList);
        for (e eVar2 : arrayList) {
            this.f14460b.put(eVar2, new v(k.a(this, eVar2)));
        }
        a();
        b();
    }

    static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((v) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void a() {
        for (Map.Entry next : this.f14460b.entrySet()) {
            e eVar = (e) next.getKey();
            if (eVar.g()) {
                v vVar = (v) next.getValue();
                for (Class put : eVar.c()) {
                    this.f14461c.put(put, vVar);
                }
            }
        }
        c();
    }

    private void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f14460b.entrySet()) {
            e eVar = (e) next.getKey();
            if (!eVar.g()) {
                v vVar = (v) next.getValue();
                for (Class cls : eVar.c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(vVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f14462d.put((Class) entry.getKey(), new v(l.a((Set) entry.getValue())));
        }
    }

    private void c() {
        for (e next : this.f14460b.keySet()) {
            Iterator<q> it = next.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    q next2 = it.next();
                    if (next2.c() && !this.f14461c.containsKey(next2.a())) {
                        throw new w(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a()}));
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    public void a(boolean z) {
        for (Map.Entry next : this.f14460b.entrySet()) {
            e eVar = (e) next.getKey();
            v vVar = (v) next.getValue();
            if (eVar.e() || (eVar.f() && z)) {
                vVar.get();
            }
        }
        this.f14463e.a();
    }

    public <T> a<T> b(Class<T> cls) {
        x.a(cls, "Null interface requested.");
        return this.f14461c.get(cls);
    }

    public <T> a<Set<T>> c(Class<T> cls) {
        v vVar = this.f14462d.get(cls);
        return vVar != null ? vVar : f14459a;
    }

    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }
}
