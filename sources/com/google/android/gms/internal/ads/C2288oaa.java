package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.oaa  reason: case insensitive filesystem */
final class C2288oaa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f11593a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f11594b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f11595c;

    C2288oaa(IX ix, Context context, View view, Activity activity) {
        this.f11593a = context;
        this.f11594b = view;
        this.f11595c = activity;
    }

    public final void run() {
        try {
            IX.u.a(this.f11593a, this.f11594b, this.f11595c);
        } catch (Exception e2) {
            IX.w.a(2020, -1, e2);
        }
    }
}
