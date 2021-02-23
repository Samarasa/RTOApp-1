package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.iA  reason: case insensitive filesystem */
final class C1836iA implements C1242_a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FA f10766a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ViewGroup f10767b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1765hA f10768c;

    C1836iA(C1765hA hAVar, FA fa, ViewGroup viewGroup) {
        this.f10768c = hAVar;
        this.f10766a = fa;
        this.f10767b = viewGroup;
    }

    public final void a(MotionEvent motionEvent) {
        this.f10766a.onTouch((View) null, motionEvent);
    }

    public final JSONObject c() {
        return this.f10766a.c();
    }

    public final void d() {
        if (C1765hA.a(this.f10766a, C1552eA.f10218a)) {
            this.f10766a.onClick(this.f10767b);
        }
    }
}
