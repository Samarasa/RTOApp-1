package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.h.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hv  reason: case insensitive filesystem */
public final class C1830hv extends C0874Lw<a> implements C2858wc {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f10753b = new Bundle();

    public C1830hv(Set<C3108zx<a>> set) {
        super(set);
    }

    public final synchronized Bundle X() {
        return new Bundle(this.f10753b);
    }

    public final synchronized void a(String str, Bundle bundle) {
        this.f10753b.putAll(bundle);
        a(C2042kv.f11125a);
    }
}
