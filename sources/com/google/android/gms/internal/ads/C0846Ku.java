package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ku  reason: case insensitive filesystem */
public final class C0846Ku extends C0874Lw<C0872Lu> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f7634b = false;

    public C0846Ku(Set<C3108zx<C0872Lu>> set) {
        super(set);
    }

    public final synchronized void I() {
        if (!this.f7634b) {
            a(C0820Ju.f7513a);
            this.f7634b = true;
        }
    }
}
