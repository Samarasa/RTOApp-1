package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0493a;
import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.Lm  reason: case insensitive filesystem */
public final class C0864Lm extends C0493a {

    /* renamed from: d  reason: collision with root package name */
    final C1175Xl f7725d;

    /* renamed from: e  reason: collision with root package name */
    final C0994Qm f7726e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7727f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f7728g;

    C0864Lm(C1175Xl xl, C0994Qm qm, String str, String[] strArr) {
        this.f7725d = xl;
        this.f7726e = qm;
        this.f7727f = str;
        this.f7728g = strArr;
        p.y().a(this);
    }

    public final void a() {
        try {
            this.f7726e.a(this.f7727f, this.f7728g);
        } finally {
            oa.f5628a.post(new C0942Om(this));
        }
    }
}
