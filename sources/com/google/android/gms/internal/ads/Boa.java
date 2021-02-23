package com.google.android.gms.internal.ads;

import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;

final class Boa implements C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2883woa f6366a;

    Boa(C2883woa woa) {
        this.f6366a = woa;
    }

    public final void a(C0254b bVar) {
        synchronized (this.f6366a.f12694b) {
            Goa unused = this.f6366a.f12697e = null;
            if (this.f6366a.f12695c != null) {
                Coa unused2 = this.f6366a.f12695c = null;
            }
            this.f6366a.f12694b.notifyAll();
        }
    }
}
