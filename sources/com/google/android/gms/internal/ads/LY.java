package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface LY<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
