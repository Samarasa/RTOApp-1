package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rha  reason: case insensitive filesystem */
public final class C2514rha extends UI<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f12012b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f12013c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f12014d;

    public C2514rha(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f12012b);
        hashMap.put(1, this.f12013c);
        hashMap.put(2, this.f12014d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = UI.a(str);
        if (a2 != null) {
            this.f12012b = (Long) a2.get(0);
            this.f12013c = (Boolean) a2.get(1);
            this.f12014d = (Boolean) a2.get(2);
        }
    }
}
