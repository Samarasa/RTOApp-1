package com.google.android.gms.internal.ads;

import android.content.Context;

final class MY implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f7858a;

    MY(IX ix, Context context) {
        this.f7858a = context;
    }

    public final void run() {
        try {
            IX.u.a(this.f7858a);
        } catch (Exception e2) {
            IX.w.a(2019, -1, e2);
        }
    }
}
