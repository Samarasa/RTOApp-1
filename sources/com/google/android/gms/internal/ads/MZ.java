package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

public class MZ implements CZ<C1648fZ> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f7859a = Logger.getLogger(MZ.class.getName());

    static class a implements C1648fZ {

        /* renamed from: a  reason: collision with root package name */
        private final AZ<C1648fZ> f7860a;

        private a(AZ<C1648fZ> az) {
            this.f7860a = az;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            return Ica.a(this.f7860a.b().d(), this.f7860a.b().a().a(bArr, bArr2));
        }
    }

    MZ() {
    }

    public final Class<C1648fZ> a() {
        return C1648fZ.class;
    }

    public final /* synthetic */ Object a(AZ az) {
        return new a(az);
    }
}
