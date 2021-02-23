package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class Naa {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7982a = new Jaa().a();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private static final C2859wca f7983b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final C2859wca f7984c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private static final C2859wca f7985d = f7983b;

    static {
        C2859wca p = C2859wca.p();
        f7983b = p;
        f7984c = p;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        DZ.a(new Jaa(), true);
        DZ.a(new Eaa(), true);
        DZ.a(new Maa());
    }
}
