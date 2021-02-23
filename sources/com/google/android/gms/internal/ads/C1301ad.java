package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.ad  reason: case insensitive filesystem */
final /* synthetic */ class C1301ad implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C1192Yc f9802a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9803b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9804c;

    C1301ad(C1192Yc yc, String str, Context context) {
        this.f9802a = yc;
        this.f9803b = str;
        this.f9804c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9802a.a(this.f9803b, this.f9804c, dialogInterface, i);
    }
}
