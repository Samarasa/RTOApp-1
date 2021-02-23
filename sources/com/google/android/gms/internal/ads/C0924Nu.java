package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Nu  reason: case insensitive filesystem */
public final class C0924Nu extends C0874Lw<C0950Ou> {
    public C0924Nu(Set<C3108zx<C0950Ou>> set) {
        super(set);
    }

    public final void a(C1057Sx sx, Executor executor) {
        a(C3108zx.a(new C1028Ru(this, sx), executor));
    }

    public final void b(Context context) {
        a(new C1002Qu(context));
    }

    public final void c(Context context) {
        a(new C0976Pu(context));
    }

    public final void d(Context context) {
        a(new C1054Su(context));
    }
}
