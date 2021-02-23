package h;

public abstract class i implements w {

    /* renamed from: a  reason: collision with root package name */
    private final w f15334a;

    public i(w wVar) {
        if (wVar != null) {
            this.f15334a = wVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(e eVar, long j) {
        return this.f15334a.a(eVar, j);
    }

    public void close() {
        this.f15334a.close();
    }

    public y timeout() {
        return this.f15334a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f15334a.toString() + ")";
    }
}
