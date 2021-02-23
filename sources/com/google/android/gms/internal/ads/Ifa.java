package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class Ifa extends Ofa {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hfa f7312b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Ifa(Hfa hfa) {
        super(hfa, (Gfa) null);
        this.f7312b = hfa;
    }

    /* synthetic */ Ifa(Hfa hfa, Gfa gfa) {
        this(hfa);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new Jfa(this.f7312b, (Gfa) null);
    }
}
