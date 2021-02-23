package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads.oc  reason: case insensitive filesystem */
public final class C2291oc extends c<C2431qb> {
    public C2291oc() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final C2360pb a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a2 = ((C2431qb) a(context)).a(b.a(context), b.a(frameLayout), b.a(frameLayout2), 203404000);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof C2360pb ? (C2360pb) queryLocalInterface : new C2501rb(a2);
        } catch (RemoteException | c.a e2) {
            C1018Rk.c("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof C2431qb ? (C2431qb) queryLocalInterface : new C2643tb(iBinder);
    }
}
