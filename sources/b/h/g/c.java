package b.h.g;

import android.os.Handler;
import b.h.a.a.h;
import b.h.g.f;
import b.h.g.k;

class c implements k.a<f.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h.a f2429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Handler f2430b;

    c(h.a aVar, Handler handler) {
        this.f2429a = aVar;
        this.f2430b = handler;
    }

    public void a(f.c cVar) {
        int i;
        h.a aVar;
        if (cVar == null) {
            aVar = this.f2429a;
            i = 1;
        } else {
            i = cVar.f2445b;
            if (i == 0) {
                this.f2429a.a(cVar.f2444a, this.f2430b);
                return;
            }
            aVar = this.f2429a;
        }
        aVar.a(i, this.f2430b);
    }
}
