package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads.iqa  reason: case insensitive filesystem */
public final class C1894iqa extends c<C1613era> {
    public C1894iqa() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final Zqa a(Context context, String str, C0675Ef ef) {
        try {
            IBinder a2 = ((C1613era) a(context)).a(b.a(context), str, ef, 203404000);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof Zqa ? (Zqa) queryLocalInterface : new C1401bra(a2);
        } catch (RemoteException | c.a e2) {
            C1018Rk.c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C1613era ? (C1613era) queryLocalInterface : new C1542dra(iBinder);
    }
}
