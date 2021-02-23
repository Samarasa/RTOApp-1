package c.a.a.h;

import c.a.a.c.h;
import c.a.a.i.i;
import java.security.MessageDigest;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3624a;

    public c(Object obj) {
        i.a(obj);
        this.f3624a = obj;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f3624a.toString().getBytes(h.f3494a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f3624a.equals(((c) obj).f3624a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3624a.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f3624a + '}';
    }
}
