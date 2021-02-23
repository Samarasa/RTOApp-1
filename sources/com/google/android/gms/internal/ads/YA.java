package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

final /* synthetic */ class YA implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final WA f9313a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f9314b;

    /* renamed from: c  reason: collision with root package name */
    private final LY f9315c;

    /* renamed from: d  reason: collision with root package name */
    private final LY f9316d;

    /* renamed from: e  reason: collision with root package name */
    private final LY f9317e;

    /* renamed from: f  reason: collision with root package name */
    private final LY f9318f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f9319g;

    /* renamed from: h  reason: collision with root package name */
    private final LY f9320h;
    private final LY i;
    private final LY j;

    YA(WA wa, LY ly, LY ly2, LY ly3, LY ly4, LY ly5, JSONObject jSONObject, LY ly6, LY ly7, LY ly8) {
        this.f9313a = wa;
        this.f9314b = ly;
        this.f9315c = ly2;
        this.f9316d = ly3;
        this.f9317e = ly4;
        this.f9318f = ly5;
        this.f9319g = jSONObject;
        this.f9320h = ly6;
        this.i = ly7;
        this.j = ly8;
    }

    public final Object call() {
        LY ly = this.f9314b;
        LY ly2 = this.f9315c;
        LY ly3 = this.f9316d;
        LY ly4 = this.f9317e;
        LY ly5 = this.f9318f;
        JSONObject jSONObject = this.f9319g;
        LY ly6 = this.f9320h;
        LY ly7 = this.i;
        LY ly8 = this.j;
        C0877Lz lz = (C0877Lz) ly.get();
        lz.a((List<C1190Ya>) (List) ly2.get());
        lz.a((C2076lb) ly3.get());
        lz.b((C2076lb) ly4.get());
        lz.a((C1580eb) ly5.get());
        lz.b(_A.a(jSONObject));
        lz.a(_A.b(jSONObject));
        C2313on onVar = (C2313on) ly6.get();
        if (onVar != null) {
            lz.a(onVar);
            lz.a(onVar.getView());
            lz.a((Sra) onVar.e());
        }
        C2313on onVar2 = (C2313on) ly7.get();
        if (onVar2 != null) {
            lz.b(onVar2);
        }
        for (C2404qB qBVar : (List) ly8.get()) {
            int i2 = qBVar.f11809a;
            if (i2 == 1) {
                lz.a(qBVar.f11810b, qBVar.f11811c);
            } else if (i2 == 2) {
                lz.a(qBVar.f11810b, qBVar.f11812d);
            }
        }
        return lz;
    }
}
