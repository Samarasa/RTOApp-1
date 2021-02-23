package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.sK  reason: case insensitive filesystem */
public final class C2554sK {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, C0624Cg> f12072a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final C1555eD f12073b;

    public C2554sK(C1555eD eDVar) {
        this.f12073b = eDVar;
    }

    public final void a(String str) {
        try {
            this.f12072a.put(str, this.f12073b.a(str));
        } catch (RemoteException e2) {
            C1018Rk.b("Couldn't create RTB adapter : ", e2);
        }
    }

    public final C0624Cg b(String str) {
        if (this.f12072a.containsKey(str)) {
            return this.f12072a.get(str);
        }
        return null;
    }
}
