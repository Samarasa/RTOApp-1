package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.kn  reason: case insensitive filesystem */
final class C2029kn implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f11095a;

    C2029kn(JsPromptResult jsPromptResult) {
        this.f11095a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f11095a.cancel();
    }
}
