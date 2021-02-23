package g.a;

public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f14952a;

    public b(String str, Object... objArr) {
        this.f14952a = e.a(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f14952a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
