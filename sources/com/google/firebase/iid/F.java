package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final /* synthetic */ class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final G f14498a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f14499b;

    F(G g2, Intent intent) {
        this.f14498a = g2;
        this.f14499b = intent;
    }

    public final void run() {
        G g2 = this.f14498a;
        String action = this.f14499b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        g2.a();
    }
}
