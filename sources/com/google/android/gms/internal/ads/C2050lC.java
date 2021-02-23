package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.v;

/* renamed from: com.google.android.gms.internal.ads.lC  reason: case insensitive filesystem */
public final class C2050lC extends v.a {

    /* renamed from: a  reason: collision with root package name */
    private final C0877Lz f11137a;

    public C2050lC(C0877Lz lz) {
        this.f11137a = lz;
    }

    private static Tra a(C0877Lz lz) {
        Sra n = lz.n();
        if (n == null) {
            return null;
        }
        try {
            return n.Jb();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void a() {
        Tra a2 = a(this.f11137a);
        if (a2 != null) {
            try {
                a2.ma();
            } catch (RemoteException e2) {
                C1018Rk.c("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void b() {
        Tra a2 = a(this.f11137a);
        if (a2 != null) {
            try {
                a2.ka();
            } catch (RemoteException e2) {
                C1018Rk.c("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void d() {
        Tra a2 = a(this.f11137a);
        if (a2 != null) {
            try {
                a2.wb();
            } catch (RemoteException e2) {
                C1018Rk.c("Unable to call onVideoEnd()", e2);
            }
        }
    }
}
