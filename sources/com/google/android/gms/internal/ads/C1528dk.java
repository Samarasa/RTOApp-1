package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.dk  reason: case insensitive filesystem */
final /* synthetic */ class C1528dk implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1017Rj f10172a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10173b;

    C1528dk(C1017Rj rj, Context context) {
        this.f10172a = rj;
        this.f10173b = context;
    }

    public final Object call() {
        return this.f10172a.f(this.f10173b);
    }
}
