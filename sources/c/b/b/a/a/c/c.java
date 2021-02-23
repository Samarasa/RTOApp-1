package c.b.b.a.a.c;

import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.d.b;
import c.b.b.a.a.l;
import c.b.b.a.a.p;
import c.b.b.a.a.u;
import c.b.b.a.h;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f3783a = Logger.getLogger(u.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final t f3784b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3785c;

    /* renamed from: d  reason: collision with root package name */
    private final f f3786d;

    /* renamed from: e  reason: collision with root package name */
    private final C0248d f3787e;

    /* renamed from: f  reason: collision with root package name */
    private final b f3788f;

    public c(Executor executor, f fVar, t tVar, C0248d dVar, b bVar) {
        this.f3785c = executor;
        this.f3786d = fVar;
        this.f3784b = tVar;
        this.f3787e = dVar;
        this.f3788f = bVar;
    }

    static /* synthetic */ Object a(c cVar, p pVar, l lVar) {
        cVar.f3787e.a(pVar, lVar);
        cVar.f3784b.a(pVar, 1);
        return null;
    }

    static /* synthetic */ void a(c cVar, p pVar, h hVar, l lVar) {
        try {
            n a2 = cVar.f3786d.a(pVar.b());
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.b()});
                f3783a.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            cVar.f3788f.a(b.a(cVar, pVar, a2.a(lVar)));
            hVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger = f3783a;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    public void a(p pVar, l lVar, h hVar) {
        this.f3785c.execute(a.a(this, pVar, hVar, lVar));
    }
}
