package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Fh  reason: case insensitive filesystem */
public final class C0703Fh extends C2587sia implements C0729Gh {
    public static C0729Gh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof C0729Gh ? (C0729Gh) queryLocalInterface : new C0781Ih(iBinder);
    }
}
