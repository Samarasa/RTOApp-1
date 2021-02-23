package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.sra  reason: case insensitive filesystem */
public abstract class C2605sra extends C2587sia implements C2393pra {
    public C2605sra() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = a(a.C0060a.a(parcel.readStrongBinder()), (C2462qqa) C2516ria.a(parcel, C2462qqa.CREATOR), parcel.readString(), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = b(a.C0060a.a(parcel.readStrongBinder()), (C2462qqa) C2516ria.a(parcel, C2462qqa.CREATOR), parcel.readString(), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = b(a.C0060a.a(parcel.readStrongBinder()), parcel.readString(), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = M(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = d(a.C0060a.a(parcel.readStrongBinder()), a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = d(a.C0060a.a(parcel.readStrongBinder()), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = H(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = x(a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = d(a.C0060a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = a(a.C0060a.a(parcel.readStrongBinder()), (C2462qqa) C2516ria.a(parcel, C2462qqa.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = b(a.C0060a.a(parcel.readStrongBinder()), a.C0060a.a(parcel.readStrongBinder()), a.C0060a.a(parcel.readStrongBinder()));
                break;
            case 12:
                iInterface = c(a.C0060a.a(parcel.readStrongBinder()), parcel.readString(), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                iInterface = c(a.C0060a.a(parcel.readStrongBinder()), (C2462qqa) C2516ria.a(parcel, C2462qqa.CREATOR), parcel.readString(), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 14:
                iInterface = c(a.C0060a.a(parcel.readStrongBinder()), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 15:
                iInterface = a(a.C0060a.a(parcel.readStrongBinder()), C0753Hf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C2516ria.a(parcel2, iInterface);
        return true;
    }
}
