package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class TN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8772a;

    public TN(String str) {
        this.f8772a = str;
    }

    /* access modifiers changed from: private */
    public static boolean b(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public final /* synthetic */ void a(Object obj) {
        C1359bT.a((Bundle) obj, "omid_v", this.f8772a);
    }
}
