package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import c.b.b.b.c.b;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C2868wh;
import com.google.android.gms.internal.ads.Qqa;

public final class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private C2868wh f5345a;

    private final void a() {
        C2868wh whVar = this.f5345a;
        if (whVar != null) {
            try {
                whVar.db();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f5345a.onActivityResult(i, i2, intent);
        } catch (Exception e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.f5345a != null) {
                z = this.f5345a.xa();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        if (z) {
            super.onBackPressed();
            try {
                this.f5345a.Ob();
            } catch (RemoteException e3) {
                C1018Rk.d("#007 Could not call remote method.", e3);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f5345a.G(b.a(configuration));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5345a = Qqa.b().a((Activity) this);
        C2868wh whVar = this.f5345a;
        if (whVar == null) {
            e = null;
        } else {
            try {
                whVar.m(bundle);
                return;
            } catch (RemoteException e2) {
                e = e2;
            }
        }
        C1018Rk.d("#007 Could not call remote method.", e);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.f5345a != null) {
                this.f5345a.onDestroy();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.f5345a != null) {
                this.f5345a.onPause();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.f5345a != null) {
                this.f5345a.Hb();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.f5345a != null) {
                this.f5345a.onResume();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f5345a != null) {
                this.f5345a.k(bundle);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.f5345a != null) {
                this.f5345a.m();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.f5345a != null) {
                this.f5345a.n();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            this.f5345a.J();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
