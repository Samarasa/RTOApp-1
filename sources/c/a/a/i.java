package c.a.a;

import c.a.a.c.a.e;
import c.a.a.c.a.g;
import c.a.a.c.b.C;
import c.a.a.c.b.F;
import c.a.a.c.b.k;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.w;
import c.a.a.c.l;
import c.a.a.c.m;
import c.a.a.f.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final w f3625a = new w(this.j);

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.f.a f3626b = new c.a.a.f.a();

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.f.e f3627c = new c.a.a.f.e();

    /* renamed from: d  reason: collision with root package name */
    private final f f3628d = new f();

    /* renamed from: e  reason: collision with root package name */
    private final g f3629e = new g();

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.c.d.f.f f3630f = new c.a.a.c.d.f.f();

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.f.b f3631g = new c.a.a.f.b();

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.f.d f3632h = new c.a.a.f.d();
    private final c.a.a.f.c i = new c.a.a.f.c();
    private final b.h.i.d<List<Throwable>> j = c.a.a.i.a.d.a();

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        a((List<String>) Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    private <Data, TResource, Transcode> List<k<Data, TResource, Transcode>> c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f3627c.b(cls, cls2)) {
            for (Class next2 : this.f3630f.b(next, cls3)) {
                arrayList.add(new k(cls, next, next2, this.f3627c.a(cls, next), this.f3630f.a(next, next2), this.j));
            }
        }
        return arrayList;
    }

    public <Data, TResource, Transcode> C<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        if (this.i.a(a2)) {
            return null;
        }
        if (a2 == null) {
            List<k<Data, TResource, Transcode>> c2 = c(cls, cls2, cls3);
            if (c2.isEmpty()) {
                a2 = null;
            } else {
                a2 = new C<>(cls, cls2, cls3, c2, this.j);
            }
            this.i.a(cls, cls2, cls3, a2);
        }
        return a2;
    }

    public <X> m<X> a(F<X> f2) {
        m<X> a2 = this.f3628d.a(f2.c());
        if (a2 != null) {
            return a2;
        }
        throw new d(f2.c());
    }

    public i a(e.a<?> aVar) {
        this.f3629e.a(aVar);
        return this;
    }

    public i a(c.a.a.c.f fVar) {
        this.f3631g.a(fVar);
        return this;
    }

    public <Data> i a(Class<Data> cls, c.a.a.c.d<Data> dVar) {
        this.f3626b.a(cls, dVar);
        return this;
    }

    public <TResource> i a(Class<TResource> cls, m<TResource> mVar) {
        this.f3628d.a(cls, mVar);
        return this;
    }

    public <Model, Data> i a(Class<Model> cls, Class<Data> cls2, v<Model, Data> vVar) {
        this.f3625a.a(cls, cls2, vVar);
        return this;
    }

    public <TResource, Transcode> i a(Class<TResource> cls, Class<Transcode> cls2, c.a.a.c.d.f.e<TResource, Transcode> eVar) {
        this.f3630f.a(cls, cls2, eVar);
        return this;
    }

    public <Data, TResource> i a(Class<Data> cls, Class<TResource> cls2, l<Data, TResource> lVar) {
        a("legacy_append", cls, cls2, lVar);
        return this;
    }

    public <Data, TResource> i a(String str, Class<Data> cls, Class<TResource> cls2, l<Data, TResource> lVar) {
        this.f3627c.a(str, lVar, cls, cls2);
        return this;
    }

    public final i a(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3627c.a((List<String>) arrayList);
        return this;
    }

    public List<c.a.a.c.f> a() {
        List<c.a.a.c.f> a2 = this.f3631g.a();
        if (!a2.isEmpty()) {
            return a2;
        }
        throw new b();
    }

    public <Model> List<u<Model, ?>> a(Model model) {
        List<u<Model, ?>> a2 = this.f3625a.a(model);
        if (!a2.isEmpty()) {
            return a2;
        }
        throw new c(model);
    }

    public <X> c.a.a.c.a.e<X> b(X x) {
        return this.f3629e.a(x);
    }

    public <Model, TResource, Transcode> List<Class<?>> b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a2 = this.f3632h.a(cls, cls2);
        if (a2 == null) {
            a2 = new ArrayList<>();
            for (Class<?> b2 : this.f3625a.a((Class<?>) cls)) {
                for (Class next : this.f3627c.b(b2, cls2)) {
                    if (!this.f3630f.b(next, cls3).isEmpty() && !a2.contains(next)) {
                        a2.add(next);
                    }
                }
            }
            this.f3632h.a(cls, cls2, Collections.unmodifiableList(a2));
        }
        return a2;
    }

    public boolean b(F<?> f2) {
        return this.f3628d.a(f2.c()) != null;
    }

    public <X> c.a.a.c.d<X> c(X x) {
        c.a.a.c.d<X> a2 = this.f3626b.a(x.getClass());
        if (a2 != null) {
            return a2;
        }
        throw new e(x.getClass());
    }
}
