package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

public final class BK extends C0728Gg {

    /* renamed from: a  reason: collision with root package name */
    private final String f6262a;

    /* renamed from: b  reason: collision with root package name */
    private final C0624Cg f6263b;

    /* renamed from: c  reason: collision with root package name */
    private C1742gl<JSONObject> f6264c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f6265d = new JSONObject();

    /* renamed from: e  reason: collision with root package name */
    private boolean f6266e = false;

    public BK(String str, C0624Cg cg, C1742gl<JSONObject> glVar) {
        this.f6264c = glVar;
        this.f6262a = str;
        this.f6263b = cg;
        try {
            this.f6265d.put("adapter_version", this.f6263b.ua().toString());
            this.f6265d.put("sdk_version", this.f6263b.ta().toString());
            this.f6265d.put("name", this.f6262a);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6266e     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.gl<org.json.JSONObject> r3 = r2.f6264c     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ all -> 0x001a }
            r3.a(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.f6266e = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BK.b(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(com.google.android.gms.internal.ads.C1824hqa r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6266e     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.f10745b     // Catch:{ JSONException -> 0x0010 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            com.google.android.gms.internal.ads.gl<org.json.JSONObject> r3 = r2.f6264c     // Catch:{ all -> 0x001c }
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ all -> 0x001c }
            r3.a(r0)     // Catch:{ all -> 0x001c }
            r3 = 1
            r2.f6266e = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BK.e(com.google.android.gms.internal.ads.hqa):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void v(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6266e     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.b(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.gl<org.json.JSONObject> r3 = r2.f6264c     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.f6265d     // Catch:{ all -> 0x0023 }
            r3.a(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.f6266e = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BK.v(java.lang.String):void");
    }
}
