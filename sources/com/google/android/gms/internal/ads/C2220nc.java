package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads.nc  reason: case insensitive filesystem */
public final class C2220nc extends c<C2856wb> {
    public C2220nc() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof C2856wb ? (C2856wb) queryLocalInterface : new C2785vb(iBinder);
    }
}
