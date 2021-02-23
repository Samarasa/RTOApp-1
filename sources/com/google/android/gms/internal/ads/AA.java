package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

final /* synthetic */ class AA implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f6082a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f6083b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6084c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f6085d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6086e;

    /* renamed from: f  reason: collision with root package name */
    private final WindowManager f6087f;

    AA(View view, C2313on onVar, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f6082a = view;
        this.f6083b = onVar;
        this.f6084c = str;
        this.f6085d = layoutParams;
        this.f6086e = i;
        this.f6087f = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f6082a;
        C2313on onVar = this.f6083b;
        String str = this.f6084c;
        WindowManager.LayoutParams layoutParams = this.f6085d;
        int i = this.f6086e;
        WindowManager windowManager = this.f6087f;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && onVar.getView().getWindowToken() != null) {
            layoutParams.y = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - i;
            windowManager.updateViewLayout(onVar.getView(), layoutParams);
        }
    }
}
