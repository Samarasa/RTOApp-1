package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.gO  reason: case insensitive filesystem */
public final class C1708gO implements JO<KO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10538b;

    C1708gO(Context context, String str) {
        this.f10537a = context;
        this.f10538b = str;
    }

    public final LY<KO<Bundle>> a() {
        return DY.a(this.f10538b == null ? null : new C1920jO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f10537a.getPackageName());
    }
}
