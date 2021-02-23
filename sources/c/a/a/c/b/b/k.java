package c.a.a.c.b.b;

import c.a.a.c.b.b.l;
import c.a.a.i.a.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class k implements d.a<l.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f3102a;

    k(l lVar) {
        this.f3102a = lVar;
    }

    public l.a a() {
        try {
            return new l.a(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
