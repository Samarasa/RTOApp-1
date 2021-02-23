package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1369bba;
import com.google.android.gms.internal.ads.C2219nba;
import com.google.android.gms.internal.ads.Tba;
import com.google.android.gms.internal.ads.Yaa;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class Faa implements Pca {

    /* renamed from: a  reason: collision with root package name */
    private final String f6867a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6868b;

    /* renamed from: c  reason: collision with root package name */
    private C2219nba f6869c;

    /* renamed from: d  reason: collision with root package name */
    private Yaa f6870d;

    /* renamed from: e  reason: collision with root package name */
    private int f6871e;

    Faa(C1513dca dca) {
        this.f6867a = dca.o();
        if (this.f6867a.equals(JZ.f7427b)) {
            try {
                C2290oba a2 = C2290oba.a(dca.p(), C2012kea.a());
                this.f6869c = (C2219nba) DZ.b(dca);
                this.f6868b = a2.o();
            } catch (Iea e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.f6867a.equals(JZ.f7426a)) {
            try {
                Zaa a3 = Zaa.a(dca.p(), C2012kea.a());
                this.f6870d = (Yaa) DZ.b(dca);
                this.f6871e = a3.o().o();
                this.f6868b = this.f6871e + a3.p().o();
            } catch (Iea e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.f6867a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    public final int a() {
        return this.f6868b;
    }

    public final C1648fZ a(byte[] bArr) {
        C1872ifa ifa;
        if (bArr.length == this.f6868b) {
            if (this.f6867a.equals(JZ.f7427b)) {
                C2219nba.a q = C2219nba.q();
                q.a(this.f6869c);
                C2219nba.a aVar = q;
                aVar.a(Lda.a(bArr, 0, this.f6868b));
                ifa = (C2219nba) aVar.k();
            } else if (this.f6867a.equals(JZ.f7426a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f6871e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f6871e, this.f6868b);
                C1369bba.a r = C1369bba.r();
                r.a(this.f6870d.p());
                C1369bba.a aVar2 = r;
                aVar2.a(Lda.a(copyOfRange));
                Tba.a r2 = Tba.r();
                r2.a(this.f6870d.q());
                Tba.a aVar3 = r2;
                aVar3.a(Lda.a(copyOfRange2));
                Yaa.a r3 = Yaa.r();
                r3.a(this.f6870d.o());
                r3.a((C1369bba) aVar2.k());
                r3.a((Tba) aVar3.k());
                ifa = (Yaa) r3.k();
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (C1648fZ) DZ.a(this.f6867a, ifa, C1648fZ.class);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
