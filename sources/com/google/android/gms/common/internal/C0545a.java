package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0557m;

/* renamed from: com.google.android.gms.common.internal.a  reason: case insensitive filesystem */
public class C0545a extends C0557m.a {
    public static Account a(C0557m mVar) {
        Account account;
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = mVar.a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
            C0563t.a(account);
            return account;
        }
        account = null;
        C0563t.a(account);
        return account;
    }
}
