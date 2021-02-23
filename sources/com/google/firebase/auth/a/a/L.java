package com.google.firebase.auth.a.a;

import android.content.Context;
import c.b.b.b.b.j;
import c.b.d.g;
import com.google.android.gms.common.api.e;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.concurrent.Callable;

final class L implements Callable<C3252a<X>> {

    /* renamed from: a  reason: collision with root package name */
    private final X f14287a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14288b;

    public L(X x, Context context) {
        this.f14287a = x;
        this.f14288b = context;
    }

    private final e<X> a(boolean z, Context context) {
        X x = (X) this.f14287a.clone();
        x.f14313a = z;
        return new C3257f(context, W.f14294c, x, new g());
    }

    public final /* synthetic */ Object call() {
        int i;
        if (M.f14289a == -1 || M.f14290b == -1) {
            int a2 = DynamiteModule.a(this.f14288b, "com.google.firebase.auth");
            if (a2 == 0) {
                i = 1;
            } else {
                int a3 = c.b.b.b.b.e.a().a(this.f14288b, (int) j.f3888a);
                i = (a3 == 0 || a3 == 2) ? DynamiteModule.b(this.f14288b, "com.google.android.gms.firebase_auth") : 0;
            }
            int unused = M.f14289a = i;
            int unused2 = M.f14290b = a2;
        }
        e<X> eVar = null;
        e<X> a4 = M.f14290b != 0 ? a(true, this.f14288b) : null;
        if (M.f14289a != 0) {
            eVar = a(false, this.f14288b);
        }
        return new C3252a(eVar, a4, new C3254c(M.f14289a, M.f14290b, Collections.emptyMap()));
    }
}
