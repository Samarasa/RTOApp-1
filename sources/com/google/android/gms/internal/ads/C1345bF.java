package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.bF  reason: case insensitive filesystem */
final /* synthetic */ class C1345bF implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Qba f9885a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9886b;

    C1345bF(Qba qba, Context context) {
        this.f9885a = qba;
        this.f9886b = context;
    }

    public final Object call() {
        Qba qba = this.f9885a;
        return qba.a().a(this.f9886b);
    }
}
