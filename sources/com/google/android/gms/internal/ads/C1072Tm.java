package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Tm  reason: case insensitive filesystem */
public final class C1072Tm extends C2159mh {

    /* renamed from: a  reason: collision with root package name */
    private final C1099Un f8819a;

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f8820b;

    public C1072Tm() {
        this((C1099Un) null);
    }

    private C1072Tm(C1099Un un) {
        this((C1099Un) null, (SSLSocketFactory) null);
    }

    private C1072Tm(C1099Un un, SSLSocketFactory sSLSocketFactory) {
        this.f8819a = null;
        this.f8820b = null;
    }

    private static List<Zoa> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String zoa : (List) next.getValue()) {
                    arrayList.add(new Zoa((String) next.getKey(), zoa));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, C1339b<?> bVar) {
        byte[] p = bVar.p();
        if (p != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(p);
            dataOutputStream.close();
        }
    }

    /* access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0074, code lost:
        r0.setRequestMethod(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1045Sl a(com.google.android.gms.internal.ads.C1339b<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.d()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.a()
            r1.putAll(r8)
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r2)
            int r2 = r7.r()
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            r4.equals(r8)
            java.util.Set r8 = r1.keySet()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00ec }
        L_0x0048:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00ec }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00ec }
            r0.setRequestProperty(r4, r5)     // Catch:{ all -> 0x00ec }
            goto L_0x0048
        L_0x005e:
            int r8 = r7.c()     // Catch:{ all -> 0x00ec }
            switch(r8) {
                case -1: goto L_0x0090;
                case 0: goto L_0x008d;
                case 1: goto L_0x0087;
                case 2: goto L_0x0081;
                case 3: goto L_0x007e;
                case 4: goto L_0x007b;
                case 5: goto L_0x0078;
                case 6: goto L_0x0072;
                case 7: goto L_0x0069;
                default: goto L_0x0065;
            }     // Catch:{ all -> 0x00ec }
        L_0x0065:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ec }
            goto L_0x00e6
        L_0x0069:
            java.lang.String r8 = "PATCH"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00ec }
        L_0x006e:
            a((java.net.HttpURLConnection) r0, (com.google.android.gms.internal.ads.C1339b<?>) r7)     // Catch:{ all -> 0x00ec }
            goto L_0x0090
        L_0x0072:
            java.lang.String r8 = "TRACE"
        L_0x0074:
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00ec }
            goto L_0x0090
        L_0x0078:
            java.lang.String r8 = "OPTIONS"
            goto L_0x0074
        L_0x007b:
            java.lang.String r8 = "HEAD"
            goto L_0x0074
        L_0x007e:
            java.lang.String r8 = "DELETE"
            goto L_0x0074
        L_0x0081:
            java.lang.String r8 = "PUT"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00ec }
            goto L_0x006e
        L_0x0087:
            java.lang.String r8 = "POST"
            r0.setRequestMethod(r8)     // Catch:{ all -> 0x00ec }
            goto L_0x006e
        L_0x008d:
            java.lang.String r8 = "GET"
            goto L_0x0074
        L_0x0090:
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x00ec }
            r1 = -1
            if (r8 == r1) goto L_0x00de
            int r7 = r7.c()     // Catch:{ all -> 0x00ec }
            r1 = 4
            if (r7 == r1) goto L_0x00b0
            r7 = 100
            if (r7 > r8) goto L_0x00a6
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L_0x00b0
        L_0x00a6:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L_0x00b0
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L_0x00b0
            r7 = 1
            goto L_0x00b1
        L_0x00b0:
            r7 = 0
        L_0x00b1:
            if (r7 != 0) goto L_0x00c4
            com.google.android.gms.internal.ads.Sl r7 = new com.google.android.gms.internal.ads.Sl     // Catch:{ all -> 0x00ec }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x00ec }
            java.util.List r1 = a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x00ec }
            r7.<init>(r8, r1)     // Catch:{ all -> 0x00ec }
            r0.disconnect()
            return r7
        L_0x00c4:
            com.google.android.gms.internal.ads.Sl r7 = new com.google.android.gms.internal.ads.Sl     // Catch:{ all -> 0x00db }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x00db }
            java.util.List r1 = a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x00db }
            int r2 = r0.getContentLength()     // Catch:{ all -> 0x00db }
            com.google.android.gms.internal.ads.uo r4 = new com.google.android.gms.internal.ads.uo     // Catch:{ all -> 0x00db }
            r4.<init>(r0)     // Catch:{ all -> 0x00db }
            r7.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x00db }
            return r7
        L_0x00db:
            r7 = move-exception
            r2 = 1
            goto L_0x00ed
        L_0x00de:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00ec }
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)     // Catch:{ all -> 0x00ec }
            throw r7     // Catch:{ all -> 0x00ec }
        L_0x00e6:
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)     // Catch:{ all -> 0x00ec }
            throw r7     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r7 = move-exception
        L_0x00ed:
            if (r2 != 0) goto L_0x00f2
            r0.disconnect()
        L_0x00f2:
            goto L_0x00f4
        L_0x00f3:
            throw r7
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1072Tm.a(com.google.android.gms.internal.ads.b, java.util.Map):com.google.android.gms.internal.ads.Sl");
    }
}
