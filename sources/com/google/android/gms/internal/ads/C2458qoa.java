package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.l;

/* renamed from: com.google.android.gms.internal.ads.qoa  reason: case insensitive filesystem */
public final class C2458qoa extends a {

    /* renamed from: a  reason: collision with root package name */
    private final C1749goa f11901a;

    public C2458qoa(C1749goa goa) {
        this.f11901a = goa;
    }

    public final void a(Activity activity, l lVar) {
        try {
            this.f11901a.a(b.a(activity), new C1820hoa(lVar));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
