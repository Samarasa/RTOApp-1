package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.v;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Rx  reason: case insensitive filesystem */
public final class C1031Rx extends C0874Lw<v.a> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f8560b;

    protected C1031Rx(Set<C3108zx<v.a>> set) {
        super(set);
    }

    public final void X() {
        a(C1083Tx.f8844a);
    }

    public final void Y() {
        a(C1109Ux.f8981a);
    }

    public final synchronized void Z() {
        if (!this.f8560b) {
            a(C1135Vx.f9100a);
            this.f8560b = true;
        }
        a(C1213Yx.f9511a);
    }

    public final synchronized void aa() {
        a(C1161Wx.f9191a);
        this.f8560b = true;
    }
}
