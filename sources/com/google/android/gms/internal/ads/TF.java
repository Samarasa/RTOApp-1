package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

final class TF implements C0795Iv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8752a;

    /* renamed from: b  reason: collision with root package name */
    private final C1017Rj f8753b;

    TF(Context context, C1017Rj rj) {
        this.f8752a = context;
        this.f8753b = rj;
    }

    public final void a(OS os) {
        if (!TextUtils.isEmpty(os.f8088b.f7844b.f6549d)) {
            this.f8753b.a(this.f8752a, os.f8087a.f7415a.f8618d);
            this.f8753b.f(this.f8752a, os.f8088b.f7844b.f6549d);
        }
    }

    public final void a(C2515ri riVar) {
    }
}
