package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.St  reason: case insensitive filesystem */
public final class C1053St implements C2608su, C0768Hu, C3107zw, C2328ox {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0846Ku f8704a;

    /* renamed from: b  reason: collision with root package name */
    private final C2988yS f8705b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f8706c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f8707d;

    /* renamed from: e  reason: collision with root package name */
    private UY<Boolean> f8708e = UY.h();

    /* renamed from: f  reason: collision with root package name */
    private ScheduledFuture<?> f8709f;

    public C1053St(C0846Ku ku, C2988yS ySVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f8704a = ku;
        this.f8705b = ySVar;
        this.f8706c = scheduledExecutorService;
        this.f8707d = executor;
    }

    public final void H() {
    }

    public final synchronized void J() {
        if (!this.f8708e.isDone()) {
            if (this.f8709f != null) {
                this.f8709f.cancel(true);
            }
            this.f8708e.a(true);
        }
    }

    public final void K() {
    }

    public final void L() {
    }

    public final void M() {
        int i = this.f8705b.S;
        if (i == 0 || i == 1) {
            this.f8704a.I();
        }
    }

    public final void N() {
    }

    public final void O() {
    }

    public final void a() {
    }

    public final void a(C0886Mi mi, String str, String str2) {
    }

    public final void b() {
        if (((Boolean) Qqa.e().a(F.pb)).booleanValue()) {
            C2988yS ySVar = this.f8705b;
            if (ySVar.S != 2) {
                return;
            }
            if (ySVar.p == 0) {
                this.f8704a.I();
                return;
            }
            DY.a(this.f8708e, new C1105Ut(this), this.f8707d);
            this.f8709f = this.f8706c.schedule(new C1027Rt(this), (long) this.f8705b.p, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void b(C1824hqa hqa) {
        if (!this.f8708e.isDone()) {
            if (this.f8709f != null) {
                this.f8709f.cancel(true);
            }
            this.f8708e.a((Throwable) new Exception());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        synchronized (this) {
            if (!this.f8708e.isDone()) {
                this.f8708e.a(true);
            }
        }
    }
}
