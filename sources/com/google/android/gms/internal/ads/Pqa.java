package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.c;
import com.google.android.gms.ads.n;

public class Pqa extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8278a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private c f8279b;

    public final void a(c cVar) {
        synchronized (this.f8278a) {
            this.f8279b = cVar;
        }
    }

    public void onAdClosed() {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdFailedToLoad(n nVar) {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdFailedToLoad(nVar);
            }
        }
    }

    public void onAdImpression() {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdImpression();
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f8278a) {
            if (this.f8279b != null) {
                this.f8279b.onAdOpened();
            }
        }
    }
}
