package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dK  reason: case insensitive filesystem */
public final class C1492dK implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C2537ru f10129a;

    /* renamed from: b  reason: collision with root package name */
    private final C0846Ku f10130b;

    /* renamed from: c  reason: collision with root package name */
    private final C0745Gx f10131c;

    /* renamed from: d  reason: collision with root package name */
    private final C3037yx f10132d;

    /* renamed from: e  reason: collision with root package name */
    private final C0660Dq f10133e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f10134f = new AtomicBoolean(false);

    C1492dK(C2537ru ruVar, C0846Ku ku, C0745Gx gx, C3037yx yxVar, C0660Dq dq) {
        this.f10129a = ruVar;
        this.f10130b = ku;
        this.f10131c = gx;
        this.f10132d = yxVar;
        this.f10133e = dq;
    }

    public final void a() {
        if (this.f10134f.get()) {
            this.f10129a.onAdClicked();
        }
    }

    public final synchronized void a(View view) {
        if (this.f10134f.compareAndSet(false, true)) {
            this.f10133e.I();
            this.f10132d.a(view);
        }
    }

    public final void b() {
        if (this.f10134f.get()) {
            this.f10130b.I();
            this.f10131c.X();
        }
    }
}
