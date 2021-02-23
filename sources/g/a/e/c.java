package g.a.e;

import g.a.e;
import h.h;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f15050a = h.b(":");

    /* renamed from: b  reason: collision with root package name */
    public static final h f15051b = h.b(":status");

    /* renamed from: c  reason: collision with root package name */
    public static final h f15052c = h.b(":method");

    /* renamed from: d  reason: collision with root package name */
    public static final h f15053d = h.b(":path");

    /* renamed from: e  reason: collision with root package name */
    public static final h f15054e = h.b(":scheme");

    /* renamed from: f  reason: collision with root package name */
    public static final h f15055f = h.b(":authority");

    /* renamed from: g  reason: collision with root package name */
    public final h f15056g;

    /* renamed from: h  reason: collision with root package name */
    public final h f15057h;
    final int i;

    public c(h hVar, h hVar2) {
        this.f15056g = hVar;
        this.f15057h = hVar2;
        this.i = hVar.n() + 32 + hVar2.n();
    }

    public c(h hVar, String str) {
        this(hVar, h.b(str));
    }

    public c(String str, String str2) {
        this(h.b(str), h.b(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15056g.equals(cVar.f15056g) && this.f15057h.equals(cVar.f15057h);
    }

    public int hashCode() {
        return ((527 + this.f15056g.hashCode()) * 31) + this.f15057h.hashCode();
    }

    public String toString() {
        return e.a("%s: %s", this.f15056g.q(), this.f15057h.q());
    }
}
