package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.hn  reason: case insensitive filesystem */
final class C1817hn implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsResult f10725a;

    C1817hn(JsResult jsResult) {
        this.f10725a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10725a.confirm();
    }
}
