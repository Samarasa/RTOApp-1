package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.ads.internal.util.i  reason: case insensitive filesystem */
final /* synthetic */ class C0503i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0502h f5597a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5598b;

    C0503i(C0502h hVar, String str) {
        this.f5597a = hVar;
        this.f5598b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5597a.a(this.f5598b, dialogInterface, i);
    }
}
