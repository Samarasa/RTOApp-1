package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a.a;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.foa  reason: case insensitive filesystem */
public final class C1678foa extends C2032koa {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a.C0069a> f10457a;

    public C1678foa(a.C0069a aVar) {
        this.f10457a = new WeakReference<>(aVar);
    }

    public final void a(C1749goa goa) {
        a.C0069a aVar = (a.C0069a) this.f10457a.get();
        if (aVar != null) {
            aVar.a((a) new C2458qoa(goa));
        }
    }

    public final void g(C1824hqa hqa) {
        a.C0069a aVar = (a.C0069a) this.f10457a.get();
        if (aVar != null) {
            aVar.a(hqa.h());
        }
    }

    public final void i(int i) {
        a.C0069a aVar = (a.C0069a) this.f10457a.get();
        if (aVar != null) {
            aVar.a(i);
        }
    }
}
