package com.google.android.gms.common.api.internal;

import b.e.b;
import c.b.b.b.b.C0254b;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.c;
import java.util.Map;
import java.util.Set;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final b<C0522b<?>, C0254b> f5821a;

    /* renamed from: b  reason: collision with root package name */
    private final b<C0522b<?>, String> f5822b;

    /* renamed from: c  reason: collision with root package name */
    private final j<Map<C0522b<?>, String>> f5823c;

    /* renamed from: d  reason: collision with root package name */
    private int f5824d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5825e;

    public final Set<C0522b<?>> a() {
        return this.f5821a.keySet();
    }

    public final void a(C0522b<?> bVar, C0254b bVar2, String str) {
        this.f5821a.put(bVar, bVar2);
        this.f5822b.put(bVar, str);
        this.f5824d--;
        if (!bVar2.k()) {
            this.f5825e = true;
        }
        if (this.f5824d != 0) {
            return;
        }
        if (this.f5825e) {
            this.f5823c.a((Exception) new c(this.f5821a));
            return;
        }
        this.f5823c.a(this.f5822b);
    }
}
