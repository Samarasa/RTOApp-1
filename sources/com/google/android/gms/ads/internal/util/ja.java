package com.google.android.gms.ads.internal.util;

import android.content.Context;

final /* synthetic */ class ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ka f5603a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5604b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5605c;

    ja(ka kaVar, Context context, String str) {
        this.f5603a = kaVar;
        this.f5604b = context;
        this.f5605c = str;
    }

    public final void run() {
        this.f5603a.a(this.f5604b, this.f5605c);
    }
}
