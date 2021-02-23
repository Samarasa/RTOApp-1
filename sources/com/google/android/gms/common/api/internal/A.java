package com.google.android.gms.common.api.internal;

import android.util.Log;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.api.internal.C0525e;
import com.google.android.gms.common.internal.C0557m;

final class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0254b f5784a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0525e.b f5785b;

    A(C0525e.b bVar, C0254b bVar2) {
        this.f5785b = bVar;
        this.f5784a = bVar2;
    }

    public final void run() {
        C0525e.a aVar = (C0525e.a) C0525e.this.m.get(this.f5785b.f5864b);
        if (aVar != null) {
            if (this.f5784a.k()) {
                boolean unused = this.f5785b.f5867e = true;
                if (this.f5785b.f5863a.i()) {
                    this.f5785b.a();
                    return;
                }
                try {
                    this.f5785b.f5863a.a((C0557m) null, this.f5785b.f5863a.b());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    aVar.a(new C0254b(10));
                }
            } else {
                aVar.a(this.f5784a);
            }
        }
    }
}
