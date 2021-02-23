package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dL  reason: case insensitive filesystem */
public final class C1493dL {

    /* renamed from: a  reason: collision with root package name */
    private final C1776hL<C3103zs> f10135a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10136b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Nra f10137c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f10138d = false;

    public C1493dL(C1776hL<C3103zs> hLVar, String str) {
        this.f10135a = hLVar;
        this.f10136b = str;
    }

    public final synchronized String a() {
        try {
            if (this.f10137c == null) {
                return null;
            }
            return this.f10137c.o();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final synchronized void a(C2249nqa nqa, int i) {
        this.f10137c = null;
        this.f10138d = this.f10135a.a(nqa, this.f10136b, new C2130mL(i), new C1705gL(this));
    }

    public final synchronized boolean b() {
        return this.f10135a.q();
    }

    public final synchronized String c() {
        try {
            if (this.f10137c == null) {
                return null;
            }
            return this.f10137c.o();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
