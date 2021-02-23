package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.b.b.b.b.j;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.measurement.internal.yb  reason: case insensitive filesystem */
public final class C3243yb extends C0547c<C3218tb> {
    public C3243yb(Context context, Looper looper, C0547c.a aVar, C0547c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C3218tb ? (C3218tb) queryLocalInterface : new C3228vb(iBinder);
    }

    public final int g() {
        return j.f3888a;
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
