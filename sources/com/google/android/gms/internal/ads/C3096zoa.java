package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zoa  reason: case insensitive filesystem */
public final class C3096zoa implements C1089Ud {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f13121a;

    public C3096zoa(Handler handler) {
        this.f13121a = new C1324aoa(this, handler);
    }

    public final void a(C1339b<?> bVar, C1143Wf wf) {
        bVar.a("post-error");
        this.f13121a.execute(new C1470cqa(bVar, C3073zd.a(wf), (Runnable) null));
    }

    public final void a(C1339b<?> bVar, C3073zd<?> zdVar) {
        a(bVar, zdVar, (Runnable) null);
    }

    public final void a(C1339b<?> bVar, C3073zd<?> zdVar, Runnable runnable) {
        bVar.t();
        bVar.a("post-response");
        this.f13121a.execute(new C1470cqa(bVar, zdVar, runnable));
    }
}
