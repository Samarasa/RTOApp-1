package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

public final class RP implements Xga<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final PP f8464a;

    public RP(PP pp) {
        this.f8464a = pp;
    }

    public static ApplicationInfo a(PP pp) {
        ApplicationInfo f2 = pp.f();
        C1452cha.a(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8464a);
    }
}
