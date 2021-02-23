package c.a.a.c.c;

import c.a.a.c.a.d;
import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.i.i;
import java.util.Collections;
import java.util.List;

public interface u<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final h f3326a;

        /* renamed from: b  reason: collision with root package name */
        public final List<h> f3327b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f3328c;

        public a(h hVar, d<Data> dVar) {
            this(hVar, Collections.emptyList(), dVar);
        }

        public a(h hVar, List<h> list, d<Data> dVar) {
            i.a(hVar);
            this.f3326a = hVar;
            i.a(list);
            this.f3327b = list;
            i.a(dVar);
            this.f3328c = dVar;
        }
    }

    a<Data> a(Model model, int i, int i2, k kVar);

    boolean a(Model model);
}
