package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nA  reason: case insensitive filesystem */
final /* synthetic */ class C2190nA implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C1977kA f11420a;

    /* renamed from: b  reason: collision with root package name */
    private final C1724gc f11421b;

    C2190nA(C1977kA kAVar, C1724gc gcVar) {
        this.f11420a = kAVar;
        this.f11421b = gcVar;
    }

    public final void a(Object obj, Map map) {
        C1977kA kAVar = this.f11420a;
        C1724gc gcVar = this.f11421b;
        try {
            kAVar.f11030f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C1018Rk.b("Failed to call parse unconfirmedClickTimestamp.");
        }
        kAVar.f11029e = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (gcVar == null) {
            C1018Rk.a("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            gcVar.s(str);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
