package androidx.work;

class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Worker f2049a;

    r(Worker worker) {
        this.f2049a = worker;
    }

    public void run() {
        try {
            this.f2049a.f1679e.b(this.f2049a.doWork());
        } catch (Throwable th) {
            this.f2049a.f1679e.a(th);
        }
    }
}
