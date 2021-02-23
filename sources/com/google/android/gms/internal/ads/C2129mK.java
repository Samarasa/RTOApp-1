package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.g;

/* renamed from: com.google.android.gms.internal.ads.mK  reason: case insensitive filesystem */
public final class C2129mK implements g {

    /* renamed from: a  reason: collision with root package name */
    private g f11291a;

    public final synchronized void a() {
        if (this.f11291a != null) {
            this.f11291a.a();
        }
    }

    public final synchronized void a(View view) {
        if (this.f11291a != null) {
            this.f11291a.a(view);
        }
    }

    public final synchronized void a(g gVar) {
        this.f11291a = gVar;
    }

    public final synchronized void b() {
        if (this.f11291a != null) {
            this.f11291a.b();
        }
    }
}
