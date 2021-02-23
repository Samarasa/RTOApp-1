package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

final /* synthetic */ class OI implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final HI f8065a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f8066b;

    /* renamed from: c  reason: collision with root package name */
    private final LY f8067c;

    /* renamed from: d  reason: collision with root package name */
    private final OS f8068d;

    /* renamed from: e  reason: collision with root package name */
    private final C2988yS f8069e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONObject f8070f;

    OI(HI hi, LY ly, LY ly2, OS os, C2988yS ySVar, JSONObject jSONObject) {
        this.f8065a = hi;
        this.f8066b = ly;
        this.f8067c = ly2;
        this.f8068d = os;
        this.f8069e = ySVar;
        this.f8070f = jSONObject;
    }

    public final Object call() {
        return this.f8065a.a(this.f8066b, this.f8067c, this.f8068d, this.f8069e, this.f8070f);
    }
}
