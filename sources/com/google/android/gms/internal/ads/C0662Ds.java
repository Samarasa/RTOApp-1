package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ds  reason: case insensitive filesystem */
public final class C0662Ds<AdT> implements C0584As<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C2480rH<AdT>> f6653a;

    C0662Ds(Map<String, C2480rH<AdT>> map) {
        this.f6653a = map;
    }

    public final C2480rH<AdT> a(int i, String str) {
        return this.f6653a.get(str);
    }
}
