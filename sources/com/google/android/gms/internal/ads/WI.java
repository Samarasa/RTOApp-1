package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C1616eu;

public final class WI extends YI<C0714Fs> {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f9120a;

    /* renamed from: b  reason: collision with root package name */
    private final C1136Vy f9121b;

    /* renamed from: c  reason: collision with root package name */
    private final C1616eu.a f9122c;

    /* renamed from: d  reason: collision with root package name */
    private final C1004Qw f9123d;

    public WI(C0710Fo fo, C1136Vy vy, C1616eu.a aVar, C1004Qw qw) {
        this.f9120a = fo;
        this.f9121b = vy;
        this.f9122c = aVar;
        this.f9123d = qw;
    }

    /* access modifiers changed from: protected */
    public final LY<C0714Fs> a(SS ss, Bundle bundle) {
        C1409bz n = this.f9120a.n();
        C1616eu.a aVar = this.f9122c;
        aVar.a(ss);
        aVar.a(bundle);
        n.c(aVar.a());
        n.a(this.f9123d);
        n.b(this.f9121b);
        n.d(new C2746ur((ViewGroup) null));
        return n.b().a().b();
    }
}
