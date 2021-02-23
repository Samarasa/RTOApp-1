package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class GM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7011a = false;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7012b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7013c;

    public GM(boolean z, boolean z2, boolean z3) {
        this.f7013c = z3;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("c_pcbg", false);
        bundle.putBoolean("c_phbg", false);
        bundle.putBoolean("ar_lr", this.f7013c);
    }
}
