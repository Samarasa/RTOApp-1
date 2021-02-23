package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.m;

@TargetApi(19)
public final class UC {

    /* renamed from: a  reason: collision with root package name */
    private Context f8858a;

    /* renamed from: b  reason: collision with root package name */
    private PopupWindow f8859b;

    private static PopupWindow b(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow(frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        C1018Rk.a("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Context context = this.f8858a;
        if (context != null && this.f8859b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f8859b.isShowing()) {
                this.f8859b.dismiss();
            }
            this.f8858a = null;
            this.f8859b = null;
        }
    }

    public final void a(Context context, View view) {
        if (m.f() && !m.h()) {
            this.f8859b = b(context, view);
            if (this.f8859b == null) {
                context = null;
            }
            this.f8858a = context;
        }
    }
}
