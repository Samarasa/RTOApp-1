package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.b.b.b.b.d;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.z;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.common.util.b;

public final class Coa extends c<Goa> {
    Coa(Context context, Looper looper, C0547c.a aVar, C0547c.b bVar) {
        super(C0808Ji.b(context), looper, 123, aVar, bVar, (String) null);
    }

    public final boolean A() {
        return ((Boolean) Qqa.e().a(F.vb)).booleanValue() && b.a(h(), z.f5738a);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof Goa ? (Goa) queryLocalInterface : new Joa(iBinder);
    }

    public final d[] n() {
        return z.f5739b;
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final Goa z() {
        return (Goa) super.t();
    }
}
