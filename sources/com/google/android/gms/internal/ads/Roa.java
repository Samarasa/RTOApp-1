package com.google.android.gms.internal.ads;

import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;

final class Roa implements C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1742gl f8541a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Loa f8542b;

    Roa(Loa loa, C1742gl glVar) {
        this.f8542b = loa;
        this.f8541a = glVar;
    }

    public final void a(C0254b bVar) {
        synchronized (this.f8542b.f7755d) {
            this.f8541a.a((Throwable) new RuntimeException("Connection failed."));
        }
    }
}
