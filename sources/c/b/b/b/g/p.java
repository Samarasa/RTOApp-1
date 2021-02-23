package c.b.b.b.g;

final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4723a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f4724b;

    p(n nVar, i iVar) {
        this.f4724b = nVar;
        this.f4723a = iVar;
    }

    public final void run() {
        try {
            i iVar = (i) this.f4724b.f4719b.a(this.f4723a);
            if (iVar == null) {
                this.f4724b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            iVar.a(k.f4712b, this.f4724b);
            iVar.a(k.f4712b, (C0472e) this.f4724b);
            iVar.a(k.f4712b, (C0470c) this.f4724b);
        } catch (C0474g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4724b.f4720c.a((Exception) e2.getCause());
            } else {
                this.f4724b.f4720c.a((Exception) e2);
            }
        } catch (Exception e3) {
            this.f4724b.f4720c.a(e3);
        }
    }
}
