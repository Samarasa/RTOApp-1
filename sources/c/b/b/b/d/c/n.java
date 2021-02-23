package c.b.b.b.d.c;

import java.io.Serializable;

final class n<T> implements l<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final l<T> f3933a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient boolean f3934b;

    /* renamed from: c  reason: collision with root package name */
    private transient T f3935c;

    n(l<T> lVar) {
        j.a(lVar);
        this.f3933a = lVar;
    }

    public final T a() {
        if (!this.f3934b) {
            synchronized (this) {
                if (!this.f3934b) {
                    T a2 = this.f3933a.a();
                    this.f3935c = a2;
                    this.f3934b = true;
                    return a2;
                }
            }
        }
        return this.f3935c;
    }

    public final String toString() {
        Object obj;
        if (this.f3934b) {
            String valueOf = String.valueOf(this.f3935c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f3933a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
