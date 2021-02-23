package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.internal.ads.hd  reason: case insensitive filesystem */
public final class C1797hd extends c<C2435qd> {
    C1797hd(Context context, Looper looper, C0547c.a aVar, C0547c.b bVar) {
        super(C0808Ji.b(context), looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof C2435qd ? (C2435qd) queryLocalInterface : new C2364pd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final C2435qd z() {
        return (C2435qd) super.t();
    }
}
