package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class Tga<K, V, V2> {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<K, C1876iha<V>> f8809a;

    Tga(int i) {
        this.f8809a = Wga.c(i);
    }

    /* access modifiers changed from: package-private */
    public Tga<K, V, V2> a(K k, C1876iha<V> iha) {
        LinkedHashMap<K, C1876iha<V>> linkedHashMap = this.f8809a;
        C1452cha.a(k, "key");
        C1452cha.a(iha, "provider");
        linkedHashMap.put(k, iha);
        return this;
    }
}
