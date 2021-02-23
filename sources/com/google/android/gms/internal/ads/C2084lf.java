package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lf  reason: case insensitive filesystem */
public final class C2084lf {

    /* renamed from: a  reason: collision with root package name */
    private C2862we f11203a;

    /* renamed from: b  reason: collision with root package name */
    private LY<C1090Ue> f11204b;

    C2084lf(C2862we weVar) {
        this.f11203a = weVar;
    }

    private final void a() {
        if (this.f11204b == null) {
            C1742gl glVar = new C1742gl();
            this.f11204b = glVar;
            this.f11203a.b((Qba) null).a(new C2297of(glVar), new C2226nf(glVar));
        }
    }

    public final <I, O> C2580sf<I, O> a(String str, C1246_e<I> _eVar, C1305af<O> afVar) {
        a();
        return new C2580sf<>(this.f11204b, str, _eVar, afVar);
    }

    public final void a(String str, C1088Uc<? super C1090Ue> uc) {
        a();
        this.f11204b = DY.a(this.f11204b, new C2439qf(str, uc), (Executor) C1252_k.f9704f);
    }

    public final void b(String str, C1088Uc<? super C1090Ue> uc) {
        this.f11204b = DY.a(this.f11204b, new C2368pf(str, uc), (Executor) C1252_k.f9704f);
    }
}
