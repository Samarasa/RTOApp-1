package c.b.b.a;

final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f3701a;

    /* renamed from: b  reason: collision with root package name */
    private final T f3702b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3703c;

    a(Integer num, T t, d dVar) {
        this.f3701a = num;
        if (t != null) {
            this.f3702b = t;
            if (dVar != null) {
                this.f3703c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f3701a;
    }

    public T b() {
        return this.f3702b;
    }

    public d c() {
        return this.f3703c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f3701a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            return this.f3702b.equals(cVar.b()) && this.f3703c.equals(cVar.c());
        }
    }

    public int hashCode() {
        Integer num = this.f3701a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f3702b.hashCode()) * 1000003) ^ this.f3703c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f3701a + ", payload=" + this.f3702b + ", priority=" + this.f3703c + "}";
    }
}
