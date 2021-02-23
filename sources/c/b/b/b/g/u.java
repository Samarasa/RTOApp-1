package c.b.b.b.g;

final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4734a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v f4735b;

    u(v vVar, i iVar) {
        this.f4735b = vVar;
        this.f4734a = iVar;
    }

    public final void run() {
        synchronized (this.f4735b.f4737b) {
            if (this.f4735b.f4738c != null) {
                this.f4735b.f4738c.a(this.f4734a.a());
            }
        }
    }
}
