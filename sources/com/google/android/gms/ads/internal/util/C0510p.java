package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.ads.internal.util.p  reason: case insensitive filesystem */
final class C0510p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f5636a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5637b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f5638c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f5639d;

    C0510p(C0507m mVar, Context context, String str, boolean z, boolean z2) {
        this.f5636a = context;
        this.f5637b = str;
        this.f5638c = z;
        this.f5639d = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5636a);
        builder.setMessage(this.f5637b);
        builder.setTitle(this.f5638c ? "Error" : "Info");
        if (this.f5639d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C0509o(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
