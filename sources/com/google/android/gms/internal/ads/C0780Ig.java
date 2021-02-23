package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.Ig  reason: case insensitive filesystem */
public class C0780Ig {
    public static C0624Cg a(String str) {
        try {
            return new C0858Lg((RtbAdapter) Class.forName(str, false, C0780Ig.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
