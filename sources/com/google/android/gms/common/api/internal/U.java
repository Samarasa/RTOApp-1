package com.google.android.gms.common.api.internal;

import c.b.b.b.g.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f5826a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<j<?>, Boolean> f5827b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f5826a) {
            hashMap = new HashMap(this.f5826a);
        }
        synchronized (this.f5827b) {
            hashMap2 = new HashMap(this.f5827b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j) entry2.getKey()).b((Exception) new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void a(j<TResult> jVar, boolean z) {
        this.f5827b.put(jVar, Boolean.valueOf(z));
        jVar.a().a(new C0536p(this, jVar));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return !this.f5826a.isEmpty() || !this.f5827b.isEmpty();
    }

    public final void b() {
        a(false, C0525e.f5847a);
    }

    public final void c() {
        a(true, K.f5813a);
    }
}
