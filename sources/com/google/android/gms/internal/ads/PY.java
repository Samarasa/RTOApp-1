package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface PY extends ExecutorService {
    LY<?> a(Runnable runnable);

    <T> LY<T> a(Callable<T> callable);
}
