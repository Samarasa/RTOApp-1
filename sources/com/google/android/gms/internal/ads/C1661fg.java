package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0490a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.v;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.fg  reason: case insensitive filesystem */
public final class C1661fg implements h, m, o {

    /* renamed from: a  reason: collision with root package name */
    private final C0831Kf f10427a;

    /* renamed from: b  reason: collision with root package name */
    private r f10428b;

    /* renamed from: c  reason: collision with root package name */
    private y f10429c;

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.gms.ads.formats.h f10430d;

    public C1661fg(C0831Kf kf) {
        this.f10427a = kf;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, y yVar, r rVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            v vVar = new v();
            vVar.a((Sra) new C1221Zf());
            if (yVar != null && yVar.r()) {
                yVar.a(vVar);
            }
            if (rVar != null && rVar.f()) {
                rVar.a(vVar);
            }
        }
    }

    public final r a() {
        return this.f10428b;
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClosed.");
        try {
            this.f10427a.O();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C0563t.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.a(i);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter, C0490a aVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        int a2 = aVar.a();
        String c2 = aVar.c();
        String b2 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 97 + String.valueOf(b2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a2);
        sb.append(". ErrorMessage: ");
        sb.append(c2);
        sb.append(". ErrorDomain: ");
        sb.append(b2);
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.b(aVar.d());
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAppEvent.");
        try {
            this.f10427a.a(str, str2);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLeftApplication.");
        try {
            this.f10427a.N();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C0563t.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.a(i);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, C0490a aVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        int a2 = aVar.a();
        String c2 = aVar.c();
        String b2 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 97 + String.valueOf(b2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a2);
        sb.append(". ErrorMessage: ");
        sb.append(c2);
        sb.append(". ErrorDomain: ");
        sb.append(b2);
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.b(aVar.d());
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdOpened.");
        try {
            this.f10427a.M();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C0563t.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.a(i);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, C0490a aVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        int a2 = aVar.a();
        String c2 = aVar.c();
        String b2 = aVar.b();
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 97 + String.valueOf(b2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a2);
        sb.append(". ErrorMessage: ");
        sb.append(c2);
        sb.append(". ErrorDomain: ");
        sb.append(b2);
        C1018Rk.a(sb.toString());
        try {
            this.f10427a.b(aVar.d());
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.formats.h hVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(hVar.W());
        C1018Rk.a(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f10430d = hVar;
        try {
            this.f10427a.H();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.formats.h hVar, String str) {
        if (hVar instanceof C0775Ib) {
            try {
                this.f10427a.a(((C0775Ib) hVar).a(), str);
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        } else {
            C1018Rk.d("Unexpected native custom template ad type.");
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, r rVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLoaded.");
        this.f10428b = rVar;
        this.f10429c = null;
        a(mediationNativeAdapter, this.f10429c, this.f10428b);
        try {
            this.f10427a.H();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, y yVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLoaded.");
        this.f10429c = yVar;
        this.f10428b = null;
        a(mediationNativeAdapter, this.f10429c, this.f10428b);
        try {
            this.f10427a.H();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final y b() {
        return this.f10429c;
    }

    public final void b(MediationBannerAdapter mediationBannerAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClicked.");
        try {
            this.f10427a.onAdClicked();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClicked.");
        try {
            this.f10427a.onAdClicked();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClosed.");
        try {
            this.f10427a.O();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final com.google.android.gms.ads.formats.h c() {
        return this.f10430d;
    }

    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLoaded.");
        try {
            this.f10427a.H();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLoaded.");
        try {
            this.f10427a.H();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void c(MediationNativeAdapter mediationNativeAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        r rVar = this.f10428b;
        y yVar = this.f10429c;
        if (this.f10430d == null) {
            if (rVar == null && yVar == null) {
                C1018Rk.d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (yVar != null && !yVar.l()) {
                C1018Rk.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (rVar != null && !rVar.c()) {
                C1018Rk.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C1018Rk.a("Adapter called onAdClicked.");
        try {
            this.f10427a.onAdClicked();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLeftApplication.");
        try {
            this.f10427a.N();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdClosed.");
        try {
            this.f10427a.O();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdLeftApplication.");
        try {
            this.f10427a.N();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdOpened.");
        try {
            this.f10427a.M();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        C1018Rk.a("Adapter called onAdOpened.");
        try {
            this.f10427a.M();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        C0563t.a("#008 Must be called on the main UI thread.");
        r rVar = this.f10428b;
        y yVar = this.f10429c;
        if (this.f10430d == null) {
            if (rVar == null && yVar == null) {
                C1018Rk.d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (yVar != null && !yVar.m()) {
                C1018Rk.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (rVar != null && !rVar.d()) {
                C1018Rk.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C1018Rk.a("Adapter called onAdImpression.");
        try {
            this.f10427a.I();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
