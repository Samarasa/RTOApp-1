package androidx.coordinatorlayout.widget;

import b.e.i;
import b.h.i.d;
import b.h.i.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d<ArrayList<T>> f838a = new e(10);

    /* renamed from: b  reason: collision with root package name */
    private final i<T, ArrayList<T>> f839b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f840c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f841d = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f839b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private void a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f838a.a(arrayList);
    }

    private ArrayList<T> c() {
        ArrayList<T> a2 = this.f838a.a();
        return a2 == null ? new ArrayList<>() : a2;
    }

    public void a() {
        int size = this.f839b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d2 = this.f839b.d(i);
            if (d2 != null) {
                a(d2);
            }
        }
        this.f839b.clear();
    }

    public void a(T t) {
        if (!this.f839b.containsKey(t)) {
            this.f839b.put(t, null);
        }
    }

    public void a(T t, T t2) {
        if (!this.f839b.containsKey(t) || !this.f839b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f839b.get(t);
        if (arrayList == null) {
            arrayList = c();
            this.f839b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public ArrayList<T> b() {
        this.f840c.clear();
        this.f841d.clear();
        int size = this.f839b.size();
        for (int i = 0; i < size; i++) {
            a(this.f839b.b(i), this.f840c, this.f841d);
        }
        return this.f840c;
    }

    public boolean b(T t) {
        return this.f839b.containsKey(t);
    }

    public List c(T t) {
        return this.f839b.get(t);
    }

    public List<T> d(T t) {
        int size = this.f839b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList d2 = this.f839b.d(i);
            if (d2 != null && d2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f839b.b(i));
            }
        }
        return arrayList;
    }

    public boolean e(T t) {
        int size = this.f839b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d2 = this.f839b.d(i);
            if (d2 != null && d2.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
