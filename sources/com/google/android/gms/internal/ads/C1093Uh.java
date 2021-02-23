package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Uh  reason: case insensitive filesystem */
final class C1093Uh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f8917a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1067Th f8918b;

    C1093Uh(C1067Th th, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8918b = th;
        this.f8917a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f8918b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8917a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f8917a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
