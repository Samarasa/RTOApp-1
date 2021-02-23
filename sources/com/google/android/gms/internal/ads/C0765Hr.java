package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Hr  reason: case insensitive filesystem */
public final class C0765Hr implements Xga<View> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7225a;

    public C0765Hr(C0661Dr dr) {
        this.f7225a = dr;
    }

    public static View a(C0661Dr dr) {
        View b2 = dr.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7225a);
    }
}
