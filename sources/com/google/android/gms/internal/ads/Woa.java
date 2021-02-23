package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;

public final class Woa {

    /* renamed from: a  reason: collision with root package name */
    C2658tia f9174a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9175b;

    public Woa() {
    }

    public Woa(Context context) {
        F.a(context);
        if (((Boolean) Qqa.e().a(F.id)).booleanValue()) {
            try {
                this.f9174a = (C2658tia) C1096Uk.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", Yoa.f9498a);
                b.a(context);
                this.f9174a.b(b.a(context), "GMA_SDK");
                this.f9175b = true;
            } catch (RemoteException | C1148Wk | NullPointerException unused) {
                C1018Rk.a("Cannot dynamite load clearcut");
            }
        }
    }

    public Woa(Context context, String str, String str2) {
        F.a(context);
        try {
            this.f9174a = (C2658tia) C1096Uk.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", _oa.f9732a);
            b.a(context);
            this.f9174a.a(b.a(context), str, (String) null);
            this.f9175b = true;
        } catch (RemoteException | C1148Wk | NullPointerException unused) {
            C1018Rk.a("Cannot dynamite load clearcut");
        }
    }

    public final C1326apa a(byte[] bArr) {
        return new C1326apa(this, bArr);
    }
}
