package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.rO  reason: case insensitive filesystem */
public final class C2487rO implements Xga<C1991kO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f11954a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f11955b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<String> f11956c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2696uK> f11957d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<Context> f11958e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<SS> f11959f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<C2554sK> f11960g;

    private C2487rO(C1876iha<PY> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<String> iha3, C1876iha<C2696uK> iha4, C1876iha<Context> iha5, C1876iha<SS> iha6, C1876iha<C2554sK> iha7) {
        this.f11954a = iha;
        this.f11955b = iha2;
        this.f11956c = iha3;
        this.f11957d = iha4;
        this.f11958e = iha5;
        this.f11959f = iha6;
        this.f11960g = iha7;
    }

    public static C2487rO a(C1876iha<PY> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<String> iha3, C1876iha<C2696uK> iha4, C1876iha<Context> iha5, C1876iha<SS> iha6, C1876iha<C2554sK> iha7) {
        return new C2487rO(iha, iha2, iha3, iha4, iha5, iha6, iha7);
    }

    public final /* synthetic */ Object get() {
        return new C1991kO(this.f11954a.get(), this.f11955b.get(), this.f11956c.get(), this.f11957d.get(), this.f11958e.get(), this.f11959f.get(), this.f11960g.get());
    }
}
