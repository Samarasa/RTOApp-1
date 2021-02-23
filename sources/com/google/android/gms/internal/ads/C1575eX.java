package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.eX  reason: case insensitive filesystem */
public final class C1575eX {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final LW f10278a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10279b;

    /* renamed from: c  reason: collision with root package name */
    private final C1859iX f10280c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f10281d;

    private C1575eX(C1859iX iXVar) {
        this(iXVar, false, PW.f8222b, Integer.MAX_VALUE);
    }

    private C1575eX(C1859iX iXVar, boolean z, LW lw, int i) {
        this.f10280c = iXVar;
        this.f10279b = false;
        this.f10278a = lw;
        this.f10281d = Integer.MAX_VALUE;
    }

    public static C1575eX a(LW lw) {
        C1434cX.a(lw);
        return new C1575eX(new C1505dX(lw));
    }

    /* access modifiers changed from: private */
    public final Iterator<String> b(CharSequence charSequence) {
        return this.f10280c.a(this, charSequence);
    }

    public final Iterable<String> a(CharSequence charSequence) {
        C1434cX.a(charSequence);
        return new C1646fX(this, charSequence);
    }
}
