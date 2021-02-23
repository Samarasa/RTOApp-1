package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class YY extends TimeoutException {
    private YY(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
