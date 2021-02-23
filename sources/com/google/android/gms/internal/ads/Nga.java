package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Nga extends Oga {

    /* renamed from: a  reason: collision with root package name */
    private Logger f7997a;

    public Nga(String str) {
        this.f7997a = Logger.getLogger(str);
    }

    public final void a(String str) {
        this.f7997a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
