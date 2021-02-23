package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class Ed implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13234a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13235b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13236c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f13237d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f13238e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ xe f13239f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C3196od f13240g;

    Ed(C3196od odVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, xe xeVar) {
        this.f13240g = odVar;
        this.f13234a = atomicReference;
        this.f13235b = str;
        this.f13236c = str2;
        this.f13237d = str3;
        this.f13238e = z;
        this.f13239f = xeVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<re> a2;
        synchronized (this.f13234a) {
            try {
                C3218tb d2 = this.f13240g.f13705d;
                if (d2 == null) {
                    this.f13240g.h().t().a("Failed to get user properties", Bb.a(this.f13235b), this.f13236c, this.f13237d);
                    this.f13234a.set(Collections.emptyList());
                    this.f13234a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f13235b)) {
                    atomicReference2 = this.f13234a;
                    a2 = d2.a(this.f13236c, this.f13237d, this.f13238e, this.f13239f);
                } else {
                    atomicReference2 = this.f13234a;
                    a2 = d2.a(this.f13235b, this.f13236c, this.f13237d, this.f13238e);
                }
                atomicReference2.set(a2);
                this.f13240g.J();
                atomicReference = this.f13234a;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f13240g.h().t().a("Failed to get user properties", Bb.a(this.f13235b), this.f13236c, e2);
                    this.f13234a.set(Collections.emptyList());
                    atomicReference = this.f13234a;
                } catch (Throwable th) {
                    this.f13234a.notify();
                    throw th;
                }
            }
        }
    }
}
