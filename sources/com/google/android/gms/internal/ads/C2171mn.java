package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.mn  reason: case insensitive filesystem */
final class C2171mn implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f11374a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ EditText f11375b;

    C2171mn(JsPromptResult jsPromptResult, EditText editText) {
        this.f11374a = jsPromptResult;
        this.f11375b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11374a.confirm(this.f11375b.getText().toString());
    }
}
