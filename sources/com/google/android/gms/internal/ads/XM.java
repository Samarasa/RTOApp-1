package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class XM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f9228a;

    public XM(String str) {
        this.f9228a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f9228a)) {
            bundle.putString("fwd_cld", this.f9228a);
        }
    }
}
