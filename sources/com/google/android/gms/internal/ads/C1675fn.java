package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.fn  reason: case insensitive filesystem */
final class C1675fn implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f10455a;

    C1675fn(JsResult jsResult) {
        this.f10455a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f10455a.cancel();
    }
}
