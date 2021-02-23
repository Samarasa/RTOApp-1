package com.google.android.gms.internal.ads;

import java.io.IOException;

public class Sia extends IOException {
    public Sia(String str) {
        super(str);
    }

    public Sia(String str, Throwable th) {
        super(str, th);
    }
}
