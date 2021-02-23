package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.common.internal.u  reason: case insensitive filesystem */
public class C0564u extends a {
    public static final Parcelable.Creator<C0564u> CREATOR = new B();

    /* renamed from: a  reason: collision with root package name */
    private final int f5993a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f5994b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5995c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleSignInAccount f5996d;

    C0564u(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f5993a = i;
        this.f5994b = account;
        this.f5995c = i2;
        this.f5996d = googleSignInAccount;
    }

    public C0564u(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account g() {
        return this.f5994b;
    }

    public int h() {
        return this.f5995c;
    }

    public GoogleSignInAccount i() {
        return this.f5996d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5993a);
        c.a(parcel, 2, (Parcelable) g(), i, false);
        c.a(parcel, 3, h());
        c.a(parcel, 4, (Parcelable) i(), i, false);
        c.a(parcel, a2);
    }
}
