package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.gms.ads.internal.util.f  reason: case insensitive filesystem */
final /* synthetic */ class C0500f implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0497c f5585a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f5586b;

    C0500f(C0497c cVar, Activity activity) {
        this.f5585a = cVar;
        this.f5586b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return C0497c.a(this.f5586b, view, windowInsets);
    }
}
