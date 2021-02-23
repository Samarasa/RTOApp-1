package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.d.f.Hf;
import java.util.ArrayList;

final class Gd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13262a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13263b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ xe f13264c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Hf f13265d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C3196od f13266e;

    Gd(C3196od odVar, String str, String str2, xe xeVar, Hf hf) {
        this.f13266e = odVar;
        this.f13262a = str;
        this.f13263b = str2;
        this.f13264c = xeVar;
        this.f13265d = hf;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C3218tb d2 = this.f13266e.f13705d;
            if (d2 == null) {
                this.f13266e.h().t().a("Failed to get conditional properties", this.f13262a, this.f13263b);
            } else {
                arrayList = se.b(d2.a(this.f13262a, this.f13263b, this.f13264c));
                this.f13266e.J();
            }
        } catch (RemoteException e2) {
            this.f13266e.h().t().a("Failed to get conditional properties", this.f13262a, this.f13263b, e2);
        } catch (Throwable th) {
            this.f13266e.k().a(this.f13265d, arrayList);
            throw th;
        }
        this.f13266e.k().a(this.f13265d, arrayList);
    }
}
