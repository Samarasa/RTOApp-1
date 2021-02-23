package c.b.b.b.g;

import java.util.concurrent.CancellationException;

final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f4744a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z f4745b;

    y(z zVar, i iVar) {
        this.f4745b = zVar;
        this.f4744a = iVar;
    }

    public final void run() {
        try {
            i a2 = this.f4745b.f4747b.a(this.f4744a.b());
            if (a2 == null) {
                this.f4745b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a2.a(k.f4712b, this.f4745b);
            a2.a(k.f4712b, (C0472e) this.f4745b);
            a2.a(k.f4712b, (C0470c) this.f4745b);
        } catch (C0474g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4745b.a((Exception) e2.getCause());
            } else {
                this.f4745b.a((Exception) e2);
            }
        } catch (CancellationException unused) {
            this.f4745b.b();
        } catch (Exception e3) {
            this.f4745b.a(e3);
        }
    }
}
