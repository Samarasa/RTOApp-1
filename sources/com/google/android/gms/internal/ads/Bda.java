package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

final class Bda extends C3003yda {
    Bda() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
