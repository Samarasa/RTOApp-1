package com.google.android.gms.internal.ads;

import android.os.Trace;

public final class Qma {
    public static void a() {
        if (Tma.f8821a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (Tma.f8821a >= 18) {
            Trace.beginSection(str);
        }
    }
}
