package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C0563t;

class Jb extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C3176ke f13314a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13315b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13316c;

    Jb(C3176ke keVar) {
        C0563t.a(keVar);
        this.f13314a = keVar;
    }

    public final void a() {
        this.f13314a.p();
        this.f13314a.g().c();
        if (!this.f13315b) {
            this.f13314a.f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f13316c = this.f13314a.d().u();
            this.f13314a.h().B().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f13316c));
            this.f13315b = true;
        }
    }

    public final void b() {
        this.f13314a.p();
        this.f13314a.g().c();
        this.f13314a.g().c();
        if (this.f13315b) {
            this.f13314a.h().B().a("Unregistering connectivity change receiver");
            this.f13315b = false;
            this.f13316c = false;
            try {
                this.f13314a.f().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f13314a.h().t().a("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f13314a.p();
        String action = intent.getAction();
        this.f13314a.h().B().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean u = this.f13314a.d().u();
            if (this.f13316c != u) {
                this.f13316c = u;
                this.f13314a.g().a((Runnable) new Mb(this, u));
                return;
            }
            return;
        }
        this.f13314a.h().w().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
