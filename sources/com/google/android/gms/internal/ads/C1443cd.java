package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.internal.ads.cd  reason: case insensitive filesystem */
final class C1443cd extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AlertDialog f10057a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Timer f10058b;

    C1443cd(C1192Yc yc, AlertDialog alertDialog, Timer timer) {
        this.f10057a = alertDialog;
        this.f10058b = timer;
    }

    public final void run() {
        this.f10057a.dismiss();
        this.f10058b.cancel();
    }
}
