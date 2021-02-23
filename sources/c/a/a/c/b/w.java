package c.a.a.c.b;

import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.c.n;
import c.a.a.i.i;
import java.security.MessageDigest;
import java.util.Map;

class w implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3227a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3228b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3229c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f3230d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f3231e;

    /* renamed from: f  reason: collision with root package name */
    private final h f3232f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, n<?>> f3233g;

    /* renamed from: h  reason: collision with root package name */
    private final k f3234h;
    private int i;

    w(Object obj, h hVar, int i2, int i3, Map<Class<?>, n<?>> map, Class<?> cls, Class<?> cls2, k kVar) {
        i.a(obj);
        this.f3227a = obj;
        i.a(hVar, "Signature must not be null");
        this.f3232f = hVar;
        this.f3228b = i2;
        this.f3229c = i3;
        i.a(map);
        this.f3233g = map;
        i.a(cls, "Resource class must not be null");
        this.f3230d = cls;
        i.a(cls2, "Transcode class must not be null");
        this.f3231e = cls2;
        i.a(kVar);
        this.f3234h = kVar;
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3227a.equals(wVar.f3227a) && this.f3232f.equals(wVar.f3232f) && this.f3229c == wVar.f3229c && this.f3228b == wVar.f3228b && this.f3233g.equals(wVar.f3233g) && this.f3230d.equals(wVar.f3230d) && this.f3231e.equals(wVar.f3231e) && this.f3234h.equals(wVar.f3234h);
    }

    public int hashCode() {
        if (this.i == 0) {
            this.i = this.f3227a.hashCode();
            this.i = (this.i * 31) + this.f3232f.hashCode();
            this.i = (this.i * 31) + this.f3228b;
            this.i = (this.i * 31) + this.f3229c;
            this.i = (this.i * 31) + this.f3233g.hashCode();
            this.i = (this.i * 31) + this.f3230d.hashCode();
            this.i = (this.i * 31) + this.f3231e.hashCode();
            this.i = (this.i * 31) + this.f3234h.hashCode();
        }
        return this.i;
    }

    public String toString() {
        return "EngineKey{model=" + this.f3227a + ", width=" + this.f3228b + ", height=" + this.f3229c + ", resourceClass=" + this.f3230d + ", transcodeClass=" + this.f3231e + ", signature=" + this.f3232f + ", hashCode=" + this.i + ", transformations=" + this.f3233g + ", options=" + this.f3234h + '}';
    }
}
