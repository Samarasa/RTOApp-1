package com.google.android.gms.internal.ads;

class ZX extends Throwable {
    ZX(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
