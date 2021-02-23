package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Vh  reason: case insensitive filesystem */
final class C1119Vh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f9065a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1067Th f9066b;

    C1119Vh(C1067Th th, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9066b = th;
        this.f9065a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f9066b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9065a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f9065a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
