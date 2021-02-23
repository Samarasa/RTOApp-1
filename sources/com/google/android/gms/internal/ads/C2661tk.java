package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.b.g;
import c.b.b.b.b.h;
import com.google.android.gms.ads.c.a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tk  reason: case insensitive filesystem */
final class C2661tk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f12234a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1742gl f12235b;

    C2661tk(C2449qk qkVar, Context context, C1742gl glVar) {
        this.f12234a = context;
        this.f12235b = glVar;
    }

    public final void run() {
        try {
            this.f12235b.a(a.a(this.f12234a));
        } catch (g | h | IOException | IllegalStateException e2) {
            this.f12235b.a(e2);
            C1018Rk.b("Exception while getting advertising Id info", e2);
        }
    }
}
