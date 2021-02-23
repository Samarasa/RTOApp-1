package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads.uh  reason: case insensitive filesystem */
public final class C2726uh extends c<C2939xh> {
    public C2726uh() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final C2868wh a(Activity activity) {
        try {
            IBinder r = ((C2939xh) a((Context) activity)).r(b.a(activity));
            if (r == null) {
                return null;
            }
            IInterface queryLocalInterface = r.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof C2868wh ? (C2868wh) queryLocalInterface : new C3010yh(r);
        } catch (RemoteException e2) {
            C1018Rk.c("Could not create remote AdOverlay.", e2);
            return null;
        } catch (c.a e3) {
            C1018Rk.c("Could not create remote AdOverlay.", e3);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof C2939xh ? (C2939xh) queryLocalInterface : new C0573Ah(iBinder);
    }
}
