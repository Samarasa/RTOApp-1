package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.vh  reason: case insensitive filesystem */
public abstract class C2797vh extends C2587sia implements C2868wh {
    public C2797vh() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static C2868wh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof C2868wh ? (C2868wh) queryLocalInterface : new C3010yh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                m((Bundle) C2516ria.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                Hb();
                break;
            case 3:
                m();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) C2516ria.a(parcel, Bundle.CREATOR);
                k(bundle);
                parcel2.writeNoException();
                C2516ria.b(parcel2, bundle);
                return true;
            case 7:
                n();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                db();
                break;
            case 10:
                Ob();
                break;
            case 11:
                boolean xa = xa();
                parcel2.writeNoException();
                C2516ria.a(parcel2, xa);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) C2516ria.a(parcel, Intent.CREATOR));
                break;
            case 13:
                G(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 14:
                J();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
