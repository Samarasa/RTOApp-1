package c.a.a.f;

import c.a.a.c.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f3561a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f3562b = new HashMap();

    private static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f3563a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f3564b;

        /* renamed from: c  reason: collision with root package name */
        final l<T, R> f3565c;

        public a(Class<T> cls, Class<R> cls2, l<T, R> lVar) {
            this.f3563a = cls;
            this.f3564b = cls2;
            this.f3565c = lVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f3563a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3564b);
        }
    }

    private synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f3561a.contains(str)) {
            this.f3561a.add(str);
        }
        list = this.f3562b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f3562b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> List<l<T, R>> a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f3561a) {
            List<a> list = this.f3562b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f3565c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, l<T, R> lVar, Class<T> cls, Class<R> cls2) {
        a(str).add(new a(cls, cls2, lVar));
    }

    public synchronized void a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f3561a);
        this.f3561a.clear();
        this.f3561a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f3561a.add(str);
            }
        }
    }

    public synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f3561a) {
            List<a> list = this.f3562b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f3564b)) {
                        arrayList.add(aVar.f3564b);
                    }
                }
            }
        }
        return arrayList;
    }
}
