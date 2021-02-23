package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.common.internal.C0563t;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ij  reason: case insensitive filesystem */
public final class C1879ij implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C1455cj f10828a;

    public C1879ij(C1455cj cjVar) {
        this.f10828a = cjVar;
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onVideoCompleted.");
        try {
            this.f10828a.n(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdFailedToLoad.");
        try {
            this.f10828a.c(b.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.h.b bVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onRewarded.");
        if (bVar != null) {
            try {
                this.f10828a.a(b.a(mediationRewardedVideoAdAdapter), new C1809hj(bVar));
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        } else {
            this.f10828a.a(b.a(mediationRewardedVideoAdAdapter), new C1809hj(BuildConfig.FLAVOR, 1));
        }
    }

    public final void b(Bundle bundle) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdMetadataChanged.");
        try {
            this.f10828a.b(bundle);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdOpened.");
        try {
            this.f10828a.j(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onVideoStarted.");
        try {
            this.f10828a.J(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLoaded.");
        try {
            this.f10828a.h(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLeftApplication.");
        try {
            this.f10828a.E(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onInitializationSucceeded.");
        try {
            this.f10828a.v(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClosed.");
        try {
            this.f10828a.N(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
