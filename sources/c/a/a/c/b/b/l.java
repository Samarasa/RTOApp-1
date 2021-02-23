package c.a.a.c.b.b;

import b.h.i.d;
import c.a.a.c.h;
import c.a.a.i.a.d;
import c.a.a.i.a.g;
import c.a.a.i.f;
import c.a.a.i.i;
import c.a.a.i.k;
import java.security.MessageDigest;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final f<h, String> f3103a = new f<>(1000);

    /* renamed from: b  reason: collision with root package name */
    private final d<a> f3104b = c.a.a.i.a.d.b(10, new k(this));

    private static final class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f3105a;

        /* renamed from: b  reason: collision with root package name */
        private final g f3106b = g.a();

        a(MessageDigest messageDigest) {
            this.f3105a = messageDigest;
        }

        public g d() {
            return this.f3106b;
        }
    }

    private String b(h hVar) {
        a a2 = this.f3104b.a();
        i.a(a2);
        a aVar = a2;
        try {
            hVar.a(aVar.f3105a);
            return k.a(aVar.f3105a.digest());
        } finally {
            this.f3104b.a(aVar);
        }
    }

    public String a(h hVar) {
        String a2;
        synchronized (this.f3103a) {
            a2 = this.f3103a.a(hVar);
        }
        if (a2 == null) {
            a2 = b(hVar);
        }
        synchronized (this.f3103a) {
            this.f3103a.b(hVar, a2);
        }
        return a2;
    }
}
