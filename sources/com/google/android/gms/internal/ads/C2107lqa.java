package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.c.b;
import c.b.b.b.c.c;

/* renamed from: com.google.android.gms.internal.ads.lqa  reason: case insensitive filesystem */
public final class C2107lqa extends c<C1826hra> {
    public C2107lqa() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final C1755gra a(Context context, C2462qqa qqa, String str, C0675Ef ef, int i) {
        try {
            IBinder a2 = ((C1826hra) a(context)).a(b.a(context), qqa, str, ef, 203404000, i);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof C1755gra ? (C1755gra) queryLocalInterface : new C1896ira(a2);
        } catch (RemoteException | c.a e2) {
            C1018Rk.a("Could not create remote AdManager.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C1826hra ? (C1826hra) queryLocalInterface : new C2038kra(iBinder);
    }
}
