package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

final class Qna implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Nna f8389a;

    Qna(Nna nna) {
        this.f8389a = nna;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        Nna nna = this.f8389a;
        nna.f8022e.a(nna.f8019b, nna.f8020c, (String) obj, nna.f8021d);
    }
}
