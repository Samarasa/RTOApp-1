package c.b.b.b.g;

final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ r f4725a;

    q(r rVar) {
        this.f4725a = rVar;
    }

    public final void run() {
        synchronized (this.f4725a.f4727b) {
            if (this.f4725a.f4728c != null) {
                this.f4725a.f4728c.b();
            }
        }
    }
}
