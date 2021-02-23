package c.b.b.b.d.f;

import java.io.Serializable;

final class Na<T> implements Ka<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Ka<T> f4238a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient boolean f4239b;

    /* renamed from: c  reason: collision with root package name */
    private transient T f4240c;

    Na(Ka<T> ka) {
        Ia.a(ka);
        this.f4238a = ka;
    }

    public final T a() {
        if (!this.f4239b) {
            synchronized (this) {
                if (!this.f4239b) {
                    T a2 = this.f4238a.a();
                    this.f4240c = a2;
                    this.f4239b = true;
                    return a2;
                }
            }
        }
        return this.f4240c;
    }

    public final String toString() {
        Object obj;
        if (this.f4239b) {
            String valueOf = String.valueOf(this.f4240c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f4238a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
