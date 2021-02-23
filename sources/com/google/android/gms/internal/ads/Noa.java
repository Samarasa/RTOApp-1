package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0547c;

final class Noa implements C0547c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Foa f8024a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1742gl f8025b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Loa f8026c;

    Noa(Loa loa, Foa foa, C1742gl glVar) {
        this.f8026c = loa;
        this.f8024a = foa;
        this.f8025b = glVar;
    }

    public final void d(int i) {
    }

    public final void h(Bundle bundle) {
        synchronized (this.f8026c.f7755d) {
            if (!this.f8026c.f7753b) {
                boolean unused = this.f8026c.f7753b = true;
                Coa d2 = this.f8026c.f7752a;
                if (d2 != null) {
                    this.f8025b.a(new Poa(this.f8025b, C1252_k.f9699a.a((Runnable) new Moa(this, d2, this.f8024a, this.f8025b))), C1252_k.f9704f);
                }
            }
        }
    }
}
