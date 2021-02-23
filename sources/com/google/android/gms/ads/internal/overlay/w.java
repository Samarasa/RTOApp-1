package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1540dqa;
import com.google.android.gms.internal.ads.C2797vh;

public final class w extends C2797vh {

    /* renamed from: a  reason: collision with root package name */
    private AdOverlayInfoParcel f5525a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f5526b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5527c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5528d = false;

    public w(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5525a = adOverlayInfoParcel;
        this.f5526b = activity;
    }

    private final synchronized void Zb() {
        if (!this.f5528d) {
            if (this.f5525a.f5479c != null) {
                this.f5525a.f5479c.a(m.OTHER);
            }
            this.f5528d = true;
        }
    }

    public final void G(a aVar) {
    }

    public final void Hb() {
    }

    public final void J() {
        q qVar = this.f5525a.f5479c;
        if (qVar != null) {
            qVar.J();
        }
    }

    public final void Ob() {
    }

    public final void db() {
    }

    public final void k(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5527c);
    }

    public final void m() {
    }

    public final void m(Bundle bundle) {
        q qVar;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5525a;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                C1540dqa dqa = adOverlayInfoParcel.f5478b;
                if (dqa != null) {
                    dqa.onAdClicked();
                }
                if (!(this.f5526b.getIntent() == null || !this.f5526b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (qVar = this.f5525a.f5479c) == null)) {
                    qVar.Tb();
                }
            }
            p.a();
            Activity activity = this.f5526b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5525a;
            if (!C0492a.a((Context) activity, adOverlayInfoParcel2.f5477a, adOverlayInfoParcel2.i)) {
                this.f5526b.finish();
                return;
            }
            return;
        }
        this.f5526b.finish();
    }

    public final void n() {
        if (this.f5526b.isFinishing()) {
            Zb();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onDestroy() {
        if (this.f5526b.isFinishing()) {
            Zb();
        }
    }

    public final void onPause() {
        q qVar = this.f5525a.f5479c;
        if (qVar != null) {
            qVar.onPause();
        }
        if (this.f5526b.isFinishing()) {
            Zb();
        }
    }

    public final void onResume() {
        if (this.f5527c) {
            this.f5526b.finish();
            return;
        }
        this.f5527c = true;
        q qVar = this.f5525a.f5479c;
        if (qVar != null) {
            qVar.onResume();
        }
    }

    public final boolean xa() {
        return false;
    }
}
