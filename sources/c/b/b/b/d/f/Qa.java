package c.b.b.b.d.f;

final class Qa<T> implements Ka<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Ka<T> f4266a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f4267b;

    /* renamed from: c  reason: collision with root package name */
    private T f4268c;

    Qa(Ka<T> ka) {
        Ia.a(ka);
        this.f4266a = ka;
    }

    public final T a() {
        if (!this.f4267b) {
            synchronized (this) {
                if (!this.f4267b) {
                    T a2 = this.f4266a.a();
                    this.f4268c = a2;
                    this.f4267b = true;
                    this.f4266a = null;
                    return a2;
                }
            }
        }
        return this.f4268c;
    }

    public final String toString() {
        Object obj = this.f4266a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f4268c);
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
