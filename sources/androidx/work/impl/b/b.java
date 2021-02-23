package androidx.work.impl.b;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1759a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1760b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1761c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1762d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1759a = z;
        this.f1760b = z2;
        this.f1761c = z3;
        this.f1762d = z4;
    }

    public boolean a() {
        return this.f1759a;
    }

    public boolean b() {
        return this.f1761c;
    }

    public boolean c() {
        return this.f1762d;
    }

    public boolean d() {
        return this.f1760b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1759a == bVar.f1759a && this.f1760b == bVar.f1760b && this.f1761c == bVar.f1761c && this.f1762d == bVar.f1762d;
    }

    public int hashCode() {
        int i = this.f1759a ? 1 : 0;
        if (this.f1760b) {
            i += 16;
        }
        if (this.f1761c) {
            i += 256;
        }
        return this.f1762d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f1759a), Boolean.valueOf(this.f1760b), Boolean.valueOf(this.f1761c), Boolean.valueOf(this.f1762d)});
    }
}
