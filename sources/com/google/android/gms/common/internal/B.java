package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a.b;

public final class B implements Parcelable.Creator<C0564u> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                account = (Account) b.a(parcel, a2, Account.CREATOR);
            } else if (a3 == 3) {
                i2 = b.n(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.a(parcel, a2, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C0564u(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0564u[i];
    }
}
