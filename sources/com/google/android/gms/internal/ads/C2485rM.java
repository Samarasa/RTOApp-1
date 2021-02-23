package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rM  reason: case insensitive filesystem */
public final class C2485rM implements JO<C2344pM> {

    /* renamed from: a  reason: collision with root package name */
    private final String f11950a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f11951b;

    /* renamed from: c  reason: collision with root package name */
    private final C1555eD f11952c;

    public C2485rM(String str, PY py, C1555eD eDVar) {
        this.f11950a = str;
        this.f11951b = py;
        this.f11952c = eDVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[Catch:{ WS -> 0x002b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.os.Bundle a(com.google.android.gms.internal.ads.C1925jT r3) {
        /*
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.Rg r1 = r3.n()     // Catch:{ WS -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "sdk_version"
            com.google.android.gms.internal.ads.Rg r2 = r3.n()     // Catch:{ WS -> 0x0018 }
            java.lang.String r2 = r2.toString()     // Catch:{ WS -> 0x0018 }
            r0.putString(r1, r2)     // Catch:{ WS -> 0x0018 }
        L_0x0018:
            com.google.android.gms.internal.ads.Rg r1 = r3.m()     // Catch:{ WS -> 0x002b }
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "adapter_version"
            com.google.android.gms.internal.ads.Rg r3 = r3.m()     // Catch:{ WS -> 0x002b }
            java.lang.String r3 = r3.toString()     // Catch:{ WS -> 0x002b }
            r0.putString(r1, r3)     // Catch:{ WS -> 0x002b }
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2485rM.a(com.google.android.gms.internal.ads.jT):android.os.Bundle");
    }

    public final LY<C2344pM> a() {
        if (new BigInteger(this.f11950a).equals(BigInteger.ONE)) {
            if (!C2000kX.b((String) Qqa.e().a(F.ib))) {
                return this.f11951b.a(new C2415qM(this));
            }
        }
        return DY.a(new C2344pM(new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2344pM b() {
        List<String> asList = Arrays.asList(((String) Qqa.e().a(F.ib)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, a(this.f11952c.a(str, new JSONObject())));
            } catch (WS unused) {
            }
        }
        return new C2344pM(bundle);
    }
}
