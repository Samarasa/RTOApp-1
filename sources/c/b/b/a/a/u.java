package c.b.b.a.a;

import android.content.Context;
import c.b.b.a.a.c.e;
import c.b.b.a.a.e.a;
import c.b.b.a.a.l;
import c.b.b.a.a.p;
import c.b.b.a.a.v;
import c.b.b.a.b;
import c.b.b.a.g;
import c.b.b.a.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import java.util.Collections;
import java.util.Set;

public class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private static volatile v f3840a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3841b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3842c;

    /* renamed from: d  reason: collision with root package name */
    private final e f3843d;

    /* renamed from: e  reason: collision with root package name */
    private final n f3844e;

    u(a aVar, a aVar2, e eVar, n nVar, r rVar) {
        this.f3841b = aVar;
        this.f3842c = aVar2;
        this.f3843d = eVar;
        this.f3844e = nVar;
        rVar.a();
    }

    private l a(o oVar) {
        l.a a2 = l.a();
        a2.a(this.f3841b.a());
        a2.b(this.f3842c.a());
        a2.a(oVar.g());
        a2.a(new k(oVar.b(), oVar.d()));
        a2.a(oVar.c().a());
        return a2.a();
    }

    public static u a() {
        v vVar = f3840a;
        if (vVar != null) {
            return vVar.r();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void a(Context context) {
        if (f3840a == null) {
            synchronized (u.class) {
                if (f3840a == null) {
                    v.a s = h.s();
                    s.a(context);
                    f3840a = s.build();
                }
            }
        }
    }

    private static Set<b> b(i iVar) {
        return iVar instanceof j ? Collections.unmodifiableSet(((j) iVar).a()) : Collections.singleton(b.a("proto"));
    }

    public g a(i iVar) {
        Set<b> b2 = b(iVar);
        p.a a2 = p.a();
        a2.a(iVar.getName());
        a2.a(iVar.getExtras());
        return new q(b2, a2.a(), this);
    }

    public void a(o oVar, h hVar) {
        this.f3843d.a(oVar.f().a(oVar.c().c()), a(oVar), hVar);
    }

    public n b() {
        return this.f3844e;
    }
}
