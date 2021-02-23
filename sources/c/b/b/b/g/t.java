package c.b.b.b.g;

final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4732a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f4733b;

    t(s sVar, i iVar) {
        this.f4733b = sVar;
        this.f4732a = iVar;
    }

    public final void run() {
        synchronized (this.f4733b.f4730b) {
            if (this.f4733b.f4731c != null) {
                this.f4733b.f4731c.onComplete(this.f4732a);
            }
        }
    }
}
