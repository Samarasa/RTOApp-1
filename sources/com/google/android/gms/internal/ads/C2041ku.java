package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1616eu;

/* renamed from: com.google.android.gms.internal.ads.ku  reason: case insensitive filesystem */
public final class C2041ku implements Xga<C1616eu.a> {

    /* renamed from: a  reason: collision with root package name */
    private final C1616eu f11124a;

    private C2041ku(C1616eu euVar) {
        this.f11124a = euVar;
    }

    public static C2041ku a(C1616eu euVar) {
        return new C2041ku(euVar);
    }

    public final /* synthetic */ Object get() {
        C1616eu.a a2 = this.f11124a.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
