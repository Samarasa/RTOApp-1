package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0502h;

/* renamed from: com.google.android.gms.internal.ads.Qt  reason: case insensitive filesystem */
final /* synthetic */ class C1001Qt implements UW {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8411a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f8412b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f8413c;

    C1001Qt(Context context, C1200Yk yk, SS ss) {
        this.f8411a = context;
        this.f8412b = yk;
        this.f8413c = ss;
    }

    public final Object apply(Object obj) {
        Context context = this.f8411a;
        C1200Yk yk = this.f8412b;
        SS ss = this.f8413c;
        C2988yS ySVar = (C2988yS) obj;
        C0502h hVar = new C0502h(context);
        hVar.c(ySVar.A);
        hVar.d(ySVar.B.toString());
        hVar.b(yk.f9456a);
        hVar.a(ss.f8620f);
        return hVar;
    }
}
