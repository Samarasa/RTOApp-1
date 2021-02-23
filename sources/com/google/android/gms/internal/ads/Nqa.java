package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.b.b.j;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

abstract class Nqa<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final C2393pra f8032a = c();

    Nqa() {
    }

    private static C2393pra c() {
        try {
            Object newInstance = Aqa.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                C1018Rk.d("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return queryLocalInterface instanceof C2393pra ? (C2393pra) queryLocalInterface : new C2534rra(iBinder);
        } catch (Exception unused) {
            C1018Rk.d("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T d() {
        C2393pra pra = f8032a;
        if (pra == null) {
            C1018Rk.d("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(pra);
        } catch (RemoteException e2) {
            C1018Rk.c("Cannot invoke local loader using ClientApi class.", e2);
            return null;
        }
    }

    private final T e() {
        try {
            return b();
        } catch (RemoteException e2) {
            C1018Rk.c("Cannot invoke remote loader.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T a(Context context, boolean z) {
        T t;
        boolean z2 = false;
        boolean z3 = z;
        if (!z3) {
            Qqa.a();
            if (!C0758Hk.c(context, j.f3888a)) {
                C1018Rk.a("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.b(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        F.a(context);
        if (C3067za.f13069a.a().booleanValue()) {
            z3 = false;
        }
        if (z3) {
            t = d();
            if (t == null) {
                t = e();
            }
        } else {
            T e2 = e();
            int i = e2 == null ? 1 : 0;
            if (i != 0) {
                if (Qqa.h().nextInt(C0800Ja.f7434a.a().intValue()) == 0) {
                    z2 = true;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    Qqa.a().a(context, Qqa.g().f9456a, "gmob-apps", bundle, true);
                }
            }
            t = e2 == null ? d() : e2;
        }
        return t == null ? a() : t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(C2393pra pra);

    /* access modifiers changed from: protected */
    public abstract T b();
}
