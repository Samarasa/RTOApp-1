package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class UE {

    /* renamed from: a  reason: collision with root package name */
    private final PY f8868a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f8869b;

    /* renamed from: c  reason: collision with root package name */
    private final JF f8870c;

    /* renamed from: d  reason: collision with root package name */
    private final Qga<C2054lG> f8871d;

    public UE(PY py, PY py2, JF jf, Qga<C2054lG> qga) {
        this.f8868a = py;
        this.f8869b = py2;
        this.f8870c = jf;
        this.f8871d = qga;
    }

    public final LY<InputStream> a(C2515ri riVar) {
        String str = riVar.f12018d;
        p.c();
        return DY.a(oa.e(str) ? DY.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR)) : DY.a(this.f8868a.a(new XE(this, riVar)), ExecutionException.class, WE.f9114a, (Executor) this.f8869b), ZF.class, new ZE(this, riVar, Binder.getCallingUid()), (Executor) this.f8869b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2515ri riVar, int i, ZF zf) {
        return this.f8871d.get().a(riVar, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream b(C2515ri riVar) {
        return this.f8870c.a(riVar).get((long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS);
    }
}
