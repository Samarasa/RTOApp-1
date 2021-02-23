package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.internal.ads.xoa  reason: case insensitive filesystem */
final class C2954xoa implements C0547c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2883woa f12847a;

    C2954xoa(C2883woa woa) {
        this.f12847a = woa;
    }

    public final void d(int i) {
        synchronized (this.f12847a.f12694b) {
            Goa unused = this.f12847a.f12697e = null;
            this.f12847a.f12694b.notifyAll();
        }
    }

    public final void h(Bundle bundle) {
        synchronized (this.f12847a.f12694b) {
            try {
                if (this.f12847a.f12695c != null) {
                    Goa unused = this.f12847a.f12697e = this.f12847a.f12695c.z();
                }
            } catch (DeadObjectException e2) {
                C1018Rk.b("Unable to obtain a cache service instance.", e2);
                this.f12847a.c();
            }
            this.f12847a.f12694b.notifyAll();
        }
    }
}
