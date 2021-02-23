package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.eR  reason: case insensitive filesystem */
public final class C1569eR {
    public static <T> void a(AtomicReference<T> atomicReference, C1499dR<T> dRVar) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                dRVar.a(t);
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }
}
