package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.b;

/* renamed from: com.google.android.gms.internal.ads.Ip  reason: case insensitive filesystem */
public final class C0789Ip implements Xga<b> {

    /* renamed from: a  reason: collision with root package name */
    private final C0737Gp f7350a;

    public C0789Ip(C0737Gp gp) {
        this.f7350a = gp;
    }

    public final /* synthetic */ Object get() {
        b e2 = this.f7350a.e();
        C1452cha.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
