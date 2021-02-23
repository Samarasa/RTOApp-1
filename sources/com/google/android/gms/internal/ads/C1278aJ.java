package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C1616eu;

/* renamed from: com.google.android.gms.internal.ads.aJ  reason: case insensitive filesystem */
public final class C1278aJ extends YI<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f9765a;

    /* renamed from: b  reason: collision with root package name */
    private final C1616eu.a f9766b;

    /* renamed from: c  reason: collision with root package name */
    private final C2058lK f9767c;

    /* renamed from: d  reason: collision with root package name */
    private final C1004Qw f9768d;

    /* renamed from: e  reason: collision with root package name */
    private final C1136Vy f9769e;

    /* renamed from: f  reason: collision with root package name */
    private final C0587Av f9770f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f9771g;

    public C1278aJ(C0710Fo fo, C1616eu.a aVar, C2058lK lKVar, C1004Qw qw, C1136Vy vy, C0587Av av, ViewGroup viewGroup) {
        this.f9765a = fo;
        this.f9766b = aVar;
        this.f9767c = lKVar;
        this.f9768d = qw;
        this.f9769e = vy;
        this.f9770f = av;
        this.f9771g = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final LY<C0583Ar> a(SS ss, Bundle bundle) {
        C1129Vr h2 = this.f9765a.h();
        C1616eu.a aVar = this.f9766b;
        aVar.a(ss);
        aVar.a(bundle);
        h2.f(aVar.a());
        h2.d(this.f9768d);
        h2.b(this.f9767c);
        h2.a(this.f9769e);
        h2.a(new C2535rs(this.f9770f));
        h2.a(new C2746ur(this.f9771g));
        return h2.e().a().b();
    }
}
