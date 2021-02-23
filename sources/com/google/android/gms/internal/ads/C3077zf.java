package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.zf  reason: case insensitive filesystem */
public final class C3077zf {

    /* renamed from: a  reason: collision with root package name */
    private static C3077zf f13086a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f13087b = new AtomicBoolean(false);

    C3077zf() {
    }

    public static C3077zf a() {
        if (f13086a == null) {
            f13086a = new C3077zf();
        }
        return f13086a;
    }

    public final Thread a(Context context, String str) {
        if (!this.f13087b.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new C3006yf(this, context, str));
        thread.start();
        return thread;
    }
}
