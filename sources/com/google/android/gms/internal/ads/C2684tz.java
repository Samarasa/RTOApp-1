package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.tz  reason: case insensitive filesystem */
public final class C2684tz implements Xga<C3037yx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12290a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2988yS> f12291b;

    public C2684tz(C1876iha<Context> iha, C1876iha<C2988yS> iha2) {
        this.f12290a = iha;
        this.f12291b = iha2;
    }

    public final /* synthetic */ Object get() {
        C3037yx yxVar = new C3037yx(this.f12290a.get(), new HashSet(), this.f12291b.get());
        C1452cha.a(yxVar, "Cannot return null from a non-@Nullable @Provides method");
        return yxVar;
    }
}
