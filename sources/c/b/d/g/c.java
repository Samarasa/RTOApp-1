package c.b.d.g;

import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.components.q;
import java.util.Iterator;
import java.util.Set;

public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f4955a;

    /* renamed from: b  reason: collision with root package name */
    private final d f4956b;

    c(Set<f> set, d dVar) {
        this.f4955a = a(set);
        this.f4956b = dVar;
    }

    static /* synthetic */ h a(f fVar) {
        return new c(fVar.d(f.class), d.a());
    }

    private static String a(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static e<h> b() {
        e.a<h> a2 = e.a(h.class);
        a2.a(q.c(f.class));
        a2.a((i<h>) b.a());
        return a2.b();
    }

    public String a() {
        if (this.f4956b.b().isEmpty()) {
            return this.f4955a;
        }
        return this.f4955a + ' ' + a(this.f4956b.b());
    }
}
