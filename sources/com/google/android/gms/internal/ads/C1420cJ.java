package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C1616eu;

/* renamed from: com.google.android.gms.internal.ads.cJ  reason: case insensitive filesystem */
public final class C1420cJ extends YI<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f10008a;

    /* renamed from: b  reason: collision with root package name */
    private final C1616eu.a f10009b;

    /* renamed from: c  reason: collision with root package name */
    private final C2058lK f10010c;

    /* renamed from: d  reason: collision with root package name */
    private final C1004Qw f10011d;

    public C1420cJ(C0710Fo fo, C1616eu.a aVar, C2058lK lKVar, C1004Qw qw) {
        this.f10008a = fo;
        this.f10009b = aVar;
        this.f10010c = lKVar;
        this.f10011d = qw;
    }

    /* access modifiers changed from: protected */
    public final LY<C1337ay> a(SS ss, Bundle bundle) {
        C0746Gy l = this.f10008a.l();
        C1616eu.a aVar = this.f10009b;
        aVar.a(ss);
        aVar.a(bundle);
        l.e(aVar.a());
        l.c(this.f10011d);
        l.a(this.f10010c);
        return l.c().a().b();
    }
}
