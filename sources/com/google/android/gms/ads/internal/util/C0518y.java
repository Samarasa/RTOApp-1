package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.Ara;
import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1439cb;
import com.google.android.gms.internal.ads.C1742gl;
import com.google.android.gms.internal.ads.C2946xka;
import com.google.android.gms.internal.ads.LY;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.y  reason: case insensitive filesystem */
public final class C0518y {

    /* renamed from: a  reason: collision with root package name */
    private static C1439cb f5664a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5665b = new Object();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final D<Void> f5666c = new C();

    public C0518y(Context context) {
        a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static LY<Ara> a(String str) {
        C1742gl glVar = new C1742gl();
        f5664a.a(new F(str, glVar));
        return glVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.C1439cb a(android.content.Context r3) {
        /*
            java.lang.Object r0 = f5665b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.cb r1 = f5664a     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.F.a(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.d.a()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.F.Rc     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.B r2 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.cb r3 = com.google.android.gms.ads.internal.util.r.a((android.content.Context) r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.cb r3 = com.google.android.gms.internal.ads.C2744uq.a(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            f5664a = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.cb r3 = f5664a     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C0518y.a(android.content.Context):com.google.android.gms.internal.ads.cb");
    }

    public final LY<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        G g2 = new G((C) null);
        A a2 = new A(this, str2, g2);
        C0836Kk kk = new C0836Kk((String) null);
        E e2 = new E(this, i, str, g2, a2, bArr, map, kk);
        if (C0836Kk.a()) {
            try {
                kk.a(str2, "GET", e2.a(), e2.p());
            } catch (C2946xka e3) {
                C1018Rk.d(e3.getMessage());
            }
        }
        f5664a.a(e2);
        return g2;
    }

    public final LY<String> a(String str, Map<String, String> map) {
        return a(0, str, map, (byte[]) null);
    }
}
