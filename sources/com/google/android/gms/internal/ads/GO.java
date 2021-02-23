package com.google.android.gms.internal.ads;

import android.os.Bundle;

final /* synthetic */ class GO implements KO {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f7015a;

    GO(Bundle bundle) {
        this.f7015a = bundle;
    }

    public final void a(Object obj) {
        ((Bundle) obj).putBundle("shared_pref", this.f7015a);
    }
}
