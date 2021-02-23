package c.a.a.c.b;

import c.a.a.c.h;
import java.security.MessageDigest;

/* renamed from: c.a.a.c.b.e  reason: case insensitive filesystem */
final class C0233e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final h f3143a;

    /* renamed from: b  reason: collision with root package name */
    private final h f3144b;

    C0233e(h hVar, h hVar2) {
        this.f3143a = hVar;
        this.f3144b = hVar2;
    }

    public void a(MessageDigest messageDigest) {
        this.f3143a.a(messageDigest);
        this.f3144b.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0233e)) {
            return false;
        }
        C0233e eVar = (C0233e) obj;
        return this.f3143a.equals(eVar.f3143a) && this.f3144b.equals(eVar.f3144b);
    }

    public int hashCode() {
        return (this.f3143a.hashCode() * 31) + this.f3144b.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f3143a + ", signature=" + this.f3144b + '}';
    }
}
