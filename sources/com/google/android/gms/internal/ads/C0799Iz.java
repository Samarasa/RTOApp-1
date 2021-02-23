package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Iz  reason: case insensitive filesystem */
public final class C0799Iz extends Rra {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7370a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Sra f7371b;

    /* renamed from: c  reason: collision with root package name */
    private final C1195Yf f7372c;

    public C0799Iz(Sra sra, C1195Yf yf) {
        this.f7371b = sra;
        this.f7372c = yf;
    }

    public final void Fb() {
        throw new RemoteException();
    }

    public final boolean Ga() {
        throw new RemoteException();
    }

    public final boolean Gb() {
        throw new RemoteException();
    }

    public final Tra Jb() {
        synchronized (this.f7370a) {
            if (this.f7371b == null) {
                return null;
            }
            Tra Jb = this.f7371b.Jb();
            return Jb;
        }
    }

    public final void a(Tra tra) {
        synchronized (this.f7370a) {
            if (this.f7371b != null) {
                this.f7371b.a(tra);
            }
        }
    }

    public final int ca() {
        throw new RemoteException();
    }

    public final float getDuration() {
        C1195Yf yf = this.f7372c;
        if (yf != null) {
            return yf.Sa();
        }
        return 0.0f;
    }

    public final void h(boolean z) {
        throw new RemoteException();
    }

    public final float ia() {
        throw new RemoteException();
    }

    public final float pa() {
        C1195Yf yf = this.f7372c;
        if (yf != null) {
            return yf.Na();
        }
        return 0.0f;
    }

    public final void pause() {
        throw new RemoteException();
    }

    public final void stop() {
        throw new RemoteException();
    }

    public final boolean za() {
        throw new RemoteException();
    }
}
