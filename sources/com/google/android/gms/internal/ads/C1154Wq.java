package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Wq  reason: case insensitive filesystem */
public final class C1154Wq implements Xga<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C1050Sq f9178a;

    public C1154Wq(C1050Sq sq) {
        this.f9178a = sq;
    }

    public static View a(C1050Sq sq) {
        View b2 = sq.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f9178a);
    }
}
