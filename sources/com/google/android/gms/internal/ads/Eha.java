package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class Eha extends UI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f6727b;

    /* renamed from: c  reason: collision with root package name */
    public Long f6728c;

    /* renamed from: d  reason: collision with root package name */
    public Long f6729d;

    /* renamed from: e  reason: collision with root package name */
    public Long f6730e;

    public Eha(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f6727b);
        hashMap.put(1, this.f6728c);
        hashMap.put(2, this.f6729d);
        hashMap.put(3, this.f6730e);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = UI.a(str);
        if (a2 != null) {
            this.f6727b = (Long) a2.get(0);
            this.f6728c = (Long) a2.get(1);
            this.f6729d = (Long) a2.get(2);
            this.f6730e = (Long) a2.get(3);
        }
    }
}
