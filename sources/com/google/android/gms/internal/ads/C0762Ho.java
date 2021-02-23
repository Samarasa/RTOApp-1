package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ho  reason: case insensitive filesystem */
public final class C0762Ho implements Xga<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f7212a;

    public C0762Ho(C0684Eo eo) {
        this.f7212a = eo;
    }

    public static Context a(C0684Eo eo) {
        Context a2 = eo.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7212a);
    }
}
