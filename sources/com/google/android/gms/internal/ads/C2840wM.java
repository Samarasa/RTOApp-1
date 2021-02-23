package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wM  reason: case insensitive filesystem */
public final class C2840wM implements JO<KO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12616a;

    /* renamed from: b  reason: collision with root package name */
    private final C2874wk f12617b;

    C2840wM(Executor executor, C2874wk wkVar) {
        this.f12616a = executor;
        this.f12617b = wkVar;
    }

    public final LY<KO<Bundle>> a() {
        return ((Boolean) Qqa.e().a(F.Lb)).booleanValue() ? DY.a(null) : DY.a(this.f12617b.j(), AM.f6103a, this.f12616a);
    }
}
