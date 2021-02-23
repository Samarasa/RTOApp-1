package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nG  reason: case insensitive filesystem */
final /* synthetic */ class C2196nG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final LY f11435a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f11436b;

    /* renamed from: c  reason: collision with root package name */
    private final LY f11437c;

    C2196nG(LY ly, LY ly2, LY ly3) {
        this.f11435a = ly;
        this.f11436b = ly2;
        this.f11437c = ly3;
    }

    public final Object call() {
        return new AG((DG) this.f11435a.get(), (JSONObject) this.f11436b.get(), (C2941xi) this.f11437c.get());
    }
}
