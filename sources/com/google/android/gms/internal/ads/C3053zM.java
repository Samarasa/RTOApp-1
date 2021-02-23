package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.zM  reason: case insensitive filesystem */
final /* synthetic */ class C3053zM implements KO {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f13038a;

    C3053zM(ArrayList arrayList) {
        this.f13038a = arrayList;
    }

    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.f13038a);
    }
}
