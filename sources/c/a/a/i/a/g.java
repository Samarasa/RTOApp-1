package c.a.a.i.a;

public abstract class g {

    private static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f3643a;

        a() {
            super();
        }

        public void a(boolean z) {
            this.f3643a = z;
        }

        public void b() {
            if (this.f3643a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private g() {
    }

    public static g a() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public abstract void a(boolean z);

    public abstract void b();
}
