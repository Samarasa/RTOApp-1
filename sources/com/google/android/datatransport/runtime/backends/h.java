package com.google.android.datatransport.runtime.backends;

public abstract class h {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static h a() {
        return new c(a.FATAL_ERROR, -1);
    }

    public static h a(long j) {
        return new c(a.OK, j);
    }

    public static h d() {
        return new c(a.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}
