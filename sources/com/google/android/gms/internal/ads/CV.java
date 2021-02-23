package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.g.C0472e;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class CV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6422a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6423b;

    /* renamed from: c  reason: collision with root package name */
    private final C2353pV f6424c;

    /* renamed from: d  reason: collision with root package name */
    private final C2424qV f6425d;

    /* renamed from: e  reason: collision with root package name */
    private final JV f6426e;

    /* renamed from: f  reason: collision with root package name */
    private final JV f6427f;

    /* renamed from: g  reason: collision with root package name */
    private i<C1766hB> f6428g;

    /* renamed from: h  reason: collision with root package name */
    private i<C1766hB> f6429h;

    private CV(Context context, Executor executor, C2353pV pVVar, C2424qV qVVar, GV gv, KV kv) {
        this.f6422a = context;
        this.f6423b = executor;
        this.f6424c = pVVar;
        this.f6425d = qVVar;
        this.f6426e = gv;
        this.f6427f = kv;
    }

    private final i<C1766hB> a(Callable<C1766hB> callable) {
        i<C1766hB> a2 = l.a(this.f6423b, callable);
        a2.a(this.f6423b, (C0472e) new IV(this));
        return a2;
    }

    public static CV a(Context context, Executor executor, C2353pV pVVar, C2424qV qVVar) {
        CV cv = new CV(context, executor, pVVar, qVVar, new GV(), new KV());
        cv.f6428g = cv.f6425d.b() ? cv.a((Callable<C1766hB>) new FV(cv)) : l.a(cv.f6426e.a());
        cv.f6429h = cv.a((Callable<C1766hB>) new EV(cv));
        return cv;
    }

    private static C1766hB a(i<C1766hB> iVar, C1766hB hBVar) {
        return !iVar.e() ? hBVar : iVar.b();
    }

    public final C1766hB a() {
        return a(this.f6428g, this.f6426e.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f6424c.a(2025, -1, exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1766hB b() {
        return this.f6427f.a(this.f6422a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1766hB c() {
        return this.f6426e.a(this.f6422a);
    }

    public final C1766hB d() {
        return a(this.f6429h, this.f6427f.a());
    }
}
