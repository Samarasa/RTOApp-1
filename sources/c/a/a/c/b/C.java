package c.a.a.c.b;

import b.h.i.d;
import c.a.a.c.a.e;
import c.a.a.c.b.k;
import c.a.a.c.k;
import c.a.a.i.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<Data> f2996a;

    /* renamed from: b  reason: collision with root package name */
    private final d<List<Throwable>> f2997b;

    /* renamed from: c  reason: collision with root package name */
    private final List<? extends k<Data, ResourceType, Transcode>> f2998c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2999d;

    public C(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<k<Data, ResourceType, Transcode>> list, d<List<Throwable>> dVar) {
        this.f2996a = cls;
        this.f2997b = dVar;
        i.a(list);
        this.f2998c = list;
        this.f2999d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private F<Transcode> a(e<Data> eVar, k kVar, int i, int i2, k.a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f2998c.size();
        F<Transcode> f2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                f2 = ((k) this.f2998c.get(i3)).a(eVar, i, i2, kVar, aVar);
            } catch (z e2) {
                list2.add(e2);
            }
            if (f2 != null) {
                break;
            }
        }
        if (f2 != null) {
            return f2;
        }
        throw new z(this.f2999d, (List<Throwable>) new ArrayList(list2));
    }

    public F<Transcode> a(e<Data> eVar, c.a.a.c.k kVar, int i, int i2, k.a<ResourceType> aVar) {
        List<Throwable> a2 = this.f2997b.a();
        i.a(a2);
        List list = a2;
        try {
            return a(eVar, kVar, i, i2, aVar, list);
        } finally {
            this.f2997b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2998c.toArray()) + '}';
    }
}
