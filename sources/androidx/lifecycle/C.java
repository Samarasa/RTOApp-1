package androidx.lifecycle;

public class C {

    /* renamed from: a  reason: collision with root package name */
    private final a f1190a;

    /* renamed from: b  reason: collision with root package name */
    private final D f1191b;

    public interface a {
        <T extends B> T a(Class<T> cls);
    }

    static abstract class b implements a {
        b() {
        }

        public <T extends B> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends B> T a(String str, Class<T> cls);
    }

    public C(D d2, a aVar) {
        this.f1190a = aVar;
        this.f1191b = d2;
    }

    public <T extends B> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends B> T a(String str, Class<T> cls) {
        T a2 = this.f1191b.a(str);
        if (cls.isInstance(a2)) {
            return a2;
        }
        a aVar = this.f1190a;
        T a3 = aVar instanceof b ? ((b) aVar).a(str, cls) : aVar.a(cls);
        this.f1191b.a(str, a3);
        return a3;
    }
}
