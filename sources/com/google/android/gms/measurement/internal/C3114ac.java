package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.ac  reason: case insensitive filesystem */
final class C3114ac implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f13500a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Zb f13501b;

    public C3114ac(Zb zb, String str) {
        this.f13501b = zb;
        C0563t.a(str);
        this.f13500a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f13501b.h().t().a(this.f13500a, th);
    }
}
