package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.fj  reason: case insensitive filesystem */
public abstract class C1667fj extends C2587sia implements C1455cj {
    public C1667fj() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static C1455cj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof C1455cj ? (C1455cj) queryLocalInterface : new C1596ej(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                v(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 2:
                b(a.C0060a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                h(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 4:
                j(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 5:
                J(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 6:
                N(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.C0060a.a(parcel.readStrongBinder()), (C1809hj) C2516ria.a(parcel, C1809hj.CREATOR));
                break;
            case 8:
                z(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 9:
                c(a.C0060a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                E(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 11:
                n(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 12:
                b((Bundle) C2516ria.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
