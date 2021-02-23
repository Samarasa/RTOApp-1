package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import c.b.b.b.d.f.Tf;

final class Yb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3144fc f13465a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f13466b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f13467c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Context f13468d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bb f13469e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ BroadcastReceiver.PendingResult f13470f;

    Yb(Wb wb, C3144fc fcVar, long j, Bundle bundle, Context context, Bb bb, BroadcastReceiver.PendingResult pendingResult) {
        this.f13465a = fcVar;
        this.f13466b = j;
        this.f13467c = bundle;
        this.f13468d = context;
        this.f13469e = bb;
        this.f13470f = pendingResult;
    }

    public final void run() {
        long a2 = this.f13465a.p().k.a();
        long j = this.f13466b;
        if (a2 > 0 && (j >= a2 || j <= 0)) {
            j = a2 - 1;
        }
        if (j > 0) {
            this.f13467c.putLong("click_timestamp", j);
        }
        this.f13467c.putString("_cis", "referrer broadcast");
        C3144fc.a(this.f13468d, (Tf) null).u().a("auto", "_cmp", this.f13467c);
        this.f13469e.B().a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f13470f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
