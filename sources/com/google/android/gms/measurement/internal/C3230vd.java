package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.vd  reason: case insensitive filesystem */
final class C3230vd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13800a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xe f13801b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3196od f13802c;

    C3230vd(C3196od odVar, AtomicReference atomicReference, xe xeVar) {
        this.f13802c = odVar;
        this.f13800a = atomicReference;
        this.f13801b = xeVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f13800a) {
            try {
                C3218tb d2 = this.f13802c.f13705d;
                if (d2 == null) {
                    this.f13802c.h().t().a("Failed to get app instance id");
                    this.f13800a.notify();
                    return;
                }
                this.f13800a.set(d2.c(this.f13801b));
                String str = (String) this.f13800a.get();
                if (str != null) {
                    this.f13802c.p().a(str);
                    this.f13802c.l().m.a(str);
                }
                this.f13802c.J();
                atomicReference = this.f13800a;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f13802c.h().t().a("Failed to get app instance id", e2);
                    atomicReference = this.f13800a;
                } catch (Throwable th) {
                    this.f13800a.notify();
                    throw th;
                }
            }
        }
    }
}
