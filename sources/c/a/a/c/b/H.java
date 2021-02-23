package c.a.a.c.b;

import c.a.a.c.b.a.b;
import c.a.a.c.h;
import c.a.a.c.k;
import c.a.a.c.n;
import c.a.a.i.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class H implements h {

    /* renamed from: a  reason: collision with root package name */
    private static final f<Class<?>, byte[]> f3013a = new f<>(50);

    /* renamed from: b  reason: collision with root package name */
    private final b f3014b;

    /* renamed from: c  reason: collision with root package name */
    private final h f3015c;

    /* renamed from: d  reason: collision with root package name */
    private final h f3016d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3017e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3018f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f3019g;

    /* renamed from: h  reason: collision with root package name */
    private final k f3020h;
    private final n<?> i;

    H(b bVar, h hVar, h hVar2, int i2, int i3, n<?> nVar, Class<?> cls, k kVar) {
        this.f3014b = bVar;
        this.f3015c = hVar;
        this.f3016d = hVar2;
        this.f3017e = i2;
        this.f3018f = i3;
        this.i = nVar;
        this.f3019g = cls;
        this.f3020h = kVar;
    }

    private byte[] a() {
        byte[] a2 = f3013a.a(this.f3019g);
        if (a2 != null) {
            return a2;
        }
        byte[] bytes = this.f3019g.getName().getBytes(h.f3494a);
        f3013a.b(this.f3019g, bytes);
        return bytes;
    }

    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3014b.a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3017e).putInt(this.f3018f).array();
        this.f3016d.a(messageDigest);
        this.f3015c.a(messageDigest);
        messageDigest.update(bArr);
        n<?> nVar = this.i;
        if (nVar != null) {
            nVar.a(messageDigest);
        }
        this.f3020h.a(messageDigest);
        messageDigest.update(a());
        this.f3014b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return this.f3018f == h2.f3018f && this.f3017e == h2.f3017e && c.a.a.i.k.b((Object) this.i, (Object) h2.i) && this.f3019g.equals(h2.f3019g) && this.f3015c.equals(h2.f3015c) && this.f3016d.equals(h2.f3016d) && this.f3020h.equals(h2.f3020h);
    }

    public int hashCode() {
        int hashCode = (((((this.f3015c.hashCode() * 31) + this.f3016d.hashCode()) * 31) + this.f3017e) * 31) + this.f3018f;
        n<?> nVar = this.i;
        if (nVar != null) {
            hashCode = (hashCode * 31) + nVar.hashCode();
        }
        return (((hashCode * 31) + this.f3019g.hashCode()) * 31) + this.f3020h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3015c + ", signature=" + this.f3016d + ", width=" + this.f3017e + ", height=" + this.f3018f + ", decodedResourceClass=" + this.f3019g + ", transformation='" + this.i + '\'' + ", options=" + this.f3020h + '}';
    }
}
