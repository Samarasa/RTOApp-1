package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bG  reason: case insensitive filesystem */
public final class C1346bG {

    /* renamed from: a  reason: collision with root package name */
    private final PY f9887a;

    /* renamed from: b  reason: collision with root package name */
    private final OF f9888b;

    /* renamed from: c  reason: collision with root package name */
    private final Qga<C2054lG> f9889c;

    public C1346bG(PY py, OF of, Qga<C2054lG> qga) {
        this.f9887a = py;
        this.f9888b = of;
        this.f9889c = qga;
    }

    private final <RetT> LY<RetT> a(C2515ri riVar, C1842iG<InputStream> iGVar, C1842iG<InputStream> iGVar2, C2214nY<InputStream, RetT> nYVar) {
        String str = riVar.f12018d;
        p.c();
        return C2710uY.c(oa.e(str) ? DY.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR)) : DY.a(iGVar.a(riVar), ExecutionException.class, C1275aG.f9764a, (Executor) this.f9887a)).a(nYVar, (Executor) this.f9887a).a(ZF.class, new C1488dG(this, iGVar2, riVar, nYVar), (Executor) this.f9887a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C1842iG iGVar, C2515ri riVar, C2214nY nYVar, ZF zf) {
        return DY.a(iGVar.a(riVar), nYVar, (Executor) this.f9887a);
    }

    public final LY<C2515ri> a(C2515ri riVar) {
        C1417cG cGVar = new C1417cG(riVar);
        OF of = this.f9888b;
        of.getClass();
        return a(riVar, (C1842iG<InputStream>) C1629fG.a(of), (C1842iG<InputStream>) new C1558eG(this), cGVar);
    }

    public final LY<Void> b(C2515ri riVar) {
        if (Bha.b(riVar.k)) {
            return DY.a((Throwable) new VE(C2351pT.INVALID_REQUEST, "Pool key missing from removeUrl call."));
        }
        return a(riVar, (C1842iG<InputStream>) new C1700gG(this), (C1842iG<InputStream>) new C1912jG(this), C1771hG.f10651a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY c(C2515ri riVar) {
        return this.f9889c.get().D(riVar.k);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY d(C2515ri riVar) {
        return this.f9888b.a(riVar.k);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY e(C2515ri riVar) {
        return this.f9889c.get().b(riVar, Binder.getCallingUid());
    }
}
