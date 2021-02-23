package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.td  reason: case insensitive filesystem */
final class C3220td implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13770a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xe f13771b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f13772c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3196od f13773d;

    C3220td(C3196od odVar, AtomicReference atomicReference, xe xeVar, boolean z) {
        this.f13773d = odVar;
        this.f13770a = atomicReference;
        this.f13771b = xeVar;
        this.f13772c = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f13770a) {
            try {
                C3218tb d2 = this.f13773d.f13705d;
                if (d2 == null) {
                    this.f13773d.h().t().a("Failed to get user properties");
                    this.f13770a.notify();
                    return;
                }
                this.f13770a.set(d2.a(this.f13771b, this.f13772c));
                this.f13773d.J();
                atomicReference = this.f13770a;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f13773d.h().t().a("Failed to get user properties", e2);
                    atomicReference = this.f13770a;
                } catch (Throwable th) {
                    this.f13770a.notify();
                    throw th;
                }
            }
        }
    }
}
