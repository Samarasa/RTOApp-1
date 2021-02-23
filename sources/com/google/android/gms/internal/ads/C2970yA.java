package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yA  reason: case insensitive filesystem */
final /* synthetic */ class C2970yA implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C2899xA f12869a;

    /* renamed from: b  reason: collision with root package name */
    private final View f12870b;

    /* renamed from: c  reason: collision with root package name */
    private final WindowManager f12871c;

    C2970yA(C2899xA xAVar, View view, WindowManager windowManager) {
        this.f12869a = xAVar;
        this.f12870b = view;
        this.f12871c = windowManager;
    }

    public final void a(Object obj, Map map) {
        this.f12869a.a(this.f12870b, this.f12871c, (C2313on) obj, map);
    }
}
