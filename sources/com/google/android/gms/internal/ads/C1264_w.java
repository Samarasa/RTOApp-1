package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads._w  reason: case insensitive filesystem */
public final class C1264_w implements Xga<Set<C3108zx<C1900iv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9749a;

    private C1264_w(C1004Qw qw) {
        this.f9749a = qw;
    }

    public static C1264_w a(C1004Qw qw) {
        return new C1264_w(qw);
    }

    public static Set<C3108zx<C1900iv>> b(C1004Qw qw) {
        Set<C3108zx<C1900iv>> b2 = qw.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f9749a);
    }
}
