package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b.c.a.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.common.util.m;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fI  reason: case insensitive filesystem */
public final class C1631fI implements C2480rH<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10369a;

    /* renamed from: b  reason: collision with root package name */
    private final C0616By f10370b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f10371c;

    /* renamed from: d  reason: collision with root package name */
    private final C2846wS f10372d;

    public C1631fI(Context context, Executor executor, C0616By by, C2846wS wSVar) {
        this.f10369a = context;
        this.f10370b = by;
        this.f10371c = executor;
        this.f10372d = wSVar;
    }

    private static String a(C2988yS ySVar) {
        try {
            return ySVar.u.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Uri uri, OS os, C2988yS ySVar, Object obj) {
        try {
            i a2 = new i.a().a();
            a2.f2182a.setData(uri);
            c cVar = new c(a2.f2182a);
            C1742gl glVar = new C1742gl();
            C1479cy a3 = this.f10370b.a(new C0974Ps(os, ySVar, (String) null), new C1762gy(new C1773hI(glVar)));
            glVar.a(new AdOverlayInfoParcel(cVar, (C1540dqa) null, a3.k(), (v) null, new C1200Yk(0, 0, false)));
            this.f10372d.c();
            return DY.a(a3.j());
        } catch (Throwable th) {
            C1018Rk.b("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final boolean a(OS os, C2988yS ySVar) {
        return (this.f10369a instanceof Activity) && m.b() && C1791ha.a(this.f10369a) && !TextUtils.isEmpty(a(ySVar));
    }

    public final LY<C1337ay> b(OS os, C2988yS ySVar) {
        String a2 = a(ySVar);
        return DY.a(DY.a(null), new C1560eI(this, a2 != null ? Uri.parse(a2) : null, os, ySVar), this.f10371c);
    }
}
