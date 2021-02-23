package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<T> f7239a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashMap<String, String> f7240b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, M> f7241c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private String f7242d;

    /* renamed from: e  reason: collision with root package name */
    private Context f7243e;

    /* renamed from: f  reason: collision with root package name */
    private String f7244f;

    /* renamed from: g  reason: collision with root package name */
    private final HashSet<String> f7245g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f7246h;
    private File i;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC, Splitter:B:38:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3 A[SYNTHETIC, Splitter:B:43:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map<java.lang.String, java.lang.String> r5, com.google.android.gms.internal.ads.W r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f7242d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 != 0) goto L_0x003b
            goto L_0x0070
        L_0x003b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0056
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.a()
            r1.append(r5)
        L_0x0056:
            java.lang.String r5 = r6.b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006c
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.b()
            r1.append(r5)
        L_0x006c:
            java.lang.String r5 = r1.toString()
        L_0x0070:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f7246h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c2
            java.io.File r6 = r4.i
            if (r6 == 0) goto L_0x00bc
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00a0 }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x00a0 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            r2.write(r5)     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            r2.close()     // Catch:{ IOException -> 0x0093 }
            return
        L_0x0093:
            r5 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.c(r0, r5)
            return
        L_0x0098:
            r5 = move-exception
            r1 = r2
            goto L_0x00b1
        L_0x009b:
            r5 = move-exception
            r1 = r2
            goto L_0x00a1
        L_0x009e:
            r5 = move-exception
            goto L_0x00b1
        L_0x00a0:
            r5 = move-exception
        L_0x00a1:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C1018Rk.c(r6, r5)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r5 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.c(r0, r5)
        L_0x00b0:
            return
        L_0x00b1:
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r6 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.c(r0, r6)
        L_0x00bb:
            throw r5
        L_0x00bc:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.C1018Rk.d(r5)
            return
        L_0x00c2:
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r6 = r4.f7243e
            java.lang.String r0 = r4.f7244f
            com.google.android.gms.ads.internal.util.oa.a((android.content.Context) r6, (java.lang.String) r0, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I.a(java.util.Map, com.google.android.gms.internal.ads.W):void");
    }

    public final M a(String str) {
        M m = this.f7241c.get(str);
        return m != null ? m : M.f7792a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        while (true) {
            try {
                T take = this.f7239a.take();
                W a2 = take.a();
                if (a2 != null && !TextUtils.isEmpty(a2.a())) {
                    a(a((Map<String, String>) this.f7240b, take.b()), a2);
                }
            } catch (InterruptedException e2) {
                C1018Rk.c("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f7243e = context;
        this.f7244f = str;
        this.f7242d = str2;
        this.f7246h = new AtomicBoolean(false);
        this.f7246h.set(C3067za.f13071c.a().booleanValue());
        if (this.f7246h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f7240b.put((String) next.getKey(), (String) next.getValue());
        }
        C1252_k.f9699a.execute(new L(this));
        this.f7241c.put("action", M.f7793b);
        this.f7241c.put("ad_format", M.f7793b);
        this.f7241c.put("e", M.f7794c);
    }

    public final boolean a(T t) {
        return this.f7239a.offer(t);
    }

    public final void b(String str) {
        if (!this.f7245g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f7244f);
            linkedHashMap.put("ue", str);
            a(a((Map<String, String>) this.f7240b, (Map<String, String>) linkedHashMap), (W) null);
        }
    }
}
