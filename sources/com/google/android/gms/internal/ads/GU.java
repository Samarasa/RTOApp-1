package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

final class GU implements C2212nW {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2211nV f7032a;

    GU(FT ft, C2211nV nVVar) {
        this.f7032a = nVVar;
    }

    public final boolean a(File file) {
        try {
            return this.f7032a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
