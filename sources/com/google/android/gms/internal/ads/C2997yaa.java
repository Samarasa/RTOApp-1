package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.yaa  reason: case insensitive filesystem */
public final class C2997yaa {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12928a = new C2855waa().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f12929b = new C2500raa().a();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final C2859wca f12930c = C2859wca.p();
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private static final C2859wca f12931d = C2859wca.p();
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private static final C2859wca f12932e = C2859wca.p();

    static {
        try {
            JZ.a();
            DZ.a(new C2500raa(), new C2855waa(), true);
            DZ.a(new C2926xaa());
            DZ.a(new Baa());
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
