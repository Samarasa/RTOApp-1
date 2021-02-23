package com.google.firebase.auth.a.a;

import android.os.Parcel;
import c.b.b.b.d.d.C0256a;
import c.b.b.b.d.d.C0271ha;
import c.b.b.b.d.d.C0273ia;
import c.b.b.b.d.d.V;
import c.b.b.b.d.d.la;
import c.b.b.b.d.d.na;
import c.b.b.b.d.d.ra;
import c.b.b.b.d.d.ya;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C3311v;

public abstract class S extends C0256a implements T {
    public S() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((ra) V.a(parcel, ra.CREATOR));
                return true;
            case 2:
                a((ra) V.a(parcel, ra.CREATOR), (na) V.a(parcel, na.CREATOR));
                return true;
            case 3:
                a((la) V.a(parcel, la.CREATOR));
                return true;
            case 4:
                a((ya) V.a(parcel, ya.CREATOR));
                return true;
            case 5:
                a((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 6:
                Db();
                return true;
            case 7:
                b();
                return true;
            case 8:
                c(parcel.readString());
                return true;
            case 9:
                d(parcel.readString());
                return true;
            case 10:
                a((C3311v) V.a(parcel, C3311v.CREATOR));
                return true;
            case 11:
                f(parcel.readString());
                return true;
            case 12:
                a((Status) V.a(parcel, Status.CREATOR), (C3311v) V.a(parcel, C3311v.CREATOR));
                return true;
            case 13:
                l();
                return true;
            case 14:
                a((C0271ha) V.a(parcel, C0271ha.CREATOR));
                return true;
            case 15:
                a((C0273ia) V.a(parcel, C0273ia.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
