package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ub  reason: case insensitive filesystem */
public final class C1087Ub extends C2446qia implements C1035Sb {
    C1087Ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void a(C0749Hb hb) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) hb);
        b(1, c2);
    }
}
