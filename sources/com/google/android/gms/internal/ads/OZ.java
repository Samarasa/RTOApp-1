package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class OZ implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f8097a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8098b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ View f8099c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Activity f8100d;

    OZ(IX ix, Context context, String str, View view, Activity activity) {
        this.f8097a = context;
        this.f8098b = str;
        this.f8099c = view;
        this.f8100d = activity;
    }

    public final void run() {
        try {
            IX.u.a(this.f8097a, this.f8098b, this.f8099c, this.f8100d);
        } catch (Exception e2) {
            IX.w.a(2021, -1, e2);
        }
    }
}
