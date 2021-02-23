package com.google.android.gms.internal.ads;

final /* synthetic */ class RC implements Cdo {

    /* renamed from: a  reason: collision with root package name */
    private final C1742gl f8448a;

    RC(C1742gl glVar) {
        this.f8448a = glVar;
    }

    public final void a(boolean z) {
        C1742gl glVar = this.f8448a;
        if (z) {
            glVar.a(null);
        } else {
            glVar.a((Throwable) new Exception("Ad Web View failed to load."));
        }
    }
}
