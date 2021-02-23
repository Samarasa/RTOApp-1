package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C2313on;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f5506a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f5507b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f5508c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5509d;

    public l(C2313on onVar) {
        this.f5507b = onVar.getLayoutParams();
        ViewParent parent = onVar.getParent();
        this.f5509d = onVar.E();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new j("Could not get the parent of the WebView for an overlay.");
        }
        this.f5508c = (ViewGroup) parent;
        this.f5506a = this.f5508c.indexOfChild(onVar.getView());
        this.f5508c.removeView(onVar.getView());
        onVar.c(true);
    }
}
