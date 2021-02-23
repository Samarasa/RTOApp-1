package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.nM  reason: case insensitive filesystem */
final /* synthetic */ class C2202nM implements KO {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f11450a;

    C2202nM(ArrayList arrayList) {
        this.f11450a = arrayList;
    }

    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f11450a);
    }
}
