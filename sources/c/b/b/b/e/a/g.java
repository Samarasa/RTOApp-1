package c.b.b.b.e.a;

import android.os.Parcel;
import c.b.b.b.b.C0254b;
import c.b.b.b.d.b.a;
import c.b.b.b.d.b.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class g extends a implements d {
    public g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            a((C0254b) c.a(parcel, C0254b.CREATOR), (c) c.a(parcel, c.CREATOR));
        } else if (i == 4) {
            b((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            c((Status) c.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            a((Status) c.a(parcel, Status.CREATOR), (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            a((l) c.a(parcel, l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
