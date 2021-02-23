package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.d.c.b;
import c.b.b.b.d.c.c;

/* renamed from: com.google.android.gms.common.internal.m  reason: case insensitive filesystem */
public interface C0557m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class a extends c.b.b.b.d.c.a implements C0557m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a  reason: collision with other inner class name */
        public static class C0078a extends b implements C0557m {
            C0078a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account a() {
                Parcel a2 = a(2, Db());
                Account account = (Account) c.a(a2, Account.CREATOR);
                a2.recycle();
                return account;
            }
        }

        public static C0557m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C0557m ? (C0557m) queryLocalInterface : new C0078a(iBinder);
        }
    }

    Account a();
}
