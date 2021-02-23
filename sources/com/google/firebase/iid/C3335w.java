package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.w  reason: case insensitive filesystem */
final class C3335w extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private C3336x f14612a;

    public C3335w(C3336x xVar) {
        this.f14612a = xVar;
    }

    public final void a() {
        if (FirebaseInstanceId.g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f14612a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C3336x xVar = this.f14612a;
        if (xVar != null && xVar.b()) {
            if (FirebaseInstanceId.g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a((Runnable) this.f14612a, 0);
            this.f14612a.a().unregisterReceiver(this);
            this.f14612a = null;
        }
    }
}
