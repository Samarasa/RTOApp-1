package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.in  reason: case insensitive filesystem */
final class C1887in implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f10843a;

    C1887in(JsResult jsResult) {
        this.f10843a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10843a.cancel();
    }
}
