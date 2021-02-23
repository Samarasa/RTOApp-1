package com.google.android.gms.internal.ads;

import android.content.Context;

public final class DT implements Xga<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C2989yT f6554a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2847wT> f6555b;

    private DT(C2989yT yTVar, C1876iha<C2847wT> iha) {
        this.f6554a = yTVar;
        this.f6555b = iha;
    }

    public static Context a(C2989yT yTVar, C2847wT wTVar) {
        Context context = wTVar.f12627a;
        C1452cha.a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public static DT a(C2989yT yTVar, C1876iha<C2847wT> iha) {
        return new DT(yTVar, iha);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6554a, this.f6555b.get());
    }
}
