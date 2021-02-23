package androidx.work.impl.c;

/* renamed from: androidx.work.impl.c.e  reason: case insensitive filesystem */
public class C0193e {

    /* renamed from: a  reason: collision with root package name */
    public final String f1876a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1877b;

    public C0193e(String str, int i) {
        this.f1876a = str;
        this.f1877b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0193e.class != obj.getClass()) {
            return false;
        }
        C0193e eVar = (C0193e) obj;
        if (this.f1877b != eVar.f1877b) {
            return false;
        }
        return this.f1876a.equals(eVar.f1876a);
    }

    public int hashCode() {
        return (this.f1876a.hashCode() * 31) + this.f1877b;
    }
}
