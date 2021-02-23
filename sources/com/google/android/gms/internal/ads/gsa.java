package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class gsa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dsa f10598a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10599b;

    gsa(dsa dsa, Context context) {
        this.f10598a = dsa;
        this.f10599b = context;
    }

    public final void run() {
        this.f10598a.a(this.f10599b);
    }
}
