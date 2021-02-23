package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.internal.C0547c;

public final class _V extends c<C1433cW> {
    private final int E;

    public _V(Context context, Looper looper, C0547c.a aVar, C0547c.b bVar, int i) {
        super(context, looper, 116, aVar, bVar, (String) null);
        this.E = i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C1433cW ? (C1433cW) queryLocalInterface : new C1645fW(iBinder);
    }

    public final int g() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.android.gms.gass.START";
    }

    public final C1433cW z() {
        return (C1433cW) super.t();
    }
}
