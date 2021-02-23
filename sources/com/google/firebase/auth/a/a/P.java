package com.google.firebase.auth.a.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.b.b.b.b.a.a;
import c.b.b.b.b.d;
import c.b.b.b.b.j;
import c.b.b.b.d.d.C0269ga;
import com.google.android.gms.common.api.internal.C0524d;
import com.google.android.gms.common.api.internal.C0530j;
import com.google.android.gms.common.internal.C0548d;
import com.google.android.gms.common.internal.C0552h;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.dynamite.DynamiteModule;

public final class P extends C0552h<U> implements N {
    private static a H = new a("FirebaseAuth", "FirebaseAuth:");
    private final Context I;
    private final X J;

    public P(Context context, Looper looper, C0548d dVar, X x, C0524d dVar2, C0530j jVar) {
        super(context, looper, 112, dVar, dVar2, jVar);
        C0563t.a(context);
        this.I = context;
        this.J = x;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof U ? (U) queryLocalInterface : new V(iBinder);
    }

    public final /* synthetic */ U a() {
        return (U) super.t();
    }

    public final boolean f() {
        return DynamiteModule.a(this.I, "com.google.firebase.auth") == 0;
    }

    public final int g() {
        return j.f3888a;
    }

    public final d[] n() {
        return C0269ga.f4002d;
    }

    /* access modifiers changed from: protected */
    public final Bundle q() {
        Bundle q = super.q();
        if (q == null) {
            q = new Bundle();
        }
        X x = this.J;
        if (x != null) {
            q.putString("com.google.firebase.auth.API_KEY", x.f());
        }
        q.putString("com.google.firebase.auth.LIBRARY_VERSION", Z.a());
        return q;
    }

    /* access modifiers changed from: protected */
    public final String u() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* access modifiers changed from: protected */
    public final String v() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    /* access modifiers changed from: protected */
    public final String w() {
        if (this.J.f14313a) {
            H.c("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.I.getPackageName();
        }
        H.c("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }
}
