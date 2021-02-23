package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public final class _C {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1272aD> f9621a = new HashMap();

    _C() {
    }

    public final synchronized C1272aD a(String str) {
        return this.f9621a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, C0624Cg cg) {
        if (!this.f9621a.containsKey(str)) {
            try {
                this.f9621a.put(str, new C1272aD(str, cg.ua(), cg.ta()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, C1925jT jTVar) {
        if (!this.f9621a.containsKey(str)) {
            try {
                this.f9621a.put(str, new C1272aD(str, jTVar.m(), jTVar.n()));
            } catch (WS unused) {
            }
        }
    }
}
