package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class Tc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13421a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13422b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13423c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f13424d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Hc f13425e;

    Tc(Hc hc, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f13425e = hc;
        this.f13421a = atomicReference;
        this.f13422b = str;
        this.f13423c = str2;
        this.f13424d = str3;
    }

    public final void run() {
        this.f13425e.f13807a.E().a((AtomicReference<List<Ge>>) this.f13421a, this.f13422b, this.f13423c, this.f13424d);
    }
}
