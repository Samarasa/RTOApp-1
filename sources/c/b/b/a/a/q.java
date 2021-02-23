package c.b.b.a.a;

import c.b.b.a.b;
import c.b.b.a.e;
import c.b.b.a.f;
import c.b.b.a.g;
import java.util.Set;

final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f3831a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3832b;

    /* renamed from: c  reason: collision with root package name */
    private final t f3833c;

    q(Set<b> set, p pVar, t tVar) {
        this.f3831a = set;
        this.f3832b = pVar;
        this.f3833c = tVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f3831a.contains(bVar)) {
            return new s(this.f3832b, str, bVar, eVar, this.f3833c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f3831a}));
    }
}
