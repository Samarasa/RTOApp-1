package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1976k;
import com.google.android.gms.internal.ads.Sra;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5729a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Sra f5730b;

    /* renamed from: c  reason: collision with root package name */
    private a f5731c;

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public final Sra a() {
        Sra sra;
        synchronized (this.f5729a) {
            sra = this.f5730b;
        }
        return sra;
    }

    public final void a(a aVar) {
        C0563t.a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f5729a) {
            this.f5731c = aVar;
            if (this.f5730b != null) {
                try {
                    this.f5730b.a(new C1976k(aVar));
                } catch (RemoteException e2) {
                    C1018Rk.b("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
        }
    }

    public final void a(Sra sra) {
        synchronized (this.f5729a) {
            this.f5730b = sra;
            if (this.f5731c != null) {
                a(this.f5731c);
            }
        }
    }
}
