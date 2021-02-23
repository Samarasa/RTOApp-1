package c.a.a.c.c;

import b.h.i.d;
import c.a.a.c.a.d;
import c.a.a.c.b.z;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import c.a.a.i.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class x<Model, Data> implements u<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<u<Model, Data>> f3333a;

    /* renamed from: b  reason: collision with root package name */
    private final d<List<Throwable>> f3334b;

    static class a<Data> implements c.a.a.c.a.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final List<c.a.a.c.a.d<Data>> f3335a;

        /* renamed from: b  reason: collision with root package name */
        private final b.h.i.d<List<Throwable>> f3336b;

        /* renamed from: c  reason: collision with root package name */
        private int f3337c = 0;

        /* renamed from: d  reason: collision with root package name */
        private h f3338d;

        /* renamed from: e  reason: collision with root package name */
        private d.a<? super Data> f3339e;

        /* renamed from: f  reason: collision with root package name */
        private List<Throwable> f3340f;

        a(List<c.a.a.c.a.d<Data>> list, b.h.i.d<List<Throwable>> dVar) {
            this.f3336b = dVar;
            i.a(list);
            this.f3335a = list;
        }

        private void d() {
            if (this.f3337c < this.f3335a.size() - 1) {
                this.f3337c++;
                a(this.f3338d, this.f3339e);
                return;
            }
            i.a(this.f3340f);
            this.f3339e.a((Exception) new z("Fetch failed", (List<Throwable>) new ArrayList(this.f3340f)));
        }

        public Class<Data> a() {
            return this.f3335a.get(0).a();
        }

        public void a(h hVar, d.a<? super Data> aVar) {
            this.f3338d = hVar;
            this.f3339e = aVar;
            this.f3340f = this.f3336b.a();
            this.f3335a.get(this.f3337c).a(hVar, this);
        }

        public void a(Exception exc) {
            List<Throwable> list = this.f3340f;
            i.a(list);
            list.add(exc);
            d();
        }

        public void a(Data data) {
            if (data != null) {
                this.f3339e.a(data);
            } else {
                d();
            }
        }

        public void b() {
            List<Throwable> list = this.f3340f;
            if (list != null) {
                this.f3336b.a(list);
            }
            this.f3340f = null;
            for (c.a.a.c.a.d<Data> b2 : this.f3335a) {
                b2.b();
            }
        }

        public c.a.a.c.a c() {
            return this.f3335a.get(0).c();
        }

        public void cancel() {
            for (c.a.a.c.a.d<Data> cancel : this.f3335a) {
                cancel.cancel();
            }
        }
    }

    x(List<u<Model, Data>> list, b.h.i.d<List<Throwable>> dVar) {
        this.f3333a = list;
        this.f3334b = dVar;
    }

    public u.a<Data> a(Model model, int i, int i2, k kVar) {
        u.a a2;
        int size = this.f3333a.size();
        ArrayList arrayList = new ArrayList(size);
        c.a.a.c.h hVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            u uVar = this.f3333a.get(i3);
            if (uVar.a(model) && (a2 = uVar.a(model, i, i2, kVar)) != null) {
                hVar = a2.f3326a;
                arrayList.add(a2.f3328c);
            }
        }
        if (arrayList.isEmpty() || hVar == null) {
            return null;
        }
        return new u.a<>(hVar, new a(arrayList, this.f3334b));
    }

    public boolean a(Model model) {
        for (u<Model, Data> a2 : this.f3333a) {
            if (a2.a(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f3333a.toArray()) + '}';
    }
}
