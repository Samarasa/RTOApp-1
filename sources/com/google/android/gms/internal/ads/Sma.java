package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class Sma implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8681a;

    Sma(String str) {
        this.f8681a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f8681a);
    }
}
