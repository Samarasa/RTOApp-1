package com.google.android.gms.internal.ads;

import android.content.Context;

public final class FK extends Xqa {

    /* renamed from: a  reason: collision with root package name */
    private final C1493dL f6829a;

    public FK(Context context, C0710Fo fo, US us, C1059Sz sz, Tqa tqa) {
        C1634fL fLVar = new C1634fL(sz);
        fLVar.a(tqa);
        this.f6829a = new C1493dL(new C2059lL(fo, context, fLVar, us), us.b());
    }

    public final synchronized void a(C2249nqa nqa, int i) {
        this.f6829a.a(nqa, i);
    }

    public final void b(C2249nqa nqa) {
        this.f6829a.a(nqa, 1);
    }

    public final synchronized String o() {
        return this.f6829a.a();
    }

    public final synchronized boolean q() {
        return this.f6829a.b();
    }

    public final synchronized String va() {
        return this.f6829a.c();
    }
}
