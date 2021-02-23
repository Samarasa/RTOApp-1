package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import b.c.a.i;
import com.google.android.gms.internal.ads.C1720ga;
import com.google.android.gms.internal.ads.C1791ha;

final class pa implements C1720ga {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1791ha f5640a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5641b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Uri f5642c;

    pa(oa oaVar, C1791ha haVar, Context context, Uri uri) {
        this.f5640a = haVar;
        this.f5641b = context;
        this.f5642c = uri;
    }

    public final void a() {
        new i.a(this.f5640a.b()).a().a(this.f5641b, this.f5642c);
        this.f5640a.a((Activity) this.f5641b);
    }

    public final void b() {
    }
}
