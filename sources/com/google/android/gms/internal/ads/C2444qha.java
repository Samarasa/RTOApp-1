package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qha  reason: case insensitive filesystem */
final class C2444qha implements C2708uW {

    /* renamed from: a  reason: collision with root package name */
    private final C2424qV f11872a;

    /* renamed from: b  reason: collision with root package name */
    private final CV f11873b;

    /* renamed from: c  reason: collision with root package name */
    private final Dha f11874c;

    /* renamed from: d  reason: collision with root package name */
    private final C2656tha f11875d;

    C2444qha(C2424qV qVVar, CV cv, Dha dha, C2656tha tha) {
        this.f11872a = qVVar;
        this.f11873b = cv;
        this.f11874c = dha;
        this.f11875d = tha;
    }

    private final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        C1766hB d2 = this.f11873b.d();
        hashMap.put("v", this.f11872a.a());
        hashMap.put("gms", Boolean.valueOf(this.f11872a.d()));
        hashMap.put("int", d2.o());
        hashMap.put("up", Boolean.valueOf(this.f11875d.a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final Map<String, Object> a() {
        Map<String, Object> d2 = d();
        d2.put("lts", Long.valueOf(this.f11874c.a()));
        return d2;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f11874c.a(view);
    }

    public final Map<String, Object> b() {
        Map<String, Object> d2 = d();
        C1766hB a2 = this.f11873b.a();
        d2.put("gai", Boolean.valueOf(this.f11872a.b()));
        d2.put("did", a2.q());
        d2.put("dst", Integer.valueOf(a2.r().a()));
        d2.put("doo", Boolean.valueOf(a2.s()));
        return d2;
    }

    public final Map<String, Object> c() {
        return d();
    }
}
