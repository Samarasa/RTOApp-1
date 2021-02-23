package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C;
import androidx.fragment.app.C0158h;
import androidx.fragment.app.C0159i;
import b.e.b;
import c.b.b.b.d.c.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class X extends C0158h implements C0528h {
    private static WeakHashMap<C0159i, WeakReference<X>> W = new WeakHashMap<>();
    private Map<String, LifecycleCallback> X = Collections.synchronizedMap(new b());
    /* access modifiers changed from: private */
    public int Y = 0;
    /* access modifiers changed from: private */
    public Bundle Z;

    public static X a(C0159i iVar) {
        X x;
        WeakReference weakReference = W.get(iVar);
        if (weakReference != null && (x = (X) weakReference.get()) != null) {
            return x;
        }
        try {
            X x2 = (X) iVar.getSupportFragmentManager().a("SupportLifecycleFragmentImpl");
            if (x2 == null || x2.F()) {
                x2 = new X();
                C a2 = iVar.getSupportFragmentManager().a();
                a2.a(x2, "SupportLifecycleFragmentImpl");
                a2.b();
            }
            W.put(iVar, new WeakReference(x2));
            return x2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final void I() {
        super.I();
        this.Y = 5;
        for (LifecycleCallback a2 : this.X.values()) {
            a2.a();
        }
    }

    public final void N() {
        super.N();
        this.Y = 3;
        for (LifecycleCallback b2 : this.X.values()) {
            b2.b();
        }
    }

    public final void O() {
        super.O();
        this.Y = 2;
        for (LifecycleCallback c2 : this.X.values()) {
            c2.c();
        }
    }

    public final void P() {
        super.P();
        this.Y = 4;
        for (LifecycleCallback d2 : this.X.values()) {
            d2.d();
        }
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.X.get(str));
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        for (LifecycleCallback a2 : this.X.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.X.containsKey(str)) {
            this.X.put(str, lifecycleCallback);
            if (this.Y > 0) {
                new h(Looper.getMainLooper()).post(new Y(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.X.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        this.Y = 1;
        this.Z = bundle;
        for (Map.Entry next : this.X.entrySet()) {
            ((LifecycleCallback) next.getValue()).a(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.X.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).b(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }
}
