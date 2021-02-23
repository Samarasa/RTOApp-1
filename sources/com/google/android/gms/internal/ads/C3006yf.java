package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.measurement.a.a;

/* renamed from: com.google.android.gms.internal.ads.yf  reason: case insensitive filesystem */
final /* synthetic */ class C3006yf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C3077zf f12944a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12945b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12946c;

    C3006yf(C3077zf zfVar, Context context, String str) {
        this.f12944a = zfVar;
        this.f12945b = context;
        this.f12946c = str;
    }

    public final void run() {
        Context context = this.f12945b;
        String str = this.f12946c;
        F.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) Qqa.e().a(F.ba)).booleanValue());
        try {
            ((C0632Co) C1096Uk.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C0597Bf.f6333a)).a(b.a(context), new C2864wf(a.a(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | C1148Wk | NullPointerException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
