package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Future;

public final class Loa {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Coa f7752a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f7753b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7754c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f7755d = new Object();

    Loa(Context context) {
        this.f7754c = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.f7755d) {
            if (this.f7752a != null) {
                this.f7752a.e();
                this.f7752a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future<Toa> a(Foa foa) {
        Koa koa = new Koa(this);
        Noa noa = new Noa(this, foa, koa);
        Roa roa = new Roa(this, koa);
        synchronized (this.f7755d) {
            this.f7752a = new Coa(this.f7754c, p.q().b(), noa, roa);
            this.f7752a.j();
        }
        return koa;
    }
}
