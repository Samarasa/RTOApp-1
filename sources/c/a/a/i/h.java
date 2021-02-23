package c.a.a.i;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f3655a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f3656b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f3657c;

    public h() {
    }

    public h(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public h(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2) {
        a(cls, cls2, (Class<?>) null);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3655a = cls;
        this.f3656b = cls2;
        this.f3657c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3655a.equals(hVar.f3655a) && this.f3656b.equals(hVar.f3656b) && k.b((Object) this.f3657c, (Object) hVar.f3657c);
    }

    public int hashCode() {
        int hashCode = ((this.f3655a.hashCode() * 31) + this.f3656b.hashCode()) * 31;
        Class<?> cls = this.f3657c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f3655a + ", second=" + this.f3656b + '}';
    }
}
