package c.b.b.a.a.c.a;

import c.b.b.a.a.l;
import c.b.b.a.a.p;

/* renamed from: c.b.b.a.a.c.a.c  reason: case insensitive filesystem */
final class C0247c extends i {

    /* renamed from: a  reason: collision with root package name */
    private final long f3751a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3752b;

    /* renamed from: c  reason: collision with root package name */
    private final l f3753c;

    C0247c(long j, p pVar, l lVar) {
        this.f3751a = j;
        if (pVar != null) {
            this.f3752b = pVar;
            if (lVar != null) {
                this.f3753c = lVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public l a() {
        return this.f3753c;
    }

    public long b() {
        return this.f3751a;
    }

    public p c() {
        return this.f3752b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3751a == iVar.b() && this.f3752b.equals(iVar.c()) && this.f3753c.equals(iVar.a());
    }

    public int hashCode() {
        long j = this.f3751a;
        return this.f3753c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3752b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f3751a + ", transportContext=" + this.f3752b + ", event=" + this.f3753c + "}";
    }
}
