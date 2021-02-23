package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class CN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f6414a;

    public CN(Bundle bundle) {
        this.f6414a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a2 = C1359bT.a(bundle, "device");
        a2.putBundle("android_mem_info", this.f6414a);
        bundle.putBundle("device", a2);
    }
}
