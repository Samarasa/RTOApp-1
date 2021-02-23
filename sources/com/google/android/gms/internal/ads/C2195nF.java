package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nF  reason: case insensitive filesystem */
public final class C2195nF {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f11431a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f11432b;

    /* renamed from: c  reason: collision with root package name */
    private final NF f11433c;

    /* renamed from: d  reason: collision with root package name */
    private final Qga<C2054lG> f11434d;

    public C2195nF(ScheduledExecutorService scheduledExecutorService, PY py, NF nf, Qga<C2054lG> qga) {
        this.f11431a = scheduledExecutorService;
        this.f11432b = py;
        this.f11433c = nf;
        this.f11434d = qga;
    }

    public final LY<InputStream> a(C2515ri riVar) {
        String str = riVar.f12018d;
        p.c();
        return C2710uY.c(oa.e(str) ? DY.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR)) : this.f11433c.a(riVar)).a((long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS, this.f11431a).a(Throwable.class, new C2478rF(this, riVar, Binder.getCallingUid()), (Executor) this.f11432b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(C2515ri riVar, int i, Throwable th) {
        return this.f11434d.get().c(riVar, i);
    }
}
