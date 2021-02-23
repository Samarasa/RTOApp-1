package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0493a;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.ads.internal.util.wa;

final class k extends C0493a {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f f5505d;

    private k(f fVar) {
        this.f5505d = fVar;
    }

    public final void a() {
        Bitmap a2 = p.v().a(Integer.valueOf(this.f5505d.f5496c.o.f5460f));
        if (a2 != null) {
            wa e2 = p.e();
            f fVar = this.f5505d;
            Activity activity = fVar.f5495b;
            i iVar = fVar.f5496c.o;
            oa.f5628a.post(new n(this, e2.a(activity, a2, iVar.f5458d, iVar.f5459e)));
        }
    }
}
