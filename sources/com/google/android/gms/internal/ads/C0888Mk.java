package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mk  reason: case insensitive filesystem */
final /* synthetic */ class C0888Mk implements C1044Sk {

    /* renamed from: a  reason: collision with root package name */
    private final int f7883a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7884b;

    C0888Mk(int i, Map map) {
        this.f7883a = i;
        this.f7884b = map;
    }

    public final void a(JsonWriter jsonWriter) {
        C0836Kk.a(this.f7883a, this.f7884b, jsonWriter);
    }
}
