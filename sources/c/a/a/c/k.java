package c.a.a.c;

import b.e.b;
import java.security.MessageDigest;

public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private final b<j<?>, Object> f3500a = new c.a.a.i.b();

    private static <T> void a(j<T> jVar, Object obj, MessageDigest messageDigest) {
        jVar.a(obj, messageDigest);
    }

    public <T> k a(j<T> jVar, T t) {
        this.f3500a.put(jVar, t);
        return this;
    }

    public <T> T a(j<T> jVar) {
        return this.f3500a.containsKey(jVar) ? this.f3500a.get(jVar) : jVar.a();
    }

    public void a(k kVar) {
        this.f3500a.a(kVar.f3500a);
    }

    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f3500a.size(); i++) {
            a(this.f3500a.b(i), this.f3500a.d(i), messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f3500a.equals(((k) obj).f3500a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3500a.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3500a + '}';
    }
}
