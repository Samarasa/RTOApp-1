package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.yi  reason: case insensitive filesystem */
public final class C3012yi {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, C0574Ai> f12952a = new WeakHashMap<>();

    public final Future<C2870wi> a(Context context) {
        return C1252_k.f9699a.a(new C0600Bi(this, context));
    }
}
