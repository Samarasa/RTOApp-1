package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Ko  reason: case insensitive filesystem */
public final class C0840Ko implements Xga<WeakReference<Context>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f7621a;

    public C0840Ko(C0684Eo eo) {
        this.f7621a = eo;
    }

    public final /* synthetic */ Object get() {
        WeakReference<Context> b2 = this.f7621a.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
