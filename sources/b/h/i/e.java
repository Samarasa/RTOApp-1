package b.h.i;

public class e<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2515a;

    /* renamed from: b  reason: collision with root package name */
    private int f2516b;

    public e(int i) {
        if (i > 0) {
            this.f2515a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean b(T t) {
        for (int i = 0; i < this.f2516b; i++) {
            if (this.f2515a[i] == t) {
                return true;
            }
        }
        return false;
    }

    public T a() {
        int i = this.f2516b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2515a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2516b = i - 1;
        return t;
    }

    public boolean a(T t) {
        if (!b(t)) {
            int i = this.f2516b;
            Object[] objArr = this.f2515a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2516b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
