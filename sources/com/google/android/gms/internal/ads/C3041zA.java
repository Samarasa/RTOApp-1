package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zA  reason: case insensitive filesystem */
final /* synthetic */ class C3041zA implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C2899xA f13012a;

    /* renamed from: b  reason: collision with root package name */
    private final WindowManager f13013b;

    /* renamed from: c  reason: collision with root package name */
    private final View f13014c;

    C3041zA(C2899xA xAVar, WindowManager windowManager, View view) {
        this.f13012a = xAVar;
        this.f13013b = windowManager;
        this.f13014c = view;
    }

    public final void a(Object obj, Map map) {
        this.f13012a.a(this.f13013b, this.f13014c, (C2313on) obj, map);
    }
}
