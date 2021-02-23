package c.b.b.b.d.c;

final class m<T> implements l<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile l<T> f3930a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f3931b;

    /* renamed from: c  reason: collision with root package name */
    private T f3932c;

    m(l<T> lVar) {
        j.a(lVar);
        this.f3930a = lVar;
    }

    public final T a() {
        if (!this.f3931b) {
            synchronized (this) {
                if (!this.f3931b) {
                    T a2 = this.f3930a.a();
                    this.f3932c = a2;
                    this.f3931b = true;
                    this.f3930a = null;
                    return a2;
                }
            }
        }
        return this.f3932c;
    }

    public final String toString() {
        Object obj = this.f3930a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3932c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
