package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class Cha extends UI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f6443b;

    /* renamed from: c  reason: collision with root package name */
    public Long f6444c;

    /* renamed from: d  reason: collision with root package name */
    public Long f6445d;

    /* renamed from: e  reason: collision with root package name */
    public Long f6446e;

    /* renamed from: f  reason: collision with root package name */
    public Long f6447f;

    /* renamed from: g  reason: collision with root package name */
    public Long f6448g;

    /* renamed from: h  reason: collision with root package name */
    public Long f6449h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;

    public Cha(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f6443b);
        hashMap.put(1, this.f6444c);
        hashMap.put(2, this.f6445d);
        hashMap.put(3, this.f6446e);
        hashMap.put(4, this.f6447f);
        hashMap.put(5, this.f6448g);
        hashMap.put(6, this.f6449h);
        hashMap.put(7, this.i);
        hashMap.put(8, this.j);
        hashMap.put(9, this.k);
        hashMap.put(10, this.l);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = UI.a(str);
        if (a2 != null) {
            this.f6443b = (Long) a2.get(0);
            this.f6444c = (Long) a2.get(1);
            this.f6445d = (Long) a2.get(2);
            this.f6446e = (Long) a2.get(3);
            this.f6447f = (Long) a2.get(4);
            this.f6448g = (Long) a2.get(5);
            this.f6449h = (Long) a2.get(6);
            this.i = (Long) a2.get(7);
            this.j = (Long) a2.get(8);
            this.k = (Long) a2.get(9);
            this.l = (Long) a2.get(10);
        }
    }
}
