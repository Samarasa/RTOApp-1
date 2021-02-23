package c.a.a.c.b;

import android.util.Log;
import b.h.i.d;
import c.a.a.c.d.f.e;
import c.a.a.c.l;
import c.a.a.i.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f3186a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends l<DataType, ResourceType>> f3187b;

    /* renamed from: c  reason: collision with root package name */
    private final e<ResourceType, Transcode> f3188c;

    /* renamed from: d  reason: collision with root package name */
    private final d<List<Throwable>> f3189d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3190e;

    interface a<ResourceType> {
        F<ResourceType> a(F<ResourceType> f2);
    }

    public k(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends l<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, d<List<Throwable>> dVar) {
        this.f3186a = cls;
        this.f3187b = list;
        this.f3188c = eVar;
        this.f3189d = dVar;
        this.f3190e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private F<ResourceType> a(c.a.a.c.a.e<DataType> eVar, int i, int i2, c.a.a.c.k kVar) {
        List<Throwable> a2 = this.f3189d.a();
        i.a(a2);
        List list = a2;
        try {
            return a(eVar, i, i2, kVar, (List<Throwable>) list);
        } finally {
            this.f3189d.a(list);
        }
    }

    private F<ResourceType> a(c.a.a.c.a.e<DataType> eVar, int i, int i2, c.a.a.c.k kVar, List<Throwable> list) {
        int size = this.f3187b.size();
        F<ResourceType> f2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            l lVar = (l) this.f3187b.get(i3);
            try {
                if (lVar.a(eVar.a(), kVar)) {
                    f2 = lVar.a(eVar.a(), i, i2, kVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + lVar, e2);
                }
                list.add(e2);
            }
            if (f2 != null) {
                break;
            }
        }
        if (f2 != null) {
            return f2;
        }
        throw new z(this.f3190e, (List<Throwable>) new ArrayList(list));
    }

    public F<Transcode> a(c.a.a.c.a.e<DataType> eVar, int i, int i2, c.a.a.c.k kVar, a<ResourceType> aVar) {
        return this.f3188c.a(aVar.a(a(eVar, i, i2, kVar)), kVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3186a + ", decoders=" + this.f3187b + ", transcoder=" + this.f3188c + '}';
    }
}
