package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.sha  reason: case insensitive filesystem */
public final class C2585sha extends UI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f12122b;

    /* renamed from: c  reason: collision with root package name */
    public Long f12123c;

    public C2585sha(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f12122b);
        hashMap.put(1, this.f12123c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = UI.a(str);
        if (a2 != null) {
            this.f12122b = (Long) a2.get(0);
            this.f12123c = (Long) a2.get(1);
        }
    }
}
