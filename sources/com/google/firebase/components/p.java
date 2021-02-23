package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class p {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final e<?> f14464a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<a> f14465b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<a> f14466c = new HashSet();

        a(e<?> eVar) {
            this.f14464a = eVar;
        }

        /* access modifiers changed from: package-private */
        public e<?> a() {
            return this.f14464a;
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar) {
            this.f14465b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public Set<a> b() {
            return this.f14465b;
        }

        /* access modifiers changed from: package-private */
        public void b(a aVar) {
            this.f14466c.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void c(a aVar) {
            this.f14466c.remove(aVar);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f14465b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.f14466c.isEmpty();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f14467a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14468b;

        private b(Class<?> cls, boolean z) {
            this.f14467a = cls;
            this.f14468b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f14467a.equals(this.f14467a) && bVar.f14468b == this.f14468b;
        }

        public int hashCode() {
            return ((this.f14467a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f14468b).hashCode();
        }
    }

    private static Set<a> a(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a next : set) {
            if (next.d()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    static void a(List<e<?>> list) {
        Set<a> b2 = b(list);
        Set<a> a2 = a(b2);
        int i = 0;
        while (!a2.isEmpty()) {
            a next = a2.iterator().next();
            a2.remove(next);
            i++;
            for (a next2 : next.b()) {
                next2.c(next);
                if (next2.d()) {
                    a2.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (a next3 : b2) {
                if (!next3.d() && !next3.c()) {
                    arrayList.add(next3.a());
                }
            }
            throw new r(arrayList);
        }
    }

    private static Set<a> b(List<e<?>> list) {
        Set<a> set;
        HashMap hashMap = new HashMap(list.size());
        for (e next : list) {
            a aVar = new a(next);
            Iterator it = next.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    b bVar = new b(cls, !next.g());
                    if (!hashMap.containsKey(bVar)) {
                        hashMap.put(bVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(bVar);
                    if (set2.isEmpty() || bVar.f14468b) {
                        set2.add(aVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<a> it2 : hashMap.values()) {
            for (a aVar2 : it2) {
                for (q next2 : aVar2.a().a()) {
                    if (next2.b() && (set = (Set) hashMap.get(new b(next2.a(), next2.d()))) != null) {
                        for (a aVar3 : set) {
                            aVar2.a(aVar3);
                            aVar3.b(aVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
