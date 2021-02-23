package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads._m  reason: case insensitive filesystem */
final class C1254_m {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C2383pma> f9719a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f9720b;

    C1254_m() {
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        Iterator<C2383pma> it = this.f9719a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> a2 = it.next().a();
            if (a2 != null) {
                for (Map.Entry next : a2.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f9720b = Math.max(this.f9720b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f9720b;
    }

    /* access modifiers changed from: package-private */
    public final void a(C2383pma pma) {
        this.f9719a.add(pma);
    }
}
