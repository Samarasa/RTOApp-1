package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kG  reason: case insensitive filesystem */
final /* synthetic */ class C1983kG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final LY f11039a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f11040b;

    C1983kG(LY ly, LY ly2) {
        this.f11039a = ly;
        this.f11040b = ly2;
    }

    public final Object call() {
        return new EG((JSONObject) this.f11039a.get(), (C2941xi) this.f11040b.get());
    }
}
