package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.apa  reason: case insensitive filesystem */
public final class C1326apa {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9843a;

    /* renamed from: b  reason: collision with root package name */
    private int f9844b;

    /* renamed from: c  reason: collision with root package name */
    private int f9845c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Woa f9846d;

    private C1326apa(Woa woa, byte[] bArr) {
        this.f9846d = woa;
        this.f9843a = bArr;
    }

    public final C1326apa a(int i) {
        this.f9844b = i;
        return this;
    }

    public final synchronized void a() {
        try {
            if (this.f9846d.f9175b) {
                this.f9846d.f9174a.a(this.f9843a);
                this.f9846d.f9174a.g(this.f9844b);
                this.f9846d.f9174a.h(this.f9845c);
                this.f9846d.f9174a.a((int[]) null);
                this.f9846d.f9174a.Nb();
            }
        } catch (RemoteException e2) {
            C1018Rk.a("Clearcut log failed", e2);
        }
    }

    public final C1326apa b(int i) {
        this.f9845c = i;
        return this;
    }
}
