package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class Cd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13204a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13205b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13206c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f13207d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ xe f13208e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C3196od f13209f;

    Cd(C3196od odVar, AtomicReference atomicReference, String str, String str2, String str3, xe xeVar) {
        this.f13209f = odVar;
        this.f13204a = atomicReference;
        this.f13205b = str;
        this.f13206c = str2;
        this.f13207d = str3;
        this.f13208e = xeVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<Ge> a2;
        synchronized (this.f13204a) {
            try {
                C3218tb d2 = this.f13209f.f13705d;
                if (d2 == null) {
                    this.f13209f.h().t().a("Failed to get conditional properties", Bb.a(this.f13205b), this.f13206c, this.f13207d);
                    this.f13204a.set(Collections.emptyList());
                    this.f13204a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f13205b)) {
                    atomicReference2 = this.f13204a;
                    a2 = d2.a(this.f13206c, this.f13207d, this.f13208e);
                } else {
                    atomicReference2 = this.f13204a;
                    a2 = d2.a(this.f13205b, this.f13206c, this.f13207d);
                }
                atomicReference2.set(a2);
                this.f13209f.J();
                atomicReference = this.f13204a;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f13209f.h().t().a("Failed to get conditional properties", Bb.a(this.f13205b), this.f13206c, e2);
                    this.f13204a.set(Collections.emptyList());
                    atomicReference = this.f13204a;
                } catch (Throwable th) {
                    this.f13204a.notify();
                    throw th;
                }
            }
        }
    }
}
