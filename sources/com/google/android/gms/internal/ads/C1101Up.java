package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.Up  reason: case insensitive filesystem */
final class C1101Up implements C0992Qk {

    /* renamed from: a  reason: collision with root package name */
    private File f8969a = null;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f8970b;

    C1101Up(Context context) {
        this.f8970b = context;
    }

    public final File k() {
        if (this.f8969a == null) {
            this.f8969a = new File(this.f8970b.getCacheDir(), "volley");
        }
        return this.f8969a;
    }
}
