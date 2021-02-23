package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fO  reason: case insensitive filesystem */
public final class C1637fO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private String f10392a;

    public C1637fO(String str) {
        this.f10392a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString("request_id", this.f10392a);
    }
}
