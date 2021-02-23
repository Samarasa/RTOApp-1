package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C1616eu;

/* renamed from: com.google.android.gms.internal.ads.eJ  reason: case insensitive filesystem */
public final class C1561eJ extends YI<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final C0710Fo f10241a;

    /* renamed from: b  reason: collision with root package name */
    private final C1616eu.a f10242b;

    /* renamed from: c  reason: collision with root package name */
    private final C1004Qw f10243c;

    public C1561eJ(C0710Fo fo, C1616eu.a aVar, C1004Qw qw) {
        this.f10241a = fo;
        this.f10242b = aVar;
        this.f10243c = qw;
    }

    /* access modifiers changed from: protected */
    public final LY<C2405qC> a(SS ss, Bundle bundle) {
        C2830wC o = this.f10241a.o();
        C1616eu.a aVar = this.f10242b;
        aVar.a(ss);
        aVar.a(bundle);
        o.d(aVar.a());
        o.b(this.f10243c);
        return o.d().b().b();
    }
}
