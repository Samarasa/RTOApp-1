package com.google.android.gms.internal.ads;

import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.g;

public final class V extends C1295aa {

    /* renamed from: a  reason: collision with root package name */
    private final g f8994a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8996c;

    public V(g gVar, String str, String str2) {
        this.f8994a = gVar;
        this.f8995b = str;
        this.f8996c = str2;
    }

    public final String Ja() {
        return this.f8995b;
    }

    public final void La() {
        this.f8994a.a();
    }

    public final String getContent() {
        return this.f8996c;
    }

    public final void k(a aVar) {
        if (aVar != null) {
            this.f8994a.a((View) b.Q(aVar));
        }
    }

    public final void z() {
        this.f8994a.b();
    }
}
