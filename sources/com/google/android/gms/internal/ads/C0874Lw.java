package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Lw  reason: case insensitive filesystem */
public class C0874Lw<ListenerT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ListenerT, Executor> f7782a = new HashMap();

    protected C0874Lw(Set<C3108zx<ListenerT>> set) {
        a(set);
    }

    private final synchronized void a(Set<C3108zx<ListenerT>> set) {
        for (C3108zx<ListenerT> a2 : set) {
            a(a2);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(C0926Nw<ListenerT> nw) {
        for (Map.Entry next : this.f7782a.entrySet()) {
            ((Executor) next.getValue()).execute(new C0952Ow(nw, next.getKey()));
        }
    }

    public final synchronized void a(C3108zx<ListenerT> zxVar) {
        a(zxVar.f13138a, zxVar.f13139b);
    }

    public final synchronized void a(ListenerT listenert, Executor executor) {
        this.f7782a.put(listenert, executor);
    }
}
