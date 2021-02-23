package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class Rda extends UI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f8491b;

    /* renamed from: c  reason: collision with root package name */
    public long f8492c;

    public Rda() {
        this.f8491b = -1;
        this.f8492c = -1;
    }

    public Rda(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f8491b));
        hashMap.put(1, Long.valueOf(this.f8492c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = UI.a(str);
        if (a2 != null) {
            this.f8491b = ((Long) a2.get(0)).longValue();
            this.f8492c = ((Long) a2.get(1)).longValue();
        }
    }
}
