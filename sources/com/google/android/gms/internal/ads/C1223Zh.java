package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.internal.ads.Zh  reason: case insensitive filesystem */
public final class C1223Zh extends c<C1524di> {
    public C1223Zh(Context context, Looper looper, C0547c.a aVar, C0547c.b bVar) {
        super(C0808Ji.b(context), looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof C1524di ? (C1524di) queryLocalInterface : new C1736gi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.android.gms.ads.service.START";
    }

    public final C1524di z() {
        return (C1524di) super.t();
    }
}
