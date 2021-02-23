package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Vc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13442a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13443b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13444c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f13445d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f13446e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Hc f13447f;

    Vc(Hc hc, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f13447f = hc;
        this.f13442a = atomicReference;
        this.f13443b = str;
        this.f13444c = str2;
        this.f13445d = str3;
        this.f13446e = z;
    }

    public final void run() {
        this.f13447f.f13807a.E().a(this.f13442a, this.f13443b, this.f13444c, this.f13445d, this.f13446e);
    }
}
