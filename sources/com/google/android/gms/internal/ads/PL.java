package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class PL implements C2214nY<C2515ri, UL> {

    /* renamed from: a  reason: collision with root package name */
    private Executor f8205a;

    /* renamed from: b  reason: collision with root package name */
    private C2195nF f8206b;

    public PL(Executor executor, C2195nF nFVar) {
        this.f8205a = executor;
        this.f8206b = nFVar;
    }

    public final /* synthetic */ LY a(Object obj) {
        C2515ri riVar = (C2515ri) obj;
        return DY.a(this.f8206b.a(riVar), new SL(riVar), this.f8205a);
    }
}
