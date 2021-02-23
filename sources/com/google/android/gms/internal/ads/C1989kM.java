package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kM  reason: case insensitive filesystem */
final class C1989kM implements JO<KO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f11046a;

    C1989kM(Set<String> set) {
        this.f11046a = set;
    }

    public final LY<KO<Bundle>> a() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f11046a) {
            arrayList.add(add);
        }
        return DY.a(new C2202nM(arrayList));
    }
}
