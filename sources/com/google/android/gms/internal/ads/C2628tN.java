package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tN  reason: case insensitive filesystem */
public final class C2628tN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f12187a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12188b;

    public C2628tN(String str, boolean z) {
        this.f12187a = str;
        this.f12188b = z;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f12187a);
        if (this.f12188b) {
            bundle.putString("de", "1");
        }
    }
}
