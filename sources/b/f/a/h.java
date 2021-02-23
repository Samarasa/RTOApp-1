package b.f.a;

class h<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f2356a;

    /* renamed from: b  reason: collision with root package name */
    private int f2357b;

    h(int i) {
        if (i > 0) {
            this.f2356a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f2357b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2356a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2357b = i - 1;
        return t;
    }

    public void a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f2357b;
            Object[] objArr = this.f2356a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f2357b = i3 + 1;
            }
        }
    }

    public boolean a(T t) {
        int i = this.f2357b;
        Object[] objArr = this.f2356a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f2357b = i + 1;
        return true;
    }
}
