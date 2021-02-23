package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

class Maa implements CZ<C2995yZ> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f7864a = Logger.getLogger(Maa.class.getName());

    static class a implements C2995yZ {

        /* renamed from: a  reason: collision with root package name */
        private final AZ<C2995yZ> f7865a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f7866b;

        private a(AZ<C2995yZ> az) {
            this.f7866b = new byte[]{0};
            this.f7865a = az;
        }

        public final byte[] a(byte[] bArr) {
            if (this.f7865a.b().c().equals(C2717uca.LEGACY)) {
                return Ica.a(this.f7865a.b().d(), this.f7865a.b().a().a(Ica.a(bArr, this.f7866b)));
            }
            return Ica.a(this.f7865a.b().d(), this.f7865a.b().a().a(bArr));
        }
    }

    Maa() {
    }

    public final Class<C2995yZ> a() {
        return C2995yZ.class;
    }

    public final /* synthetic */ Object a(AZ az) {
        return new a(az);
    }
}
