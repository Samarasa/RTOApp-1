package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zf  reason: case insensitive filesystem */
public final class C1221Zf extends Rra {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9572a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile Tra f9573b;

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
        Tra tra;
        synchronized (this.f9572a) {
            tra = this.f9573b;
        }
        return tra;
    }

    public final void a(Tra tra) {
        synchronized (this.f9572a) {
            this.f9573b = tra;
        }
    }

    public final int ca() {
        throw new RemoteException();
    }

    public final float getDuration() {
        throw new RemoteException();
    }

    public final void h(boolean z) {
        throw new RemoteException();
    }

    public final float ia() {
        throw new RemoteException();
    }

    public final float pa() {
        throw new RemoteException();
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
