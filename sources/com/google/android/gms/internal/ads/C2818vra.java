package com.google.android.gms.internal.ads;

import android.os.Parcel;
import c.b.b.b.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vra  reason: case insensitive filesystem */
public abstract class C2818vra extends C2587sia implements C2889wra {
    public C2818vra() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                p();
                break;
            case 2:
                a(parcel.readFloat());
                break;
            case 3:
                z(parcel.readString());
                break;
            case 4:
                g(C2516ria.a(parcel));
                break;
            case 5:
                a(a.C0060a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                b(parcel.readString(), a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float pb = pb();
                parcel2.writeNoException();
                parcel2.writeFloat(pb);
                return true;
            case 8:
                boolean fb = fb();
                parcel2.writeNoException();
                C2516ria.a(parcel2, fb);
                return true;
            case 9:
                String hb = hb();
                parcel2.writeNoException();
                parcel2.writeString(hb);
                return true;
            case 10:
                B(parcel.readString());
                break;
            case 11:
                a(C0753Hf.a(parcel.readStrongBinder()));
                break;
            case 12:
                a(C0699Fd.a(parcel.readStrongBinder()));
                break;
            case 13:
                List<C3002yd> Ta = Ta();
                parcel2.writeNoException();
                parcel2.writeTypedList(Ta);
                return true;
            case 14:
                a((C1551e) C2516ria.a(parcel, C1551e.CREATOR));
                break;
            case 15:
                Fa();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
