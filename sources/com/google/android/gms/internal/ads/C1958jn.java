package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.jn  reason: case insensitive filesystem */
final class C1958jn implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f10998a;

    C1958jn(JsPromptResult jsPromptResult) {
        this.f10998a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10998a.cancel();
    }
}
