package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.LY;

/* renamed from: com.google.android.gms.ads.internal.util.a  reason: case insensitive filesystem */
public abstract class C0493a {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f5563a = new da(this);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile Thread f5564b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5565c = false;

    public abstract void a();

    public final LY<?> b() {
        return C1252_k.f9700b.a(this.f5563a);
    }
}
