package c.b.b.b.g;

final class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4742a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f4743b;

    x(w wVar, i iVar) {
        this.f4743b = wVar;
        this.f4742a = iVar;
    }

    public final void run() {
        synchronized (this.f4743b.f4740b) {
            if (this.f4743b.f4741c != null) {
                this.f4743b.f4741c.a(this.f4742a.b());
            }
        }
    }
}
