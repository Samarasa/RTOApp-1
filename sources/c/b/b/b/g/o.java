package c.b.b.b.g;

final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4721a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ m f4722b;

    o(m mVar, i iVar) {
        this.f4722b = mVar;
        this.f4721a = iVar;
    }

    public final void run() {
        if (this.f4721a.c()) {
            this.f4722b.f4717c.f();
            return;
        }
        try {
            this.f4722b.f4717c.a(this.f4722b.f4716b.a(this.f4721a));
        } catch (C0474g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4722b.f4717c.a((Exception) e2.getCause());
            } else {
                this.f4722b.f4717c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4722b.f4717c.a(e3);
        }
    }
}
